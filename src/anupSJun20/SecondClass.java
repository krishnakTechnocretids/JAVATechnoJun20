package anupSJun20;

public class SecondClass {
	void thirdmethod() {
		System.out.println("Third Method Second class");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.sixthmethod();
	}
	static void fourthmethod() {
		System.out.println("Fourth Method Second Class");
		SecondClass secondclass = new SecondClass();
		secondclass.thirdmethod();
	}

}
