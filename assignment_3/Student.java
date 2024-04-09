package Assign4;

public class Student {
	int id;
	String name;
	int mark;
	
public Student(int id, String name, int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	} 

public void display() {
	System.out.println(id+name+mark);
}
}

