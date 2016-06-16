import java.lang.String;

public class Books //Här talar vi om att det är en klass vi skapar och att den ska heta book.
{
    private String title; //Variabel som endast kan nås i klassen.
    private String author;
    public int price;
    //egenskaper (properties). Används för att förhindra åtkomst till privata variabler.

	public void skrivUt()
	{
		System.out.println("Titel " + title);
		System.out.println("F�rfattare " + author);
		System.out.println("Pris " + price);
		System.out.println("");
	}
	
    //Getter for "title"
    public String Title() {
        return title;
    }

    // Setter for "title"
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter for "author"
    public String Author() {
        return author;
    }

    // Setter for "author"
    public void setAuthor(String author) {
        this.author = author;
    }

    //Getter for "price"
    public int Price() {
        return price;
    }

    // Setter for "price"
    public void setPrice(int price) {
        this.price = price;
    }
}
