package rajAJun20;

public class MaximumDifferIndexValue {
	
	void maxValueOfDifferIndex(int[] arr1 , int[] arr2) {
		if(arr1.length == arr2.length) {
			for(int index = 0 ; index < arr1.length ; index++) {
				if(arr1[index] != arr2[index]) {
					System.out.println("Numbers are not matching at index : " + index);
				if(arr1[index] > arr2[index]) 
					System.out.println("From ( " + arr1[index]+ "," + arr2[index] + " ) Maximum value is : " +arr1[index]);
				else 
					System.out.println("From ( " + arr1[index]+ "," + arr2[index] + " ) Maximum value is : " +arr2[index]);
				}
			}
		}
	}

	public static void main(String[] args) {
		MaximumDifferIndexValue maxDifferIndexValue = new MaximumDifferIndexValue();
		
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};
		
		maxDifferIndexValue.maxValueOfDifferIndex(array1, array2);
	}
}
