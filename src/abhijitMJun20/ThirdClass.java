package abhijitMJun20;

public class ThirdClass {
	static void fifthMethod() {
		System.out.println("Inside fifth method");
		ForthClass.eighthMethod();
	}
	void sixthMethod() {
		System.out.println("Inside sixth method");
		fifthMethod();
	}
}
