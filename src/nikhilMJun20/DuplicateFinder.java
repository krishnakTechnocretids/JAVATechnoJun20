/*Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.
*/

package nikhilMJun20;

public class DuplicateFinder {
	void findDuplicate(int[] intArray) {
		System.out.println("Given Array : {0, 3, 1, 2, 3}");
		for(int index=0; index<intArray.length; index++) {
			for(int innerIndex=index+1; innerIndex<intArray.length; innerIndex++) {
				if(intArray[index] == intArray[innerIndex])
					System.out.println("Duplicate Array Element is : "+intArray[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = {0, 3, 1, 2, 3};
		new DuplicateFinder().findDuplicate(intArray);
	}
}
