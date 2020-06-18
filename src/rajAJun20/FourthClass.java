package rajAJun20;

public class FourthClass {
	static void m1() {
		System.out.println("Done with m1()");
	}
	static void m2() {
		System.out.println("Static method m2() is calling static method m1()");
		FourthClass.m1();
	}
}
