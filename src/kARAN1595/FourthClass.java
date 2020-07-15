package kARAN1595;

public class FourthClass {

	static void m1() {
		System.out.println();
		System.out.println(" Fourth Class Method1");
	}
	static void m2() {
		System.out.println();
		System.out.println(" Fourth Class Method2");
		FourthClass.m1();
	}
}
