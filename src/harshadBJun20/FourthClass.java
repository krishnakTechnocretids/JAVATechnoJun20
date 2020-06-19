package harshadBJun20;

public class FourthClass{
	
	static void method7ofFourthClass(){
		System.out.println("Static method 7 of Fourth class.");
	}
	
	static void method8ofFourthClass(){
		System.out.println("Static method 8 of Fourth class.");
		System.out.println();
		System.out.println("From Static method 8 of Fourth class direct calling: ");
		method7ofFourthClass();
		System.out.println();
	}
}