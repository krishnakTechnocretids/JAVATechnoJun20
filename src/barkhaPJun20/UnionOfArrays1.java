package barkhaPJun20;

import java.util.Arrays;

public class UnionOfArrays1 {
	static int count=0;

	double[] insertUniqueElementFromGivenArrayToTempUnionArray(double[] givenArray,double[] tempUnionArray) {
		boolean isNumberPresent=true;		
		for (int index=0; index<givenArray.length; index++) {
			 
			 for (int innerIndex=0; innerIndex<tempUnionArray.length; innerIndex++) {
				 if (tempUnionArray[innerIndex]==givenArray[index]) {
					 isNumberPresent=false;
				 }
			}		 
			 if (isNumberPresent) {
				 tempUnionArray[count]=givenArray[index];
				  count++;
			}	 
		
		}
		return tempUnionArray;
	}
	void findUnionOfArray(double[] arr1,double[]arr2) {
		double[] tempUnionArray=new double[arr1.length+arr2.length] ;
		insertUniqueElementFromGivenArrayToTempUnionArray(arr1, tempUnionArray);
		insertUniqueElementFromGivenArrayToTempUnionArray(arr2, tempUnionArray);
		
		double[] unionArray=new double[count];
		 for (int index=0; index<count; index++) {     //to remove 0.0 from tempUninonArray
			 unionArray[index]=tempUnionArray[index];
		 }
		System.out.println("Union of provided Arrays is: "+Arrays.toString(unionArray));
	}
	
	
	public static void main(String[] args) {
		UnionOfArrays1 unionOfArrays=new UnionOfArrays1();
		double[] array1= {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] array2= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		System.out.println("First Array is: "+Arrays.toString(array1));
		System.out.println("Second Array is: "+Arrays.toString(array2));
		unionOfArrays.findUnionOfArray(array1,array2);
	}
}
