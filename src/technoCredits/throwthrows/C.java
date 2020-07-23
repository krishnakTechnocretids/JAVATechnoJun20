package technoCredits.throwthrows;

import java.io.FileNotFoundException;

public class C {
	void m1() throws FileNotFoundException {
		D d1 = new D(); // 3
		try {
			d1.m2("D://mmk.txt"); //4 // 7
		} catch (FileNotFoundException fe) {
			System.out.println("Catch"); //8
		}
		System.out.println("1"); //9
	}

	public static void main(String[] args) throws FileNotFoundException{
		C c1 = new C(); // 1
		c1.m1(); // 2 // 10
		System.out.println("4"); //11
		System.out.println("3"); // 12
	}
}
