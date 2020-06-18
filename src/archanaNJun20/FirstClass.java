package archanaNJun20;

public class FirstClass {

	void firstMethod()
	{
		System.out.println("Your are in FirstClasss:non static firstMethod() and calling secondMethod() of FirstClass ");
		FirstClass.secondMethod();
	}
	
	static void secondMethod()
	{
		
		System.out.println("Your are in FirstClasss:static secondMethod() and calling firstmethod() of FirstClass");
		SecondClass.forthMethod();
	}
}
