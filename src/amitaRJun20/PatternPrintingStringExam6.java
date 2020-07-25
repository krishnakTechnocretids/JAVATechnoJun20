package amitaRJun20;

public class PatternPrintingStringExam6 {
	
	void display(String input) {
		System.out.println("Input String : "+input);
		for(int index=0; index<=input.length()-1; index++) {
			String temp = input.substring(index, index+1).toUpperCase();
			//System.out.println(temp);
			System.out.println(temp + input.substring(index+1));
		}
		
	}
	public static void main(String[] args) {
		String input = "Globant";
		new PatternPrintingStringExam6().display(input);
	}
}
