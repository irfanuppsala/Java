
public class ProgrammingBook extends Book {
	public static void main(String args[]){
		ProgrammingBook programmingJava = new ProgrammingBook();
		
		programmingJava.setTitle("C++");
		programmingJava.setAuthor("Skansholm");
		programmingJava.setPrice(500);
		programmingJava.setLanguage("PHP");
		
		programmingJava.skrivUt();
	}
	
	protected String language = "";
	public ProgrammingBook() {
	}

	public ProgrammingBook(String title, String author, int price, String language) {
		super(title, author, price);
		setLanguage(language);
	}
	
	// Setter
	public void setLanguage(String language) {
		this.language = language;
	}
	
	// Hämtar attribut
	public String Language() {
		return language;
	}
	
	//override
	public void skrivUt()
	{
		super.skrivUt();
		System.out.println("Programmeringsspråk: " + language);
	}
}
