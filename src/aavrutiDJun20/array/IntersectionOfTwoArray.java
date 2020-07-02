/*Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/

package aavrutiDJun20.array;

public class IntersectionOfTwoArray {
	int numberCnt = 0;
	
	double[] findIntersectionOfArray(double[] array1,double[] array2) {
		double[] tempIntersectionArray = new double[array1.length+array2.length];
		String[] str = new String[array1.length+array2.length];
		str[0] = "";
		for(int outerIndex=0;outerIndex<array1.length;outerIndex++) {
			if(str[outerIndex]!= "*" ) {
				for(int innerIndex=0;innerIndex<array2.length;innerIndex++) {
					if(array1[outerIndex] == array2[innerIndex]) {
						tempIntersectionArray[numberCnt] = array2[innerIndex];
						str[innerIndex] = "*";
						numberCnt++;
						break;
					}
				}
			}
		}
		return tempIntersectionArray;
	}
	
	double[] getIntersectionOfArray(double[] array1,double[] array2) {
		double[] tempIntersectionOfArray = findIntersectionOfArray(array1, array2);
		double[] intersectionOfArray =  new double[numberCnt];
		
		for(int index=0;index<intersectionOfArray.length;index++) {
			intersectionOfArray[index] = tempIntersectionOfArray[index];
		}
		return intersectionOfArray;
	}
	
	void display(double[] intersectionOfArray) {
		System.out.println("Intersection of an Array : ");
		
		for(int index=0;index<intersectionOfArray.length;index++) {
			System.out.print(intersectionOfArray[index] + " ");
		}
	}
	
	public static void main(String[] args) {
		IntersectionOfTwoArray intersectionOfTwoArray = new IntersectionOfTwoArray();
		double[] array1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] array2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		
		intersectionOfTwoArray.display(intersectionOfTwoArray.getIntersectionOfArray(array1, array2));
	}
}