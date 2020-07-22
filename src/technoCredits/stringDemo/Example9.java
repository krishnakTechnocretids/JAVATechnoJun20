package technoCredits.stringDemo;

public class Example9 {
	
	void compareContent() {
		String s1 = "Techno"; // String pool
		String s2 = new String("Techno"); // Object
		String s3 = "Techno"; // String pool
		String s4 = new String("Techno");	// Object
		String s5 = s2;
		
		if(s5 == s2)
			System.out.println(1);
		if(s5.equals(s2))
			System.out.println(2);
		
		if(s5 == s1)
			System.out.println(3);
		
	}
	public static void main(String[] args) {
		new Example9().compareContent();
	}
}
