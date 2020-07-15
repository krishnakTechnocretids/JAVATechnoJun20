package technoCredits.classcastExceptionDemo;

public class Test {
	
	void display(A a) {
		C a1 = (C)a;
		a1.m2();
	}
	
	void display1(Object obj) {
		int msg = (int)obj;
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		String msg = "Hi";
		Test test = new Test();
		test.display(a1);
	}
}
