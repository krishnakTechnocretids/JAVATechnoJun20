package apurvaJun20;

public class SpecialCharacters {
	
	void displaySpecialChar(String str) {
		
		String str1= str;
		
		str1 = str1.replace('[', ' ').replace('{', ' ').replace(']', ' ').replace('}', ' ').replace('_', ' ').replace(',', ' ');
		
		String[] strArray = str1.split(" ");
		System.out.println("\nNo. of Special Characters: "+(strArray.length - 1));

		System.out.println("Input String: "+str+"\nNo. of Special Characters in the String = "+(str.length() - str.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "").length()));
	}

	public static void main(String[] args) {
		SpecialCharacters specialCharacters = new SpecialCharacters();

		String str = "Kr[i{s]hn}_a,Tech";
		specialCharacters.displaySpecialChar(str);
	
		
	}

}
