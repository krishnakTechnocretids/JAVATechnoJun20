package swapnaWJun20;

import javax.jws.Oneway;

public class SearchItemId {

	void findItemID(String input) {
		System.out.println("\nInput : " + input);
		if (input.contains("itemId")) {
			int itemIndex = input.lastIndexOf("itemId=");
			int slashIndex = input.lastIndexOf("/");
			String output = input.substring(itemIndex, slashIndex).replace("itemId=", "");
			if (output.contains("empid")) {
				output = output.substring(0, output.lastIndexOf("&"));
			}
			System.out.println("Output : " + output);
		} else {
			System.out.println("Output : No ItemId present");
		}
	}

	public static void main(String[] args) {
		SearchItemId searchItemId = new SearchItemId();
		searchItemId.findItemID("https://www.facebook.com/technocredits/itemId=12345/");
		searchItemId.findItemID("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		searchItemId.findItemID("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		searchItemId.findItemID("https://www.facebook.com/technocredits/empid=123/");
	}
}
