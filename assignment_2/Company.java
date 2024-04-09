package Scanner;

import java.io.PrintStream;

public class Company {
	public static void main(String args[]) {
	CommissionEmployee cm = new CommissionEmployee("abhay", "cacg", 123, 5000);
	HourlyEmployee1 hm = new HourlyEmployee1("vira", "gjb", 100, 20);
	SalariedEmployee1 sm = new SalariedEmployee1("arun", "fghb", 20000);
	
	cm.salary();
	hm.salary();
	sm.salary();
	cm.toString();
	hm.toString();
	sm.toString();
	
	}

}
