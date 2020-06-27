package kartikeyDJune20;

public class CountSpecialCharacters {
	
	public static void main(String[] args) {
		String input="Kr[i{s]hn}_a,Tech";
		
		int specialCharlength=input.replaceAll("[a-zA-Z0-9]", "").length();
		System.out.println(specialCharlength+" special charcters are there in "+input);
				
	}
		
	}
