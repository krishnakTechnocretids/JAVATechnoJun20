package sweetyMJun20;

public class ThirdClass {
  static void fifthMethod(){   
    System.out.println("In Third Class : static fifthMethod() and calling eightMethod() of ForthClass");
	ForthClass.eightMethod();
   }
  void sixthMethod(){
	System.out.println("In Third Class: Non-static sixthMethod() and calling fifthMethod() of Third Class ");
	ThirdClass.fifthMethod();
  }
 }
