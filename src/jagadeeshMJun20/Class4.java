package jagadeeshMJun20;

public class Class4 {
	static void m1() {
			System.out.println("Inside Class4 and Method1");
		}
	static void m2() {
			System.out.println("Inside Class4 and Method2");
			Class4.m1();
		}
}
