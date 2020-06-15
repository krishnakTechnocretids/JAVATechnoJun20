package anupSJun20;
/*Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.

a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" otherwise return "Band D".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, if deptid is 2 then return department name as "Finance", anything apart from 1 and 2, retun department name as "Support team".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and main method will print Employee is eligible for increment, otherwise print not "eligible for increment" message.*/

public class Employee {
	
		int empid;
		String empname;
		double salary;
		int deptId;
		void setData(String ename,int eid, double sal,int dName)
		{
			empname = ename;
			empid = eid;
			salary = sal;
			deptId = dName;
		}
		String getEmpName()
		{
			return empname;
		}
		int getEmpID()
		{
			
			return empid;
		}
		String getEmployeeBand()
		{
			
			if(salary > 30000)
			{
				return "Band A";
			}
			else
			{
				return "Band D";
			}
		
		}
		String getEmployeeDeptName()
		{
			
			if(deptId ==1)
			{
				return "IT";
			}
			else if(deptId == 2)
			{
				return "Finance";
			}
			else
			{
				return "Support Team";
			}
			
		}
		boolean isEligibleForIncrement()
		{
			if (deptId == 1 || salary<30000)
			{
				return true;
			}
			else {
				return false;
			}

			
		}
		
		public static void main(String[] args) {
			Employee employee1 = new Employee();
			employee1.setData("Anup Kumar Sahoo",1234,35000,1);
			System.out.println("Employee Details :" + "Employee 1" );
			System.out.println("Employee Name = " +employee1.getEmpName());
			System.out.println("Employee ID = " +employee1.getEmpID());
			System.out.println("Employee Band = " +employee1.getEmployeeBand());
			System.out.println("Employee Dept Name = " +employee1.getEmployeeDeptName());
			if(employee1.isEligibleForIncrement() == true) {
				System.out.println("Employee is eligible for Increment");	
			}
			else {
				System.out.println("Employee is not eligible for Increment");	
			}
			
			Employee employee2 = new Employee();
			employee2.setData("Amita Rout",234,50000,2);
			System.out.println("Employee Details :" + "Employee 2");
			System.out.println("Employee Name = " +employee2.getEmpName());
			System.out.println("Employee ID = " +employee2.getEmpID());
			System.out.println("Employee Band = " +employee2.getEmployeeBand());
			System.out.println("Employee Dept Name = " +employee2.getEmployeeDeptName());
			if(employee2.isEligibleForIncrement() == true) {
				System.out.println("Employee is eligible for Increment");	
			}
			else {
				System.out.println("Employee is not eligible for Increment");	
			}
		}

	}
