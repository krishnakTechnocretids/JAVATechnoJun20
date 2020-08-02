package anshuKJun20;

public class AppendLastString {
	
	void appendLastString(String input ,String requiredOutput) {
		int count =0;
		if(input.length() == requiredOutput.length()) {
			while(!input.equals(requiredOutput)) {
			 input = input.substring(input.length()-1).concat( input.substring(0,input.length()-1));
				count++;
			 }
		}
	
		System.out.println("Final Output " +input+" comes after minimum " +count+" iteration");
		
	}
	public static void main(String[] args) {
		AppendLastString appendLastString = new AppendLastString();
		String input = "abcdef";
		String requiredOutput ="defabc";
		System.out.println(input);
		appendLastString.appendLastString(input ,requiredOutput );
	}
}
