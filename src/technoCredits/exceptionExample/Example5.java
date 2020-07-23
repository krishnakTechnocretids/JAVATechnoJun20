package technoCredits.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example5 {

	void m1() {
		File file = new File("D://mmk.txt");
		try {
			FileInputStream inputStream = new FileInputStream(file);
			System.out.println("Hi");
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Example5().m1();
	}
}
