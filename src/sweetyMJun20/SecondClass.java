package sweetyMJun20;

public class SecondClass {
  void thirdMethod(){   
   System.out.println("In Second Class: non static Third method() and calling sixthMethod() of ThirdClass");
   ThirdClass thirdclass=new ThirdClass();
   thirdclass.sixthMethod();
 }
   static void forthMethod(){   
	System.out.println("In Second Class :Static forthMethod() and calling thirdMethod() of SecondClass");
	 SecondClass secondclass=new SecondClass();
	 secondclass.thirdMethod();
 }
}

