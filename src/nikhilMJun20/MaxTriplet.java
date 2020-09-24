/*
Find triplet having maximum sum.
int[] num = {10,20,12,22,15,13,9,17,21}
Max sum triplet is : 22,15,13 -> 50
*/

package nikhilMJun20;

import java.util.ArrayList;

public class MaxTriplet {
	void findMaxTriplet(int[] num) {
		ArrayList<Integer> tripMax = new ArrayList<Integer>();
		for (int i : num)
		{
		    tripMax.add(i);
		}
		System.out.println("Given integers are:-\n"+tripMax);
		
		//Finding out max triplet
		int tripMaxSum = 0;
		int maxIndex = 0;
		for(int index=0; index<tripMax.size()/3*2; index+=3) {
			int tempSum = 0;
			for(int innerIndex=index; innerIndex<index+3; innerIndex++) {
				tempSum = tempSum + tripMax.get(innerIndex);
			}
			if(tempSum > tripMaxSum) {
				tripMaxSum = tempSum;
				maxIndex = index;
			}
		}
		System.out.println("\nMax triplet from above integers is:-");
		for(int index=maxIndex; index<maxIndex+3; index++) {
			System.out.print(tripMax.get(index)+" ");
		}
		System.out.println("\n\nSum of Max triplet integers = "+tripMaxSum);
	}
	
	public static void main(String[] args) {
		int[] num = {10,20,12,22,15,13,9,17,21};
		new MaxTriplet().findMaxTriplet(num);
	}
}
