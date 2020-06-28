/*Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                    arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18*/

package ajitSJune20;

public class FindMaxValAtDifferIndex {
	int index= 0;
	void maxValAtIndex(int[] array1, int[] array2) {
		if (array1.length==array2.length) {
			for (int index= 0; index<array2.length; index++) {
				if(array1[index]!=array2[index]) {
					int maxVal=0;
					if (array1[index]> array2[index]) {
						maxVal= array1[index];
					}	
					else {
						maxVal= array2[index];
					}
						System.out.println("Values are not matching at index " + index + ", from (" + array1[index] + "," + array2[index] + ") max value is " + maxVal);
				}
			}
		}	
	}

	public static void main(String[] args) {
		FindMaxValAtDifferIndex findMaxValAtDifferIndex= new FindMaxValAtDifferIndex();
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};
		findMaxValAtDifferIndex.maxValAtIndex(array1,array2);
	}
}