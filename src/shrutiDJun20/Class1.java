package shrutiDJun20;

public class Class1 {
	
	void firstmethod(){
		System.out.println("first non-static method or class 1, called by main method");
		Class1.secondmethod();
	}
	static void secondmethod(){
		System.out.println("second static method or class 1, called by first method of class1");
		Class2.fourthmethod();
	}
}
