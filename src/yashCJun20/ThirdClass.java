package yashCJun20;
public class ThirdClass {
	static void m5() {
		System.out.println("In m5 method of ThirdClass");
		System.out.println("Calling static m2 method of Fourth class from Third Class");
		FourthClass.m2();
	}
	void m6() {
		System.out.println("In m6 method of ThirdClass");
		System.out.println("Calling static m5 method of Third class from Third Class");
		m5();
		
	}

}
