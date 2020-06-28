/*Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH
*/
package palakSJun20;

public class StringInReverseOrder {
	
	void stringInReverseOrder(String str){
		System.out.print("Input is : " + str + "\nOutput is : ");
		for (int i = str.length()-1; i>= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String string = "Hello this is technocredits";
		StringInReverseOrder reverseOrder = new StringInReverseOrder();
		reverseOrder.stringInReverseOrder(string);
	}
}


	
