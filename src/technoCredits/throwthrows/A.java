package technoCredits.throwthrows;

public class A {
	void m1() {
		System.out.println("2");
		try {
			new B().m2();
			System.out.println("4");
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
		}
		System.out.println("3");
	}
	public static void main(String[] args) {
		new A().m1();
		System.out.println("End");
	}
}
