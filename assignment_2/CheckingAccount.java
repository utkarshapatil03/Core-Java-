package Scanner;

public class CheckingAccount extends BankAccount {
	double fee;
	
	public CheckingAccount(long accountnumber, double totalbalance, double fee) {
		super(accountnumber, totalbalance);
		this.fee = fee;
	}




	public void deductfee() {
		if(fee > totalbalance) {
			System.out.println("insufficient balance");
		}else {
			totalbalance = totalbalance - fee;
			System.out.println(fee + "dedect fee successfuly");
		}
		
	}




	

}
