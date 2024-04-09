package Scanner;

public class SalariedEmployee extends Employee {
	int salary;

	public SalariedEmployee(int ssn, String firstName, String lastName, int salary) {
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
        return salary / 12; // Assuming monthly salary
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

	

