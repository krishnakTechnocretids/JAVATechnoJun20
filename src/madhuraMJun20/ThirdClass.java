package madhuraMJun20;

public class ThirdClass {
	static void method5() {
		System.out.println("ClassC_M5");
		System.out.println();
		FourthClass.method2();
	}
	void method6() {
		System.out.println("ClassC_M6");
		System.out.println();
		ThirdClass.method5();
		
	}
}
