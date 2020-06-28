package aavrutiDJun20;

public class SumOfNumberInArray {
	
	void sumInArray(int[] arr1,int number) {
		for(int index=0;index<arr1.length;index++) {
			for(int index2=index;index2<arr1.length;index2++) {
				if((arr1[index]+arr1[index2]) == number)
					System.out.println("(" +arr1[index] + ", " + arr1[index2] + ")");
			}
		}
	}
	
	public static void main(String[] rags) {
		SumOfNumberInArray sumOfNumberInArray = new SumOfNumberInArray();
		
		int[] arr1 = {2, 4, 3, 5, 7, 8, 9 ,-1};
		int number = 7;
		
		sumOfNumberInArray.sumInArray(arr1,number);				
	}
}