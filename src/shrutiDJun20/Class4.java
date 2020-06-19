package shrutiDJun20;

public class Class4 {
	static void firstmethod(){
		System.out.println("first non-static method or class 4, called by second method of class4");
	}
	static void secondmethod(){
		System.out.println("second static method or class 4, called by fifth method of class3");
		Class4.firstmethod();
	}
}