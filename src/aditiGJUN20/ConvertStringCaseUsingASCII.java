/*
 * WAP to convert case in all elements of array. 
 * Input : 
 * String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
 * 
 * Output:
 * array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
 */

package aditiGJUN20;

import java.util.Arrays;

public class ConvertStringCaseUsingASCII {
	String[] getCaseChangedString(String[] nameArray) {
		String[] convertedNameArray = new String[nameArray.length];
		for (int index = 0; index < convertedNameArray.length; index++) {
			convertedNameArray[index] = "";
			for (int innerIndex = 0; innerIndex < nameArray[index].length(); innerIndex++) {
				if (nameArray[index].charAt(innerIndex) >= 'A' && nameArray[index].charAt(innerIndex) <= 'Z')
					convertedNameArray[index] += (char) (nameArray[index].charAt(innerIndex) + 32);
				else if (nameArray[index].charAt(innerIndex) >= 'a' && nameArray[index].charAt(innerIndex) <= 'z')
					convertedNameArray[index] += (char) (nameArray[index].charAt(innerIndex) - 32);
				else
					convertedNameArray[index] += nameArray[index].charAt(innerIndex);
			}
		}
		return convertedNameArray;
	}

	public static void main(String[] args) {

		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("Input Array -> " + Arrays.toString(array));
		System.out.println(
				"Output Array -> " + Arrays.toString(new ConvertStringCaseUsingASCII().getCaseChangedString(array)));
	}
}
