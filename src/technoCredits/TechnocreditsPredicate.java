package technoCredits;

import java.util.ArrayList;

public class TechnocreditsPredicate {

	static void display(ArrayList<EmployeeDetails> list) {
		for(EmployeeDetails emp : list) {
			System.out.println(emp.toString());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>(); 
		EmployeeDetails e1 = new EmployeeDetails(10101, "Krishna", "Finance", 300000);
		empList.add(e1);
		empList.add(new EmployeeDetails(10102, "Maulik", "Admin", 10000));
		empList.add(new EmployeeDetails(10101, "Harsh", "IT", 120000));
		empList.removeIf(emp -> (emp.salary<50000 && emp.deptName.equals("Admin")));
		display(empList);
	}
}
