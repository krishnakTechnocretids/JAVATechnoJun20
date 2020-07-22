package archanaNJun20;

public class ExtractItemId {
	void printItemId(String input) {
		String output = "";
		if (input.contains("itemId")) {
			String temp = input.substring(input.indexOf("12345"));
			for (int index = 0; index < temp.length(); index++) {
				if (Character.isDigit(temp.charAt(index))) {
					output += temp.charAt(index);
					if (!Character.isDigit(temp.charAt(index + 1)))
						break;
				}
			}
			System.out.println("Item ID is : " + output);
		} else
			System.out.println("Item Id is not present");
	}
	public static void main(String[] args) {
		ExtractItemId extractItemId = new ExtractItemId();
		String[] input = { "https://www.facebook.com/technocredits/temId=12345/",
				"https://www.facebook.com/technocredits/empid=123&itemId=12345/",
				" https://www.facebook.com/technocredits/itemId=12345&empid=123/",
		"https://www.facebook.com/technocredits/empid=123/" };
		for (int index = 0; index < input.length; index++) {
			extractItemId.printItemId(input[index]);
		}
	}
}