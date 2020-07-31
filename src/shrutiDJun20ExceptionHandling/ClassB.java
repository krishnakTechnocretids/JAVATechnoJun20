package shrutiDJun20ExceptionHandling;



public class ClassB {

	static int a = 1;

	private static void m1(){
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		try {
			a = a + 1;
			throw new Exception();
		}
		catch (Exception e){
			a = a+1;
		}
		finally{
			a = a+1;
			m1();
			a=a+1;
		}
		
		
		System.out.println(a);
	}
}
