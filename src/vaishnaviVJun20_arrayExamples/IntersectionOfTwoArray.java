package vaishnaviVJun20_arrayExamples;

//Find intersection(common elements) of two arrays.

public class IntersectionOfTwoArray {
    int count;
    
    void findUniqueNumberArray(double tempIntersectionArray[]) {
		System.out.println("Intersection of given two arrays is:");
		double[] intersectionArray = new double[count];
		for(int index=0;index<intersectionArray.length;index++) {
			intersectionArray[index]=tempIntersectionArray[index];
		}		
		for(int index=0;index<intersectionArray.length;index++) {
			System.out.print(intersectionArray[index] +" ");
		}
	}
    
	void findIntersectionOfTwoArrays(double[] arr1, double[] arr2) {
		
		double[] intersectionArray = new double[arr1.length+arr2.length];	
		String[] str = new String[arr1.length+arr2.length];
		
		for(int outerIndex=0;outerIndex<arr1.length;outerIndex++) {
			if(str[outerIndex]!= "*" ) {
			for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {	
				if(arr1[outerIndex] == arr2[innerIndex]) {
					intersectionArray[count]=arr1[outerIndex];
					str[innerIndex] = "*";
					count++;
					break;
				}
			}
		}
	}	
		findUniqueNumberArray(intersectionArray);
	}
	public static void main(String[] args) {
		double array1[] = {10.45,14.0,18.35,88.88,54.10,18.35};
        double array2[] = {17.20,13.30,10.45,18.35,84.33,13.30};
        new IntersectionOfTwoArray().findIntersectionOfTwoArrays(array1, array2);
	}

}
