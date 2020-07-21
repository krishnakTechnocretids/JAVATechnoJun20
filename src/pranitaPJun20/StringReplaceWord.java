/*
 * Assignement 30 : 18th July 2020
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
 */
package pranitaPJun20;

import java.util.Arrays;

public class StringReplaceWord {
	void replaceWord(String[] input) {
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			if (input[index].equals("Globant")) {
				count++;
				if (count == 2) {
					input[index] = "Technocredits";
					break;
				}
			}
		}
		System.out.println("\nOutput Array = " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String[] array = input.split(" ");
		System.out.println("Input Array = " + Arrays.toString(array));
		new StringReplaceWord().replaceWord(array);
	}

}
