package aasthaJJun20;

public class FourthClass {
	
	static void firstMethod(){
		System.out.println("\nfirstMethod of FourthClass is called. firstMethod is a static method");
	}
	
	static void secondMethod(){
		System.out.println("\nsecondMethod of FourthClass is called. secondMethod is a static method");
		System.out.println("Next call: static m2 to static m1 of FourthClass");
		firstMethod();
	}
}
