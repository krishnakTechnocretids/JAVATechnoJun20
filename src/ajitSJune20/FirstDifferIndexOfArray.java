/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                          arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2 */
package ajitSJune20;

public class FirstDifferIndexOfArray {

	void FirstDifferIndex(int[] array1,int[] array2) {

		if(array1.length == array2.length) {
			for(int index=0;index<array1.length;index++) {
				if(array1[index] != array2[index]) {
					System.out.println("Values are not matching at index -> " + index);
					return;
				}
			}
		}
		else
			System.out.println("Array size is not identical");	
	}

	public static void main(String[] args) {
		FirstDifferIndexOfArray firstDifferIndexOfArray = new FirstDifferIndexOfArray();

		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};

		firstDifferIndexOfArray.FirstDifferIndex(array1,array2);		
	}
} 