
public class TypAvVideo extends Kortfilm{
	private String genre;
	
	// Function overriding
	@Override
	public void skrivUt(){
		System.out.println("================\n");
		super.skrivUt();
		setGenre("Action");
		System.out.println("Genre:" + genre);
	}
	
	// Setters
	public void setGenre(String genre){
		this.genre = genre;
	}

	// Getters
	public String getGenre(){
		return genre;
	}
}
