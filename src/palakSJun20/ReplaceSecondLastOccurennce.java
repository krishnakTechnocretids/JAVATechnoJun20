/*Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant*/
package palakSJun20;

import java.util.Arrays;

public class ReplaceSecondLastOccurennce {

	// Iterating from last Index
	void replaceString(String input) {
		int count = 0;
		String[] temp = input.split(" ");
		for (int index = temp.length - 1; index > 0; index--) {
			if (temp[index].equals("Globant")) {
				count++;
				if (count == 2) {
					temp[index] = "Technocredits";
					break;
				}
			}
		}
		System.out.println("Input : " + Arrays.toString(input.split(" ")));
		System.out.println("Output: " + Arrays.toString(temp));
	}

	//Iterating from first 
	String[] replaceString1(String input) {
		int count = 0;
		String tempInput = input.replace("Globant", "*");
		int totalCount = (input.length() - tempInput.length()) / 6; // 57 - 87 = 30/6 = 4
		String[] temp = input.split(" ");
		if (count >= 0) {
			for (int index = 0; index < temp.length; index++) {
				if (temp[index].equals("Globant")) {
					count++;
					if (count == (totalCount - 1)) {
						temp[index] = "Technocredits";
						break;
					}
				}
			}
		}
		else 
			System.out.println("There is only occurennce in given String"+ input + "cannot Replace");
		
		return temp;
	}
	
	//Using String Method
	void replaceString3(String input) {
		// Last occurence of String Globant
		int lastIndex = input.lastIndexOf("Globant"); // 50
		//Creating String without last occurence of string - Hi Globant Hello Globant Hi Globant GM Globant Hi
		String tempString = input.substring(0,input.lastIndexOf("Globant"));
		
		//Storing last index of Globant i.e 39
		int secondLastIndex = tempString.lastIndexOf("Globant"); 
		
		// Storing Replacing String - Globant Hi 
		String replaceString = tempString.substring(secondLastIndex); 
		
		// Replace String Globant position at 39 to technocredits 
		String finalReplacedString = replaceString.replace("Globant", "technocredits");
		
		System.out.println("\nOutput: "+tempString.substring(0,secondLastIndex)+ finalReplacedString + input.substring(lastIndex));
		}
	
	void display(String[] result) {
		String output="";
		 for (int i = 0; i < result.length; i++) {
			output += result[i] +" ";
		}
		 System.out.println("Output: "+output);
	}

	public static void main(String[] args) {
		ReplaceSecondLastOccurennce replaceSecondLastOccurennce = new ReplaceSecondLastOccurennce();
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input : "+input);
		
		// Calling Method which is iterating from starting and printing the result in String format
		 String[] result= replaceSecondLastOccurennce.replaceString1(input);
		 replaceSecondLastOccurennce.display(result);
		 
		 // Calling Method which is iterating from last and printing the result in array format
		 System.out.println();
		replaceSecondLastOccurennce.replaceString(input);
		
		//Calling Method Using String Methods
		replaceSecondLastOccurennce.replaceString3(input);
	}

}

