package amitaRJun20;

public class ClassA {	
	
	void method1() {
		System.out.println("I am non-static Method1 of classA called from main method of client class");
		ClassA.method2();
	}
		 static void method2() {
		 System.out.println("\n"+"I am static Method2 of classA called from non-static Method1 of ClassA ");
		 ClassB.method4();
	 }
}
