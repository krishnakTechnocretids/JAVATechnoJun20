package vaishnaviVJun20_arrayExamples;

//Find intersection(common elements) of two arrays.

public class IntersectionOfTwoArray {
    int count;
    
    void findUniqueNumberArray(double[] tempIntersectionArray) {
		System.out.println("Intersection of given two arrays is:");
		int countOfFinalArray = 0;
		double[] fianlArray = new double[count];
		for(int outerIndex =0;outerIndex<count;outerIndex++) {
			boolean flag = true;
		    for(int index=0;index<countOfFinalArray;index++) {
		    	if (fianlArray[index] == tempIntersectionArray[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				fianlArray[countOfFinalArray] = tempIntersectionArray[outerIndex];
				countOfFinalArray++;
			}
		}
		for(int index=0;index<countOfFinalArray;index++) {
			System.out.print(fianlArray[index] +" ");
		}
	}
    
	void findIntersectionOfTwoArrays(double[] arr1, double[] arr2) {	
		double[] intersectionArray = new double[arr1.length];
		
		for(int outerIndex=0;outerIndex<arr1.length;outerIndex++) {
			for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {	
				if(arr1[outerIndex] == arr2[innerIndex]) {
					intersectionArray[count]=arr1[outerIndex];
					count++;
				}
			}
		}
		
		findUniqueNumberArray(intersectionArray);
	}
	
	public static void main(String[] args) {
		double array1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
        double array2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
        new IntersectionOfTwoArray().findIntersectionOfTwoArrays(array1, array2);
	}

}
