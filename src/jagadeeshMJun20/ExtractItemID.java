/*Extract ItemId from below inpu9t
String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/
Output : 
item id is 12345 
        OR
no item id present. */
package jagadeeshMJun20;
public class ExtractItemID {
	void displayItemID(String input) {
		String itemId = "";
		if (input.contains("itemId")) {
			String temp1 = input.substring(input.indexOf("itemId"));
			for (int index = 0; index < temp1.length(); index++) {
				if (temp1.charAt(index) >='0' && temp1.charAt(index) <='9') {
					itemId += temp1.charAt(index);
					if (!(temp1.charAt(index + 1) >='0' && temp1.charAt(index+1) <='9'))
						break;
				}
			}
			System.out.println("Item ID is : " + itemId);
		} else
			System.out.println("No Item Id is present");
	}
	public static void main(String[] agrs) {
		ExtractItemID extractItemID = new ExtractItemID();
		String input[]= {"https://www.facebook.com/technocredits/temId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				"https://www.facebook.com/technocredits/itemId=12345&empid=123/",
				"https://www.facebook.com/technocredits/empid=123/"};	
		for(int index=0;index<input.length;index++) {
			System.out.println("For Input : "+input[index]);
			extractItemID.displayItemID(input[index]);
		}
	}
}
