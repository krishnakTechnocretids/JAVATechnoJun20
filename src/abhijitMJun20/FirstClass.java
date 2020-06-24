package abhijitMJun20;

public class FirstClass {
	void firstMethod() {
    	System.out.println("Inside first method");
    	secondMethod();
	 
      }
     static void secondMethod() {
    	 
    	 System.out.println("Inside second method");
    	 SecondClass.forthMethod();
     }
}
