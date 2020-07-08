package technoCredits.stringDemo;

public class Example6 {

	public static void main(String[] args) {
		String s1 = "Techno";
		String s2 = "credits";
		s1 = s1+s2;
		s1 = s1 + s1.charAt(0);
		s1.toLowerCase(); 
		s1 = s1.substring(s1.indexOf('d'));
		s1 = "" + s1.charAt(0) + s1.charAt(s1.length()-1);
		if(s1.contains("d"))
			System.out.println("Lets practice more");
		
		if(s1.length()>4)
			System.out.println("I am good");
		else
			System.out.println("We can do it");
		
		System.out.println(s1);
		
	}
}
