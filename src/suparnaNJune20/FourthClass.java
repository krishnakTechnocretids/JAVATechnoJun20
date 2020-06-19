package suparnaNJune20;

public class FourthClass {
	static void seventhMethod()	{
		System.out.println(" seventhMethod :This is  static method of class FourthClass ");
	}
	static void eighthMethod ()	{
		System.out.println(" eighthMethod :This is  static method of class FourthClass");
		System.out.println("This call from FourthClass to FourthClass  with class name as seventhMethod() is static method ");
		FourthClass.seventhMethod();
	}
}
