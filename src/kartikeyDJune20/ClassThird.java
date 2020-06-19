package kartikeyDJune20;

public class ClassThird {
	static void firstMtehod() {

		System.out.println("Class: Third  |  Method: Fifth");
		ClassFourth.secondMethod();

	}

	void secondMethod() {

		System.out.println("Class: Third  |  Method: Sixth");
		ClassThird.firstMtehod();

	}

}
