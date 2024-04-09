package Scanner;

public class SalariedEmployee1 extends Employee1 {
	double basicSalary;

	public SalariedEmployee1(String name, String ssn, double basicSalary) {
		super(name, ssn);
		this.basicSalary = basicSalary;
	}
	
	@Override
    public double salary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + getName() + '\'' +
                ", ssn='" + getSsn() + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }
	
	
}
