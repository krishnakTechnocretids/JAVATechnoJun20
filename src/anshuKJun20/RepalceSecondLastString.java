package anshuKJun20;

import java.util.Arrays;

public class RepalceSecondLastString {

	void replaceSecondLastString(String input) {
		/*
		 * Second Approach------------> String str1 =
		 * input.substring(input.lastIndexOf("Globant")); String str2 =
		 * input.substring(0, input.lastIndexOf("Globant")); String str3 =
		 * str2.substring(0, str2.lastIndexOf("Globant")); String str4 =
		 * str2.substring(str2.lastIndexOf("Globant")); String str5 =
		 * str4.replace("Globant", "Technocredits"); String finalAnsw = str3 + str5 +
		 * str1; System.out.println("Output---->" + finalAnsw);
		 */

		// first Approach
		int count = 0;
		String resultStr = "";
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			if (array[index].equals("Globant")) {
				count++;
			}
			if (count == 4) {
				resultStr += "Technocredits ";
				count++;
			} else {
				resultStr += array[index] + " ";
			}
		}
		System.out.println("Output--->" + resultStr);
	}

	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input---->" + input);
		new RepalceSecondLastString().replaceSecondLastString(input);
	}
}
