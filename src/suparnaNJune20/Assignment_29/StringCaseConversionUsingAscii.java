/*
 * Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
 */
package suparnaNJune20.Assignment_29;
import java.util.Arrays;
public class StringCaseConversionUsingAscii {

	String[] convertStrCases(String[] inputStr) {
		String[] outputStr = new String[inputStr.length];
		for(int index = 0;index<inputStr.length;index++) {
			outputStr[index] = "";
			for(int innerindex = 0;innerindex<inputStr[index].length();innerindex++) {
				char strOfChar = inputStr[index].charAt(innerindex);
				if(strOfChar >= 65  && strOfChar <= 90) {
					strOfChar+=32;
					outputStr[index]+= strOfChar;
				}
				else if(strOfChar >= 97  && strOfChar <= 122) {
					strOfChar-=32;
					outputStr[index]+= strOfChar;
				}
				else {
					outputStr[index]+= strOfChar;
				}
			}
		}

		return outputStr;
	}
	public static void main(String[] args) {
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		System.out.println("The input array is " + Arrays.toString(array));
		StringCaseConversionUsingAscii convertCases = new StringCaseConversionUsingAscii();
		System.out.println("The output array is " + Arrays.toString(convertCases.convertStrCases(array)));

	}

}