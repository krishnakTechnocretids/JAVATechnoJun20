package abhishekSJun20;
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
(-1, 8)*/

public class CodingExam3 {
// method to check Integer numbers in array whose sum is equal to value:7
	void checknumberSum(int[] num, int Sum) {
		System.out.println("Pair of numbers with sum "+Sum+" :");
		for (int index=0; index<num.length-1;index++){
			for (int innerIndex=index+1;innerIndex<num.length;innerIndex++){
				if ((num[index] + num[innerIndex]) == Sum){
					System.out.println("(" + num[index] + ", " + num[innerIndex] + ")");
				}			
			}
		}
	}
		
	public static void main(String[] args) {
		int[] num = { 2, 4, 3,5,7, 8, 9, -1 };
		int Sum = 7;
		CodingExam3 codingExam3 = new CodingExam3();
		codingExam3.checknumberSum(num, Sum);
	}

}
