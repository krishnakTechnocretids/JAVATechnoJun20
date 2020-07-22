package technoCredits.stringDemo.toStringExplanation;

public class Test {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"Maulik","Kanani",101);
		Employee employee2 = new Employee(2,"Krishna","Kanani",102);
		Employee employee3 = new Employee(3,"Harhs","Vegada",103);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		String s1 = new String("Technocredits");
		System.out.println(s1.toString());
		
		Integer i = new Integer(10);
		System.out.println(i.toString());
		
	}
}
