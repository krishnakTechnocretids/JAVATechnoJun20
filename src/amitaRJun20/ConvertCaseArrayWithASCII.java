/*Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/

package amitaRJun20;

import java.util.Arrays;

public class ConvertCaseArrayWithASCII {

	String[] displayConvertCaseArray(String[] input) { // method to display the convert case array
		String[] newConvertArray = new String[input.length]; // Declare a new convert case array
		for (int index = 0; index < input.length; index++) {
			newConvertArray[index] = "";
			for (int outerIndex = 0; outerIndex < input[index].length(); outerIndex++) {
				char ch = input[index].charAt(outerIndex);
				if (ch >= 65 && ch <= 90) {
					// if(ch >= 'A' && ch <= 'Z')
					ch = (char) (ch + 32);
					newConvertArray[index] += ch;
				} else if (ch >= 97 && ch <= 122) {
					// if(ch >= 'a' && ch <= 'z')
					ch = (char) (ch - 32);
					newConvertArray[index] += ch;
				} else {
					newConvertArray[index] += ch;
				}
			}
		}
		return newConvertArray;
	}

	public static void main(String[] args) {
		ConvertCaseArrayWithASCII convertCase = new ConvertCaseArrayWithASCII();
		String[] inputArray = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("The Input Array : " + Arrays.toString(inputArray));
		System.out.println("The converted Array with change case "
				+ Arrays.toString(convertCase.displayConvertCaseArray(inputArray)));
	}
}