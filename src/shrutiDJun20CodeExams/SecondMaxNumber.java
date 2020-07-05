//Find second max number.
//int[] number = {10,33,56,43,99,21}
//output : 56

package shrutiDJun20CodeExams;

import java.util.Arrays;

public class SecondMaxNumber {
	
	void findSecondHighest(int[] number){
		int highestNum = 0;
		int secondHighestNum=0;
		int lowestNum = 0;
		int temparr[] = new int[number.length];
		
		for (int index=0;index<number.length;index++ ){
			if(number[index]>highestNum){
				secondHighestNum=highestNum;
				highestNum=number[index];
			}
			else if(number[index]>secondHighestNum)
				secondHighestNum=number[index];
		}

		System.out.println(highestNum);
		System.out.println(secondHighestNum);
	}
		
	public static void main(String[] args) {
		int[] number = {10,33,56,43,99,21};
		SecondMaxNumber secondMaxNumber = new SecondMaxNumber();
		secondMaxNumber.findSecondHighest(number);
		}
	}

