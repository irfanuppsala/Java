
public class Långfilm extends Film{
	private String location;
	
	// Function overriding 
	@Override
	public void skrivUt(){
		super.skrivUt();
		setLocation("New York City");
		System.out.println(location);
	}
	
	// Setters
	public void setLocation(String location){
		this.location = location;
	}

	// Getters
	public String getLocation(){
		return location;
	}

}
