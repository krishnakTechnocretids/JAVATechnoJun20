package swapnaWJun20;

public class C {

	static void m5() {
		System.out.println("Direct calling from C class ---> static method 'M5 in class C'");
		D.m2();
	}

	void m6() {
		System.out.println("\nCalling from B class ---> non static method 'M6 in class C' by creating an object");
		m5();
	}
}
