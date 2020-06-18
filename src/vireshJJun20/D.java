package vireshJJun20;

public class D {

	static void m1() {
		System.out.println("Loop completed at D m1()");
	}
	
	static void m2() {
		System.out.println("in D m2() calling D m1()");
		D.m1();
	}
}
