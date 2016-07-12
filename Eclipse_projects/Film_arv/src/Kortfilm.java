
public class Kortfilm extends Film{
	private String sort;
	
	// Function overriding
	@Override
	public void skrivUt(){
		System.out.println("\n");
		super.skrivUt();
		setSort("Musik Video");
		System.out.println("Kategory:" + sort);
	}
	
	// Setters
	public void setSort(String sort){
		this.sort = sort;
	}

	// Getters
	public String getSort(){
		return sort;
	}
}
