package madhuraMJun20;

public class FourthClass {
	static void method1() {
		System.out.println("ClassD_M1");
		System.out.println();
	}
	static void method2() {
		System.out.println("ClassD_M2");
		System.out.println();
		FourthClass.method1();
	}
}
