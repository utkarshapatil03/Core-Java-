package Assign4;

import java.util.ArrayList;

public class StudMain {

	public static void main(String[] args) {
		StudManagement sm = new StudManagement();
		ArrayList<Student> a = sm.createobject();
		sm.displaystuobject(a);
		
		
		sm.deletestu(a);
		sm.displaystuobject(a);
		
		
		sm.updatestu(a);
		sm.displaystuobject(a);
		sm.bygetStud(a);
		int index = 1;
		System.out.println("Element at index " + index + ": " + viewElement(Student.al, index)))
	}

}
