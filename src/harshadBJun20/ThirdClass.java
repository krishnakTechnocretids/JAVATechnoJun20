package harshadBJun20;

public class ThirdClass{

	static void method5ofThirdClass(){
		System.out.println("Static method 5 of Third class.");
		System.out.println();
		System.out.println("From Static method 5 of Third class via Fourth Class calling: ");
		FourthClass.method8ofFourthClass();
		System.out.println();
	}
	
	void method6ofThirdClass(){
		System.out.println("Non-Static method 6 of Third class.");
		System.out.println();
		System.out.println("From Non-Static method 6 of Third class direct calling: ");
		method5ofThirdClass();
		System.out.println();
	}
}