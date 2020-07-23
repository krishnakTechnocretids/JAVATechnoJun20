/*
 * Extract ItemId from below input
 * String input = https://www.facebook.com/technocredits/itemId=12345/
 * String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
 * String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
 * String input = https://www.facebook.com/technocredits/empid=123/
 * 
 * Output : 
 * item id is 12345 
 *      OR
 *      no item id present.
 */

package aditiGJUN20;

import java.util.Arrays;

public class ExtractValueFromInput {
	void findValueOf(String url, String findValueOf) {
		String itemId = "";
		if (url.contains(findValueOf)) {
			System.out.println("Input Url: " + url);
			String tempStr = url.substring(url.lastIndexOf(findValueOf));
			for (int index = 0; index < tempStr.length(); index++) {
				if (String.valueOf(tempStr.charAt(index)).equals("&")
						|| String.valueOf(tempStr.charAt(index)).equals("/")) {
					break;
				}
				itemId += tempStr.charAt(index);
			}
			System.out.println(findValueOf + " is: " + itemId + "\n");
		} else {
			System.out.println("Input Url: " + url + "\n" + "No " + findValueOf + " present");
		}
	}

	public static void main(String[] args) {
		ExtractValueFromInput extractValueFromInput = new ExtractValueFromInput();
		String[] inputUrl = { "https://www.facebook.com/technocredits/itemId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				"https://www.facebook.com/technocredits/itemId=12345&empid=123/",
				"https://www.facebook.com/technocredits/empid=123/" };
		String findValueOf = "itemId";
		// String findValueOf = "empid";
		for (int index = 0; index < inputUrl.length; index++) {
			extractValueFromInput.findValueOf(inputUrl[index], findValueOf);
		}
	}
}