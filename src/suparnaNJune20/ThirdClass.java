package suparnaNJune20;

public class ThirdClass {
	static void fifthMethod()	{
		System.out.println(" fifthMethod :This is  static method of class ThirdClass ");
		System.out.println("This call from ThirdClass to FourthClass with class name as eighthMethod ()	is static method  ");
		FourthClass.eighthMethod ()	;
	}
	void sixthMethod ()	{
		System.out.println(" sixthMethod :This is Non static method of class ThirdClass");
		System.out.println("This call from ThirdClass to ThirdClass with class name as fifthMethod() is static method   ");
		ThirdClass.fifthMethod();
	}
}
