package abhishekSJun20;

import java.util.Arrays;

public class ArrayConvertCase {
	// method to display the convert case array
	String[] displayConvertCaseArray(String[] input) {
		String[] ConvertArray = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			ConvertArray[index] = "";
			for (int outerIndex = 0; outerIndex < input[index].length(); outerIndex++) {
				char ch = input[index].charAt(outerIndex);
				if (ch >= 65 && ch <= 90) {
					ch = (char) (ch + 32);
					ConvertArray[index] += ch;
				} else if (ch >= 97 && ch <= 122) {
					ch = (char) (ch - 32);
					ConvertArray[index] += ch;
				} else {
					ConvertArray[index] += ch;
				}
			}
		}
		return ConvertArray;
	}

	public static void main(String[] args) {
		ArrayConvertCase convertCase = new ArrayConvertCase();
		String[] inputArray = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("Input Array  : " + Arrays.toString(inputArray));
		System.out.println("Output Array : " + Arrays.toString(convertCase.displayConvertCaseArray(inputArray)));
	}
}
