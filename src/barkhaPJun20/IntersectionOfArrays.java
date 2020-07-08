package barkhaPJun20;

import java.util.Arrays;

public class IntersectionOfArrays {
	int count=0;
	
	void findIntersectionOfArray(double[] arr1, double[] arr2) {
		
		double[]tempIntersectionOfArray=new double[arr1.length+arr2.length];
		for (int outerIndex=0; outerIndex<arr1.length; outerIndex++) {
			for (int innerIndex=0;innerIndex<arr2.length;innerIndex++) {
				if (arr1[outerIndex]==arr2[innerIndex]) {
					tempIntersectionOfArray[count]=arr1[outerIndex];   //{10.45,18.35,18.35}
					count++;
				}
			}
		}
		int count1=0;
		for (int index=0; index<count; index++) {
			for (int innerIndex=index+1; innerIndex<count; innerIndex++ ) {
				if (tempIntersectionOfArray[index]==tempIntersectionOfArray[innerIndex]) {
					tempIntersectionOfArray[index]=0;     //{10.45,0,18.35}
				}
			}
			if (tempIntersectionOfArray[index]>0) {
				count1++;                                 // this is length of {10.45,0,18.35}
			}
		}
		int count2=0;
		double[] intersectionOfArray=new double[count1];
		for (int index=0; index<tempIntersectionOfArray.length; index++) {
			if (tempIntersectionOfArray[index]>0) {
				intersectionOfArray[count2]=tempIntersectionOfArray[index];
				count2++;
			}
		}
		
		System.out.println("Intersection of provided Arrays is: "+Arrays.toString(intersectionOfArray));

	}
	public static void main(String[] args) {
		IntersectionOfArrays intersectionOfArrays=new IntersectionOfArrays();
		double[] arr1= {10.45,14.0,18.35,88.88,54.10,18.35};
		double[] arr2= {17.20,13.30,10.45,18.35,84.33,13.30};
		System.out.println("First Array is: "+Arrays.toString(arr1));
		System.out.println("Second Array is: "+Arrays.toString(arr2));
		
		intersectionOfArrays.findIntersectionOfArray(arr1, arr2);
		}	
}		
