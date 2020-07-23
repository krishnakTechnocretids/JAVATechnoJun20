package technoCredits.stringDemo;

public class Example13 {

	static void m1() {
		String s1 = "Hi";
		String s2 = new String("Hi");
		s2 = s2.intern();
		
		if(s1 == s2)
			System.out.println(1);
		else
			System.out.println(2);
	}
	
	public static void main(String[] args) {
		m1();
		/*String s1 = "Hi"; // constant pool
		String s2 = new String("Hi"); // heap new object
		String s3 = s2.intern(); // pointing to heap memory object 
		
		if(s2 == s3)
			System.out.println("s2 == s3");
		
		if(s1 == s3)
			System.out.println("s1 ==s3");*/
	}
}
