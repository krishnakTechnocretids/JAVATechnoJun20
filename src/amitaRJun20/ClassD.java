package amitaRJun20;

public class ClassD {
	static void method1() {
		System.out.println("\n"+"I am static Method1 of classD called from static Method2 of ClassD ");
	}
	static void method2() {
		System.out.println("\n"+"I am static Method2 of classD called from static Method5 of ClassC ");
		ClassD.method1();
	 }
}
