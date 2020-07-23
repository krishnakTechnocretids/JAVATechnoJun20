/*Assignment 33 : 22nd July 2020

Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.
*/

package nikhilMJun20;

public class FindItemId {
	void displayItemId(String str, String toBeFound) {
		System.out.println("\nGiven string:-\n"+str);
		try {
			String temp = str.substring(str.indexOf(toBeFound));
			String itemId = "";
			if(temp.charAt(toBeFound.length()) == '=') {
				int index = toBeFound.length()+1;
				while(Character.isDigit(temp.charAt(index))) {
					itemId += temp.charAt(index);
					index++;
				}
				System.out.println("Item ID -> "+itemId);
			}else {
				System.out.println("Item ID -> Not present");
			}
		}catch(StringIndexOutOfBoundsException siob){
			System.out.println("Item ID -> Not present");
		}
	}
	
	public static void main(String[] args) {
		String[] strArray = {"https://www.facebook.com/technocredits/itemId=12345/", "https://www.facebook.com/technocredits/empid=123&itemId=12345/", "https://www.facebook.com/technocredits/itemId=12345&empid=123/", "https://www.facebook.com/technocredits/empid=123/"};
		String toBeFound = "itemId";
		FindItemId findItemId = new FindItemId();
		for(int index = 0; index < strArray.length; index++) {
			findItemId.displayItemId(strArray[index], toBeFound);
		}
	}
}
