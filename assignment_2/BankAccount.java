package Scanner;

public class BankAccount {
	long accountnumber;
	double totalbalance;

public BankAccount(long accountnumber, double totalbalance) {
		this.accountnumber = accountnumber;
		this.totalbalance = totalbalance;
	}
	
public void deposit(double depositAmount) {
	totalbalance = totalbalance + depositAmount;
	System.out.println(totalbalance + "Amount deposited successfuly.");
}	


public void withdraw(double withdrwalAmount) {
	if(withdrwalAmount > totalbalance) {
		System.out.println("insufficient balance.");
	}else {
		totalbalance = totalbalance - withdrwalAmount;
		System.out.println(totalbalance + "balance withdrwal succesfuly.");
	}
}

public void getbalance() {
	System.out.println("accountnumber" + accountnumber);
	System.out.println("totalbalance" + totalbalance );
}
}