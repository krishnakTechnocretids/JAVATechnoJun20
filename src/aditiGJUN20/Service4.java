package aditiGJUN20;

public class Service4 {
	
	static void m1() {
		System.out.println("Class Service4 -> Static Method m1().");
	}
	
	static void m2() {
		System.out.println("Class Service4 -> Static Method m2()");

		System.out.println("\nFrom Service4 class Static method m2() calling Static method m1() in the same class");
		Service4.m1();//calling static method m1() of same class
	}
}
