package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Client {

	static void printAllEmployeeDetails(ArrayList<Employee> empList) {
		for(Employee emp : empList) {
			System.out.println(emp.toString());
			/*if(emp.salary < 20000)
				empList.remove(emp); // empid // empname
*/		}
		//System.out.println(empList);
	}
	
	/*static void m1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Harsh");
		al.add("Techno");
		
		for(String temp : al) {
			if(temp.length()>3)
				al.remove(temp);
		}
		System.out.println(al);
	}*/
	
	public void filter(ArrayList<Employee> empList, char gender, double salary){
		
	}
	
	public void filter(ArrayList<Employee> empList, char gender, double salary, String dept){
		
	}
	
	public static Predicate<Employee> filter(){
		return emp -> emp.gender == 'M' || emp.deptName.equals("IT");
	}
	
	public static void main(String[] args) {
		Employee employee2 = new Employee(10102,"Viresh","Admin",150000,'M');
		Employee employee3 = new Employee(10103,"Jagadish","IT",200000,'M');
		Employee employee4 = new Employee(10104,"Maulik","IT",15000,'M');
		Employee employee5 = new Employee(10104,"Aditi","Admin",250000,'F');
		
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee(10101,"Harsh","IT",100000,'M'));
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee4);
		listOfEmployees.add(employee5);
		
		//listOfEmployees.removeIf(emp -> emp.salary>=100000); 
		//listOfEmployees.removeIf(e1 -> e1.gender == 'M' || e1.deptName.equals("IT")); 
		listOfEmployees.removeIf(filter()); 
		//System.out.println(employee2);
		printAllEmployeeDetails(listOfEmployees);
		//m1();
	}
}
