import java.io.Console;

public class Computer 
{
	public static void main(String[] args){
		Computer com = new Computer();
		Computer EnComputer = new Computer("IBM", "Corei9", 12000, "1TB"); // Creating a Computer object with the constructor that has parameters. 
		EnComputer.skrivUt(); // Printing member variables of the class method skrivUt() by using class object EnComputer; 
		
		
		com.setBrand("Stormaktstiden");
		com.setProcessor("Peter Englund");
		com.setRam(300);
		com.setHardDrive("1TB");
		System.out.println("Brand på datoran är " + com.Brand());
		
		int summan = calculate(5,7);
		System.out.println("Summan av talen är " + summan);		
	}
	private String brand; //Variabel som endast kan nås i klassen.
	private String processor;
	private int ram;
	private String hardDrive;
	
	//Getter for "brand"
	public String Brand() {
		return brand;
	}
	// Setter for "brand"
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Getter for "processor"
	public String Processor() {
		return processor;
	}
	// Setter for "processor"
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	//Getter for "Ram"
	public int Ram() {
		return ram;
	}
	// Setter for "ram"
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	//Getter for "hardDrive"
	public String HardDrive() {
		return hardDrive;
	}
	// Setter for "hardDrive"
	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}
	
	//Constructor
	public Computer(String brand, String processor, int ram, String hardDrive)
	{
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
	}
	
	//Empty constructor
	public Computer()
	{}
	
	public void skrivUt()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram);
		System.out.println("Hard Drive: " + hardDrive);
		System.out.println("");
	}
	
    private static int calculate(int tal1, int tal2)
	{
		  int summa = tal1 + tal2;
		  return summa;
	}
}
