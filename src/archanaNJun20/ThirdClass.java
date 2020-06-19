package archanaNJun20;

public class ThirdClass {
	static void fifthMethod()
	{
		
		System.out.println("Your are in ThirdClass : static fifthMethod() and calling eightmethod of Forthclass");
		ForthClass.eightMethod();
	}
	 void sixthMethod()
	{
		 
		System.out.println("Your are in ThirdClass : non static sixthMethod() and calling fifthmethod() of ThirdClass");
		ThirdClass.fifthMethod();
	}
}
