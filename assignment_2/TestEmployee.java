package Scanner;

public class TestEmployee {

	public static void main(String[] args) {
	HourlyEmployee hm = new HourlyEmployee(111,"xxx","zzz",5000);
	hm.display();
	System.out.println("Gross Pay: " + hm.computeGrossPay());
    System.out.println("Net Pay: " + hm.computeNetPay());
	hm.printSalary();
	
	SalariedEmployee sm = new SalariedEmployee(222,"aaa","bbb",6000);
	sm.display();
	System.out.println("Gross Pay: " + sm.computeGrossPay());
    System.out.println("Net Pay: " + sm.computeNetPay());
    sm.printSalary();

	}

}
