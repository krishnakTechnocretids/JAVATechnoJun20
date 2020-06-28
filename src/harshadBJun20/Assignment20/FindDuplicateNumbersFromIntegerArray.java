package harshadBJun20.Assignment20;
/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/
public class FindDuplicateNumbersFromIntegerArray {
	void findDuplicateNumber(int[] num) {
		for(int index=0;index<num.length;index++) {
			for(int j=index+1;j<num.length;j++) {
				if(num[index]==num[j]) {
					System.out.println("The duplicated number in array is: "+num[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		FindDuplicateNumbersFromIntegerArray findDuplicateNumbersFromIntegerArray = new FindDuplicateNumbersFromIntegerArray();
		int[] arr= {0,3,1,2,3};
		findDuplicateNumbersFromIntegerArray.findDuplicateNumber(arr);
	}
}
