/*Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18*/

package amitaRJun20;

public class MaxValueAtDiffIndexArray {
	
	//Method to find max value at differed index of two array
	void maxValueDiffIndex(int[] array1,int[] array2) {
		
		boolean flag = true;
		if(array1.length == array2.length) {		
			for(int index=0; index < array1.length; index++) {
				if(array1[index] != array2[index]) {
					flag = false;
					if(array1[index]>array2[index]) 
						System.out.println("Values are not matching at index "+index+" From ("+array1[index]+","+array2[index]+") Max value is "+array1[index]);
					else
						System.out.println("Values are not matching at index "+index+" From ("+array1[index]+","+array2[index]+") Max value is "+array2[index]);
					}
			}
			if(flag == true)
				System.out.println("Both arrays are equal");			
		}
		else
			System.out.println("Array length are not equal");		
	}

	public static void main(String[] args) {
		MaxValueAtDiffIndexArray maxValue=new MaxValueAtDiffIndexArray();
		
		int[] array1 = {10,2,9,14,3};
        int[] array2 = {10,2,18,14,3};
        System.out.println("Two Given arrays are : \n{10,2,9,14,3}\n{10,2,18,14,13}");
		maxValue.maxValueDiffIndex(array1,array2);
	}
}
