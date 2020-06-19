package pranitaPJun20;

public class FourthClass {
	static void firstMethod(){
		System.out.println("In method M1");	
	}
	
	static void secondMethod() {
		System.out.println("In method M2");	
		FourthClass.firstMethod();
		
	}

}
