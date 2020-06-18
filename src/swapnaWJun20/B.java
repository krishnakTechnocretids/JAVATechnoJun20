package swapnaWJun20;

public class B {

	void m3() {
		System.out.println("Calling from B class ---> non static method 'M3 in class B' by creating an object");
		C c1 = new C();
		c1.m6();
	}

	static void m4() {
		System.out.println("\nDirect calling from A class ---> static method 'M4 in class B'");
		B b1=new B();
		b1.m3();
	}
}
