package suparnaNJune20;

public class SecondClass {
	void thirdMethod()	{
		System.out.println(" thirdMethod :This is Non static method of class SecondClass ");
		System.out.println("This call from SecondClass to ThirdClass with class ref var as sixthMethod() is non static ");
		ThirdClass thirdVar = new ThirdClass();
		thirdVar.sixthMethod();
	}
	static void fourthMethod ()	{
		System.out.println(" fourthMethod :This is static method of class SecondClass");
		System.out.println("This call from SecondClass to SecondClass  with  class ref var as thirdMethod() is non static  ");
		SecondClass secondVar = new SecondClass();
		secondVar.thirdMethod();
	}
}