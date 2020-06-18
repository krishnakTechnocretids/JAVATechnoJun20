package pranitaPJun20;

public class SecondClass {
	void thirdMethod(){
		System.out.println("In method M3");	
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.sixthMethod();
	}
	
	static void fourthMethod() {
		System.out.println("In method M4");	
		SecondClass secondClass = new SecondClass();
		secondClass.thirdMethod();
		
	}

}
