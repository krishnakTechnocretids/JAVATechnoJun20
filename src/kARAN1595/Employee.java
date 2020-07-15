package kARAN1595;


/* Assignment 8 :  13th Jun 2020


Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.

a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return ""Band A"" otherwise return ""Band D"".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return ""IT"" as department name, if deptid is 2 then return department name as ""Finance"", anything apart from 1 and 2, retun department name as ""Support team"".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and main method will print Employee is eligible for increment, otherwise print not ""eligible for increment"" message.

Assignment 8 : 16th Jun 2020

Create a Banking System which has following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variable will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time"
*/ 
public class Employee {
	
	int employeeID, departmentID;
	String employeeName;
	double salary;
	
	void setData(int identity,String name,int department, double income)
	{
		employeeID=identity;
		employeeName=name;
		salary= income;
		departmentID = department;
	}
	
	String getEmpName()
	{
		return employeeName;
	}
	
	int getEmpID()
	{
		return employeeID;
	}
	
	String getEmployeeBand() 
	{
		if(salary>30000)
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
		if(departmentID==1)
		{
			return "From Department IT";
		}
		else if(departmentID==2)
		{
		    return "From Department Finance ";	
		}
		else
		{
			return "Contact Support Team";
		}
	}	
	
	boolean isEligibleForIncrement()
	{
		if(departmentID==1 || salary<30000)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
     
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee1.setData(1, "Karan ", 1, 35000);
		employee2.setData(2, "Kumar", 2, 55000);
	//Employee1
     System.out.println("Employee ID:" +employee1.getEmpID());
     System.out.println("Employee Name:" +employee1.getEmpName());
     System.out.println("Employee Band:" +employee1.getEmployeeBand());
     System.out.println("Employee Department:" +employee1.getEmployeeDeptName());
     if(employee1.isEligibleForIncrement()==true)
     {
    	 System.out.println("Employee is eligible for increment");
     }
     else
     {
    	 System.out.println("Employee is not eligible for increment");
     }
     
     //Employee2
     System.out.println("Employee ID:" +employee2.getEmpID());
     System.out.println("Employee Name:" +employee2.getEmpName());
     System.out.println("Employee Band:" +employee2.getEmployeeBand());
     System.out.println("Employee Department:" +employee2.getEmployeeDeptName());
     if(employee2.isEligibleForIncrement()==true)
     {
    	 System.out.println("Employee is eligible for increment");
     }
     else
     {
    	 System.out.println("Employee is not eligible for increment");
     }

	}

}
