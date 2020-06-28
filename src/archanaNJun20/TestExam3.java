package archanaNJun20;
/*
 Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find
all elements in the array whose sum is equal to the given number. Remember, the array
may contain both positive and negative numbers, so your solution should consider that.
Input:2, 4, 3, 5, 7, 8, 9,-1
Given sum:7
Integer numbers, whose sum is equal to value:7
(2, 5)
(4, 3)
 */
public class TestExam3 {
	void printallpair(int arr[],int number){
		System.out.println("Integer numbers, whose sum is equal to value: "+number);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==number){
					System.out.println("["+arr[i]+","+arr[j]+"]");
				}
			}
		}
	}
	public static void main(String[] args) {
		TestExam3 testexam3=new TestExam3();
		int[] array= {2, 4, 3, 5, 7, 8, 9,-1};
		testexam3.printallpair(array,7);
	}
}