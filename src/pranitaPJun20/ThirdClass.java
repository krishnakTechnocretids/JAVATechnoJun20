package pranitaPJun20;

public class ThirdClass {
	static void fifthMethod(){
		System.out.println("In method M5");	
		FourthClass.secondMethod();
	}
	
	void sixthMethod() {
		System.out.println("In method M6");	
		ThirdClass.fifthMethod();
	}


}
