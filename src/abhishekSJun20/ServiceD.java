package abhishekSJun20;

public class ServiceD {
	
	static void m1() {
		System.out.println("This is Static m1 of ServiceD");
	}

	static void m2() {
		System.out.println("This is Static m2 of ServiceD");
		ServiceD.m1();
	}
}
