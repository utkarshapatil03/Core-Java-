package Assign4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FileHandlingobject {

	public static void main(String[] args) {
		ArrayList<Students> list = new ArrayList<>();
		Students s1 = new Students(11, "abc", 50,"java");
		Students s2 = new Students(22, "cgd", 60,"python");
		Students s3 = new Students(33,"bcd",30,"JavaScript");
		Students s4 = new Students(44,"bcd",40,"C++");
		Students s5 = new Students(55, "bgf",20,"R");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
	
     // write to the file
     		FileOutputStream fo = new FileOutputStream("Student.txt");
     		ObjectOutputStream oo = new ObjectOutputStream(fo);
     		  		
     		oo.writeObject(list);
     		System.out.println("object write is over");
     		
     		fo.close();
     		oo.close();
     		
     		//Read From the file
     		FileInputStream fi = new FileInputStream("Student.txt");
     		ObjectInputStream oi = new ObjectInputStream(fi);
     		ArrayList<Students>listFromFile = (ArrayList<Students>) oi.readObject());
     		
     		oi.close();
     		fi.close();

     		
     		//Find out result and display the student details along with result.
     		for(Students result: listFromFile) {
     			result.display();
     			if(result.mark < 35) {
     				System.out.println("Fail");
     			}else {
     				System.out.println("pass");
     			}
     		}
     		
     		//Find out how many no of students passed and failed in a particular Subject.
             for(Students result:listFromFile) {
             	result.display();
             	if(result.mark < 35) {
             		System.out.println("Fail");
             	}else {
             		System.out.println("pass");
             	}
             }
     		
             
             //Find out how many no of students passed and failed in a particular Subject.
             int pass = 0;
             int fail = 0;
             Object subject;
     		for(Students student : listFromFile) {
     			if(student.subject.equals(subject)) {
     				if ((student.mark)<=35) {
     					fail++;
     				}else {
     					pass++;
     				}
             		
             	}
             }
             System.out.println("Number of students passed in"+ subject + pass);
             System.out.println("Number of students failed in"+ subject + fail);
             
             
             //Sort the students object based on marks.
             Collections.sort(listFromFile, Comparator.comparing(Students ->Student.mark));
             System.out.println("Soretd the student mark");
             System.out.println(list);
             
     	}
}

