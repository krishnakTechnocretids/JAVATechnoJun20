package vireshJJun20;

public class C {

	static void m5() {
		System.out.println("in C m5() calling D m2()");
		D.m2();
	}
	
	void m6() {
		System.out.println("in C m6() calling C m5()");
		C.m5();
	}
}
