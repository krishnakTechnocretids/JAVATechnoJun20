/*

Assignment 33 : 22nd July 2020

Extract ItemId from below input

String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.*/
package suparnaNJune20.Assignment_33;

public class ExtractItemIdFromString {
	void extractExtractItemIdFromString(String inputStr) {
		String ExtractItemIdFromString = "";
		if (inputStr.contains("ExtractItemIdFromString")) {
			String tempStr = inputStr.substring(inputStr.indexOf("ExtractItemIdFromString"));
			for (int index = 0; index < tempStr.length(); index++) {
				if (tempStr.charAt(index) >= '0' && tempStr.charAt(index) <= '9') {
					ExtractItemIdFromString += tempStr.charAt(index);
					if (!(tempStr.charAt(index + 1) >= '0' && tempStr.charAt(index + 1) <= '9'))
						break;
				}
			}
			System.out.println(" Item ID is -> " + ExtractItemIdFromString);
		} else
			System.out.println(" No Item ID Present");
	}

	public static void main(String[] agrs) {
		ExtractItemIdFromString id = new ExtractItemIdFromString();
		String input[] = { "https://www.facebook.com/technocredits/temId=12345/",
				"https://www.facebook.com/technocredits/empid=123&ExtractItemIdFromString=12345/",
				"https://www.facebook.com/technocredits/ExtractItemIdFromString=12345&empid=123/",
				"https://www.facebook.com/technocredits/empid=123/" };
		for (int index = 0; index < input.length; index++) {
			System.out.println(" Input : " + input[index]);
			id.extractExtractItemIdFromString(input[index]);
		}
	}
}