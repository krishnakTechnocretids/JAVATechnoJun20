package jagadeeshMJun20;

public class Class2 {

	void m3() {
		System.out.println("Inside Class2 and Method3");
		Class3 class3 = new Class3();
		class3.m6();
	}
	static void m4() {
		System.out.println("Inside Class2 and Method4");
		Class2 class2 = new Class2();
		class2.m3();
	}
}
