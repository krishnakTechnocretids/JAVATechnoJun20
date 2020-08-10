package barkhaPJun20;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_Client {
	
	public static void main(String[] args) {
		Comparator_EmployeeDetails e1=new Comparator_EmployeeDetails();
		e1.setEmpId(100);
		e1.setEmpName("Barkha");
		e1.setEmpSalary(350000.56);
		e1.setDeptId(50);
		
		Comparator_EmployeeDetails e2=new Comparator_EmployeeDetails();
		e2.setEmpId(500);
		e2.setEmpName("Akshata");
		e2.setEmpSalary(450000);
		e2.setDeptId(26);
		
		Comparator_EmployeeDetails e3=new Comparator_EmployeeDetails();
		e3.setEmpId(56);
		e3.setEmpName("Sushant");
		e3.setEmpSalary(350000.89);
		e3.setDeptId(30);
		
		ArrayList<Comparator_EmployeeDetails> al=new ArrayList <Comparator_EmployeeDetails>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al,new Comparator_EmployeeDetails_empId());
		System.out.println("Sorting on the basis of Emp ID: (Ascending Order)");
		for (Comparator_EmployeeDetails Employee:al) {
			
			System.out.println(Employee.getEmpId()+"  :   "+Employee.getEmpName()+"  :   "+Employee.getEmpSalary()+"  :   "+Employee.getDeptId());
		}
		
		Collections.sort(al,new Comparator_EmployeeDetails_empName());
		System.out.println("\nSorting on the basis of Emp Name: (Ascending Order)");
		for (Comparator_EmployeeDetails Employee:al) {
			
			System.out.println(Employee.getEmpId()+"  :   "+Employee.getEmpName()+"  :   "+Employee.getEmpSalary()+"  :   "+Employee.getDeptId());
		}
			
		Collections.sort(al,new Comaparator_EmployeeDetails_empSalary());
		System.out.println("\nSorting on the basis of Emp Salary: (Ascending Order)");
		for (Comparator_EmployeeDetails Employee:al) {
			
			System.out.println(Employee.getEmpId()+"  :   "+Employee.getEmpName()+"  :   "+Employee.getEmpSalary()+"  :   "+Employee.getDeptId());
		}
			
		Collections.sort(al,new Comparator_EmployeeDetails_empDeptId());
		System.out.println("\nSorting on the basis of Emp Department: (Descending Order)");
		for (Comparator_EmployeeDetails Employee:al) {
			
			System.out.println(Employee.getEmpId()+"  :   "+Employee.getEmpName()+"  :   "+Employee.getEmpSalary()+"  :   "+Employee.getDeptId());
		}
	}	
}