package technoCredits.collectionDemo.list;

public class Employee {

	int empId;
	String empName;
	String deptName;
	double salary;
	char gender;
	
	public Employee(int empId, String empName, String deptName, double salary, char gender) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
		this.gender = gender;
	}
	
	public String toString() {
		return empName + ":" + empId + ":" + deptName + ":" + salary + ":" + gender;
	}
}
