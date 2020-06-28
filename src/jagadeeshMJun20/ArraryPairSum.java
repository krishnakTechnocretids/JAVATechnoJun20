/*Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9 ,-1
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)
(5, 2)
(3, 4)
(8, -1)
(-1, 8) */

package jagadeeshMJun20;
public class ArraryPairSum {
	void displaySum(int[] input, int num) {
		System.out.println("Integer numbers, whose sum is equal to value : "+num);
		for(int index=0; index<input.length;index++) {
			for(int i=index; i<input.length;i++) {
				if((input[index]+ input[i] )== 7) 
					System.out.println("("+input[index]+","+input[i]+")");			
			}
	}
	}
	public static void main(String[] agrs) {
		ArraryPairSum arrayPairSum = new ArraryPairSum();
		int[] input= {2, 4, 3, 5, 7, 8, 9 ,-1};
		int num=7;
		arrayPairSum.displaySum(input,num);
	}
}