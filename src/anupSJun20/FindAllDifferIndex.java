package anupSJun20;
/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4*/

public class FindAllDifferIndex {
	static void findAlldifferentIndexInArray(int[] arr1,int[] arr2) {
		boolean flag = true;
		if(arr1.length == arr2.length) {
		for(int index = 0;index<arr1.length;index++) {
			if(arr1[index]!=arr2[index]) {
				flag = false;
				System.out.println("Values are not matching at "+ index);
			}
		}
		if(flag ==true) {
			System.out.println("");
		}
		}
		else
			System.out.println("The array lengths are not equal");
	}
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		findAlldifferentIndexInArray(arr1,arr2);
	}

}
