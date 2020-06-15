package harshadBJun20;

public class Employee {
	
	int empId,deptId;
	String empName;
	double salary;
	
	//To set values in instance variable
	void setData(int empId, String empName, double salary, int deptId) {
		if(deptId!=0 && deptId>0) {
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.deptId = deptId;
		}else{
			System.out.println("Invalid Department Id");
		}
	}
	
	//Method to return Employee name
	String getEmpName() {
		return empName;
	}
	
	//Method to return Employee name
	int getEmpId() {
		return empId;
	}
	
	//Method to return Employee Band as per Salary
	String getEmployeeBand() {
		if(salary>30000) {
			return "Band A";
		}else {
			return "Band D";
		}
		
	}
	
	//Method to return Employee Department Name according to Department Id.
	String getEmployeeDeptName(){
		if(deptId == 1) {
			return "IT";
		}else if(deptId == 2){
			return "Finance";
		}else {
			return "Support team";
		}
	}
	
	//Method to return Is Employee eligible for increment according to the dept. Id or Salary.
	boolean isEligibleForIncrement(){
		if(deptId == 1 || salary<30000) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//Main method with 2 Employee objects.
	public static void main(String[] args) {
		Employee employee1= new Employee();
		employee1.setData(101, "John Taylor", 25000.00, 1);
		System.out.println("Employee name: "+employee1.getEmpName());
		System.out.println("Employee id: "+employee1.getEmpId());
		System.out.println("Employee Band: "+employee1.getEmployeeBand());
		System.out.println("Employee belongs to "+employee1.getEmployeeDeptName() +" Department.");
		
		if(employee1.isEligibleForIncrement() == true) {
			System.out.println("Employee is eligible for increment");
		}else {
			System.out.println("Employee is not eligible for increment");
		}
		
		Employee employee2= new Employee();
		employee2.setData(201, "David Thompson", 35000.00, 2);
		System.out.println();
		System.out.println("Employee name: "+employee2.getEmpName());
		System.out.println("Employee id: "+employee2.getEmpId());
		System.out.println("Employee Band: "+employee2.getEmployeeBand());
		System.out.println("Employee belongs to "+employee2.getEmployeeDeptName() +" Department.");
		
		if(employee2.isEligibleForIncrement() == true) {
			System.out.println("Employee is eligible for increment");
		}else {
			System.out.println("Employee is not eligible for increment");
		}
		
	}
}
