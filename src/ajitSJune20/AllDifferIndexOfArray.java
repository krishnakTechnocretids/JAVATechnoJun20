/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                       arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                      Values are not matching at index -> 4 */
package ajitSJune20;

public class AllDifferIndexOfArray {
	void allDifferIndex(int[] array1,int[] array2) {

		if(array1.length == array2.length) {
			for(int index=0;index<array1.length;index++) {
				if(array1[index] != array2[index])
					System.out.println("Values are not matching at index -> " + index);
			}	
		}
	}

	public static void main(String[] args) {
		AllDifferIndexOfArray allDifferIndexOfArray = new AllDifferIndexOfArray();

		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,13};

		allDifferIndexOfArray.allDifferIndex(array1,array2);		
	}
}