package ajitSJune20;

public class ThirdClass {
	static void method5() {
		System.out.println("I am inside method5 of ThirdClass ");
		ForthClass.method2();
	}

	void method6() {
		System.out.println("I am inside method6 of ThirdClass ");
		ThirdClass.method5();
	}

}
