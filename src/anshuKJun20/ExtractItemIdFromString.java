package anshuKJun20;

public class ExtractItemIdFromString {

	void findItemId(String input) {
	//first Apprach;
	   /* String replaceStr = input.replace("/", "&");
		String[] array = replaceStr.split("&");
		int num = 0;
		for (int index = 0; index < array.length; index++) {
			try {
				if (array[index].contains("itemid=12345")) {
					String[] temparray = array[index].split("=");
					for (int innerindex = 0; innerindex < temparray.length; innerindex++) {
						try {
							num += Integer.parseInt(temparray[innerindex]);
						} catch (NumberFormatException ne) {
						}
					}
				}
			} catch (Exception e) {
			}
		}
		System.out.println(" Item id is " + num);**/
		
		// second Approach
		String sum = ""; int count = 0;
		if(input.contains("itemid=")) {
		int index = input.indexOf("12345");
		String substr = input.substring(index);
		for(int outerindex = 0;outerindex< substr.length();outerindex++) {
			if(Character.isDigit(substr.charAt(outerindex))) {
				sum += substr.charAt(outerindex);
				count++;
			}
			if(count == 5) {
				System.out.println("Item id in given String is "+sum);
				break;
			}
			
		}
		}else {
			System.out.println("Itemid is 0");
		}
	}

	public static void main(String[] args) {
		
		ExtractItemIdFromString extractItemId = new ExtractItemIdFromString();
		String[] strarray = {"http://www.facebook.com/technocredits/itemid=12345/","http://www.facebook.com/technocredits/empid=123&itemid=12345/","http://www.facebook.com/technocredits/itemid=12345&empid=123/","http://www.facebook.com/technocredits/empid=123/"};
		for(int index = 0 ;index < strarray.length; index++) {
			System.out.println("\n Given string is "+strarray[index]);
			extractItemId.findItemId(strarray[index]);
			
			
		}
		
		
		
	}
}
