package aasthaJJun20;
/*Assignement 30 : 18th July 2020

Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant*/

public class ReplaceSecondLastWordOfString {
	// option 1 - without using indexOf, lastIndexOf, replace & substring methods
	String replaceWord(String input, String oldWord, String newWord) {
		System.out.println("\nOriginal String : " + input);
		String[] outputArr = input.split(" ");
		int count = 0;
		for (int index = 0; index < outputArr.length; index++) {
			if (outputArr[index].equals(oldWord))
				count++;
		}
		if (count == 1 || count == 0) {
			return "*****Error : There is " + count + " occurence of \"" + oldWord + "\" in given String*****";
		} else {
			count = 0;
			for (int index = outputArr.length - 1; index >= 0; index--) {
				if (outputArr[index].equals(oldWord)) {
					count++;
					if (count == 2) {
						outputArr[index] = newWord;
						break;
					}
				}
			}
		}
		input = "";
		for (int index = 0; index < outputArr.length; index++) {
			input += outputArr[index] + " ";
		}
		return input.trim();
	}

	// option 2 - without using Loops, with the use of substring & replace methods
	String replaceWordUsingReplaceSubstring(String input, String oldWord, String newWord) {
		System.out.println("\nOriginal String : " + input);
		if (input.indexOf(oldWord) == input.lastIndexOf(oldWord))
			return "*****Error : There is only 1 or 0 occurence of \"" + oldWord + "\" in given String*****";
		else {
			String temp1 = input.substring(input.lastIndexOf(oldWord));
			String temp2 = input.substring(0, input.lastIndexOf(oldWord));
			String temp3 = (temp2.substring(temp2.lastIndexOf(oldWord))).replace(oldWord, newWord);
			temp2 = temp2.substring(0, temp2.lastIndexOf(oldWord));
			input = temp2 + temp3 + temp1;
		}
		return input;
	}

	public static void main(String[] args) {
		ReplaceSecondLastWordOfString replaceSecondLastWordOfString = new ReplaceSecondLastWordOfString();
		String input1 = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println(
				"After replacing : " + replaceSecondLastWordOfString.replaceWord(input1, "Globant", "Technocredits"));
		System.out.println("After replacing : "
				+ replaceSecondLastWordOfString.replaceWordUsingReplaceSubstring(input1, "Globant", "Technocredits"));
		String input2 = "Hi Techno Hello Techno Hi Globant GM Techno Hi Techno Hi";
		System.out.println(
				"After replacing : " + replaceSecondLastWordOfString.replaceWord(input2, "Globant", "Technocredits"));
		System.out.println("After replacing : "
				+ replaceSecondLastWordOfString.replaceWordUsingReplaceSubstring(input2, "Globant", "Technocredits"));
		System.out.println(
				"After replacing : " + replaceSecondLastWordOfString.replaceWord(input2, "Aastha", "Technocredits"));
		System.out.println("After replacing : "
				+ replaceSecondLastWordOfString.replaceWordUsingReplaceSubstring(input2, "Aastha", "Technocredits"));
	}
}
