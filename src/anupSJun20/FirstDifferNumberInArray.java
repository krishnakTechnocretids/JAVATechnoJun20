package anupSJun20;
/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2*/

public class FirstDifferNumberInArray {
	static void finddifferentIndexInArray(int[] arr1,int[] arr2) {
		if(arr1.length == arr2.length) {
		for(int index = 0;index<arr1.length;index++) {
			if(arr1[index]!=arr2[index]) {
				System.out.println("Values are not matching at "+ index);
				break;
			}
		}
		}
		else
			System.out.println("The array lengths are not equal");
	}
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		finddifferentIndexInArray(arr1,arr2);
	}

}
