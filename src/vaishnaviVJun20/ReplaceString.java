package vaishnaviVJun20;

/* Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant*/

public class ReplaceString {
	
	String[]  replaceLastSecondOccurenceOfGivenString(String str, String replaceString, String sourceWord) {
		String[] array = str.split(" ");
		int count = 0;
		for (int index = array.length-1; index >= 0 ; index--) {
			if (array[index].equals(sourceWord)) {
				count++;
				if (count == 2) {
					array[index] = replaceString;
					break;
				}
			}
		}
		
		return array;
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String replaceWord = "Technocredits" , sourceWord = "Globant";
		String output = "";
		String[] array = new ReplaceString().replaceLastSecondOccurenceOfGivenString(str, replaceWord , sourceWord);
		for(int index=0; index<array.length;index++) {
			output += array[index] + " ";
		}
		System.out.println("Output String is: " +output);
	}

}

