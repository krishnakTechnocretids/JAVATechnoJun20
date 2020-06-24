package meghaJJune20;

public class FourthClass {
	
	static void method1(){
		System.out.println("FourthClass of Method1");
		}
	static void method2(){
		System.out.println("FourthClass of Method2");
		FourthClass.method1();
	}

}
