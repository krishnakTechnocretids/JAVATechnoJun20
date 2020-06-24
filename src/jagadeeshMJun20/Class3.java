package jagadeeshMJun20;

public class Class3 {
static void m5() {
	System.out.println("Inside Class3 and Method5");
	Class4.m2();
}
void m6() {
	System.out.println("Inside Class3 and Method6");
	Class3.m5();
}
}