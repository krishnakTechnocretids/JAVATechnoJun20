package aditiGJUN20;

public class Service3 {
	static void m5() {
		System.out.println("Class Service3 -> Static method m5()");
		
		System.out.println("\nFrom Service3 class Static method m5() calling Static method m2() of Service4 Class");
		Service4.m2();//calling static method m2() of Service4 class
	}
	
	void m6() {
		System.out.println("Class Service3 -> Non-static Method m6()");
		
		System.out.println("\nFrom Service3 class non-static method m6() calling Static method m5() in the same class");
		Service3.m5();//calling static method m5() of same class
	}

}
