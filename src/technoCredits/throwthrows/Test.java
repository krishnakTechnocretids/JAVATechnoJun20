package technoCredits.throwthrows;

import java.io.IOException;

public class Test {

//	{
//		try {
//			throw new IOException();
//		}catch(IOException ie) {
//			System.out.println("1");
//		}
//	}
	
	Test() {
		throw new ArithmeticException("Age is less then 18, not allowed to enter");
	}
	
	public static void main(String[] args) {
		try {
			new Test();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
