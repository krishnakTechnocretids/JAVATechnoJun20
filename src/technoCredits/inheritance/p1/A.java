package technoCredits.inheritance.p1;

public class A{

	Object obj = new A();
	
	Object m1() {
		System.out.println("A m1");
		return new A();
	}
	
	A m2() {
		return new A();
	}
}
