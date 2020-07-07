package technoCredits.polymorphismdemo;

public class InterviewQ1 {

	void m1(byte s) {
		System.out.println("Byte");
	}
	
	void m1(short s) {
		System.out.println("Short");
	}
	
	void m1(long l) {
		System.out.println("Long");
	}
	
	void m1(int x) {
		System.out.println("Int" + x);
	}
	
	void m1(float f) {
		System.out.println("Float : " + f);
	}
	
	void m1(double d) {
		System.out.println("Double " + d);
	}
		
	void m1(Object obj) {
		System.out.println("Object");
	}
	
	void m1(String s) {
		System.out.println("String");
	}
}
