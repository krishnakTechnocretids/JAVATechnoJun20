package shrutiDJun20ExceptionHandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Practice {
	
void m1(String filepath){
	File file = new File(filepath);
	
	try {
		FileInputStream input = new FileInputStream (file);
	} catch (FileNotFoundException e) {
		System.out.println("file not fount");
	}
	

	
}
	 
	public static void main(String[] args)throws FileNotFoundException{
		Practice p= new Practice();
		p.m1("");
	
		


}
}
