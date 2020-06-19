package sweetyMJun20;

public class FirstClass {
	void firstMethod(){
	  System.out.println("In First class: non static firstMethod() and calling secondMethod()of First Class");
	  FirstClass.secondMethod();
		  }
	static void secondMethod(){
	 System.out.println("In Second Class :static secondMethod() and calling fourthMethod()of Second Class");
	 SecondClass.forthMethod();
		  }
		 }

