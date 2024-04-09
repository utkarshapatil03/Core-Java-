package Scanner;

public class Book extends Author{
	String name2;
	String author;
	double price;
	int qty;
	
	public Book(String name, String email, char gender, String name2, String string, int price, int qty) {
		super(name, email, gender);
		this.name2 = name2;
		this.author = string;
		this.price = price;
		this.qty = qty;
	}


	public String getName2() {
		return name2;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book [name2=" + name2 + ", author=" + author + ", name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
	}
	

}
