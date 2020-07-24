package vireshJJun20.assignment33;

public class StringOpsItemId {

	void getSubString(String ipStr) {
		String tempStr1 = "", tempStr2 = "";
		for (int index = 0; index < ipStr.length(); index++) {
			if (ipStr.charAt(index) == '=' && ipStr.charAt(index - 3) == 'm') {
				for (int innerIndex = index - 6; innerIndex < ipStr.length(); innerIndex++) {
					if (innerIndex < index) {
						tempStr1 += String.valueOf(ipStr.charAt(innerIndex));
					} else if (innerIndex > index && Character.isDigit(ipStr.charAt(innerIndex)) == true
							|| innerIndex == index) {
						tempStr2 += String.valueOf(ipStr.charAt(innerIndex));
					} else
						break;
				}
			}
		}
		if (tempStr1.isEmpty() || !(tempStr1.equalsIgnoreCase("itemid"))) {
			System.out.println(ipStr);
			System.out.println("No item id present");
		} else if (tempStr1.equalsIgnoreCase("itemid")) {
			System.out.println(ipStr);
			System.out.println(tempStr1.substring(0, tempStr1.length() - 2) + " "
					+ tempStr1.substring(tempStr1.length() - 2) + " is " + tempStr2.substring(1, tempStr2.length()));
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		new StringOpsItemId().getSubString("https://www.facebook.com/technocredits/temId=12345/");
		new StringOpsItemId().getSubString("https://www.facebook.com/technocredits/empid=123&itemId=123/");
		new StringOpsItemId().getSubString("https://www.facebook.com/technocredits/itemId=1234579865&empid=123/");
		new StringOpsItemId().getSubString("https://www.facebook.com/technocredits/empid=123/");
	}
}
