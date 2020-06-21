package barkhaPJun20;

public class ThirdClass {
	
	static void fifthMethod() {
		System.out.println("This is ThirdClass_fifthMethod");
		FourthClass.secondMethod();
	}
	void sixthMethod() {
		System.out.println("This is ThirdClass_sixthMethod");
		fifthMethod();
	}
}
