package technoCredits.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class D {
	
	void m2(String filePath) throws FileNotFoundException{
		File file = new File(filePath); //5
		FileInputStream inputStream = new FileInputStream(file); //6
		System.out.println("2");
	}
}
