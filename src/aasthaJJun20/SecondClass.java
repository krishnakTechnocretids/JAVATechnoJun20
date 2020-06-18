package aasthaJJun20;

public class SecondClass {
	
	void thirdMethod(){
		System.out.println("\nthirdMethod of SecondClass is called. thirdMethod is a non-static method");
		System.out.println("Next call: m3 to m6");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.sixthMethod();
	}
	
	static void fourthMethod(){
		System.out.println("\nfourthMethod of SecondClass is called. fourthMethod is a static method");
		System.out.println("Next call: static m4 to m3");
		SecondClass secondClass = new SecondClass();
		secondClass.thirdMethod();
	}
}
