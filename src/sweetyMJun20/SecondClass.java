package sweetyMJun20;

public class SecondClass {
  void thirdMethod()
	  {   
	  ThirdClass thirdclass=new ThirdClass();
	      thirdclass.sixthMethod();
		  System.out.println("In third method");
	  }
	  static void forthMethod()
	  {
		  FirstClass.secondMethod();
		  SecondClass secondclass=new SecondClass();
		  secondclass.thirdMethod();
		  System.out.println("In forth method");
	  }
	 }

