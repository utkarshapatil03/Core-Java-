package Scanner;

public class HourlyEmployee1 extends Employee1 {
	double wage;
    double hours;
    
	public HourlyEmployee1(String name, String ssn, double wage, double hours) {
		super(name, ssn);
		this.wage = wage;
		this.hours = hours;
	}
    
	@Override
    public double salary() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + getName() + '\'' +
                ", ssn='" + getSsn() + '\'' +
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
	
	
	
}
