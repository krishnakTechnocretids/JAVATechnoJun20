/*Assignement 29 : 17th July 2020
 * WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
 */
package pranitaPJun20;

import java.util.Arrays;

public class ConvertCaseString {
	void convertCharCaseWithAscii(String[] input) {
		String[] resultArray = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			resultArray[index] = "";
			for (int nameIndex = 0; nameIndex < input[index].length(); nameIndex++) {
				char ch = input[index].charAt(nameIndex);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
					resultArray[index] += String.valueOf(ch);
				} else if (ch >= 'a' && ch <= 'z') {
					ch = (char) (ch - 32);
					resultArray[index] += String.valueOf(ch);
				} else 
					System.out.println("Character is not letter");
			}
		}
		System.out.println("Input Array = " + Arrays.toString(input));
		System.out.println("Output Array= " + Arrays.toString(resultArray));
	}

	public static void main(String[] args) {
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		new ConvertCaseString().convertCharCaseWithAscii(array);

	}
}
