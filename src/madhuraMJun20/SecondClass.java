package madhuraMJun20;

public class SecondClass {
	void method3() {
		System.out.println("ClassB_M3");
		System.out.println();
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.method6();
	}
	static void method4() {
		System.out.println("ClassB_M4");
		System.out.println();
		SecondClass secondClass = new SecondClass();
		secondClass.method3();
	}
}
