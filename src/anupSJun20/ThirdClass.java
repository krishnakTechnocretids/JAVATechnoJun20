package anupSJun20;

public class ThirdClass {
	static void fifthmethod() {
		System.out.println("Fifth Method Third class");
		FourthClass.secondmethod();
	}
	void sixthmethod() {
		System.out.println("Sixth Method Third Class");
		fifthmethod();
	}

}
