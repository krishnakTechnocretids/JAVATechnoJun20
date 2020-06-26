package vaishnaviVJun20_arrayExamples;

public class CountSpecialChar {
	
	void countSpecialCharactersInWord(String s) {
		int count=0;
		String name= s.replace("[","").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "");
		count = s.length()-name.length();
		System.out.println("Total special characters are: "+count);
		
	}

	public static void main(String[] args) {
		CountSpecialChar countSpecialChar = new CountSpecialChar();
		String input = "Kr[i{s]hn}_a,Tech";
		countSpecialChar.countSpecialCharactersInWord(input);

	}

}
