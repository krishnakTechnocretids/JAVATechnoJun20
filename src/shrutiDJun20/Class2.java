package shrutiDJun20;

public class Class2 {
	void thirdmethod(){
		System.out.println("third non-static method or class 1, called by fourth method of class2");
		Class3 class3 = new Class3();
		class3.sixthmethod();
	}
	static void fourthmethod(){
		System.out.println("fourth static method or class 1, called by second method of class1");
		Class2 class2 = new Class2();
		class2.thirdmethod();
	}

}
