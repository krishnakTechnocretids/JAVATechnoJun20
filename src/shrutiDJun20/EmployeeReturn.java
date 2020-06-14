/*Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.
a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return Band A otherwise return Band D.
f) create a method called getEmployeeDeptName, if employee deptid is 1 return IT as department name, if deptid is 2 then return department name as Finance, anything apart from 1 and 2, retun department name as Support team.
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and main method will print Employee is eligible for increment, otherwise print not eligible for increment message
package assignment;*/
package shrutiDJun20;

public class EmployeeReturn {
	int id;
	String name;
	double sal;
	int dept;
	
	void setdata(String empName, int empID, double empSal, int empdept){
		name = empName;
		id= empID;
		sal=empSal;
		dept=empdept;
	}
	
	String getEmpName(){
		return name;
	}
	
	int getEmpId(){
		return id;
	}
//if salary is greater then 30,000 then return Band A otherwise return Band D.
	String getEmployeeBand(){
	if(sal>30000){
		return "Band A";
	}	
	else{
		return "Band D";
	}
	}
//if employee deptid is 1 return IT as department name, 
//if deptid is 2 then return department name as Finance, 
//anything apart from 1 and 2, retun department name as Support team.
	String getEmployeeDeptName(){
	if(dept==1){
		return "IT";
	}
	else if(dept ==2){
		return "Finance";	
	}
	else{
		return "Support team";
	}
	}
//if deptId is 1 or salary is less then 30,000 return true and main method will print
//Employee is eligible for increment, otherwise print not eligible for increment message	
	
	boolean isEligibleForIncrement(){
		if(dept==1 || sal<30000){
			return true;
			//System.out.print.ln(name + "is eligible for increament");
		}
		else{
			return false;
		}
		}
		
		void displayInfoofEmployee(String nameOfEmp, int idOfEmp, double salOfEmp, int deptOfEmp){
			
			name=nameOfEmp ;
			id = idOfEmp;
			sal=salOfEmp;
			dept=deptOfEmp;
			System.out.println("Name: "+ name );
			System.out.println("ID: "+ id);
			System.out.println("Salary: "+ salOfEmp );
			System.out.println("Dept: "+ deptOfEmp );
		
	}
	
	public static void main(String[] args){
		EmployeeReturn employee1 = new EmployeeReturn();
		
		employee1.displayInfoofEmployee("Shruti", 1147, 15000.50, 1);
		System.out.println(employee1.getEmployeeBand());
		System.out.println(employee1.getEmployeeDeptName());
		if(employee1.isEligibleForIncrement()== true){
			System.out.println(employee1.getEmpName()+" from department "+employee1.getEmployeeDeptName() + " is eligible for increament");
		}
		else{
			System.out.println(employee1.getEmpName()+" from department "+employee1.getEmployeeDeptName() + " is not eligible for increament");
		}
		
		System.out.println();
		
		EmployeeReturn employee2= new EmployeeReturn();
		employee2.displayInfoofEmployee("Ankit", 1148, 50000.50, 2);
		System.out.println(employee2.getEmployeeBand());
		System.out.println(employee2.getEmployeeDeptName());
		if(employee2.isEligibleForIncrement()== true){
			System.out.println(employee2.getEmpName()+" from department "+employee2.getEmployeeDeptName() + " is eligible for increament");
		}
		else{
			System.out.println(employee2.getEmpName()+" from department "+employee2.getEmployeeDeptName() + " is not eligible for increament");
		}
		
		
		
	}

}
