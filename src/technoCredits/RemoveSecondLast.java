package technoCredits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveSecondLast {

	static void removeNthElement(Integer[] num, int nthLast) {
			TreeSet<Integer> numberSet = new TreeSet<Integer>(Arrays.asList(num));
			System.out.println(numberSet);
			int count = 0;
			while(count<nthLast-1) {
				int last = numberSet.last();
				numberSet.remove(last);
				count++;
			}
			System.out.println(numberSet.last());
	}
	
	static int removeNthUsingArrayList(Integer[] num, int nthLast) {
		TreeSet<Integer> numberSet = new TreeSet<Integer>(Arrays.asList(num));
		System.out.println(numberSet);
		ArrayList<Integer> numList = new ArrayList<Integer>(numberSet);
		return numList.get(numList.size()-nthLast);
	}
	
	public static void main(String[] args) {
		Integer[] num = {8,4,5,2,2,2,2,2,2,10,1,10};
		//removeNthElement(num,3);
		System.out.println("Second last is " + removeNthUsingArrayList(num, 2));
	}
}
