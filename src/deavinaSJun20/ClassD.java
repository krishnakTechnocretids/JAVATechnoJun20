package deavinaSJun20;

public class ClassD {
	static void m1() {
		System.out.println("ClassD-m1 method called");
	}

	static void m2() {
		System.out.println("ClassD-m2 method called");
		ClassD.m1();
	}
}
