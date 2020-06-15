package aadeshJun20;

public class Employee {

	int empId;
	String empName;
	double salary;
	int deptId;
		
	void setData(int employeeId, String employeeName, double employeeSalary, int departmentId )
	{
		empId = employeeId;
		empName = employeeName;
		salary = employeeSalary;
		deptId = departmentId ;
	}
	
	String getEmpName()
	{ 
		return empName; 
	}
	
	int getEmpId()
	{
		return empId;
		
	}
	
	String getEmployeeBand() 
	{
		if(salary>3000)
			return("Band A");
		else
			return("Band B");
	}
	
	String getEmployeeDeptName() 
	{	
	
		if(deptId==1)
			return("IT");
		
		else if(deptId==2)
			return("Finance");
					
		else return ("Support Team");
			
	}
	
	boolean isEligibleForIncreament()
	{
		if(deptId==1 || salary<3000)
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		employee.setData(123,"Shanky", 25000, 1);
		employee1.setData(321,"Appu", 40000, 2);
		System.out.println("Employee Details are");
		System.out.println("Name of Employee " + employee.getEmpName());
		System.out.println("Employee Band is " + employee.getEmployeeBand());
		System.out.println("Employee Department is " + employee.getEmployeeDeptName());
		System.out.println("Employee ID is "+ employee.getEmpId());
		if(employee.isEligibleForIncreament()==true)
			System.out.println("Eligible for Increament");
		else
			System.out.println("Not Eligible for Increament");
		
		System.out.println("Employee Details are");
		System.out.println("Name of Employee " + employee1.getEmpName());
		System.out.println("Employee Band is " + employee1.getEmployeeBand());
		System.out.println("Employee Department is " + employee1.getEmployeeDeptName());
		System.out.println("Employee ID is "+ employee1.getEmpId());
		if(employee1.isEligibleForIncreament()==true)
			System.out.println("Eligible for Increament");
		else
			System.out.println("Not Eligible for Increament");
		
		
	
	
	}
		
	
	
	
	
	

	



}
