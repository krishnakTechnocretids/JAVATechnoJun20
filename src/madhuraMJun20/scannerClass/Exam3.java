package madhuraMJun20.scannerClass;

/*Find all pairs on integer array whose sum is equal to given number*/

public class Exam3 {
	void findPairs(int[] num, int givenSum) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
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