import java.io.Serializable;

public class Book implements Serializable {
	private String title;
	private String author;
	private int price;
	
	public Book(String title, String author, int price) {
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}
	
	// Getters
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	} 
	
	// Setters
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setPrice(int price){
		this.price = price;
	}
}
