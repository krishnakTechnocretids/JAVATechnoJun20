package technoCredits.stringDemo;

public class Example12 {
	
	void compareContent() {
		String str1 = new String("Hi");	
		String str2 = "Hi";
		String str3 = str2.substring(0) + str2.substring(1);
		
		if(str2 == str3)
			System.out.println("Same");
		else
			System.out.println("Reference is not same");
		
		
	}
	public static void main(String[] args) {
		new Example12().compareContent();
	}
}
