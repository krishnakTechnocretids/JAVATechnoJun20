package sweetyMJun20;

public class ThirdClass {
	
	  static void fifthMethod()
	  {   ForthClass.sevenMethod();
		  System.out.println("In fifth Method");
	  }
	  void sixthMethod()
	  {   ThirdClass.fifthMethod();
	      ForthClass.eightMethod();
	      System.out.println("In sixth method");
	  }
	  
	}