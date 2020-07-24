/* Extract ItemId from below input :
	 String input = https://www.facebook.com/technocredits/itemId=12345/
	 String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
	 String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
	 String input = https://www.facebook.com/technocredits/empid=123/
 */

package rajAJun20;

public class ExtractItemIdFromInput {

	void findItemIdFromInput(String input) {
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
			System.out.println("item id is : " + itemId);
		} else
			System.out.println("no item id present");
	}

	public static void main(String[] args) {

		String input[]= {"https://www.facebook.com/technocredits/itemId=12345/","https://www.facebook.com/technocredits/empid=123&itemId=12345/","https://www.facebook.com/technocredits/itemId=12345&empid=123/","https://www.facebook.com/technocredits/empid=123/"};	
		for(int index=0;index<input.length;index++) {
			System.out.println("\nFor Input : " +input[index]);
			new ExtractItemIdFromInput().findItemIdFromInput(input[index]);
		}
	}
}

