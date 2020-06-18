package aasthaJJun20;

public class FirstClass {
	
	void firstMethod(){
		System.out.println("\nfirstMethod of FirstClass is called. firstMethod is a non-static method");
		System.out.println("Next call: m1 to static m2");
		secondMethod();
	}
	
	static void secondMethod(){
		System.out.println("\nsecondMethod of FirstClass is called. secondMethod is a static method");
		System.out.println("Next call: static m2 to static m4");
		SecondClass.fourthMethod();
	}
}
