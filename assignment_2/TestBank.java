package Scanner;

public class TestBank {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(123335,50000,500);
		ca.deposit(500);
		ca.withdraw(500);
		ca.getbalance();
		ca.deductfee();
		
		SavingAccount sa = new SavingAccount(110000,50000,5);
		sa.deposit(500);
		sa.withdraw(400);
		sa.getbalance();
		sa.addInterest(5);
			
		}

	}




