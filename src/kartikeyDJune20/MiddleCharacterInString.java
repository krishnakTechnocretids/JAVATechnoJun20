package kartikeyDJune20;

public class MiddleCharacterInString {

	static void middleCharInString(String[] input) {
		for (int index = 0; index < input.length; index++) {

			int middleOfString = (input[index].length()-1)/ 2;
			char ch = input[index].charAt(middleOfString);
			System.out.println("Middle character in " + input[index] + " is " + ch);

		}

	}

	public static void main(String[] args) {
		String input = "Harsh Maulik Kartikey";
		String[] inputArray = input.split(" ");
		middleCharInString(inputArray);
	}
	
}
