package archanaNJun20;

public class ForthClass {
	static void seventhMethod()
	{
		System.out.println("Your are in ForthClass : static seventhMethod()");
	}
	static void eightMethod()
	{
		
		System.out.println("Your are in ForthClass : static eightMethod() and calling seventhMethod() of ForthClass");
		ForthClass.seventhMethod();
	}
}
