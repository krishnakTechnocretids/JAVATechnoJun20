package abhijitMJun20;

public class ForthClass {
	static void seventhMethod() {
		System.out.println("inside seventh method");
	}
	static void eighthMethod() {
		System.out.println("inside eighth method");
		seventhMethod();
	}
}
