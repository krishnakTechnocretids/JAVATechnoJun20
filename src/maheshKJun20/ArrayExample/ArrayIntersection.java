package maheshKJun20.ArrayExample;

public class ArrayIntersection {
	
	int count=0;
	
	//Method to find Intersection of 2 Arrays
	void findArrayIntersection(double[] arr1, double[] arr2) {
		double[] intersectionOfArray = new double[arr1.length + arr2.length];
		String[] tempStringArray = new String[arr1.length + arr2.length];
		for(int index=0;index<arr1.length;index++) {
			if(tempStringArray[index] != "@") {
				for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {
					if(arr2[innerIndex] == arr1[index]) {
						intersectionOfArray[count] = arr1[index];
						tempStringArray[innerIndex] = "@";
						count++;
						break;
					}
				}
			}
			
		}	
		intersectionOfArray = removeExtraValueArray(intersectionOfArray);
		displayArrayElements(intersectionOfArray);
	}
	
	//Method to Remove 0 Values from Array
	double[] removeExtraValueArray(double[] tempintersectionOfArray) {
		double[] finalArray = new double[count];
		int counter = 0;
		for (int index=0;index<tempintersectionOfArray.length;index++) {
			if (tempintersectionOfArray[index] != 0) { 
				finalArray[counter] = tempintersectionOfArray[index];
				counter++;
			}
		}
		return finalArray;
	}
	
	//Method to display Elements of Array
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
