package meghaJJune20;

public class Student {
	String name = "Techno";
	int rno = 1;
	String name2 = "Harsh";
	int rno2 = 2;
	
	void display()
	{
		System.out.println(name);
		System.out.println(rno);
		
	}
	void display2()
	{
		System.out.println(name2);
		System.out.println(rno2);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.display();
		s1.display2();
	}

}
