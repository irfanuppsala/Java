
public class Barnbok extends Bok{

	public int �lder;
	
	public static void main(String args[]){
		Bok bokMain = new Bok();
		bokMain.skrivUt(955);
	}
	
	//super();
	//super(f�lten,f�rfattare,pris);
	//super(one,two,three,four);
	
	
	public void skrivUt(){
		
	}

	//Setter
	public void set�lder(int �lder)
	{
		this.�lder = �lder;
	}
	
	//Getter
	public int get�lder()
	{
		return �lder;
	}
}
