package anupSJun20;

public class FirstClass {
	void firstmethod() {
		System.out.println("First Method First class");
		secondmethod();
	}
	static void secondmethod() {
		System.out.println("Second Method First Class");
		SecondClass.fourthmethod();
	}

}
