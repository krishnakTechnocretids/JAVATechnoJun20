package rajAJun20;

public class AllDifferIndex {
	
	void allDifferIndexOfArray(int[] arr1 , int[] arr2) {
		
		if(arr1.length == arr2.length) {
			for(int index =0 ; index < arr1.length ; index++) {
				if(arr1[index] != arr2[index]) {
					System.out.println("Numbers of both the arrays are not matching at index : " + index);
				}
			}
		}
	}

	public static void main(String[] args) {
		AllDifferIndex allDifferIndex = new AllDifferIndex();
		
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,13};
		
		allDifferIndex.allDifferIndexOfArray(array1, array2);
		
	}
}


