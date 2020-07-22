package vaishnaviVJun20_ExceptionHandling;

/* Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present. */

public class Extract {

	void getItemIdFromGivenString(String str) {
		try {
			int firstindex = str.indexOf("itemId");
			String temp = str.substring(firstindex);
			String itemID = "";
			for (int index = 0; index < temp.length(); index++) {
				if (Character.isDigit(temp.charAt(index))) {
					itemID += temp.charAt(index);
					if (!Character.isDigit(temp.charAt(index + 1))) {
						break;
					}
				}
			}
			System.out.println("Item Id is: " + itemID);
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("No Item Id is Present");
		}
	}

	public static void main(String[] args) {
		Extract extract = new Extract();
		extract.getItemIdFromGivenString("https://www.facebook.com/technocredits/itemId=12345/");
		extract.getItemIdFromGivenString("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		extract.getItemIdFromGivenString("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		extract.getItemIdFromGivenString("https://www.facebook.com/technocredits/empid=123/");
	}

}
