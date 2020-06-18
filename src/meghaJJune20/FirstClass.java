package meghaJJune20;

public class FirstClass {
	
	void method1(){
		System.out.println("FirstClass of Method1");
		FirstClass.method2();
	}
	static void method2(){
		System.out.println("FirstClass of Method2");
		SecondClass.method4();
	}
	

}
