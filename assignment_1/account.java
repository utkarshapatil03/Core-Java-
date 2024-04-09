package Scanner;

public class account {
	int accno;
	String accname;
	double amount;

public account(int accno, String accname, int amount) {
	this.accno = accno;
	this.accname = accname;
	this.amount = amount;
}

public void withdraw(double withdrawalAmount) {
    if (withdrawalAmount > amount) {
        System.out.println("Insufficient balance");
    } else {
        amount -= withdrawalAmount;
        System.out.println(withdrawalAmount + " withdrawn successfully");
    }
}

public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println(depositAmount + " deposited successfully");
    }

public void calculateInterest(double rate) {
    double interest = amount * (rate / 100);
    amount += interest;
    System.out.println("Interest calculated and added to the account balance");
}

public void display() {
	System.out.println(accno+ accname + amount);
	
}
public static void main(String[] args) {
		account ac = new account(10 , "utk" , 1000);
		ac.withdraw(500);
		ac.deposit(50);
		ac.calculateInterest(10);
		ac.display();

	}

}


