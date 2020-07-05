package technoCredits.stringDemo;

public class Example6 {

	public static void main(String[] args) {
		String s1 = "Techno";
		String s2 = "credits";
		s1 = s1+s2; // Technocredits
		s1 = s1 + s1.charAt(0);// TechnocreditsT
		s1 = s1.toLowerCase(); //technocreditst
		s1 = s1.substring(s1.indexOf('d')); //ditst
		s1 = "" + s1.charAt(0) + s1.charAt(s1.length()-1);//dt
		if(s1.contains("d"))
			System.out.println("Please like Technocredits FB page"); // P
		
		if(s1.length()>4)
			System.out.println("Lets practice more");
		else
			System.out.println("We can do it");
		
		System.out.println(s1);
		
	}
}
