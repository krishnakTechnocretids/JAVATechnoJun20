package abhishekSJun20;

public class ServiceA {

	void m1() {
		System.out.println("This is nonStatic m1 of ServiceA");
		ServiceA.m2();
	}

	static void m2() {
		System.out.println("This is Static m1 of ServiceA");
		ServiceB.m4();

	}
}

