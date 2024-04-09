package Scanner;

public class HourlyEmployee extends Employee {
	int salary;

	public HourlyEmployee(int ssn, String firstName, String lastName, int salary) {
		super(ssn, firstName, lastName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Method to compute gross pay
    public double computeGrossPay() {
        int hourlyWorked = 100;
		double hourlyRate = 50;
		return hourlyRate * hourlyWorked; // Assuming hourly salary
    }
    
    // Method to compute net pay
    public double computeNetPay() {
        return computeGrossPay() * 0.8; // Assuming 20% deduction for taxes
    }
    
    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
	

