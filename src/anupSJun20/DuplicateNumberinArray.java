package anupSJun20;
/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then the duplicated number is 3.*/

public class DuplicateNumberinArray {
	static void FindDuplicateNumberinArray(int[] num) {
		for(int index =0; index<num.length;index++) {
			for (int innerindex = index+1;innerindex<num.length;index++) {
				if(num[index] == num[innerindex]) {
					System.out.println("The duplicate number is : "+ num[index]);
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] num = {0,3,1,2,3};
		FindDuplicateNumberinArray(num);
	}
}