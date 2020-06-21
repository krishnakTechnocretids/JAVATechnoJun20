package vireshJJun20;

public class B {

	void m3() {
		C c= new C();
		System.out.println("in B m3() calling C m6()");
		c.m6();
	}
	
	static void m4() {
		B b= new B();
		System.out.println("in B m4() calling B m3()");
		b.m3();
	}
}
