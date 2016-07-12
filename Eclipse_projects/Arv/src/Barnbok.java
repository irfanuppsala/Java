
public class Barnbok extends Bok{

	public int ålder;
	
	public static void main(String args[]){
		Bok bokMain = new Bok();
		bokMain.skrivUt(955);
	}
	
	//super();
	//super(fälten,författare,pris);
	//super(one,two,three,four);
	
	
	public void skrivUt(){
		
	}

	//Setter
	public void setÅlder(int ålder)
	{
		this.ålder = ålder;
	}
	
	//Getter
	public int getÅlder()
	{
		return ålder;
	}
}
