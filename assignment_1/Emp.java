package Scanner;

import java.util.*;

public class Emp {
	int empno;
	String empname;
	String designation;
	String dept;
	int salary;
	
public void readEmpData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee no:");
	empno = sc.nextInt();
	
	System.out.println("Enter Employee name:");
	empname = sc.next();
	
	System.out.println("Enter Designation:");
	designation = sc.next();
	
	System.out.println("Enter Department name:");
	dept = sc.next();
	
	System.out.println("Enter Salary:");
	salary = sc.nextInt();
}

public void displayEmpData() {
	System.out.println(empno);
	System.out.println(empname);
	System.out.println(designation);
	System.out.println(dept);
	System.out.println(salary);
}

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.readEmpData();
		e1.displayEmpData();

	}

}
