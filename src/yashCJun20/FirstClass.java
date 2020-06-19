package yashCJun20;

public class FirstClass {
	
	void m1() {
		System.out.println("In m1 method of FirstClass");
		System.out.println("Calling static m2 method of First class from First Class");
		m2();
	}
	
	static void m2() {
		System.out.println("In m2 method of FirstClass");
		System.out.println("Calling static m4 method of Second class from First Class");
		SecondClass.m4();
	}
	

}
