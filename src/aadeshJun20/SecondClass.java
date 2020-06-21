package aadeshJun20;

public class SecondClass {
	
	void m3() {
		System.out.println("Method 1 Second Class");
		
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.m6();
	
	}
	
	static void m4() {
		System.out.println("Method 2 Second Class");
		
		SecondClass secondClass = new SecondClass();
		secondClass.m3();
		
	}

}
