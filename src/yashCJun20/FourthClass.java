package yashCJun20;

public class FourthClass {
	static void m1() {
		System.out.println("In m1 method of FourthClass");
	}
	static void m2() {
		System.out.println("In m2 method of FourthClass");
		System.out.println("Calling static m1 method of Fourth class from Fourth Class");
		m1();
	}

}
