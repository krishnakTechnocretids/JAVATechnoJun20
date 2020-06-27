package anupSJun20;
/*Program 4 : 
Print given string in reverse order.

Input : Hello this is technocredits
Output : stiderconhcet si siht olleH*/

public class ReverseOrderString {
	static void findReverseOrder(String str) {
		String newword="";
		for(int index = str.length()-1;index>=0;index--) {
			newword = newword + String.valueOf(str.charAt(index));
			}
		System.out.println(newword);
	}
	public static void main(String[] args) {
		findReverseOrder("Hello this is technocredits");
	}

}
