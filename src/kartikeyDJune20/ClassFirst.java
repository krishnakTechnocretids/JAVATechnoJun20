package kartikeyDJune20;

public class ClassFirst {
	void firstMtehod() {

		System.out.println("Class: First  |  Method: First");
		ClassFirst.secondMethod();
	}

	static void secondMethod() {

		System.out.println("Class: First  |  Method: Second");
		ClassSecond.secondMethod();

	}

}
