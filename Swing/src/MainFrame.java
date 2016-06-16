import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;

public class MainFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtFieldTitle;
	private JTextField txtFieldAuthor;
	private JTextField txtFieldPrice;
	private JTextArea ta1,ta2;
	
	private JButton btnL�g;
	private JButton btnVisa;
	private JButton btnSt�ng;
	
	private JRadioButton proRadio;
	private JRadioButton amateurRadio;
	private ButtonGroup playersBtnGroup;
	
	private ArrayList<Book> aList;
	
	private JLabel txtTextArea;
	private JLabel txtTitle;
	private JLabel txtTextData;
	
	private Border redBorder = BorderFactory.createLineBorder(Color.blue);
	/****************************************************************************
	* Detta �r de ramar man kan prova f�r stor textrutan *
	* *
	* **************************************************************************
	blackline = BorderFactory.createLineBorder(Color.black);
	raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);loweredetched =
	BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	raisedbevel = BorderFactory.createRaisedBevelBorder();
	loweredbevel = BorderFactory.createLoweredBevelBorder();
	empty = BorderFactory.createEmptyBorder();
	 * @throws SQLException 
	***************************************************************************/
	public MainFrame() throws SQLException{ //Konstruktor
		
		//Namn p� f�nster
		super("Java Swing");
		setLayout(null);
		
		File d1 = new File("C:\\SavedObjects"); //Skapar ett fil-objekt f�r att g�ra en mapp.
		d1.mkdir(); //Skapar ny mapp
		
		//S�tter storlek p� f�nstret.
		setSize(1050, 700);
		
		//Hindra att f�nstret �ndrar storlek
		setResizable(false);
		
		//F�r att programmet och inte bara f�nstret ska st�ngas vid tryck p� kryss.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//G�r f�nstret synlig
		setVisible(true);
		
		//Color newGreen = new Color(1,158,79); // Definierar ny f�rg
		getContentPane().setBackground(Color.LIGHT_GRAY);

		aList = new ArrayList<Book>(); //Skapar en lyssnar som lyssnar efter h�ndelser
		
		//Knappar
		btnL�g = new JButton("L�gg in bok");
		btnL�g.setBounds(410,115,120,30);
		add(btnL�g);
		btnL�g.addActionListener(this); //Skapar en lyssnar som lyssnar efter h�ndelser
		
		btnVisa = new JButton("Visa b�cker");
		btnVisa.setBounds(550,115,120,30);
		add(btnVisa);
		btnVisa.addActionListener(this); //Skapar en lyssnar som lyssnar efter h�ndelser
		
		btnSt�ng = new JButton("St�ng Applikation");
		btnSt�ng.setBounds(750,530,200,50);
		add(btnSt�ng);
		btnSt�ng.addActionListener(this);
		
		//Textf�lt
		txtFieldTitle = new JTextField();
		txtFieldTitle.setBounds(150,90,200,20);
		add(txtFieldTitle);
		
		txtFieldAuthor = new JTextField();
		txtFieldAuthor.setBounds(150,115,200,20);
		add(txtFieldAuthor);
		
		txtFieldPrice = new JTextField();
		txtFieldPrice.setBounds(150,140,200,20);
		add(txtFieldPrice);
		
		//Textareor (st�rre textf�lt)
		ta1 = new JTextArea();
		ta1.setBounds(720,40,300,220);
		ta1.setBorder(redBorder);
		add(ta1);
		
		//RadioKnappar start
		proRadio = new JRadioButton("Bok");
		amateurRadio = new JRadioButton("Programmeringsbok");
		proRadio.setSelected(true);
		
		playersBtnGroup = new ButtonGroup();
		playersBtnGroup.add(proRadio);
		playersBtnGroup.add(amateurRadio);
		proRadio.setBounds(150,250,100,30);
		amateurRadio.setBounds(260,250,150,30);
		add(proRadio);
		add(amateurRadio);
		
		//Labels
		txtTextArea = new JLabel("B�cker");
		txtTextArea.setBounds(850,265,120,30);
		add(txtTextArea);
		
		txtTitle = new JLabel("Titel");
		txtTitle.setBounds(80,90,200,20);
		add(txtTitle);

		txtTitle = new JLabel("F�rfattare");
		txtTitle.setBounds(80,115,200,20);
		add(txtTitle);

		txtTitle = new JLabel("Pris");
		txtTitle.setBounds(80,140,200,20);
		add(txtTitle);
		
		// Databas information
		MyDB dbData = new MyDB();
		dbData.show();
		txtTextData = new JLabel("Data kommer fr�n databas");
		txtTextData.setBounds(250,640,190,20);
		add(txtTextData);
		ta2 = new JTextArea();
		ta2.setBounds(130,390,400,250);
		ta2.setBorder(redBorder);
		add(ta2);

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
		
		String data ="";
		while(result.next())
		{	data+=result.getString(1) + " " + result.getString(2) + " " + result.getString(3)  + " " + result.getString(4) + "\n";
			System.out.println(ta2.getText());
		}
		ta2.setText(data);
		
		laddaBok();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnL�g) //L�gg in bok
		{
			String title = txtFieldTitle.getText();
			String author = txtFieldAuthor.getText();
			String price = txtFieldPrice.getText();
			//String aLanguage = txtFieldLanguage.getText();
			int thePrice = Integer.parseInt(price);
		
			Book enBok = new Book(title,author,thePrice);
			aList = new ArrayList<Book>();
			aList.add(enBok);
			if (proRadio.isSelected() == true){
		
			}
			if (amateurRadio.isSelected() == true){
		
			}
	    }//if getSource
		
		if(e.getSource() == btnSt�ng) //St�ng-knapp
		{
			sparaBok(aList); //Anrop till metod f�r att spara
			System.exit(0); //Talar om att vi vill st�nga f�nster
		}
		
		if(e.getSource() == btnVisa) //Visa b�cker
		{
			
			//Foreach JavaWay :)
			 //For each book b IN aList
			 for (Book b : aList) {
			 ta1.append("Titel: " + b.getTitle() + "\n");
			 ta1.append("F�rfattare: " + b.getAuthor() + "\n");
			 ta1.append("Pris: " + Integer.toString(b.getPrice()) + "\n");
			 ta1.append("\n");
		}//foreach
			 
		
	}
		
	}
	
	
	public void sparaBok(ArrayList<Book> aList)
	{
		try
		{
			FileOutputStream fil = new FileOutputStream("C:\\SavedObjects\\Objektfil.txt");
			ObjectOutputStream oostr = new ObjectOutputStream(fil);
			oostr.writeObject(aList);
			oostr.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.out.println("Nu blev det visst fel i spara Bok");
		}
	}//slut sparaBok
	
	@SuppressWarnings("unchecked")
	public void laddaBok()
	{
		try
		{
			FileInputStream fil = new FileInputStream("C:\\SavedObjects\\Objektfil.txt");
			ObjectInputStream oistr = new ObjectInputStream(fil);
			aList = (ArrayList<Book>) oistr.readObject();
			oistr.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.out.println("Nu blev det visst fel i ladda IO");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
			System.out.println("Nu blev det visst fel i ladda ClassNot...");
		}
	}//slut laddaBok
}
