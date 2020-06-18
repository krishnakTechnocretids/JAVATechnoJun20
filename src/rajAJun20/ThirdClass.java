package rajAJun20;

public class ThirdClass {
	static void m5() {
		System.out.println("ThirdClass static method m5() is calling FourthClass static method m2()");
		FourthClass.m2();
	}
	void m6() {
		System.out.println("ThirdClass method m6() is calling ThirdClass static method m5()");
		ThirdClass.m5();
	}
}
