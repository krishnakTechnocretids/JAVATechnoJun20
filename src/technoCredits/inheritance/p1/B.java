package technoCredits.inheritance.p1;

public class B extends A {

	A m1() {
		return new A();
	}

	void m3() {
		System.out.println("m3");
		m4();
	}
	
	void m4() {
		System.out.println("m4");
		m3();
	}
	/*B m2() {
		return new A();
	}*/

	public static void main(String[] args) {
		System.out.println("Hi");
		new B().m3();
	}
}
