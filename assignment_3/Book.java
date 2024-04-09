package Assign4;

public class Book {
	String name;
	double price;
	String authorname;
	int isbnno;
	String publication;
	
	public Book(String name, int price, String authorname, int isbnno, String publication) {
		this.name = name;
		this.price = price;
		this.authorname = authorname;
		this.isbnno = isbnno;
		this.publication = publication;
	}
	
    void display() {
    	System.out.println(name + price + authorname +isbnno + publication);
    }
	
}
