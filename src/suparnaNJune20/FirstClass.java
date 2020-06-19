package suparnaNJune20;

public class FirstClass {
	void firstMethod()	{
		System.out.println(" firstmethod :This is Non static method of class FirstClass ");
		System.out.println("This call from FirstClass to FirstClass  with class name as secondMethod() is  static function");
		FirstClass.secondMethod ();
	}
	static void secondMethod ()	{
		System.out.println(" secondMethod :This is static method of class FirstClass ");
		System.out.println("This call from FirstClass to second class with class name as fourthMethod ()is static function");
		SecondClass.fourthMethod ();
	}
}

