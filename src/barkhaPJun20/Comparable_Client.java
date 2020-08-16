package barkhaPJun20;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Client {
	public static void main(String[] args) {
		
		
		Comparable_Employee employee1=new Comparable_Employee(120, "Tarun" ,15000.53);
		Comparable_Employee employee2=new Comparable_Employee(5037344, "Barkha", 450000);
		Comparable_Employee employee3=new Comparable_Employee(1, "Megha" ,750000);
		Comparable_Employee employee4=new Comparable_Employee(420, "Piyush" ,15000.89);
		
		ArrayList<Comparable_Employee> al=new ArrayList<Comparable_Employee>();
		al.add(employee1);
		al.add(employee2);
		al.add(employee3);
		al.add(employee4);
		
		Collections.sort(al);           //here in al we store objects thats why sorting is not possible so we override comapreTo method for sorting
		
		System.out.println("Sorting on the basis of Emp ID: (Ascending Order)");
		System.out.println("\nEmp ID: "+"Emp Name: "+"Emp Salary: ");
		for ( Comparable_Employee Employee:al) {
		
			System.out.println(Employee.empId+"  :  "+Employee.empName+" :  "+Employee.empSalary);
		}
	}
}	