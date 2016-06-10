
/*
* 	This class is a simple example of function overriding, function overloading, and multilevel inheritance. @Overriding 
*   keyword used for function overriding and since we're using the same function name called skrivUt() with different definition 
*   in different classes, so we're implementing function Overloading as well.  
*/
public class Film {
	private String titel;
	private String huvudroll;
	private String typ;
	private int l�ngd;
	
	Film(){}
	public static void main(String args[]){
		Film baseFilm = new Film();
		L�ngfilm lFilm = new L�ngfilm();
		Kortfilm kFilm = new Kortfilm();
		TypAvVideo videoTyp = new TypAvVideo();
		
		baseFilm.skrivUt();
		lFilm.skrivUt();
		kFilm.skrivUt();
		videoTyp.skrivUt();
	}
	
	public void skrivUt(){
		setTitel("Titanic");
		setHuvudroll("Hero");
		setTyp("Action");
		setL�ngd(2);
		System.out.println("Looking for a movie with the following description: \n" + "Title:" + titel + "\nMain Roll:" + huvudroll + "\nType:" + typ + "\nDuration:" + l�ngd +"\n");
	}
	
	// Setters
	public void setTitel(String titel){
		this.titel = titel;
	}
	public void setHuvudroll(String huvudroll){
		this.huvudroll = huvudroll;
	}
	public void setTyp(String typ){
		this.typ = typ;
	}
	public void setL�ngd(int l�ngd){
		this.l�ngd = l�ngd;
	}
	
	// Getters
	public String getTitel(){
		return titel;
	}
	public String getHuvudroll(){
		return huvudroll;
	}
	public String getTyp(){
		return typ;
	}
	public int getL�ngd(){
		return l�ngd;
	}
	
}
