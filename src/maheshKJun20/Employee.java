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
package maheshKJun20;

class Employee{
	int empid;
	String empName;
	double salary;
	int deptId;
	
	void setData(int id, String name, double sal, int dept ){
		empid = id;
		empName = name;
		salary = sal;
		deptId = dept;
	}
	
	
	String getEmpName(){
		return empName;
	}
	
	int getEmpId(){
		return empid;
	}
	
	String getEmployeeBand(){
		if (salary > 30000){
			return "Band A"; 
		}
		else{
			return "Band D";
		}
	}
	
	
	String getEmployeeDeptName(){
		if (deptId == 1){
			return "IT";
		}
		else if(deptId == 2){
			return "Finance";
		}
		else{
			return "Support";
		}
	}
	
	boolean isEligibleForIncrement(){
		if (deptId == 1 || salary < 30000){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		Employee employee0 = new Employee();
		Employee employee1 = new Employee();
		employee0.setData(1,"M",1,2);
		employee1.setData(3,"S",3,4);
		
	}
}