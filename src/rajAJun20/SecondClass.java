package rajAJun20;

public class SecondClass {
	void m3() {
		ThirdClass thirdclass= new ThirdClass();
		System.out.println("Second Class method m3() is calling Third Class method m6()");
		thirdclass.m6();
	}
	static void m4() {
		SecondClass secondclass= new SecondClass();
		System.out.println("Second Class static method m4() is calling Second Class method m3()");
		secondclass.m3();
	}
}
