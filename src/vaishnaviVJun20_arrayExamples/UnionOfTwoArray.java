package vaishnaviVJun20_arrayExamples;

//Find union of two arrays.

public class UnionOfTwoArray {
	int count;
	
	void findUniqueNumberArray(double tempUnionArray[]) {
		System.out.println("Union of given two arrays is:");
		double[] unionArray = new double[count];
		for(int index=0;index<unionArray.length;index++) {
			unionArray[index]=tempUnionArray[index];
		}		
		for(int index=0;index<unionArray.length;index++) {
			System.out.print(unionArray[index] +" ");
		}
	}
	
	 double[] getUnionOfArrays(double[] tempUnionArray, double[] array) {
		 boolean flag = true;
		 for(int outerIndex=0;outerIndex<array.length;outerIndex++) {	
				flag = true;
				for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {				
				     if(tempUnionArray[innerIndex] == array[outerIndex]) 	    	
				    	 flag = false;                 			    		    	 
				}
				if(flag == true) {
					tempUnionArray[count] = array[outerIndex];
					count++;
				}	
			}	
		 return tempUnionArray;
	 }

	public static void main(String[] args) {
        double array1[] = {10.45,14.0,18.35,88.88,54.10,18.35};
        double array2[] = {17.20,13.30,10.45,18.35,84.33,13.30};
        double[] tempUnionArray = new double[array1.length+array2.length];
        UnionOfTwoArray unionOfTwoArray = new UnionOfTwoArray();
        tempUnionArray = unionOfTwoArray.getUnionOfArrays(tempUnionArray,array1);
		tempUnionArray = unionOfTwoArray.getUnionOfArrays(tempUnionArray,array2);
		unionOfTwoArray.findUniqueNumberArray(tempUnionArray);               
	}
}
