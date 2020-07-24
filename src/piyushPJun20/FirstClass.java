package piyushPJun20;
public class FirstClass {
	void m1() {
		System.out.println();
		System.out.println(" First Class Method1 ");
		FirstClass.m2();
	}
	static void m2() {
		System.out.println();
		System.out.println(" First Class Method2 ");
		SecondClass.m4();
	}
}
