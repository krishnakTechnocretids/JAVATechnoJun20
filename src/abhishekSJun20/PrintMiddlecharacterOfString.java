package abhishekSJun20;
/*Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */

public class PrintMiddlecharacterOfString {
	// method to find the middle character in String
	void PrintMiddleCharacterOfWord(String s) {
		String[] array = s.split(" ");
		for (int index = 0; index < array.length; index++) {
			int middle = 0;
			if (array[index].length() % 2 == 0) {
				middle = (array[index].length() / 2) - 1;
				System.out.println(array[index].charAt(middle) + " is middle character in " + array[index]);
			} else {
				middle = array[index].length() / 2;
				System.out.println(array[index].charAt(middle) + " is middle character in " + array[index]);
			}
		}
	}

	public static void main(String[] args) {
		PrintMiddlecharacterOfString printMiddlecharacterOfString = new PrintMiddlecharacterOfString();
		String input = "Harsh Maulik";
		printMiddlecharacterOfString.PrintMiddleCharacterOfWord(input);
	}

}
