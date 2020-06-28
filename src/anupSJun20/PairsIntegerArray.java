package anupSJun20;
/* Find all pairs on integer array whose sum is equal to given number?
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
(-1, 8)*/

public class PairsIntegerArray {
	static void findAllPairs(int[] num, int sum) {
		System.out.println("Integer numbers, whose sum is equal to value: " + sum);
		for(int index = 0; index<num.length;index++) {
			for(int innerloop = index+1;innerloop<num.length;innerloop++) {
			if(num[index]+num[innerloop] == sum) {
				System.out.println(" ( " + num[index] + " , "+ num[innerloop] + " ) " );
			}
		}
		}
		
	}
	public static void main(String[] args) {
		int[] num = {2, 4, 3, 5, 7, 8, 9 ,-1};
		int sum = 7;
		findAllPairs(num,sum);
	}

}
