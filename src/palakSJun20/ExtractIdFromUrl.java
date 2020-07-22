/*Extract ItemId from below input

String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.*/
package palakSJun20;

public class ExtractIdFromUrl {

	void findIdFromUrl(String input) {
		String output = "";
		if (input.contains("itemId")) {
			for (int index = input.indexOf("itemId"); index < input.length(); index++) {
				if (input.charAt(index) >= '0' && input.charAt(index) <= '9') {
					output += input.charAt(index);
					if (!(input.charAt(index + 1) >= '0' && input.charAt(index) <= '9')) {
						break;
					}
				}
			}
			System.out.println("Item id is :" + output);
		} else
			System.out.println("Item id Not Found");
	}

	public static void main(String[] args) {
		ExtractIdFromUrl extractIdFromUrl = new ExtractIdFromUrl();

		String input1 = "https://www.facebook.com/technocredits/itemId=12345/";
		System.out.println("String Input : " + input1);
		extractIdFromUrl.findIdFromUrl(input1);

		String input2 = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		System.out.println("\nString Input : " + input2);
		extractIdFromUrl.findIdFromUrl(input2);

		String input3 = "https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		System.out.println("\nString Input :" + input3);
		extractIdFromUrl.findIdFromUrl(input3);

		String input4 = "https://www.facebook.com/technocredits/empid=123/";
		System.out.println("\nString Input :" + input4);
		extractIdFromUrl.findIdFromUrl(input4);
	}
}
