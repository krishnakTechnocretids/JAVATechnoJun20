package abhijitMJun20;

public class SecondClass {
	void thirdMethod() {
		System.out.println("Inside third method");
		ThirdClass thirdclass=new ThirdClass();
		thirdclass.sixthMethod();
		
	}
	static void forthMethod() {
		System.out.println("Inside forth method");
		SecondClass secondclass =new SecondClass();
		secondclass.thirdMethod();
	}
}
