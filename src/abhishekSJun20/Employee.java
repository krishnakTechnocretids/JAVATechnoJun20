package abhishekSJun20;

public class Employee {

	int empId; 
	String empname;
	double salary;
	int deptId;
	void setData(int employeeNumber,String employeeName,double employeeSalary,int departmentId) {
		empId=employeeNumber;
		empname=employeeName;
		salary=employeeSalary;
		deptId=departmentId;
	}

	String getEmpName() {
		return empname;
	}

	int getEmpId() {
		return empId;
	}

	String getEmployeeBand() {
		if(salary>=30000) 
			return "Band A";	
		else
			return "Band D";
	}

	String getEmployeeDeptName() {
		if(deptId==1){
			return "IT";
		}else if(deptId==2)
			return "Finance";
		else 
			return "Support team";
	}
	boolean isEligibleForIncrement() {
		if (deptId==1 || salary>=30000) {
			return true;
		}else
			return false;
	}

	public static void main(String[]args) {
		Employee employee1=new Employee();
		employee1.setData(1, "radhe", 3000, 2);
		System.out.println("Empoyee1 Details are : --->");
		System.out.println("Employee name: " +employee1.getEmpName());
		System.out.println("Employee id: " +employee1.getEmpId());
		System.out.println("Band Achieved: " + employee1.getEmployeeBand());
		System.out.println("Employee department is:" + employee1.getEmployeeDeptName());
		if (employee1.isEligibleForIncrement()== true)
			System.out.println("Employee is eligible for increment");
		else
			System.out.println("Employee is not eligible for increment");

		Employee employee2= new Employee();
		employee2.setData(2, "Radh2", 30000, 4);
		System.out.println("");
		System.out.println("Employee2 Datails are: --->");
		System.out.println("Employee name: " +employee2.getEmpName());
		System.out.println("Employee id: " +employee2.getEmpId());
		System.out.println("Band Achieved: " + employee2.getEmployeeBand());
		System.out.println("Employee department is:" + employee2.getEmployeeDeptName());
		if (employee2.isEligibleForIncrement()== false)
			System.out.println("Employee is eligible for increment");
		else
			System.out.println("Employee is not eligible for increment");
	}

}
