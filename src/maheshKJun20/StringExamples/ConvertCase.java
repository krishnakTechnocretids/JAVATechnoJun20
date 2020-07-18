/*Assignement 29 : 17th July 2020
WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
*/

package maheshKJun20.StringExamples;

import java.util.Arrays;

public class ConvertCase {
	
	//Method to Iterate through Array and convert case of each string element
	void displayArraywithConvertedCase(String[] strArray) {
		String[] tempArray = new String[strArray.length];
		for (int index=0;index<strArray.length;index++) {
			tempArray[index] = convertCaseInString(strArray[index]);
		}
		System.out.println("Output: " + Arrays.toString(tempArray));
	}
	
	//Method to convert case of each character in String and return the converted string value. It is using Character class method
	String convertCaseInString(String str) {
		String newStr = "";
		for (int index=0;index<str.length();index++) {
			if (Character.isLetter(str.charAt(index))) {
				if (Character.isUpperCase(str.charAt(index)))
					newStr += Character.toLowerCase(str.charAt(index));
				else
					newStr += Character.toUpperCase(str.charAt(index));
			}else {
				newStr += str.charAt(index);
			}
		}
		return newStr;
	}
	
	//Optional Method to convert case of each character in String and return the converted string value. It is using Ascii value of character.
	String convertCaseInStringUsingAscii(String str) {
		String newStr = "";
		for (int index=0;index<str.length();index++) {
			int asciiValue = str.charAt(index);
			if (asciiValue >= 65 && asciiValue <= 90)
				newStr += Character.toLowerCase(str.charAt(index));
			else if(asciiValue >= 97 && asciiValue <= 122)
				newStr += Character.toUpperCase(str.charAt(index));
			else
				newStr += str.charAt(index);
		}
		return newStr;
	}
	
	
	public static void main(String[] args) {
		ConvertCase convertCase = new ConvertCase();
		String[] strArray = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		System.out.println("Input: " + Arrays.toString(strArray));
		convertCase.displayArraywithConvertedCase(strArray);
	}
}
