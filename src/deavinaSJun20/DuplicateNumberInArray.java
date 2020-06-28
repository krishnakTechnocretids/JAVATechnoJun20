package deavinaSJun20;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int Arr[] = { 0, 3, 1, 2, 3 };
		new DuplicateNumberInArray().printArray(Arr);
		new DuplicateNumberInArray().duplicateNumberinArray(Arr);
	}
	
	void printArray(int[] arr) {
		System.out.print("Entered array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	void duplicateNumberinArray(int Arr[]) {
		for (int i = 0; i < Arr.length; i++) {
			for (int j = i + 1; j < Arr.length; j++) {
				if (Arr[i] == Arr[j]) {
					System.out.println("\nDuplicate Number in the entered array: " + Arr[j]);
				}
			}
		}
	}
}
