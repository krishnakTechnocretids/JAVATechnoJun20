/*Extract ItemId from below input
String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/
Output : 
item id is 12345 
        OR
no item id present.*/
package amitaRJun20;

public class ExtractItemIdFromString {

	void display(String input) {
		System.out.println("The input String is :" + input);
		String itemId = "";
		if (input.contains("itemId")) {
			String temp = input.substring(input.indexOf("itemId"));
			for (int index = 0; index < temp.length(); index++) {
				if (Character.isDigit(temp.charAt(index))) {
					itemId += temp.charAt(index);
					if (!Character.isDigit(temp.charAt(index + 1))) {
						break;
					}
				}
			}
			System.out.println("ItemId is " + itemId);
			System.out.println();
		} else {
			System.out.println("ItemId is not present");
		}
	}

	public static void main(String[] args) {
		new ExtractItemIdFromString().display("https://www.facebook.com/technocredits/itemId=12345/");
		new ExtractItemIdFromString().display("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		new ExtractItemIdFromString().display("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		new ExtractItemIdFromString().display("https://www.facebook.com/technocredits/empid=123/");
	}
}