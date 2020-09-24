package anupSJun20;

import java.util.ArrayList;
import java.util.Arrays;

/*Java Coding Test

Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50*/

public class MaxSumTripletCodingExam12 {
	int sum = 0;
	int maxSum = 0;
	int count = 0;
	String output;
	public void findmaxSum(int[] num) {
		for(int i=0;i<num.length;i++) {
			sum += num[i];
			count++;
			if(count==3) {
				if(maxSum<sum) {
					maxSum = sum;
					output = num[i-2]+","+num[i-1]+","+num[i];
				}
				count = 0;
				sum = 0;
			}
		}
		System.out.println(output+ "-->"+ maxSum);
	}

	
	public static void main(String[] args) {
		int[] num = {10,20,12,22,15,13,9,17,21};
		new MaxSumTripletCodingExam12().findmaxSum(num);
	}
}
