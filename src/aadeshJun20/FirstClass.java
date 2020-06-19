package aadeshJun20;

public class FirstClass {
	
	void m1() {
		System.out.println("Method 1 First Class");
		m2();
	
	}

	static void m2() {
		
		System.out.println("Method 2 First Class");
		SecondClass.m4();
	}
}
