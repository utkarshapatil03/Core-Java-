package Scanner;

public class CommissionEmployee extends Employee1{
	double sales;
    double commission;

	public CommissionEmployee(String name, String ssn, double sales, double commission) {
		super(name, ssn);
		this.sales = sales;
		this.commission = commission;
	}
    
	 @Override
	    public double salary() {
	        return sales * commission;
	    }

	    @Override
	    public String toString() {
	        return "CommissionEmployee{" +
	                "name='" + getName() + '\'' +
	                ", ssn='" + getSsn() + '\'' +
	                ", sales=" + sales +
	                ", commission=" + commission +
	                '}';
	    }

}	

