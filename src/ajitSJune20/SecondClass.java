package ajitSJune20;

public class SecondClass {

	void method3() {
		System.out.println("I am inside method3 of SecondClass ");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.method6();
	}

	static void method4() {
		System.out.println("I am inside method4 of SecondClass ");
		SecondClass secondClass = new SecondClass();
		secondClass.method3();
	}

}
