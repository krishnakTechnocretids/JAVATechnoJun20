package nikhilMJun20;

public class SecondLargest {
	int findSecondLarest(int[] array) {
		int temp=0;
		for(int index=0; index<array.length; index++) {
			for (int innerIndex = index+1; innerIndex<array.length; innerIndex++) {
				if(array[index]<array[innerIndex]) {
					temp = array[index];
					array[index] = array[innerIndex];
					array[innerIndex] = temp;
				}
			}
		}
		return array[1];
	}
	
	public static void main(String[] args) {
		int[] intArray = {10,33,56,43,99,21};
		
		System.out.println("The second-largest number in the given array is: "+new SecondLargest().findSecondLarest(intArray));
	}
}
