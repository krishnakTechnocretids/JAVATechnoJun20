package vaishnaviVJun20;

public class ThirdClass {
	static void fifthMethod() {
		System.out.println("You are inside fifth method of Third Class");
		FourthClass.eighthMethod();
	}
	void sixthMethod() {
		 System.out.println("You are inside sixth method of Third class");
		 fifthMethod();
	}
}
