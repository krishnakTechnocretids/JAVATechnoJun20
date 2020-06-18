package swapnaWJun20;

public class A {

	void m1() {
		System.out.println("Client class Main Method ---> non static 'M1 in class A' by creating an object");
		A.m2();
	}

	static void m2() {
		System.out.println("Direct calling from Same class ---> static method 'M2 in class A'");
		B.m4();
	}
}
