package apurvaJun20;

public class ClassA {
	void m1() {
		System.out.println("First non static menthod of Class a called from main method of client class");
		
		ClassA.m2();
    }
	static void m2() {
		System.out.println("\n"+"This is static method m2 of Class A called from non static method M1 of Class A");
		
		ClassB.m4();
	}
	

}
