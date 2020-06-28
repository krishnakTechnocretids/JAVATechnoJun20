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
(-1, 8)
*/

package nikhilMJun20;

public class PairSum {
	void findPairsWithSum(int[] intArray, int sumExpected) {
		System.out.println("Pair of numbers with sum "+sumExpected+" :-");
		for(int index=0; index<intArray.length; index++) {
			for(int innerIndex=index+1; innerIndex<intArray.length; innerIndex++) {
				if(intArray[index]+intArray[innerIndex] == sumExpected)
					System.out.println("-> "+intArray[index]+" and "+intArray[innerIndex]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = {2, 4, 3, 5, 7, 8, 9 ,-1};
		int sumExpected = 7;
		
		new PairSum().findPairsWithSum(intArray, sumExpected);
	}
}
