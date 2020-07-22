package technoCredits.stringDemo;

public class InterviewQ1 {

	static void m1() {
		String s1 = "Globant";
		String s2 = "Globant";
		String s3 = new String("Globant");
		String s4 = new String("Globant");
		
		if(s1 == s2)
			System.out.println(1);
		
		if(s1 == s3)
			System.out.println(2);
		
		if(s3 == s4)
			System.out.println(3);
		
		//Employee e1 = new Employee();
		// Sop(e1); / Memory Address
		
		System.out.println(s3); //
	}
	
	public static void main(String[] args) {
		m1();
	}
	
}
