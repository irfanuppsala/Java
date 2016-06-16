public class Person
{
	public static void main(String[] args){
		Person per = new Person();  // Creating a Computer class object with the constructor
		per.setNamn("Maria Jhonsson");  // Setting the value of namn variable by calling setter method of Person class using its object called per 
		per.setAdress("Hus 34 Malmö");
		per.setEmail("maria.jhonsson@email.com");
		per.skrivUt();  // Printing member variables of the class method skrivUt() by using class object per;
		
		Person perData = new Person("Alexandra", "Malmö", "alexandra@femail.com",0760262011); // Creating a Computer class object with the constructor that has parameters. 
		perData.skrivUt(); // Printing member variables of the class method skrivUt() by using class object EnComputer;
	}
	
	private String namn; // Variable that can only be access inside the class.
	private String adress;
	private String email;
	private long telefon;
	
	//Getter for "namn"
	public String Namn() {
		return namn;
	}
	// Setter for "namn"
	public void setNamn(String namn) {
		this.namn = namn;
	}
	
	//Getter for "adress"
	public String Adress() {
		return adress;
	}
	// Setter for "adress"
	public void setAdress(String adress) {
		this.adress = adress;
	}

	//Getter for "Email"
	public String Email() {
		return email;
	}
	// Setter for "Email"
	public void setEmail(String email) {
		this.email = email;
	}
	

	//Constructor
	public Person(String namn, String adress, String email, long telefon)
	{
		this.namn = namn;
		this.adress = adress;
		this.email = email;
		this.telefon = telefon;
	}
	
	//Empty constructor
	public Person()
	{}
	
	public void skrivUt()
	{
		System.out.println("Namn: " + namn);
		System.out.println("Adress: " + adress);
		System.out.println("Email: " + email);
		System.out.println("Telefon: " + telefon);
		System.out.println("");
	}
}