package maheshKJun20;

public class ThirdClass {
	
	static void methodFive() {
		//This Method will be calling methodEight(Static) defined in the Another class - FourthClass
		System.out.println("I am methodFive from ThirdClass. I will be calling methodEight(static) from FourthClass");
		FourthClass.methodEight();
	}
	
	void methodSix() {
		//This Method will be calling methodFive(Static) defined in the Same class
		System.out.println("I am methodSix from ThirdClass. I will be calling methodFive(static) from ThirdClass");
		ThirdClass.methodFive();
	}

}
