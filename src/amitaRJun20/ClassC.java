package amitaRJun20;

public class ClassC {
	static void method5() {
		System.out.println("\n"+"I am static Method5 of classC called from non-static Method6 of ClassC ");
		ClassD.method2();
	}
	void method6() {
		System.out.println("\n"+"I am non-static Method6 of ClassC called from non-static Method3 of ClassB ");
		ClassC.method5();
	 }
}
