package technoCredits;

import java.util.function.Predicate;

public class EmployeeDetails {

	int empId;
	String empName;
	String deptName;
	double salary;
	String gender;
	
	public EmployeeDetails(int empId, String empName, String deptName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	static public Predicate<EmployeeDetails> isEmployeeHighlyPaid(){
		return emp -> emp.salary>50000;
	}
	
	public Predicate<EmployeeDetails> isDeptName(String deptName){
		return emp -> emp.deptName.equals(deptName); 
	}
	
	public String toString() {
		return this.empName + ":" + this.empId + ":" + this.deptName + ":" + this.salary;
	}
}
