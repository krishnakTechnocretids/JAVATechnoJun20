package technoCredits.throwthrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

	@Override
	void m1() throws FileNotFoundException {
		System.out.println("Child m1");
	}
	
	void m2() {
		
	}
	
	public static void main(String[] args) {
		Parent p1 = new Child();
		try {
			p1.m1();
		}catch(IOException ie) {
			
		}
	}
}
