package technoCredits.abstraction.p1;

// Abstract class can have constructors.
// To initialize parent class (abstract class) instance variable 
// or perform set of activity 
// while creating child class object, constructor is required in abstract class (Parent).

public class Employee1 extends Manager1{
	String empName;
	int empId;
	
	Employee1(String empName, int empId, int managerId){
		super(managerId);
		this.empName = empName;
		this.empId = empId;
	}
	
	void displayInfo() {
		System.out.println(empName + ":" + empId + ":" + managerId + ":" + managerName);
	}
	
	public static void main(String[] args) {
		Manager1 manager = new Employee1("Maulik",10102,101);
		
	}
	
	
}
