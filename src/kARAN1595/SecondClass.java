package kARAN1595;

public class SecondClass {
	void m3() {
		System.out.println();
		System.out.println(" Second Class Method3 ");
		ThirdClass third = new ThirdClass();
		third.m6();
	}
	static void m4() {
		System.out.println();
		System.out.println(" Second Class Method4 ");
		SecondClass second = new SecondClass();
		second.m3();
	}
}
