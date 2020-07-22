package aavrutiDJun20;

public class ExtractItemIdFromInput {
	
	//Extract ItemId
	void findItemId(String input) {
		System.out.println("Input  --> " + input);
		if(input.contains("itemId")) {
			String itemIdValue = input.substring(input.lastIndexOf("itemId="),input.lastIndexOf("/")).replace("itemId=", "");
			if(itemIdValue.contains("empid")) {
				itemIdValue = itemIdValue.substring(0,itemIdValue.lastIndexOf("&"));
			}
			System.out.println("Output --> ItemId is " + itemIdValue);
		}
		else {
			System.out.println("Output --> ItemId not Present");
		}
	}

	public static void main(String[] args) {
		ExtractItemIdFromInput extractItemIdFromInput = new ExtractItemIdFromInput();
		String input = "https://www.facebook.com/technocredits/itemId=12345/";
		extractItemIdFromInput.findItemId(input);
		System.out.println();
		input = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		extractItemIdFromInput.findItemId(input);
		System.out.println();
		input = "https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		extractItemIdFromInput.findItemId(input);
		System.out.println();
		input = "https://www.facebook.com/technocredits/empid=123/";
		extractItemIdFromInput.findItemId(input);
	}
}
