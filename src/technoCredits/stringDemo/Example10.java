package technoCredits.stringDemo;

public class Example10 {
	
	void compareContent() {
		String s1 = new String("JUN19");
		String s3 = s1.toLowerCase(); // jul19// 
		String s2 = "jun19";
		
		if(s1 == s3)
			System.out.println(1);
		/*if(s1 == s2)
			System.out.println(2);*/
		/*if(s2.equals(s3))
			System.out.println(3);*/
		/*if(s1.equals(s3))
			System.out.println(4);*/	
		if(s2 == s3)
			System.out.println(5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	public static void main(String[] args) {
		new Example10().compareContent();
	}
}
