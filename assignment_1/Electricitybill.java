package Scanner;

import java.util.Scanner;

public class Electricitybill {
	int customernumber;
	String customername;
	float unitsconsumed;
	
public void readData() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter customer number:");
	customernumber = sc.nextInt();
	
	System.out.println("Enter Customer name:");
	customername = sc.next();
	
	System.out.println("Enter Unit Consumed");
	unitsconsumed = sc.nextFloat();
	
}

public void showData() {
	System.out.println("customernumber: " + customernumber);
	System.out.println("customername: " + customername);
	System.out.println("unitsconsumed: " + unitsconsumed);
}

public double computeBill() {
	double bill = 0.0;
	if(unitsconsumed <=100) {
		bill = unitsconsumed*1.20;
		}
	else if(unitsconsumed<=300) {
		bill = 100*1.20+ (unitsconsumed - 100)*2.00;
	}
	else if(unitsconsumed <= 600) {
		bill = 100*1.20 + 200*2.00 + (unitsconsumed-300)*3.00;
	}
	else{
		bill = 100*1.20 + 200*2.00 + 300*3.00+ (unitsconsumed-600)*5.00;
	}
	return bill;
}

	public static void main(String[] args) {
		Electricitybill customer = new Electricitybill();
		customer.readData();
		customer.showData();
		double bill = customer.computeBill(); 
		
		System.out.println("Total Electricity bill :" + bill);
	}

}
