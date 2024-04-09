package Scanner;

public class Employee1 {
	String name;
    String ssn;

    public Employee1(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double salary() {
        return 0.0;
    }

    public String toString() {
        return "Employee{name='" + name + "', ssn='" + ssn + "'}";
    }
}

