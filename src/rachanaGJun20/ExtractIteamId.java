/*Assignment 33 : 22nd July 2020

Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.*/
package rachanaGJun20;

public class ExtractIteamId {

	void extractItemIdFromString(String str) {
		System.out.println("Input: "+str);
		if (str.contains("itemId")) {
			String[] str1 = str.split("/");
			int strindex = str1.length;
			String str2 = str1[strindex - 1];
			if (str2.contains("&")) {
				String[] str3 = str2.split("&");
				for (int index = 0; index < str3.length; index++) {
					if (str3[index].contains("itemId=")) {
					int id = Integer.parseInt(str3[index].replace("itemId=", "").trim());
						System.out.println("Output: Itemid is : " + id);
					}
				}
			}
			
		} else {
			System.out.println("Output: Item Id not found");
		}
	}

	public static void main(String[] args) {
		ExtractIteamId extractitemid = new ExtractIteamId();
		String input1 = "https://www.facebook.com/technocredits/temId=12345/";
		extractitemid.extractItemIdFromString(input1);
		String input2 = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		extractitemid.extractItemIdFromString(input2);
		String input3 = "https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		extractitemid.extractItemIdFromString(input3);
		String input4="https://www.facebook.com/technocredits/empid=123/";
		extractitemid.extractItemIdFromString(input4);
	}

}
