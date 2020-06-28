package madhuraMJun20.scannerClass;

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
public class Exam3 {
	void findPairs(int[] num, int givenSum) {
		
		for (int i = 0; i <= num.length; i++) {
			for (int j = 0; j <= num.length; j++) {
				if (num[i] + num[j] == givenSum) {
					System.out.println("(" + num[i] + "," + num[j] + ")");
				}
			}

		}
	}

	public static void main(String[] args) {
		Exam3 exam3 = new Exam3();

		int[] num = { 2, 4, 3, 5, 7, 8, 9, -1 };
		int givenSum = 7;
		exam3.findPairs(num, givenSum);

	}

}
