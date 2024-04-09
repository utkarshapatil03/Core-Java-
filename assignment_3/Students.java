package Assign4;

import java.io.Serializable;

public class Students implements Serializable{
	int id;
	String name;
	int mark;
	String subject;
	
	public Students(int id, String name, int mark, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.subject = subject;
	}
	
	void display()
	{
		System.out.println(id+name+mark+subject);
	}
	

}
