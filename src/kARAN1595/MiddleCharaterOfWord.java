package kARAN1595;

public class MiddleCharaterOfWord {
	void PrintMiddleCharacterOfWord(String word) {
		String[] array = word.split(" ");
		for (int index = 0; index < array.length; index++) {
			int middleCharater = 0;
			if (array[index].length() % 2 == 0) {
				middleCharater = (array[index].length() / 2) - 1;
				System.out.println(array[index].charAt(middleCharater) + " is middle character in " + array[index]);
			} else {
				middleCharater = array[index].length() / 2;
				System.out.println(array[index].charAt(middleCharater) + " is middle character in " + array[index]);
			}
		}
	}

	public static void main(String[] args) {
		MiddleCharaterOfWord middlecharacter = new MiddleCharaterOfWord();
		String input = "Harsh Maulik";
		middlecharacter.PrintMiddleCharacterOfWord(input);
	}
}
