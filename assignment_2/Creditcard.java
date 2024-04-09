package Scanner;

public interface Creditcard {

	void rupees(double amount);
	void dollar(double amount);
	void pound(double amount);


}

class BankAcc implements Creditcard 
{
	@Override
	public void rupees(double amount) {
	 System.out.println("Payment done through Rupees: "+ amount);
		
	}

	@Override
	public void dollar(double amount) {
		 System.out.println("Payment done through dollar: " +amount);
	}
	
	@Override
	public void pound(double amount) {
		 System.out.println("Payment done through pound: " + amount);
	}
	
}
 
class TestInterface {

	public static void main(String[] args) {
		Creditcard c;
		c = new BankAcc();
		c.rupees(1000);
		c.dollar(2000);
		c.pound(3000);
	

	}

}