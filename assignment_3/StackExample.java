package Assign4;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		//Pop(remove)
		Integer ele = s.pop();
		System.out.println(ele);
		System.out.println(s);
		
		//Push(add)
		s.push(200);
		System.out.println("performed push operation to add value"+ s);
		
		//Display objects on stacks
		System.out.println("using for each to display object");
		for(Integer n:s) {
			System.out.println(n);
		}

	}

}
