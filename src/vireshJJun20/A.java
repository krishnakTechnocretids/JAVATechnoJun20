package vireshJJun20;

public class A {

	void m1() {
		System.out.println("in A m1() calling A m2()");
		A.m2();
	}
	static void m2() {
		System.out.println("in A m2() calling B m4()");
		B.m4();
	}
}
