package anshuKJun20;
/* Input : Hello this is technocredits
Output : stiderconhcet si siht olleH*/
public class ReverseOrder {
	void revorder(String name) {
		for(int index =(name.length()-1); index >= 0;index-- ) {
			System.out.print(name.charAt(index));
		}
	}
  public static void main(String[] args) {
	  ReverseOrder reverseorder = new ReverseOrder();
	  String name = "Hello this is technocredits";
	  reverseorder.revorder(name);
}
}
