/*
 * Assignment 18 : 26th innerIndexun 2020

Program 1 :
Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1


Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik 
 

Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 


Program 4 : 
Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
 */
package suparnaNJune20.Assignment18;

public class StringOpeartion {

	void findMidChar(String str) {
		char ch;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String str1 = arr[index];
			int mod = str1.length() % 2;
			int div = str1.length() / 2;
			if (mod == 0)
				ch = str1.charAt(div - 1);
			else
				ch = str1.charAt((div - 1) + mod);
			System.out.println(ch + " is a middle character in " + str1);
		}
	}

	void checkSpecChar(String str) {
		String newStr = str.replace("_", "").replace("[", "").replace("]", "").replace("{", "").replace("}", "")
				.replace(",", "");
		System.out.println("Total special characters are: " + ((str.length()) - (newStr.length())));
	}

	void revString(String str) {
		System.out.print("Reverse String Output :");
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	void checkWordFreq(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = arr[index].replaceAll("_", "");
			arr[index] = arr[index].toLowerCase();
		}
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			String str1 = arr[outerIndex];
			int cnt = 1;
			if (!arr[outerIndex].equals("*")) {
				for (int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++) {
					String str2 = arr[innerIndex];
					if (str1.equals(str2)) {
						cnt++;
						arr[innerIndex] = "*";
					}
				}
				System.out.println(arr[outerIndex] + " -> " + cnt);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Harsh maulik ";
		System.out.println("print middle character of all words.");
		new StringOpeartion().findMidChar(input);
		System.out.println("\n Count total special characters  from  string Kr[i{s]hn}_a,Tech");
		new StringOpeartion().checkSpecChar("Kr[i{s]hn}_a,Tech");
		System.out.println("\nPrint given string in reverse order");
		System.out.println("Input : Hello this is technocredits");
		new StringOpeartion().revString("Hello this is technocredits");
		System.out.println("\n\n Find Frequency of every word in a given String");
		System.out.println(" Input = Tech_no Hi T_EchNo H_I Tech hi_");
		new StringOpeartion().checkWordFreq("Tech_no Hi T_EchNo H_I Tech hi_");
	}
}
