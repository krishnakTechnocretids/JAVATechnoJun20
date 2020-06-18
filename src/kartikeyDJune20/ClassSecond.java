package kartikeyDJune20;

public class ClassSecond {
	void firstMtehod() {

		System.out.println("Class: Second |  Method: Third");
		ClassThird classThird = new ClassThird();
		classThird.secondMethod();
	}

	static void secondMethod() {

		System.out.println("Class: Second |  Method: Fourth");
		ClassSecond classSecound = new ClassSecond();
		classSecound.firstMtehod();
	}

}
