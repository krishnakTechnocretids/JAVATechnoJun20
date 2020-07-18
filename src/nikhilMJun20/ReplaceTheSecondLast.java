/*
Assignement 30 : 18th July 2020

Replace second last globant with Technocredits.
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output-> Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/

package nikhilMJun20;

public class ReplaceTheSecondLast {
	void replaceSecondLast(String str, String toBeReplaced, String replacement) {
		if(str.indexOf(toBeReplaced) != str.lastIndexOf(toBeReplaced)) {
			//Removing and storing last appearance of Globant
			String tempStr1 = str.substring(str.lastIndexOf(toBeReplaced));
			//Getting sub-string after removing last appearance of Globant
			String tempStr2 = str.substring(0, str.lastIndexOf(toBeReplaced));
			//Removing and storing last second-appearance of Globant
			String tempStr3 = tempStr2.substring(tempStr2.lastIndexOf(toBeReplaced));
			//Getting sub-string after removing second-last appearance of Globant
			String tempStr4 = tempStr2.substring(0, tempStr2.lastIndexOf(toBeReplaced));
			//Replacing second-last appearance of Globant with Technocredits
			tempStr3 = tempStr3.replace(toBeReplaced, replacement);
			//Adding the strings		
			String result = tempStr4 + tempStr3 + tempStr1;
			//Printing the result
			System.out.println("\nResultant string with second appearance of "+toBeReplaced+" replaced is:-\n"+result);
		}else {
			System.out.println("The given string can not be processed - as word to be replaced is not present or it appears only once.");
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String toBeReplaced = "Globant";
		String replacement = "Technocredits";
		System.out.println("The given string is:-\n"+str);
		new ReplaceTheSecondLast().replaceSecondLast(str, toBeReplaced, replacement);
	}
}
