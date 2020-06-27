package anupSJun20;
/*Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18*/

public class MaxValueAtDifferentIndex {
	static void findMaxValueAtDifferentIndex(int[] arr1, int[] arr2) {
		boolean flag = true;
		if(arr1.length == arr2.length) {
			for(int index = 0;index<arr1.length;index++) {
				if(arr1[index]!= arr2[index]) {
					if(arr1[index] > arr2[index]) {
						flag = false;
						System.out.println("Values are not matching at index -> " +index+ " From " + "(" + arr1[index] +"," +arr2[index]+")" + " max value is "+ arr1[index]);
					}
					else {
						flag = false;
						System.out.println("Values are not matching at index -> " +index+ " From " + "(" + arr1[index] +"," +arr2[index]+")" + " max value is "+ arr2[index]);
					}
				}
				}
			if (flag == true) {
				System.out.println("Both the arrays are equal");
			}
				
			}
			
		else
			System.out.println("Array lengths re not equal");
		
	}
	public static void main(String[] args) {
		int[] arr1 =  {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		findMaxValueAtDifferentIndex(arr1,arr2);
	}

}
