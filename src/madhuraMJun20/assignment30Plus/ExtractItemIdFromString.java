/*Extract ItemId from below input
String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/
Output : 
item id is 12345 
        OR
no item id present.*/
package madhuraMJun20.assignment30Plus;

public class ExtractItemIdFromString {
	void extractItemId(String input) {
		String output = "";
		System.out.println(input);
		if (input.contains("itemId")) {
			for (int index = input.indexOf("itemId=") + 7; index < input.length(); index++) {
				if (String.valueOf(input.charAt(index)).equals("&")
						|| String.valueOf(input.charAt(index)).equals("/")) {
					break;
				}
				output += input.charAt(index);
			}
			System.out.println("Item Id is : " + output);
		} else {
			System.out.println("*No Item Id Present*");
		}
	}

	public static void main(String[] args) {
		ExtractItemIdFromString extractItemIdFromString = new ExtractItemIdFromString();
		extractItemIdFromString.extractItemId("https://www.facebook.com/technocredits/temId=12345/");
		extractItemIdFromString.extractItemId("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		extractItemIdFromString.extractItemId("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		extractItemIdFromString.extractItemId("https://www.facebook.com/technocredits/empid=123/");
	}
}
