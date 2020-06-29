/*Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)
 */

package shrutiDJun20;

public class SumIs7 {
	
	void sumEqualsSeven(int[] arr){
		//int sum = 0;
		System.out.println("Integer numbers, whose sum is equal to value:7");
		for(int index=0;  index<arr.length; index++)
			
			for(int index2=0;  index2<arr.length; index2++){
				if(arr[index]+arr[index2]==7){
					System.out.println(arr[index]+" , "+arr[index2]);
				}
			}
	}

	
	public static void main(String[] args) {
		SumIs7 sumIs7 = new SumIs7();
		int[] arr1 = {2, 4, 3, 5, 7, 8, 9, -1};
		sumIs7.sumEqualsSeven(arr1);
		
		
	}
}
