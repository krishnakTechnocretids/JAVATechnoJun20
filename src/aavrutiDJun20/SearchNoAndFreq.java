package aavrutiDJun20;

import java.util.*;

public class SearchNoAndFreq {
	
	//Verify whether number is available in pre-defined array or not and count frequency for available number.
	void searchFreqAndNumber(int[] numberArray,int numberSearch) {
		int numCount = 0;
		boolean flag = false;
		for(int index=0;index<numberArray.length;index++) {
			if(numberArray[index] == numberSearch) {
				numCount++;
				flag = true;
			}
		}
		if(flag == true)
			System.out.println("\nGiven number " + numberSearch + " is present in predefined {10,3,9,-99,81,3,-11} array with frequency " + numCount + ".");
		else
			System.out.println("\nGiven number " + numberSearch + " is not present in predefined {10,3,9,-99,81,3,-11} array.");
	}

	public static void main(String[] args){
		SearchNoAndFreq searchNoAndFreq = new SearchNoAndFreq();
		Scanner scanner=new Scanner(System.in);
		
		int[] numberArray = {10,3,9,-99,81,3,-11};
		
		System.out.println("Please enter the Number which you want to search from {10,3,9,-99,81,3,-11} : ");
		int numberSearch = scanner.nextInt();
		
		searchNoAndFreq.searchFreqAndNumber(numberArray,numberSearch);
		
		scanner.close();
	}
}
