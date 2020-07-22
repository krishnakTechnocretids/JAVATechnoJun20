package shrutiDJun20ExceptionHandling;

public class ItemIDValue {

	void fetchItemID(String url, String iD) { // taking String name as iD so
												// that in future if EMP id is
												// needed, code can be reused
												// with minor changes

		String urlafterId = "";
		String itemId = "";
		if (url.contains("itemId=")) {
			urlafterId = url.substring((url.lastIndexOf(iD) + iD.length()));

			for (int index = 0; index < urlafterId.length(); index++)
				if (Character.isDigit(urlafterId.charAt(index))) {
					itemId += (urlafterId.charAt(index));
				} else {
					break;
				}
			System.out.println("URL provided: " + url);
			System.out.println("itemId in given URL is: " + itemId + "\n");
		} else
			System.out.println("No itemId present" + "\n");
	}

	public static void main(String[] args) {

		ItemIDValue itemIDValue = new ItemIDValue();

		String input1 = "https://www.facebook.com/technocredits/temId=12345/";
		String input2 = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		String input3 = "https://www.facebook.com/technocredits/itemId=12345678&empid=123/";
		String input4 = "https://www.facebook.com/technocredits/empid=123/";

		itemIDValue.fetchItemID(input1, "itemId=");
		itemIDValue.fetchItemID(input2, "itemId=");
		itemIDValue.fetchItemID(input3, "itemId=");
		itemIDValue.fetchItemID(input4, "itemId=");

	}

}
