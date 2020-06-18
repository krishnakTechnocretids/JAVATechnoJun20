package vaishnaviVJun20;

public class SecondClass {
	void thirdMethod() {
		System.out.println("You are inside third method of Second Class");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.sixthMethod();
	}
	static void fourthMethod() {
		 System.out.println("You are inside fourth method of Second class");
		 SecondClass SecondClass = new SecondClass();
		 SecondClass.thirdMethod();
	}
}
