package shrutiDJun20Assignments;

public class DuplicateNumberinArray {

	void FindDuplicateNumber(int[] input) {
		boolean flag = false;
		// int dup = 0; 
		for (int index = 0; index < input.length; index++) {
			for (int index2 = index + 1; index2 < input.length; index2++) {
				if (input[index] == input[index2]) {
					System.out.println("Duplicate number is " + input[index]);
					// dup=input[index];
					flag = true;
					return;// only if we have to find one duplicate number
				}
			}
		}
		if (flag == false)
			System.out.println("No number is duplicate in given array");
		// else
		// System.out.println("number duplicate in given array is "+dup);
	}

	public static void main(String[] args) {
		DuplicateNumberinArray duplicateNumberinArray = new DuplicateNumberinArray();
		int input[] = { 1, 2, 4, 3, 6, 4 };
		duplicateNumberinArray.FindDuplicateNumber(input);

	}
}
