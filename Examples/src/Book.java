import java.io.*;

public class Book
{
	public String title = "N N";
	public String author = "N N";
	public int price = 0;
	public Book()
	{}
	
	//Construktor
	public Book(String title, String author, int price)
	{
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}
	
	//Setters
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	//Getters
	public int getPrice()
	{
		return price;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	
	//Utskriftsmetod
	public void skrivUt()
	{
		System.out.println("");
		System.out.println("Titel: " + title);
		System.out.println("Författare: " + author);
		System.out.println("Pris: " + price);
	}
}//End superclass
