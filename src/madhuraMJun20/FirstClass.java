package madhuraMJun20;

public class FirstClass {
	void method1() {
		System.out.println("ClassA_M1");
		System.out.println();
		FirstClass.method2();
	}
	static void method2() {
		System.out.println("ClassA_M2");
		System.out.println();
		SecondClass.method4();
	}
}
