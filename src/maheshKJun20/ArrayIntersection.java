package maheshKJun20;

public class ArrayIntersection {
	
	int count=0;
	void findArrayIntersection(double[] arr1, double[] arr2) {
		double[] intersectionOfArray = new double[arr1.length];
		int counter =0;
		for(int index=0;index<arr1.length;index++) {
			for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {
				if(arr2[innerIndex] == arr1[index]) {
					intersectionOfArray[counter] = arr1[index];
					counter++;
				}
			}
		}	
		intersectionOfArray = findUniqueValueArray(intersectionOfArray);
		intersectionOfArray = removeExtraValueArray(intersectionOfArray);
		displayArrayElements(intersectionOfArray);
	}
	
	double[] findUniqueValueArray(double[] tempintersectionOfArray) {
		for(int index=0;index<tempintersectionOfArray.length;index++) {
			if (tempintersectionOfArray[index]>0) {
				for(int innerIndex=index+1;innerIndex<tempintersectionOfArray.length;innerIndex++) {
					if (tempintersectionOfArray[innerIndex] == tempintersectionOfArray[index] ) {
						tempintersectionOfArray[innerIndex] = 0;
					}
				}
			}else {
				count++;
			}
		}
		return tempintersectionOfArray;
	}
	
	
	double[] removeExtraValueArray(double[] tempintersectionOfArray) {
		double[] finalArray = new double[tempintersectionOfArray.length - count];
		int counter = 0;
		for (int index=0;index<tempintersectionOfArray.length;index++) {
			if (tempintersectionOfArray[index] != 0) { 
				finalArray[counter] = tempintersectionOfArray[index];
				counter++;
			}
		}
		return finalArray;
	}
	
	void displayArrayElements(double[] intersectionOfArray){
		System.out.print("Output: ");
		for (int index=0;index<intersectionOfArray.length;index++) {
			if(index<intersectionOfArray.length-1)
				System.out.print(intersectionOfArray[index] + ", ");
			else
				System.out.println(intersectionOfArray[index]);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayIntersection arrayIntersection = new ArrayIntersection();
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		arrayIntersection.findArrayIntersection(arr1, arr2);
	}

}
