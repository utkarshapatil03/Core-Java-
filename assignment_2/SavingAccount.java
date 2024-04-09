package Scanner;

public class SavingAccount extends BankAccount{
	float interestRate;

	
    
	public SavingAccount(long accountnumber, double totalbalance, float interestRate) {
		super(accountnumber, totalbalance);
		this.interestRate = interestRate;
	}



	public void addInterest(double interestRate) {
		double amount = totalbalance *(interestRate/100);
		totalbalance = totalbalance + amount;
		System.out.println(amount + "interest added succesfuly");
		  
	}

}
