/*
Find all pairs on integer array whose sum is equal to given number?
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

package aditiGJUN20;

public class IntArraySumPair {
	void findSumPair(int[] inputArray, int inputSum) {
		System.out.println("All pairs whose sum=7 is : ");
		for (int index = 0; index < inputArray.length; index++)
        {
            for (int j = index+1; j < inputArray.length; j++)
            {
                if(inputArray[index]+inputArray[j] == inputSum)
                {
                	System.out.println("("+inputArray[index]+","+inputArray[j]+")");
                }
            }
        }
    }
	
	public static void main(String[] args) {
		IntArraySumPair intArraySumPair=new IntArraySumPair();
		int[] intArray= {2, 4, 3, 5, 7, 8, 9 ,-1};
		int inputSumValue=7;
		intArraySumPair.findSumPair(intArray,inputSumValue);		
	}
}
