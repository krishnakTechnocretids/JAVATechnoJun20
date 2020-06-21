package meghaJJune20;

public class SecondClass {
	
	void method3(){
		System.out.println("SecondClass of Method3");	
		ThirdClass thirdclass = new ThirdClass();
		thirdclass.method6();
	}
	static void method4(){
		System.out.println("SecondClass of Method4");
		SecondClass secondclass = new SecondClass();
		secondclass.method3();
	}

}
