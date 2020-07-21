package shrutiDJun20Assignments;

import java.util.Arrays;

//Hi Globant Hello Globant Hi Globant GM Globant Hi Globant
//Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant

public class ReplaceSecondLast {

	void replaceString(String input, String word) {
		String tempInput = input.replace("Globant", "*");
		String output = "";
		int wordCount = (input.length() - tempInput.length())
				/ (word.length() - 1);
		int count = 0;
		String[] tempArr = input.split(" ");
		for (int index = 0; index < tempArr.length; index++) {
			if (tempArr[index].equals("Globant")) {
				count++;
				if (count == (wordCount - 1)) {
					tempArr[index] = "Technocredits";
				}
			}
			output += tempArr[index] + " ";
		}
		System.out.println("----------Given Input ------------"+"\n");
		System.out.println(input );
		System.out.println("----------Required Output------------"+"\n");
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String word = "Globant";
		ReplaceSecondLast replaceSecondLast = new ReplaceSecondLast();
		replaceSecondLast.replaceString(input, word);

	}
}
