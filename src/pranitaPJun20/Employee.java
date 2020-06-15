/*
Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.
a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" otherwise return "Band D".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, if deptid is 2 then return department name as "Finance", anything apart from 1 and 2, retun department name as "Support team".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and main method will print Employee is eligible for increment, otherwise print not "eligible for increment" message.
 */

package pranitaPJun20;

public class Employee {
	int empId,deptId;
	String empName ;
	double salary;
 
	 void setData(int eId,String eName,double monthlySalary,int departmentId){
		empId = eId;
		empName =eName;
		salary =monthlySalary;
		deptId =departmentId; 
	 }
	 
	 String getEmpName(){
		 System.out.println("Employee Name is: "+empName);
		 return empName;
	 }
	 
	 int getEmpId(){
		 System.out.println("Employee ID is: "+empId);
		 return empId;
	 }
//create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" otherwise return "Band D".
	 String getEmployeeBand(){	 
		 if(salary>30000)
		 {
			 System.out.println("Emplyee band is: Band A ");
			 return "Band A" ;
		 }
		 else
		 {
			 System.out.println("Emplyee band is: Band D ");
			 return "Band D";
		 }
		 
	 }
//create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, if deptid is 2 then return department name as "Finance",
 //anything apart from 1 and 2, return department name as "Support team".
	 
	 String getEmployeeDeptName(){
		 if(deptId==1){
			 System.out.println("Employee department is :IT");
			return "IT" ;
		 }
		 else if(deptId==2){
			 System.out.println("Employee department is: Finance");
			 return "Finance";
		 }
		 else{
			 System.out.println("Employee department is: Support team");
			 return "Support team";
		 } 
	 }
//Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true 
	boolean isEligibleForIncrement(){
		if(deptId==1 || salary<30000)
		
			return(true);
		
		else
			
			return(false);	
	}
	
//main method will print Employee is eligible for increment, otherwise print "not eligible for increment" message.
	public static void main(String[] args){
		Employee employee = new Employee();
		System.out.println("First Employee details:- ");
		employee.setData(523617,"Shashank",60000,1);
		employee.getEmpName();
		employee.getEmpId();
		employee.getEmployeeBand();
		employee.getEmployeeDeptName();
		employee.isEligibleForIncrement();
		if(employee.isEligibleForIncrement() == true) 
			System.out.println("Employee is eligible for increment");
		else 
			System.out.println("Employee is not eligible for increment");
		
		
		//to print other details in main method
		/*System.out.println("Employee ID: "+employee1.getEmpId());
		System.out.println("Employee Name: "+employee1.getEmpName());
		System.out.println("Employee Band: "+employee1.getEmployeeBand());
		System.out.println("Department: "+employee1.getEmployeeDeptName());
		 */
		 
		System.out.print("\n");
		System.out.println("Second Employee details:");
		Employee employee1 =new Employee();
		employee1.setData(545185,"Pranita",30000,2);
		employee1.getEmpName();
		employee1.getEmpId();
		employee1.getEmployeeBand();
		employee1.getEmployeeDeptName();
		employee1.isEligibleForIncrement();
		if(employee1.isEligibleForIncrement() == true) 
			System.out.println("Employee is eligible for increment");
		else 
			System.out.println("Employee is not eligible for increment");
		
	}
}


