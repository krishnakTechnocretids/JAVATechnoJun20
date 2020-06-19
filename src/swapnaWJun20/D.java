package swapnaWJun20;

public class D {

	static void m1() {
		System.out.println("Direct calling from D class ---> static method 'M1 in class D'");
	}

	static void m2() {
		System.out.println("\nDirect calling from C class ---> static method 'M2 in class D'");
		m1();
	}
}
