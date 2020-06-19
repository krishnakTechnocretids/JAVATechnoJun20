package ajitSJune20;

public class ForthClass {

	static void method1() {
		System.out.println("I am inside Method1 of ForthClass ");
	}

	static void method2() {
		System.out.println("I am inside Method2 of ForthClass ");
		ForthClass.method1();
	}

}
