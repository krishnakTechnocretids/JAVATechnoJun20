package anupSJun20;
/*Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant*/

import java.util.Arrays;

public class StringReplace {
	String findTheNewString(String str, String replace) {
		String[] newstr = str.split(" ");
		int count = 0;
		String finalString = "";
		for(int index = 0;index<newstr.length;index++) {
			if(newstr[index].equals(replace)) {
				count++;
			}
		}
		if(count <2 ) {
			System.out.println("Can't replace the second last element as there is no sufficient string");
			return str;
		}
		int newcount = 0;
		for(int index=newstr.length-1;index>= 0;index--) {
			if(newstr[index].equals(replace)) {
				newcount++;
			}
			if(newcount == 2) {
				newstr[index] = "Technocredits";
				break;
			}
		}
		for(int index = 0;index<newstr.length;index++) {
			finalString += newstr[index]+ " ";
		}
		return finalString;	
	}
	
	public static void main(String[] args) {
		StringReplace stringReplace = new StringReplace();
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String replace = "Globant";
		System.out.println("The input string is " + input);
		System.out.println("The output string is " + stringReplace.findTheNewString(input,replace));
		
		String input1 = "Hi Globant";
		String replace1 = "Globant";
		System.out.println("The input string is " + input1);
		System.out.println("The output string is " + stringReplace.findTheNewString(input1,replace1));
	}
}
