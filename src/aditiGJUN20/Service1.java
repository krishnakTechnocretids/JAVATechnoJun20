package aditiGJUN20;

public class Service1 {

	void m1() {
		System.out.println("Class Service1 ->Non-static method m1().");
		
		System.out.println("\nFrom Service1 class non-static method m1() calling static method m2() in the same class");
		Service1.m2();// Calling Static method m2() of same class 
	}
	
	static void m2() {
		System.out.println("Class Service1 ->Static method m2().");
		
		System.out.println("\nFrom Service1 class Static method m2() calling static method m4() of Service2 Class");
		Service2.m4();// Calling static method m4() of Service2 Class 
	}
}
