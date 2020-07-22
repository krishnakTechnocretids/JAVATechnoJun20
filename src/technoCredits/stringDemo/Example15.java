package technoCredits.stringDemo;

public class Example15 {
	
	String reverseGivenString(String input) {
		//StringBuilder sb = new StringBuilder(input);
		return new StringBuilder(input).reverse().toString();
	}

	public static void main(String[] args) {
		String msg = "Technocredits";
		StringBuffer sb = new StringBuffer(msg);
		
		System.out.println(sb.reverse());
		
		String msg1 = "Technocredits";
		StringBuilder stringB = new StringBuilder(msg1);
		msg1 = stringB.reverse().toString();
		System.out.println(stringB.reverse());
		
		StringBuilder b1 = new StringBuilder();
		b1.append("Hi");
		String msg2 = b1.toString();
		
		//1. String -> StringBuffer
		//2. StringBuffer -> toString method of StringBuffer class
	}
}
