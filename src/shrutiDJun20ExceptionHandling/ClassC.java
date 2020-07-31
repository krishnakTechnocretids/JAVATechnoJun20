package shrutiDJun20ExceptionHandling;


public class ClassC {


public static void main(String[] args) {
	
	try{
		throw new IllegalAccessException();
	}
	catch(IllegalAccessException e){
		System.out.println("EO");
	}
	
}
}
