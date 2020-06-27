/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4*/
                         package jagadeeshMJun20;
import jagadeeshMJun20.DiffInArray;
public class DiffInArray2 {

	public static void main(String[] agrs) {
		DiffInArray diffInArray = new DiffInArray();
		int[] arr1= {10,2,9,14,3};
        int[] arr2= {10,2,18,14,13};
        diffInArray.mainLogic(arr1, arr2);
	}
}
