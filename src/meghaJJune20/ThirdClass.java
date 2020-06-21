package meghaJJune20;

public class ThirdClass {
	
	static void method5(){
		System.out.println("ThirdClass of Method5");
		FourthClass.method2();
	}
	void method6(){
		System.out.println("ThirdClass of Method6");
		ThirdClass.method5();
	}

}
