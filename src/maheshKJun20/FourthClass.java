package maheshKJun20;

public class FourthClass {
	
	static void methodSeven() {
		//This Method is the final endpoint of communication started
		System.out.println("I am methodSeven from FourthClass. No further calling, I am the endpoint of communication started");
	}

	static void methodEight() {
		//This Method will be calling methodSeven(Static) defined in the Same class - FourthClass
		System.out.println("I am methodEight from FourthClass. I will be calling methodSeven(static) from FourthClass");
		FourthClass.methodSeven();
	}
}
