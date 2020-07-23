package barkhaPJun20;

public class ExtractNumFromURL {
	String output="";
	
	void displayItemId(String URL) {
		System.out.println("Input is=> "+URL);
		String removeFB=URL.replace("https://www.facebook.com/technocredits/", "");
		if (removeFB.contains("itemId=")) {
			if (removeFB.contains("itemId=") && !removeFB.contains("empid=123")) {
				for (int index=0; index<removeFB.length(); index++) {
					char ch=removeFB.charAt(index);
					if (Character.isDigit(ch))
						output+=ch;
				}
				System.out.println("itemID is=> "+output);
			}else if(removeFB.contains("itemId=") && removeFB.contains("empid=123")) {  //will work as if
				String removeEmpid=removeFB.replace("empid=123", "");
				for (int index1=0; index1<removeEmpid.length(); index1++) {
					char ch=removeEmpid.charAt(index1);
					if (Character.isDigit(ch))
						output+=ch;
				}
				System.out.println("itemID is=> "+output);
			}
		
		}else
			System.out.println("ItemID not present");
	}
	public static void main(String[] args) {
		//String input = "https://www.facebook.com/technocredits/itemId=12345/";
		String input ="https://www.facebook.com/technocredits/empid=123&itemId=12345/";
		//String input ="https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		//String input ="https://www.facebook.com/technocredits/empid=123/";
		new ExtractNumFromURL().displayItemId(input);
	}
}			