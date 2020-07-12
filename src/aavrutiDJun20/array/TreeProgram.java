package aavrutiDJun20.array;

public class TreeProgram {
	
	public static void main(String[] args) {
		int[] arr1 = {3,5,5,13,9,10,11};
		int count = 0;
		for(int index=0;index<arr1.length-1;index++) {
			if(arr1[index] < arr1[index+1])
				count++;
		}		
		System.out.println(count);
	}
}