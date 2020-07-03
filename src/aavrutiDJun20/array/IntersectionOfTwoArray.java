package aavrutiDJun20.array;

public class IntersectionOfTwoArray {
	int duplicateNumberCnt = 0;
	
	//Store count of all the duplicate numbers from two arrays and store it in temporary array
	double[] findIntersectionOfArray(double[] array1,double[] array2) {
		int numberCnt = 0;
		int arrayLength = 0;
		
		if(array1.length>=array2.length)
			arrayLength = array1.length;
		else
			arrayLength = array2.length;
		
		double[] tempIntersectionArray = new double[arrayLength];
		String[] str = new String[arrayLength];
		str[0] = "";
		
		for(int outerIndex=0;outerIndex<array1.length;outerIndex++) {			
				for(int innerIndex=0;innerIndex<array2.length-1;innerIndex++) {
					if(array1[outerIndex] == array2[innerIndex]) {
						tempIntersectionArray[numberCnt] = array2[innerIndex];
						numberCnt++;
					}
				}
		}
		
		for(int outerIndex=0;outerIndex<numberCnt;outerIndex++) {
			boolean isNumberDuplicate = false;
			if(str[outerIndex] != "*") {
				for(int innerIndex=outerIndex+1;innerIndex<numberCnt;innerIndex++) {
					if(tempIntersectionArray[outerIndex]==tempIntersectionArray[innerIndex]) {
						isNumberDuplicate = true;
						str[innerIndex] = "*";
					}
				}
				if(isNumberDuplicate == true) {
					tempIntersectionArray[duplicateNumberCnt] = tempIntersectionArray[outerIndex];
					duplicateNumberCnt++;
				}
			}
		}		
		return tempIntersectionArray;
	}
	
	//Create new array without 0.0 in the array
	double[] getIntersectionOfArray(double[] array1,double[] array2) {
		double[] tempIntersectionOfArray = findIntersectionOfArray(array1, array2);
		double[] intersectionOfArray =  new double[duplicateNumberCnt];
		
		for(int index=0;index<intersectionOfArray.length;index++) {
			intersectionOfArray[index] = tempIntersectionOfArray[index];
		}		
		return intersectionOfArray;
	}
	
	//Display intersection of two arrays
	void display(double[] intersectionOfArray) {
		System.out.println("Intersection of an Array : ");
		
		for(int index=0;index<intersectionOfArray.length;index++) {
			System.out.print(intersectionOfArray[index] + " ");
		}
	}
	
	public static void main(String[] args) {
		IntersectionOfTwoArray intersectionOfTwoArray = new IntersectionOfTwoArray();
		double[] array1 = {10.45, 14.0, 10.45, 18.35, 88.88, 54.10, 18.35, 10.45, 18.35};
		double[] array2 = {17.20, 13.30, 10.45, 18.35, 84.33, 10.45, 13.30, 18.35};
		
		intersectionOfTwoArray.display(intersectionOfTwoArray.getIntersectionOfArray(array1, array2));
	}
}