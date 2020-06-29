/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, 
you need to write a Java program to find that missing number in an array.package jagadeeshMJun20; */
package jagadeeshMJun20;
public class MissingNum {
	void displayMissingNumber(int[] arr) {
		for(int index=0;index<(arr.length-1);index++) {
			if(arr[index+1]!=(arr[index]+1))
				System.out.println(arr[index]+1);
		}
	}
	public static void main(String[] agrs) {
		MissingNum missingNum = new MissingNum();
		int[] arr= {1,2,3,5,6,8,10};
		missingNum.displayMissingNumber(arr);
	}
}
