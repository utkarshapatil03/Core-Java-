package Assign4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		HashMap<Integer,Book> hm = new HashMap<>();
		Book b1 = new Book("abc", 100, "xyz", 10, "az");
		Book b2 = new Book("cde", 200, "blu", 20, "yz");
		Book b3 = new Book("abd", 300, "hjr", 30, "ax");
		Book b4 = new Book("dbg", 400, "thr", 40, "dh");
		Book b5 = new Book("thy", 500, "dbo", 50, "xh");
		
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		hm.put(4, b4);
		hm.put(5, b5);
		
		//Display all the map object using for each 
		for(Map.Entry<Integer, Book> m: hm.entrySet()) {
			System.out.println(m.getKey());
			m.getValue().display();
			System.out.println(" ");
		}
		
		//Read any key from the user and display the particular book object based on key 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		//display book object
		for(Map.Entry<Integer, Book> m: hm.entrySet()) {
			if(m.getKey()== key) {
				System.out.println(m.getKey());
				m.getValue().display();
				System.out.println(" ");
				
			}
		}
		
        //Reduce the price by 10% for a particular publication books and display all object with reduced price. 
		
		System.out.println("Enter the Publication name to reduce the price ");
		String Pb = sc.next();
		for(Map.Entry<Integer, Book> m: hm.entrySet()) {
			if(Pb.equals(m.getValue().publication)) {
				System.out.println(m.getKey() +" "+ m.getValue());
				double reducedPrice = m.getValue().price*0.9;
				m.getValue().price = reducedPrice;
				m.getValue().display();
				System.out.println(" ");
			}else {
				System.out.println("Invalid Input.");
				
				}
		  }
		
		
	}

}
