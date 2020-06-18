package barkhaPJun20;

public class SecondClass {
	
	void thirdMethod() {
		System.out.println("This is SecondClass_thirdMethod");
		ThirdClass thirdclass=new ThirdClass();
		 thirdclass.sixthMethod();
	}
	
	static void fourthMethod() {
		System.out.println("This is SecondClass_fourthMethod");
		SecondClass secondclass=new SecondClass();
		secondclass.thirdMethod();
	}

}
