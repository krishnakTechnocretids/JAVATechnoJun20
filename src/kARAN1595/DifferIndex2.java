/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4
*/		
package kARAN1595;

public class DifferIndex2 {

	
		void differIndex(int[] numberArray1, int[] numberArray2) {
			if (numberArray1.length == numberArray2.length) {
				for (int index = 0; index < numberArray1.length; index++) {
					if (numberArray1[index] != numberArray2[index]) {
						System.out.println("Values are not matching at index :" + index);

					}

				}

			}

		}

		public static void main(String[] args) {
			DifferIndex2 differ = new DifferIndex2();

			int[] numberArray1 = {10,2,9,14,3 };
			int[] numberArray2 = { 10,2,18,14,13 };

			differ.differIndex(numberArray1, numberArray2);

		}

	

	}


