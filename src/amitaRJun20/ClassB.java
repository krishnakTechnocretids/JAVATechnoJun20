package amitaRJun20;

public class ClassB {
	void method3() {
		System.out.println("\n"+"I am non-static Method3 of classB called from static Method4 of ClassB ");
		ClassC classc=new ClassC();
		classc.method6();
	}
	static void method4() {
		System.out.println("\n"+"I am static Method4 of classB called from static Method2 of ClassA ");
		ClassB classb=new ClassB();
		classb.method3();
	 }
}
