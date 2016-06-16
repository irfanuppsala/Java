import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class MyDB {

	public static void main(String[] args) throws Exception
	{
		MyDB dbData = new MyDB();
		dbData.show();
	}
	
	public void show() throws SQLException{
		// Accessing driver from the JAR file
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					
				}
				
				// Creating a veriable for the connection called con
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","");
				
				// Here we create our query
				PreparedStatement statement = (PreparedStatement) con.prepareStatement("select * from test");
				
				// Creating a variable to execute query
				ResultSet result = statement.executeQuery();
				
				while(result.next())
				{
					System.out.println(result.getString(1) + " " + result.getString(2));
				}
	}
}
