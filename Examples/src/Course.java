import java.io.*;
import java.lang.String;

public class Course extends Book {
    
	public static void main(String args[])
    {
        //Skapar objekt
    	Book fairytaleBook = new Book();
    	Book programmingBook = new Book();
    	Book historyBook = new Book();
    	
    	historyBook.setTitle("C++ Direkt");
    	historyBook.setAuthor("Jan Skansholm");
    	historyBook.setPrice(700);
        
        //Sätter värden
/*        fairytaleBook.setTitle("Mio min Mio");
        fairytaleBook.setAuthor("Astrid Lindgren");
        fairytaleBook.setPrice(500);
        programmingBook.setTitle("C++ Direkt");
        programmingBook.setAuthor("Jan Skansholm");
        programmingBook.setPrice(700);
        
        System.out.println("Titel bok 2 " + fairytaleBook.Title());
        System.out.println("Titel bok 2 " + fairytaleBook.Author());
        System.out.println("Titel bok 2 " + fairytaleBook.Price());
        System.out.println("Titel bok 3 " + programmingBook.Title());
        System.out.println("Titel bok 3 " + programmingBook.Author());
        System.out.println("Titel bok 3 " + programmingBook.Price());*/

        historyBook.skrivUt();
    }
}
