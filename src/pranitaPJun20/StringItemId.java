/*Assignment 33 : 22nd July 2020

Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.
 * 
 */
package pranitaPJun20;

public class StringItemId {
	void extractItemId(String input) {
		System.out.println("\nInput = " + input);
		String number = "";
		if (input.contains("itemId")) {
			String subInput = input.substring(input.lastIndexOf("itemId="), input.lastIndexOf("/"));
			if (subInput.contains("empid")) {
				subInput = subInput.substring(0, subInput.lastIndexOf("&"));
			}
			String[] array = subInput.split("");
			for (int index = 0; index < array.length; index++) {
				try {
					number += Integer.parseInt(array[index]);
				} catch (NumberFormatException nfe) {

				}
			}
			System.out.println("Item ID is: " + number);
			
		} else {
			System.out.println("Output: Item Id not Present");
		}

	}

	public static void main(String[] args) {
		StringItemId StringItemId = new StringItemId();
		String input1 = "https://www.facebook.com/technocredits/itemId=12345/";
		String input2 = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		String input3 = "https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		String input4 = "https://www.facebook.com/technocredits/empid=123/";
		StringItemId.extractItemId(input1);
		StringItemId.extractItemId(input2);
		StringItemId.extractItemId(input3);
		StringItemId.extractItemId(input4);
	}
}
