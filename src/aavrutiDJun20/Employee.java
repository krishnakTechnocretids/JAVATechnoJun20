package aavrutiDJun20;

public class Employee {

	int empid;
	String empname;
	double salary;
	int deptId;
	
	void setData(int employeeID,String employeeName,double empSalary,int empDeptId) {
		empid = employeeID;
		empname = employeeName;
		salary = empSalary;
		deptId = empDeptId;
	}
	
	//return employee name
	String getEmpName() {
		return empname;
	}
	
	//return employee ID
	int getEmpId() {
		return empid;
	}
	
	//Return Salary Band
	String getEmployeeBand() {
		
		if(salary > 30000) {
			return "Band A";
		}
		else if (salary <= 30000 && salary > 0) {
			return "Band D";
		}
		else {
			return "Invalid Salary. Please pass valid Salary Again.";
		}
	}
	
	//Return Department Name
	String getEmployeeDeptName() {
		
		if(deptId == 1) {
			return "IT";
		}
		else if(deptId == 2) {
			return "Finance";
		}
		else if(deptId > 0 && deptId != 1 && deptId != 2) {
			return "Support Team";
		}
		else {
			return "Invalid Department ID.Please pass valid Department ID again";
		}
	}
	
	//return whether employee is eligible for increment or not
	boolean isEligibleForIncrement() {
		
		boolean flag;
		if(deptId == 1 || (salary<30000 && salary>0)) {
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;
	}
	
	//Display Employee Info
	void displayEmployeeInfo(int employeeID,String employeeName,double empSalary,int empDeptId, String employeeBand, String eDeptName) {
		
		System.out.println("Employee ID: " + employeeID );
		System.out.println("Employee Name: " + employeeName );
		System.out.println("Employee Salary: " + empSalary );
		System.out.println("Employee Department ID: " + empDeptId );
		System.out.println("Employee Department Name: " + eDeptName );
		System.out.println("Employee Band: " + employeeBand );
	}
		
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.setData(41563, "Aavruti Dalmia", 25000, 1);
		employee2.setData(41564, "Nikhil Depolkar", 55000, 3);
		
		boolean eligibleForIncrement = employee1.isEligibleForIncrement();
		
		//Display employee 1 details
		System.out.println();
		System.out.println("Employee 1 details are as below: ");
		
		employee1.displayEmployeeInfo(employee1.getEmpId(), employee1.getEmpName(),employee1.salary,employee1.deptId,employee1.getEmployeeBand(),employee1.getEmployeeDeptName());
		
		//print whether employee 1 is eligible for increment or not
		if(eligibleForIncrement == true) {
			System.out.println("Employee " + employee1.getEmpName() + " is eligible for increment.");
		}
		else {
			System.out.println("Employee " + employee1.getEmpName() + " is not eligible for increment.");
		}
		
		
		boolean eligibleForIncrement2 = employee2.isEligibleForIncrement();
		
		//Display employee 2 details
		System.out.println();
		System.out.println("Employee 2 details are as below: ");
		
		employee2.displayEmployeeInfo(employee2.getEmpId(), employee2.getEmpName(),employee2.salary,employee2.deptId,employee2.getEmployeeBand(),employee2.getEmployeeDeptName());
		
		//print whether employee 2 is eligible for increment or not
		if(eligibleForIncrement2 == true) {
			System.out.println("Employee " + employee2.getEmpName() + " is eligible for increment.");
		}
		else {
			System.out.println("Employee " + employee2.getEmpName() + " is not eligible for increment.");
		}
	}
}

