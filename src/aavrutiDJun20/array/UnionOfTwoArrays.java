package aavrutiDJun20.array;

public class UnionOfTwoArrays {
	int numberCnt=0;
	
	//Store 2 array value in third temp array
	double[] findUnionOfArrays(double[] array1,double[] array2) {
		double[] tempUnionArray = new double[array1.length+array2.length];
		
		for(int outerIndex=0;outerIndex<array1.length;outerIndex++) {
			boolean isNumberPresent = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {
				if(tempUnionArray[innerIndex]==array1[outerIndex]) {
					isNumberPresent=false;
					break;
				}
			}
			if(isNumberPresent) {
				tempUnionArray[numberCnt] = array1[outerIndex];
				numberCnt++;
			}
		}
		
		for(int outerIndex=0;outerIndex<array2.length;outerIndex++) {
			boolean isNumberPresent = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {
				if(tempUnionArray[innerIndex]==array2[outerIndex]) {
					isNumberPresent=false;
					break;
				}
			}
			if(isNumberPresent) {
				tempUnionArray[numberCnt] = array2[outerIndex];
				numberCnt++;
			}
		}
		
		return tempUnionArray;
	}
	
	//Get data of Union Array and remove 
	double[] getUnionOfArrays(double[] array1,double[] array2) {
	    double[] tempUnionArray = findUnionOfArrays(array1,array2);
		double[] unionOfArray = new double[numberCnt];
		
		for(int outerIndex=0;outerIndex<unionOfArray.length;outerIndex++) {
			unionOfArray[outerIndex] = tempUnionArray[outerIndex];
		}		
		
		return unionOfArray;
	}
	
	void displayUnionArray(double[] unionOfArray) {
		System.out.println("Union of Two Array : ");
		for(int outerIndex=0;outerIndex<unionOfArray.length;outerIndex++) {
			System.out.print(unionOfArray[outerIndex] + " ");
		}				
	}
	
	public static void main(String[] args) {
		UnionOfTwoArrays unionOfTwoArrays = new UnionOfTwoArrays();
		double[] array1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] array2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
				
		unionOfTwoArrays.displayUnionArray(unionOfTwoArrays.getUnionOfArrays(array1,array2));
	}
}