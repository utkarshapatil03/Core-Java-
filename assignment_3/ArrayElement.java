package Assign4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayElement {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	  System.out.println(list);
	   
	  // remove particular element
	  list.remove(2);
	  System.out.println(list);
	  
	  //modify
	  list.set(0,80);
	  System.out.println(list);
	  
	  
	  // view all element
	  System.out.println("view all element:");
	  Iterator<Integer> iterator = list.iterator();
	  
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
	  
	  // View a Particular element- get() 
	  int element = list.get(2);
	  System.out.println("view paricular element: "+ element);
	  
	  //collection sort
	  Collections.sort(list);
	  System.out.println(list);
	}

}



