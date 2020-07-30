/*Assignment 33
Extract ItemId from below input

String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.
 */
package ajitSJune20;

public class ExtractItemIdFromString {

	void displayItemId(String input) {
		System.out.println("Input : " + input);
		if (input.contains("itemId=")) {
			String str = input.split("itemId=")[1];
			String output = "";
			for (int index = 0; index < str.length(); index++) {
				if (Character.isDigit(str.charAt(index))) {
					output += str.charAt(index);
				} else {
					break;
				}
			}
			System.out.println("Output: Item id is " + output);
		} else {
			System.out.println("Output: No item ID Present.");
		}
	}

	public static void main(String[] args) {
		ExtractItemIdFromString extractItemIdFromString = new ExtractItemIdFromString();
		String[] input = { "https://www.facebook.com/technocredits/temId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				" https://www.facebook.com/technocredits/itemId=12345&empid=123/",
				"https://www.facebook.com/technocredits/empid=123/" };
		for (int index = 0; index < input.length; index++) {
			extractItemIdFromString.displayItemId(input[index]);
		}
	}
}