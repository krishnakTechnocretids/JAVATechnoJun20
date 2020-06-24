package rajAJun20;

public class FirstClass {
	void m1() {
		System.out.println("First Class method m1() is calling First Class static method m2()");
		FirstClass.m2();
	}
	static void m2() {
		System.out.println("First Class static method m2() is calling Second Class static method m4()");
		SecondClass.m4();
	}
}
