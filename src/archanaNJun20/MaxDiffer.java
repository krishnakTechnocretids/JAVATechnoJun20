package archanaNJun20;

public class MaxDiffer {
	static void printMaxdiffer(int[] arr1,int arr2[])	{
		if(arr1.length==arr2.length) {
			for(int index =0; index <arr1.length; index++){
				if(arr1[index]!=arr2[index]){
					if(arr1[index]>arr2[index])
						System.out.println("Values are not matching at index -> "+index+", From ("+arr1[index]+","+arr2[index]+") max value is "+ arr1[index] );
					else
						System.out.println("Values are not matching at index -> "+index+", From ("+arr1[index]+","+arr2[index]+") max value is "+ arr2[index] );
				}
			}
		}
		else
			System.out.println("array are identical");
	}
	public static void main(String[] args) {
		int []arr1={10,2,9,14,3};
		int[] arr2={10,2,18,14,3};
		printMaxdiffer(arr1, arr2);
	}
}
