package aasthaJJun20;

public class ThirdClass {
	
	static void fifthMethod(){
		System.out.println("\nfifthMethod of ThirdClass is called. fifthMethod is a static method");
		System.out.println("Next call: static m5 to static m2 of FourthClass");
		FourthClass.secondMethod();
	}
	
	void sixthMethod(){
		System.out.println("\nsixthMethod of ThirdClass is called. sixthMethod is a non-static method");
		System.out.println("Next call: m6 to static m5");
		ThirdClass.fifthMethod();
	}
}
