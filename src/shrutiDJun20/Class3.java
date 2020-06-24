package shrutiDJun20;

public class Class3 {
	static void fifthmethod(){
		System.out.println("fifth static method or class 3, called by sixth method of class3");
		Class4.secondmethod();
	}
	 void sixthmethod(){
		System.out.println("sixth non-static method or class 1, called by third method of class2");
		Class3.fifthmethod();
	}
}
