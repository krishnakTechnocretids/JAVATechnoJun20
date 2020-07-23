package technoCredits.stringDemo;

public class Example7 {
	
	void compareContent() {
		String s1 = "Techno"; // String pool
		String s2 = new String("Techno"); // Object
		String s3 = "Techno"; // String pool
		String s4 = new String("Techno");	// Object
		
		String s5 = s4;
		
		
		if(s1 == s2)
			System.out.println(1);
		if(s1 == s3)
			System.out.println(2);
		if(s2 == s4)
			System.out.println(3);
		if(s1 == s4)
			System.out.println(4);
		
		if(s1.equals(s2))
			System.out.println(5);
		if(s1.equals(s3))
			System.out.println(6);
		if(s2.equals(s4))
			System.out.println(7);
		if(s1.equals(s4))
			System.out.println(8);
	}
	public static void main(String[] args) {
		new Example7().compareContent();
	}
}
