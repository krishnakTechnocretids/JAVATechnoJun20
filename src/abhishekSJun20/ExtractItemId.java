package abhishekSJun20;
/*Extract ItemId from below input

String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/
Output : 
item id is 12345 
        OR
no item id present.*/

public class ExtractItemId {
	
	void displayItemID(String input) {
		String itemId = "";
		if (input.contains("itemId")) {
			String temp = input.substring(input.indexOf("itemId"));
			for (int index = 0; index < temp.length(); index++) {
				if (temp.charAt(index) >='0' && temp.charAt(index) <='9') {
					itemId += temp.charAt(index);
					if (!(temp.charAt(index + 1) >='0' && temp.charAt(index+1) <='9'))
						break;
				}
			}
			System.out.println("Item ID is :" + itemId);
		} else
			System.out.println("No Item Id present");
	}
	public static void main(String[] agrs) {
		ExtractItemId extractItemId = new ExtractItemId();
		String input[]= {"https://www.facebook.com/technocredits/temId=12345/","https://www.facebook.com/technocredits/empid=123&itemId=12345/","https://www.facebook.com/technocredits/itemId=12345&empid=123/",
				"https://www.facebook.com/technocredits/empid=123/"};	
		for(int index=0;index<input.length;index++) {
			System.out.println("For Input : "+input[index]);
			extractItemId.displayItemID(input[index]);
		}
	}
}
