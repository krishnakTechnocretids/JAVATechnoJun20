package aasthaJJun20;
/*Assignment 33 : 22nd July 2020

Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.*/
public class ItemIDFromURL {
	void findItemIDFromURL(String url) {
		System.out.println("\nString input : " + url);
		String temp = "";
		try {
			temp = url.substring(url.indexOf("itemId"));
		} catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
			System.out.println("No item id present");
			return;
		}
		String itemId = "";
		for (int index = 0; index < temp.length(); index++) {
			if (Character.isDigit(temp.charAt(index))) {
				itemId += temp.charAt(index);
				try {
					if (!Character.isDigit(temp.charAt(index + 1)))
						break;
				} catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
				}
			}
		}
		System.out.println("Item ID is: " + itemId);
	}

	public static void main(String[] args) {
		ItemIDFromURL itemIDFromURL = new ItemIDFromURL();
		String[] urls = { "https://www.facebook.com/technocredits/itemId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				"https://www.facebook.com/technocredits/itemId=12345&empid=123/",
				"https://www.facebook.com/technocredits/itemId=12345/empid=123/",
				"https://www.facebook.com/technocredits/empid=123/itemId=12345/",
				"https://www.facebook.com/technocredits/empid=123/itemId=12345",
				"https://www.facebook.com/technocredits/empid=123/",
				"https://www.facebook.com/technocredits/itemId12345/empid=123/"};
		for (int index = 0; index < urls.length; index++) {
			itemIDFromURL.findItemIDFromURL(urls[index]);
		}
	}
}
