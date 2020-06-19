package maheshKJun20;

public class FirstClass {
	
	void methodOne() {
		//Method one will be calling methodtwo(Static) defined in the same class
		System.out.println("I am methodOne from FirstClass. I will be calling methodTwo(static) from Firstclass");
		FirstClass.methodTwo();
	}
	
	static void methodTwo() {
		//This method will be calling methodFour(Static) defined in the another class - SecondClass
		System.out.println("I am methodTwo from FirstClass. I will be calling methodFour(static) from Secondclass");
		SecondClass.methodFour();
		
	}

}