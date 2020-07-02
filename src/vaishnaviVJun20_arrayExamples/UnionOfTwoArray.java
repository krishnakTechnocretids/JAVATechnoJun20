package vaishnaviVJun20_arrayExamples;

//Find union of two arrays.

import java.lang.reflect.Array;

public class UnionOfTwoArray {
	int count;
	
	void findUniqueNumberArray(double tempUnionArray[]) {
		System.out.println("Union of given two arrays is:");
		double[] unionArray = new double[count];
		for(int index=0;index<unionArray.length;index++) {
			unionArray[index]=tempUnionArray[index];
		}		
		for(int index=0;index<unionArray.length;index++) {
			System.out.print(unionArray[index] +" ");
		}
	}
	
	void getUnionOfArrays(double[] arr1, double[] arr2) {
		boolean flag = true;
		double[] tempUnionArray = new double[arr1.length+arr2.length];	
	
		for(int outerIndex=0;outerIndex<arr1.length;outerIndex++) {	
			flag = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {				
			     if(tempUnionArray[innerIndex] == arr1[outerIndex]) 	    	
			    	 flag = false;                 			    		    	 
			}
			if(flag == true) {
				tempUnionArray[count] = arr1[outerIndex];
				count++;
			}	
		}
		
		for(int outerIndex=0;outerIndex<arr2.length;outerIndex++) {	
			flag = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {				
			     if(tempUnionArray[innerIndex] == arr2[outerIndex]) 	    	
			    	 flag = false;                 			    		    	 
			}
			if(flag == true) {
				tempUnionArray[count] = arr2[outerIndex];
				count++;
			}	
		}
		
		findUniqueNumberArray(tempUnionArray);

	}

	public static void main(String[] args) {
        double array1[] = {10.45,14.0,18.35,88.88,54.10,18.35};
        double array2[] = {17.20,13.30,10.45,18.35,84.33,13.30};
        new UnionOfTwoArray().getUnionOfArrays(array1, array2);
	}

}
