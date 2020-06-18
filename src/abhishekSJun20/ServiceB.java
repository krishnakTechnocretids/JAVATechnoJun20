package abhishekSJun20;

public class ServiceB {
	void m3() {
		ServiceC serviceC = new ServiceC();
		System.out.println("This is nonStatic m3 of ServiceB");
		serviceC.m6();
	}

	static void m4() {
		ServiceB serviceB = new ServiceB();
		System.out.println("This is Static m4 of ServiceB");
		serviceB.m3();
	}
}
