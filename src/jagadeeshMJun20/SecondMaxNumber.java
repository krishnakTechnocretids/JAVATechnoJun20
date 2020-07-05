/*Find second max number.
int[] number = {10,33,56,43,99,21}
output : 56 */
package jagadeeshMJun20;

public class SecondMaxNumber {
	void displaySecondMaxNumber(int[] num) {
		int highestValue=0;
		int secondHighest=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>highestValue )
				highestValue = num[index];
		}
		for(int index=0; index<num.length;index++) {
			if(num[index]>secondHighest && num[index]!=highestValue)
				secondHighest = num[index];
		} 
		
		System.out.println("Second highest value is : " +secondHighest);
	}
	public static void main(String[] agrs) {
		int[] number = {10,33,56,43,99,21};
		new SecondMaxNumber().displaySecondMaxNumber(number);
	}

}
