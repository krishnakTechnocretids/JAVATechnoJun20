package maheshKJun20;

public class SecondClass {
	
	void methodThree() {
		//This Method will be calling methodsix(Non Static) defined in the another class - ThirdClass
		System.out.println("I am methodThree from SecondClass. I will be calling methodSix(Non static) from Thirdclass");
		ThirdClass thirdclass = new ThirdClass();
		thirdclass.methodSix();
	}
	
	static void methodFour() {
		//This Method will be calling methodThree(Non Static) defined in the Same class
		System.out.println("I am methodFour from SecondClass. I will be calling methodThree(Non static) from Secondclass");
		SecondClass secondclass = new SecondClass();
		secondclass.methodThree();
	}

}
