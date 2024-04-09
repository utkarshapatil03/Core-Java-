package Assign4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudManagement {
	ArrayList<Student> createobject(){
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(100,"purva",90);
		Student s2 = new Student(200,"utkarsha",50);
		Student s3 = new Student(300,"pratiksha",60);
		Student s4 = new Student(400,"anushka",70);
		Student s5 = new Student(500,"arya",80);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		return al;
		
	}
	
	void displaystuobject(ArrayList<Student> al)
	{
		for(Student  obj :al)
		{
			obj.display();
		}
	}


public void updatestu(ArrayList<Student> al)
{
	System.out.println("enter stuid and the mark to update");
	Scanner sc = new Scanner(System.in);
	
	int arya = sc.nextInt();
	int m = sc.nextInt();
				
	for(Student  obj      :al)
	{
		if(obj.id ==arya)
		{
			obj.mark = m;
		}
				
	}
}

public void deletestu(ArrayList<Student> al) 
{
	System.out.println("enter stuid to be deleted");
	Scanner sc = new Scanner(System.in);
	int sid = sc.nextInt();
	int pos =0;
	for(Student  obj      :al)
	{
		if(obj.id ==sid)
		{
			 pos = al.indexOf(obj);
		}
				
	}
	
	al.remove(pos);
	
}


public void bygetStud(ArrayList<Student> al) {
	System.out.println("enter index no: ");
	Scanner sc = new Scanner(System.in);
	int ele = sc.nextInt();
System.out.println(al.get(ele));
	
	
}
public static int viewElement(ArrayList<Integer> arrayList, int index) {
    return arrayList.get(index);
}

}
