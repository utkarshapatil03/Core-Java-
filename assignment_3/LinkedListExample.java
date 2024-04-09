package Assign4;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		
		System.out.println(li);
		
		//Insert at the beginning.
		li.add(0,800);
		System.out.println(li + "Inserting element at the beginning");

		
		//Insert at given position.
		li.set(1,150);
		System.out.println(li + " Inserting element at given position");
		
		//Insert after a given node.
		Scanner sc = new Scanner(System.in);
		Integer node = sc.nextInt();
		li.set(node+1, 270);
		System.out.println(li +"Inserting element after a given node");
		
		//Delete at the beginning
		li.remove(0);
		System.out.println(li +"Delete at the beginning");
		
		//Delete at given position
		li.remove(2);
		System.out.println(li + "Delete at given position");
		
		//Delete after a given node
		Integer node1 = sc.nextInt();
		li.remove(node1+1);
		System.out.println(li +"Delete after given node");
;
		}

}
