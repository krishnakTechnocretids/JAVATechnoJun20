package anupSJun20;
/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G*/

public class StringPrintinginOrder {
	void printString(String str) {
		for(int index = 0;index <str.length() ;index++) {
		System.out.println(str);
		str = str.substring(0,str.length()-1);
		index--;
		}
		
	}
	public static void main(String[] args) {
		StringPrintinginOrder stringPrintinginOrder = new StringPrintinginOrder();
		String str = "Globant";
		stringPrintinginOrder.printString(str);
	}

}
