/*Assignment 8 : 13th Jun 2020
Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.
a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" 
otherwise return "Band D".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, 
if deptid is 2 then return department name as "Finance", anything apart from 1 and 2, retun 
department name as "Support team".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or 
salary is less then 30,000 return true and main method will print Employee is eligible for increment, 
otherwise print not "eligible for increment" message.*/
package palakSJun20;
public class Employee {
	int empId , deptId;
	String empName;
	double salary;
	
	void setData(int empId, String empName, double salary, int deptId){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
	}
	String getEmpName(){
		return this.empName; 
	}
	int getEmpId(){
		return this.empId;
	}
	String getEmployeeBand(){
		if(salary > 30000){
			return "Band A";
		}else{
			return "Band D";
		}
	}
	String getEmployeeDeptName(){
		if(deptId==1)
			return "IT";
		else if(deptId == 2)
			return "Finance";
		else 
			return "Support Team";
	}
	boolean isEligibleForIncrement(){
		if(deptId == 1 || salary < 30000)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee(); // Employee 1 
		employee1.setData(44561, "Palak", 35000, 4);
		System.out.println("--Employee 1 Details--");
		System.out.println(" Name : " + employee1.empName);
		System.out.println(" Id : "+ employee1.empId);
		System.out.println(" Employee Band : "+ employee1.getEmployeeBand());
		System.out.println(" Department : "+ employee1.getEmployeeDeptName());
		if(employee1.isEligibleForIncrement())
			System.out.println(" Employee is eligible for increment");
		else
			System.out.println(" Not eligible for increment");
		Employee employee2 = new Employee();
		employee2.setData(78389, "Swaati", 35000, 1); // Employee 2 
		System.out.println("\n--Employee 2 Details--");
		System.out.println(" Name : " + employee2.empName);
		System.out.println(" Id : "+ employee2.empId);
		System.out.println(" Employee Band is : "+ employee2.getEmployeeBand());
		System.out.println(" Department : "+ employee2.getEmployeeDeptName());
		if(employee2.isEligibleForIncrement())
			System.out.println(" Employee is eligible for increment");
		else
			System.out.println(" Not eligible for increment");
		
	}

}
