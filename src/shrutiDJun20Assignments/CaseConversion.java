package shrutiDJun20Assignments;

import java.util.Arrays;

public class CaseConversion {

	void covertcase(String[] input) {

		String[] convertedArray = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			String tempString = "";
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++)
				if (input[index].charAt(innerindex) >= 97
						&& input[index].charAt(innerindex) <= 122) {
					tempString += (char) (input[index].charAt(innerindex) - 32);
				} else if (input[index].charAt(innerindex) >= 65
						&& input[index].charAt(innerindex) <= 90) {
					tempString += (char) (input[index].charAt(innerindex) + 32);
				}
			convertedArray[index] = tempString;
		}
		System.out.println("Input Array--> "+ Arrays.toString(input));
		System.out.println("Output Array--> "+Arrays.toString(convertedArray));
	}
	public static void main(String[] args) {
		String[] input = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA",
				"jaGAdeesh" };
		CaseConversion caseConversion = new CaseConversion();
		caseConversion.covertcase(input);

	}
}
