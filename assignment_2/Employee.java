package Scanner;

public class Employee {
	int ssn;
	String FirstName;
	String LastName;
	
	public Employee(int ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.FirstName = firstName;
		this.LastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void display() {
		System.out.println(ssn +"ssn");
		System.out.println(FirstName +"FirstName");
		System.out.println(LastName +"LastName");
	}
	
		
	}


