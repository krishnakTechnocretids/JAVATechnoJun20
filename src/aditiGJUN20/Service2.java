package aditiGJUN20;

public class Service2 {
	void m3() {
		System.out.println("Class Service2->Non-static method m3().");
		
		System.out.println("\nFrom Service2 class Static method m4() calling non-static method m6() of Service3 Class");
		Service3 service3 = new Service3();
		service3.m6();//Calling non static method m6() of Service3 class
	}
	
	static void m4() {
		System.out.println("Class Service2 ->Static method m4().");
		
		System.out.println("\nFrom Service2 class Static method m4() calling non-static method m3() in the same class");
		Service2 service2 = new Service2();
		service2.m3();//Calling Non static method m3() from static method m4()
	}
}
