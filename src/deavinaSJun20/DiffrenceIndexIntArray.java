package deavinaSJun20;

public class DiffrenceIndexIntArray {

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		new DiffrenceIndexIntArray().diffrenceofIndexvalueinArrays(arr1, arr2);
	}
		
		public void diffrenceofIndexvalueinArrays(int[]arr1,int[]arr2) {
			if (arr1.length == arr2.length) {
				for (int i = 0; i < arr1.length; i++) {
					if (arr2[i] != arr1[i]) {
						System.out.println("Values are not matching at index -> " + i);
					}
				}
			} else {
				System.out.println("Arrays are not having same length");
			}	
		}
		
	}
