public class Bok {
	public String f�lten;
	public String f�rfattare;
	public int pris; 
	public int value;
	
	public Bok(){}
/*	public Bok(String f�lten, String f�rfattare, int pris){

	}
	public Bok(String one, String two, String three, String four){
		
	}*/
	
	public void skrivUt(int value){
		setF�lten("Introduction to programming");
		setF�rfattare("Jack straw");
		setPris(955);
		System.out.println("Title=" + f�lten + "\nAuthor=" + f�rfattare + "\nPrice=" + pris);

    	this.value = value + (value*25)/100;
		System.out.println("\nBook price after applying moms is: " + this.value);
	}
	
	//Setters
	public void setF�lten(String f�lten)
	{
		this.f�lten = f�lten;
	}
	public void setF�rfattare(String f�rfattare)
	{
		this.f�rfattare = f�rfattare;
	}
	public void setPris(int pris)
	{
		this.pris = pris;
	}
	
	//Getters
	public String getF�lten()
	{
		return f�lten;
	}
	public String getF�rfattare()
	{
		return f�rfattare;
	}
	public int getPris()
	{
		return pris;
	}
}
