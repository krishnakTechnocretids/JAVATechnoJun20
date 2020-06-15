package yashCJun20;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	int deptId;
	
	void setData(int eId,String eName, double sal,int dptId) {
		
		empId=eId;
		empName=eName;
		salary=sal;
		deptId=dptId;
	}
	
	String getEmpName() {
		
		return empName;
	}
	
	int getEmpId() {
		
		 return empId;
		
	}

	String getEmployeeBand() {
		
		if (salary >30000)
			
			return "Band A";
		else
			return "Band D";
	}
	
	String getEmployeeDeptName() {
		
		if (deptId==1)
			
			return "IT";
		
		if (deptId==2)
			
			return "Finance";
		
		else
			
			return "Support team";
	}
	
	boolean isEligibleForIncrement() {
		
		if(deptId == 1 || salary<30000)
			return true;
		else 
			return false;
		
	}
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setData(22145,"Aniket Kapoor",28040.40,1);
		System.out.println("Employee Name " + ":" +employee1.getEmpName());
		System.out.println("Employee ID " + ":" +employee1.getEmpId());
		System.out.println("Employee Band " + ":" +employee1.getEmployeeBand());
		System.out.println("Employee Dept " + ":"+employee1.getEmployeeDeptName());
		if (employee1.isEligibleForIncrement()==true)
			System.out.println(employee1.empName+" is Eligible for increment");
			else
			System.out.println(employee1.empName+" is Not Eligible for increment");
			
		System.out.println("--------------------------------------------------");
		
		Employee employee2=new Employee();
		employee2.setData(22236,"Rajiv Saxena",40018.18,4);
		System.out.println("Employee Name " + ":" +employee2.getEmpName());
		System.out.println("Employee ID " + ":" +employee2.getEmpId());
		System.out.println("Employee Band " + ":" +employee2.getEmployeeBand());
		System.out.println("Employee Dept " + ":"+employee2.getEmployeeDeptName());
		if (employee2.isEligibleForIncrement()==true)
		System.out.println(employee2.empName+" is Eligible for increment");
		else
		System.out.println(employee2.empName+" is Not Eligible for increment");
		
		}

}
