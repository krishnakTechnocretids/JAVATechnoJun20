package deavinaSJun20;

public class ReplaceSecondLastString {
	void replaceOccurenceOfString(String[] array, String replaceString, String sourceWord) {
		int count = 0;
		for (int index = array.length - 1; index >= 0; index--) {
			if (array[index].equals(sourceWord)) {
				count++;
				if (count == 2) {
					array[index] = replaceString;
					break;
				}
			}
		}
		displayString(array);
	}

	void displayString(String[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String[] array = str.split(" ");
		System.out.println("Input String is: ");
		new ReplaceSecondLastString().displayString(array);
		String replaceWord = "Technocredits";
		String sourceWord = "Globant";
		System.out.println("\nOutput String is: ");
		new ReplaceSecondLastString().replaceOccurenceOfString(array, replaceWord, sourceWord);

	}

}
