package harshadBJun20;

public class SecondClass{
	
	void method3ofSecondClass(){
		System.out.println("Non-Static method 3 of Second class.");
		System.out.println();
		System.out.println("From Non-Static method 3 of Second class via object of Third Class calling: ");
		ThirdClass thirdClass = new ThirdClass(); 
		thirdClass.method6ofThirdClass();
		System.out.println();
	}
	
	static void method4ofSecondClass(){
		System.out.println("Static method 4 of Second class.");
		System.out.println();
		System.out.println("From Static method 4 of Second class via object Second Class calling: ");
		SecondClass secondClass = new SecondClass();
		secondClass.method3ofSecondClass();
		System.out.println();
	}
}