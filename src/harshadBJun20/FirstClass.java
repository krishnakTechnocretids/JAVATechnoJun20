package harshadBJun20;

public class FirstClass{

	void method1ofFirstClass(){
		System.out.println("Non-Static method 1 of First class.");
		System.out.println();
		System.out.println("From Non-Static method 1 of First class direct calling: ");
		method2ofFirstClass();
		System.out.println();
	}
	
	static void method2ofFirstClass(){
		System.out.println("Static method 2 of First class.");
		System.out.println();
		System.out.println("From Static method 2 of First class via Second Class calling: ");
		SecondClass.method4ofSecondClass();
		System.out.println();
	}
}