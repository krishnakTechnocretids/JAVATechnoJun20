package technoCredits.classcastExceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args ) throws Exception{
			try {
				m1();
			}catch(FileNotFoundException fe) {
				System.out.println(1);
			}
		
	}
	
	static void m1() throws IOException{
		int x = 9;
		if(x<10)	
			throw new FileNotFoundException();
		else
			throw new IOException();
	}
}
