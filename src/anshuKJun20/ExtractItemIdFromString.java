package anshuKJun20;

public class ExtractItemIdFromString {

	void findItemId(String input) {
		// first Apprach;
		/*
		 * String replaceStr = input.replace("/", "&"); 
		 * String[] array = replaceStr.split("&");
		 *  int num = 0; 
		 *  for (int index = 0; index < array.length; index++) {
		 * 	try { 
		 * 	if (array[index].contains("itemid=12345")) {
		 *  String[]  temparray = array[index].split("=");
		 * for (int innerindex = 0; innerindex < temparray.length; innerindex++) {
		 *   	try { 
		 *  		num += Integer.parseInt(temparray[innerindex]);
		 * 		} catch (NumberFormatException ne) {
		 *   } 
		 * } 
		 * }
		 *  } catch (Exception e) { } } System.out.println(" Item id is " + num);
		 **/

		// second Approach
		String number = "";
		int count = 0;
		if (input.contains("itemid=")) {
			String substr = input.substring(input.lastIndexOf("itemid="), input.lastIndexOf("/"));
			if (substr.contains("empid")) {
				substr = substr.substring(0, substr.lastIndexOf("&"));
			}
			String[] array = substr.split("=");
			for (int index = 0; index < array.length; index++) {
				try {
					number += Integer.parseInt(array[index]);
				} catch (NumberFormatException ne) {

				}
			}
			System.out.println("Item id in given string is: " + number);
		} else {
			System.out.println("Itemid is 0");
		}
	}

	public static void main(String[] args) {

		ExtractItemIdFromString extractItemId = new ExtractItemIdFromString();
		String[] strarray = { "http://www.facebook.com/technocredits/itemid=12345/",
				"http://www.facebook.com/technocredits/empid=123&itemid=12345/",
				"http://www.facebook.com/technocredits/itemid=12345&empid=123/",
				"http://www.facebook.com/technocredits/empid=123/" };
		for (int index = 0; index < strarray.length; index++) {
			System.out.println("\n Given string is " + strarray[index]);
			extractItemId.findItemId(strarray[index]);

		}

	}
}
