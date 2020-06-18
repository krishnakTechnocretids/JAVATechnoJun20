package barkhaPJun20;

public class FirstClass {
	
	void firstMethod() {
		System.out.println("This is firstClass_FirstMethod");
		secondMethod();
	}
	 static void secondMethod() {
		 System.out.println("This is firstClass_SecondMethod");
		 SecondClass.fourthMethod();
	 }

}
