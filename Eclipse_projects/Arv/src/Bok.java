public class Bok {
	public String fälten;
	public String författare;
	public int pris; 
	public int value;
	
	public Bok(){}
/*	public Bok(String fälten, String författare, int pris){

	}
	public Bok(String one, String two, String three, String four){
		
	}*/
	
	public void skrivUt(int value){
		setFälten("Introduction to programming");
		setFörfattare("Jack straw");
		setPris(955);
		System.out.println("Title=" + fälten + "\nAuthor=" + författare + "\nPrice=" + pris);

    	this.value = value + (value*25)/100;
		System.out.println("\nBook price after applying moms is: " + this.value);
	}
	
	//Setters
	public void setFälten(String fälten)
	{
		this.fälten = fälten;
	}
	public void setFörfattare(String författare)
	{
		this.författare = författare;
	}
	public void setPris(int pris)
	{
		this.pris = pris;
	}
	
	//Getters
	public String getFälten()
	{
		return fälten;
	}
	public String getFörfattare()
	{
		return författare;
	}
	public int getPris()
	{
		return pris;
	}
}
