package Scanner;

public class Student {
    int id;
    String name;
    int mark;
    String result;
    
Student(int id, String name, int mark){
	this.id = id;
	this.name = name;
	this.mark = mark;
}
   
public String result() {
	if(mark >= 35) {
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}
	return result;
	
}

public void studDetail() {
	System.out.println("id : "+id);
	System.out.println("name :" +name);
	System.out.println("mark :" + mark);
	
}
	public static void main(String[] args) {
		Student s = new Student(1000,"Utkarsha",50);
		s.studDetail();
		s.result();
		

	}

}
