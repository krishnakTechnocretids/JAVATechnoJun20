package technoCredits.stringDemo;

public class Example11 {
	
	void compareContent() {
		String s1 = new String("JUN19");
		String s2 = "jun19";
		String s3 = "JUN19";
		String s4 = new String(s2.toUpperCase());
		
		if(s3 == s4)
			System.out.println(1);
		else
			System.out.println(2);
		
	}
	public static void main(String[] args) {
		new Example11().compareContent();
	}
}
