/*Assignment 21 : 30th Jun 2020
 * Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10
 */
package suparnaNJune20.Assignment_21;

public class SwipeNo {
	static void swipe2No(int no1, int no2) {
		System.out.println("Before swap No1 = " + no1 + " No2 = " + no2);
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		System.out.println("After swap No1 = " + no1 + " No2 = " + no2);
	}

	public static void main(String[] args) {
		SwipeNo.swipe2No(10, 20);
	}
}