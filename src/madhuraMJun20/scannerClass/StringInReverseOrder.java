package madhuraMJun20.scannerClass;
/*Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH*/
public class StringInReverseOrder {
	
	void reverseOrder(String input) {
		for (int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
	}	
	
	public static void main(String[] args) {
		StringInReverseOrder stringInReverseOrder = new StringInReverseOrder();
		String input = "Hello this is technocredits";
		stringInReverseOrder.reverseOrder(input);
	}

}
