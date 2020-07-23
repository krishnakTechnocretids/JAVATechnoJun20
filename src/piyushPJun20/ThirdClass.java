package piyushPJun20;

public class ThirdClass {
	static void m5() {
		System.out.println();
		System.out.println(" Third Class Method5 ");
		
		FourthClass.m2();
	}
	void m6() {
		System.out.println();
		System.out.println(" Third Class Method6 ");
		
		ThirdClass.m5();
		
	}
}
