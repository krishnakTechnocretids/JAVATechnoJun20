package amitaRJun20;
/*Create Employee class having 4 instance variable empid & empname, salary (double type), deptId.
a) create 2 objects of Employee class.
b) create method setData to set values in instance variable
c) create method called getEmpName() which should return employee name.
d) create method called getEmpId() which should return employee id.
e) create a method called getEmployeeBand(), if salary is greater then 30,000 then return "Band A" otherwise return "Band D".
f) create a method called getEmployeeDeptName, if employee deptid is 1 return "IT" as department name, if deptid is 2 then return department name as "Finance", anything apart from 1 and 2, retun department name as "Support team".
g) Create a method called isEligibleForIncrement which will return boolean value, if deptId is 1 or salary is less then 30,000 return true and main method will print Employee is eligible for increment, otherwise print not "eligible for increment" message.
*/
public class Employee{
	
		int employeeID,deptartmentID;
		String employeeName;
		double employeeSalary;
		
		void setData(int empID,int deptID,String empName,double empSal){
			employeeID=empID;
			deptartmentID=deptID;
			employeeName=empName;
			employeeSalary=empSal;	
			
		}
		String getEmpName(){
			return employeeName;
		}
		int getEmpId(){
			return employeeID;
		}
		String getEmployeeBand(){
			if(employeeSalary>30000) {
				return "Band A";
			}
			else {
				return "Band D";	
			}
		}
		String getEmployeeDeptName(){
			if(deptartmentID==1) {
				return "IT";
			}
			else if((deptartmentID==2)){
				return "Finance";
			}
			else {
				return "Support Team";
			}		
		}
		boolean isEligibleForIncrement(){
			if(deptartmentID==1 || employeeSalary<30000) {
				return true;
			}
			else {
				return false;
			}		
		}

		public static void main(String[] args) {
			
			Employee employee1=new Employee();
			Employee employee2=new Employee();
			
			employee1.setData(1111,1,"Amita",25000);
			employee2.setData(2222,2,"Anup",35000);
			
			System.out.println("Details of First Employee:-   ");
			System.out.println("Employee Name:- "+employee1.getEmpName());
			System.out.println("Employee ID:- "+employee1.getEmpId());
			System.out.println("Employee Band:- "+employee1.getEmployeeBand());
			System.out.println("Employee Department Name:- "+employee1.getEmployeeDeptName());
			if(employee1.isEligibleForIncrement()==true) {
				System.out.println(employee1.getEmpName()+" is" +" eligible for increment");
			}
			else {
				System.out.println(employee1.getEmpName()+" is not " +" eligible for increment");		
			}			
			System.out.println("---------------------------------------------------------");
			System.out.println("Details of Second Employee:-   ");
			System.out.println("Employee Name:- "+employee2.getEmpName());
			System.out.println("Employee ID:- "+employee2.getEmpId());
			System.out.println("Employee Band:- "+employee2.getEmployeeBand());
			System.out.println("Employee Department Name:- "+employee2.getEmployeeDeptName());
			if(employee2.isEligibleForIncrement()==true) {
				System.out.println(employee2.getEmpName()+" is" +" eligible for increment");
			}
			else {
				System.out.println(employee2.getEmpName()+" is not " +" eligible for increment");		
			}		
			
		}

	}



