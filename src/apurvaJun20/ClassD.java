package apurvaJun20;

public class ClassD {
	static void m1() {
		System.out.println("\n"+"This is Static Method m1 of ClassD");
	}
	 static void m2() {
		 System.out.println("\n"+"This is Static Method m2 of ClassD called from Static Method m5 of ClassC");
		 ClassD.m1();
	 }
}
