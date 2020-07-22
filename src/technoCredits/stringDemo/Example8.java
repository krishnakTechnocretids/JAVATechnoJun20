package technoCredits.stringDemo;

public class Example8 {
	
	void compareContent() {
		String s1 = new String("JUN19");
		s1.toLowerCase();
		String s2 = "jun19";
		
		if(s1 == s2)
			System.out.println(1);
		
		if(s1.equals(s2))
			System.out.println(2);
		else
			System.out.println(3);
		
		
	}
	public static void main(String[] args) {
		new Example8().compareContent();
	}
}
