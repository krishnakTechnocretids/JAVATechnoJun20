package maheshKJun20.ArrayExample;

public class ArrayUnionUsingString {
	
	//Method to find Union of 2 Array
	void findUnionArray(double[] arr1, double[] arr2) {
		String tempStr = "";
		for (int index=0;index<arr1.length;index++) {
			tempStr += arr1[index] + "," + arr2[index] + "," ;
		}
		String[] tempUnionArray = tempStr.split(",");
		double[] arrayUnion = findUniqueArrayValues(tempUnionArray);
		displayArrayElements(arrayUnion);
	}
	
	//Method to Find Unique values in an Array
	double[] findUniqueArrayValues(String[] tempUnionArray) {
		String strUniqueNumbers = ""; 
		boolean flag;
		for (int index=0;index<tempUnionArray.length;index++) {
			flag = true;
			for (int innerIndex=0;innerIndex < tempUnionArray.length;innerIndex++) {
				if (tempUnionArray[index].equals(tempUnionArray[innerIndex])) {
					if (innerIndex>index) {
						flag = false;
						break;
					}
				}
			}
			if(flag)
				strUniqueNumbers += tempUnionArray[index] + ",";
		}
		String[] strUnionArray = strUniqueNumbers.split(",");
		return covertStringToDoubleArray(strUnionArray);
	}
	
	//Method to convert String Array to double Array
	double[] covertStringToDoubleArray(String[] strUnionArray) {
		double[] dblUnionArray = new double[strUnionArray.length];
		for (int index=0;index<strUnionArray.length;index++) {
			dblUnionArray[index] = Double.parseDouble(strUnionArray[index]);
		}
		return dblUnionArray;
	}
	
	//Method to display element values of Array
	void displayArrayElements(double[] unionOfArray){
		System.out.print("Output: ");
		for (int index=0;index<unionOfArray.length;index++) {
			if(index<unionOfArray.length-1)
				System.out.print(unionOfArray[index] + ", ");
			else
				System.out.println(unionOfArray[index]);
		}
	}
	
	public static void main(String[] args) {
		ArrayUnionUsingString arrayUnionUsingString = new ArrayUnionUsingString();
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		arrayUnionUsingString.findUnionArray(arr1, arr2);
	}
}
