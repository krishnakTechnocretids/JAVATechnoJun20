/*Assignement 30 : 18th July 2020
 
Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant*/
package amitaRJun20;

public class ReplaceSecondLastStringInarray {
	
	String replacedSecondLastString(String input, String replaceString) {
		int newLength = input.replaceAll("Globant", "").length();
		int totalCount = (input.length() - newLength) / replaceString.length();
		String outputString = "";
		int count = 0;
		String[] strArray = input.split(" ");
		if(totalCount<2) {
			System.out.println("The String has no second last " +replaceString);
			return input;
		}
		for (int index = 0; index < strArray.length; index++) {
			if (strArray[index].equals(replaceString)) {
				count++;
			}
			if (count == (totalCount - 1)) {
				strArray[index] = "Technocredits";
				count++;
			}
			outputString += strArray[index]+" ";			
		}
		return outputString;
	}

	public static void main(String[] args) {
		ReplaceSecondLastStringInarray replaceSecondLastString = new ReplaceSecondLastStringInarray();
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("The Input String is :   "+input);
		String replaceString = "Globant";
		System.out.println("The Output String is :   " + replaceSecondLastString.replacedSecondLastString(input, replaceString));
		System.out.println();
		String input1 = "Hi Globant";
		System.out.println("The Input String is :    "+input1);
		String replaceString1 = "Globant";
		System.out.println("The Output String is : " + replaceSecondLastString.replacedSecondLastString(input1, replaceString1));
	}
}
