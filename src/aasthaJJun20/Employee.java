package aasthaJJun20;

/*Assignment 8 :  13th Jun 2020
Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.
a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" otherwise return "Band D".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, if deptid is 2 then return department name as "Finance", anything apart from 1 and 2, retun department name as "Support team".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and 
h)main method will print Employee is eligible for increment, otherwise print "not eligible for increment" message.*/

public class Employee {
	
	int empId , deptId;
	String empName;
	double salary;
	
	void setData(int id, String name, double sal, int dptId) {
		empId = id;
		empName = name;
		salary = sal;
		deptId = dptId;
	}
	
	String getEmpName() {
		return empName;
	}
	
	int getEmpId() {
		return empId;
	}
	
	String getEmployeeBand() {
		if(salary > 30000)
			return "Band A";
		else
			return "Band D";
	}
	
	String getEmployeeDeptName() {
		if(deptId == 1)			
			return "IT";
		else if(deptId == 2)
			return "Finance";
		else
			return "Support team";
	}
	
	boolean isEligibleForIncrement() {
		if(deptId == 1 || salary < 30000)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();	
		employee1.setData(111, "Aastha", 29999, 1);
		System.out.println("\nDetails of Employee with Emp ID: "+employee1.getEmpId());
		System.out.println("Name: "+employee1.getEmpName());
		System.out.println("Band: "+employee1.getEmployeeBand());
		System.out.println("Department: "+employee1.getEmployeeDeptName());
		if(employee1.isEligibleForIncrement() == true)
			System.out.println("Above mentioned Employee is eligible for increment");
		else
			System.out.println("Above mentioned Employee is not eligible for increment");
		
		employee2.setData(222, "Sakshi", 40000, 3);
		System.out.println("\nDetails of Employee with Emp ID: "+employee2.getEmpId());
		System.out.println("Name: "+employee2.getEmpName());
		System.out.println("Band: "+employee2.getEmployeeBand());
		System.out.println("Department: "+employee2.getEmployeeDeptName());
		if(employee2.isEligibleForIncrement() == true)
			System.out.println("Above mentioned Employee is eligible for increment");
		else
			System.out.println("Above mentioned Employee is not eligible for increment");
	}
}
