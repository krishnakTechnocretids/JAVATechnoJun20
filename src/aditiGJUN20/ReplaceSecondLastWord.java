/*
 * Replace second last globant with Technocredits. 
 * input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant
 * 
 * output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
 */

package aditiGJUN20;

import java.util.Arrays;

public class ReplaceSecondLastWord {

	// Logic-1 -> Creating parts of input string, replace word and later concat all
	// parts and return string with replaced word
	String getSecongLastWordReplaced(String input, String wordToBeReplace, String replaceWith) {

		if (input.indexOf(wordToBeReplace) == input.lastIndexOf(wordToBeReplace)) {
			return "Input String \" " + input + "\" can not be processed as wordToBeReplace (" + wordToBeReplace
					+ ") has 0/1 occurance";

		} else {
			String tempString1 = input.substring(0, input.lastIndexOf(wordToBeReplace));
			String inputStrPart1 = tempString1.substring(0, tempString1.lastIndexOf(wordToBeReplace));
			String inputStrPart2 = input.substring(tempString1.lastIndexOf(wordToBeReplace), input.length());
			String replacedPart = inputStrPart2.replaceFirst(wordToBeReplace, replaceWith);
			return inputStrPart1.concat(replacedPart);
		}

	}

	// Logic - 2 -> Using conditional statements -> can further enahanced for any
	// number of Stringoccurance by Adding one more method parameter which user ask
	// i.e. for 4th occurance String replaceWord(String input, String
	// wordToBeReplace, String replaceWith, int occurance) and adjust if condition
	// accordingly
	String replaceWord(String input, String wordToBeReplace, String replaceWith) {
		System.out.println("\nOriginal String : " + input);
		String[] resultArray = input.split(" ");
		int stringOccurance = 0;
		for (int index = 0; index < resultArray.length; index++) {
			if (resultArray[index].equals(wordToBeReplace))
				stringOccurance++;
		}
		if (stringOccurance == 1 || stringOccurance == 0) {
			return "Input String \" " + input + "\" can not be processed as wordToBeReplace (" + wordToBeReplace
					+ ") has " + stringOccurance + " occurance";
		} else {
			stringOccurance = 0;
			for (int index = resultArray.length - 1; index >= 0; index--) {
				if (resultArray[index].equals(wordToBeReplace)) {
					stringOccurance++;
					if (stringOccurance == 2) {
						resultArray[index] = replaceWith;
						break;
					}
				}
			}
		}
		input = "";
		for (int index = 0; index < resultArray.length; index++) {
			input += resultArray[index] + " ";
		}
		return input.trim();
	}

	public static void main(String[] args) {
		ReplaceSecondLastWord replaceSecondLastWord = new ReplaceSecondLastWord();
		String input1 = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String input2 = "Hi Globant User";
		String wordToBeReplace = "Globant", replaceWith = "Technocredits";
		System.out.println("Input String: " + input1);
		System.out.println("Replaced String: "
				+ replaceSecondLastWord.getSecongLastWordReplaced(input1, wordToBeReplace, replaceWith));
		System.out
				.println("Replaced String: " + replaceSecondLastWord.replaceWord(input2, wordToBeReplace, replaceWith));

	}
}
