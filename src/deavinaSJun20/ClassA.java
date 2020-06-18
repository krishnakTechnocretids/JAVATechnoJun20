package deavinaSJun20;

public class ClassA {
	void m1() {
		System.out.println("m1 method called");
		ClassA.m2();
	}

	static void m2() {
		System.out.println("m2 method called");
		ClassB.m4();
	}
}
