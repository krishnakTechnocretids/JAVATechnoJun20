
/*
 * Assignement 30 : 18th July 2020
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
 */

package suparnaNJune20.Assignment_30;

public class ReplaceSecondLastOcuuranceOfString {
	String[] replaceSecondLastOccurance(String str, String replaceStr, String orignalStr) {
		String[] array = str.split(" ");
		int strCnt = 0;
		for (int index = array.length - 1; index >= 0; index--) {
			if (array[index].equals(orignalStr)) {
				strCnt++;
				if (strCnt == 2) {
					array[index] = replaceStr;
					break;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Given string is : \n" + str);
		String replaceStr = "Technocredits", orignalStr = "Globant";
		String output = "";
		String[] array = new ReplaceSecondLastOcuuranceOfString().replaceSecondLastOccurance(str, replaceStr,
				orignalStr);
		for (int index = 0; index < array.length; index++) {
			output += array[index] + " ";
		}
		System.out.println("String after replacement is: \n" + output);
	}
}