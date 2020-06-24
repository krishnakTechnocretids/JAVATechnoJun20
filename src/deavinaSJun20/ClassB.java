package deavinaSJun20;

public class ClassB {
	void m3() {
		System.out.println("m3 method called");
		ClassC c = new ClassC();
		c.m6();
	}

	static void m4() {
		System.out.println("m4 method called");
		ClassB b1 = new ClassB();
		b1.m3();
	}
}
