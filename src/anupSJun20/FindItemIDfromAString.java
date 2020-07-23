package anupSJun20;
/*Extract ItemId from below input

String input = https://www.facebook.com/technocredits/temId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.*/

public class FindItemIDfromAString {
	void findItemID(String str) {
		System.out.println("\nGiven String is : "+str);
		String temp = "";
		try {
			String newstr = str.substring(str.indexOf("item"));
			if (newstr.contains("item")) {
				for (int index = 0; index < newstr.length(); index++) {
					if (String.valueOf(newstr.charAt(index)).equals("&")
							|| String.valueOf(newstr.charAt(index)).equals("/")) {
						break;
					}
					temp += newstr.charAt(index);
				}
				System.out.println(temp);
			}
		} catch (Exception e) {
			System.out.println("No item id present");
		}
	}

	public static void main(String[] args) {
		FindItemIDfromAString findItemIDfromAString = new FindItemIDfromAString();
		findItemIDfromAString.findItemID("https://www.facebook.com/technocredits/itemId=12345/");
		findItemIDfromAString.findItemID("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		findItemIDfromAString.findItemID("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		findItemIDfromAString.findItemID("https://www.facebook.com/technocredits/empid=123/");
	}
}