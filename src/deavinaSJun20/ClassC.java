package deavinaSJun20;

public class ClassC {
	static void m5() {
		System.out.println("m5 method called");
		ClassD.m2();
		
	}
	 void m6() {
		 System.out.println("m6 method called");
		 ClassC.m5();
	}

}
