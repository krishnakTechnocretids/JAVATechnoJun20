package aavrutiDJun20.array;

public class TreeProgram {
	
	public static void main(String[] args) {
		int[] arr1 = {3,5,5,13,9,10,14};
		int count = 1;
		int max = arr1[0];
		for(int index=1;index<arr1.length;index++) {
			if(arr1[index] > max) {
				max = arr1[index];
				count++;				
			}				
		}		
		System.out.println(count);
	}
}