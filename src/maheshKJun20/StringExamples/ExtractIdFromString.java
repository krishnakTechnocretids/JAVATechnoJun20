/*
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

package maheshKJun20.StringExamples;

public class ExtractIdFromString {
	
	void displayItemId(String str) {
		System.out.println("Input: " + str);
		String itemID = "";
		if (str.contains("itemId=")) {
			for (int index=str.indexOf("itemId=")+7;index<str.length();index++) {
				if (String.valueOf(str.charAt(index)).equals("&") || String.valueOf(str.charAt(index)).equals("/")) {
					break;
				}
				itemID += str.charAt(index);
			}
			System.out.println("Output: ItemId is - " + itemID);
		}else
			System.out.println("Output: No ItemId present in String");
	}
	
	
	public static void main(String[] args) {
		ExtractIdFromString extractIdFromString = new ExtractIdFromString();
		extractIdFromString.displayItemId("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		extractIdFromString.displayItemId("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		extractIdFromString.displayItemId("https://www.facebook.com/technocredits/empid=123/");
		extractIdFromString.displayItemId("https://www.facebook.com/technocredits/itemId=123345/");
	}
}
