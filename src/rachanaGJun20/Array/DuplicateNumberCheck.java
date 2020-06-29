/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

package rachanaGJun20.Array;

public class DuplicateNumberCheck{

	// method will find and display duplicate number from given array
	void findDuplicateNumber(int[] arr) {
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number in a given array is: " + arr[i]);
					flag= true;
					break;
				}
				
			}
		}
		if(flag==false)
			System.out.println("No duplicate number in a given Array");
	}

	public static void main(String[] args) {
		DuplicateNumberCheck duplicatenumbercheck = new DuplicateNumberCheck();
		int[] arr = { 0, 3, 1, 2, 3 };
		System.out.println("Given Array : { 0, 3, 1, 2, 3 }");
		duplicatenumbercheck.findDuplicateNumber(arr);
	}

}
