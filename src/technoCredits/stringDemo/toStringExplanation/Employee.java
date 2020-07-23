package technoCredits.stringDemo.toStringExplanation;

public class Employee extends Object{
	int empid;
	String empFirstName;
	String empLastName;
	int empdept;
	
	public Employee(int empid, String empFirstName, String empLastName, int empdept) {
		this.empid = empid;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empdept = empdept;
	}

	public String toString() {
		return empid + ":" + empFirstName + ":" + empLastName + ":" + empdept;
	}
}
