package aadeshJun20;

public class ThirdClass {

	static void m5() {
		System.out.println("Method 1 Third Class");
		FourthClass.m8();
	
	}
	
	void m6() {
		System.out.println("Method 2 Third Class");
	    m5();
	}
}
