package ajitSJune20;

public class FirstClass {

	void method1() {

		System.out.println("I am inside method1 of FirstClass ");
		FirstClass.method2();
	}

	static void method2() {
		System.out.println("I am inside method2 of FirstClass ");
		SecondClass.method4();
	}

}
