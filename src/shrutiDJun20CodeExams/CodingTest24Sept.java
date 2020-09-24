/*
Java Coding Test

Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50
 */

package shrutiDJun20CodeExams;

import java.util.ArrayList;
import java.util.Collections;

public class CodingTest24Sept {

	void findSumOfTriplets(int[] num){
		int setOfThree=3;
		int sumOfSet1=0;
		int sumOfSet2=0;
		int sumOfSet3=0;
		String set1,set2 = "",set3;
		for(int i=0; i<setOfThree; i++) {
			if(num[i]>0)
			sumOfSet1 += num[i];
			set1 = num[i]+" ";
			num[i]=0;
		}
		System.out.println(sumOfSet1);		
		for(int i=0; i<(setOfThree*2); i++) {
			if(num[i]>0)
				sumOfSet2 += num[i];
			if(num[i]>0) {
				set2 += String.valueOf(num[i])+",";}
				num[i]=0;
		}
		System.out.println(sumOfSet2);
		
		for(int i=0; i<(setOfThree*3); i++) {
			if(num[i]>0)
				sumOfSet3 += num[i];
				set3 = num[i]+" ";
				num[i]=0;
		}
		System.out.println(sumOfSet3);
		
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(sumOfSet1);
		listOfNum.add(sumOfSet2);
		listOfNum.add(sumOfSet3);
		
		Collections.sort(listOfNum);
		System.out.println(listOfNum);
		System.out.println("Max sum triplet is:" + set2 + "-->"+Collections.max(listOfNum));
		
	}
	
	
	public static void main(String[] args) {
		int[] num = {10,20,12,22,15,13,9,17,21};
		CodingTest24Sept CodingTest24Sept = new CodingTest24Sept();
		CodingTest24Sept.findSumOfTriplets(num);;
	}
	
	
}
