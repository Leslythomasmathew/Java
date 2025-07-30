package JavaTut;
class Book{
	String title;
	String author;
	double price;
	int quantity;
	double total_value;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price= price;
		this.quantity = quantity;
		
	}
	
	public void displayDetails() {
		total_value=(price*quantity);
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		System.out.println("Total Value :"+total_value);
	}
	}
	

public class BookStore {
	public static void main(String[] args){
		Book st1 = new Book("Book1","Lesly",88,1);
		
		Book st2 = new Book("Book2","Johnson",95,2);
		st1.displayDetails();
		st2.displayDetails();
	}

}
