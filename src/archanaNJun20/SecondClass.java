package archanaNJun20;

public class SecondClass {

	void ThirdMethod()
	{
		System.out.println("Your are in Secondclass:non static ThirdMethod() and calling sixthMethod() of ThirdClass");
		ThirdClass thirdclass=new ThirdClass();
		thirdclass.sixthMethod();
		
	}
	static void forthMethod()
	{	System.out.println("Your are in Secondclass:static secondMethod() and calling ThirdMethod() of SecondClass");
		SecondClass secondclass = new SecondClass();
		secondclass.ThirdMethod();
		
	}
}
