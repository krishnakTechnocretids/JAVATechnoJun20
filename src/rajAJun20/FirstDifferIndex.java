package rajAJun20;

public class FirstDifferIndex {
	
	void differFirstIndexOfArrays(int[] arr1 , int[] arr2 ) {
		
		if(arr1.length == arr2.length) {
				for(int index = 0 ; index < arr1.length ; index++ ) {
					if(arr1[index] != arr2[index]) {
						System.out.println("Numbers of both the arrays are not matching at index : " + index);
						break ;
					}
				}
			} else {
				System.out.println("Arrays are not identical");
			}
		
	}
	
	public static void main(String[] args) {
		FirstDifferIndex firstDifferIndex = new FirstDifferIndex();
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};
		
		firstDifferIndex.differFirstIndexOfArrays(array1, array2);
	}

}
