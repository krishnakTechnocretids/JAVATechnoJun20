package abhishekSJun20;

public class ServiceC {
	static void m5() {
		System.out.println("This is Static m5 of ServiceC");
		ServiceD.m2();
	}

	void m6() {
		System.out.println("This is nonStatic m6 of ServiceC");
		ServiceC.m5();
	}
}
