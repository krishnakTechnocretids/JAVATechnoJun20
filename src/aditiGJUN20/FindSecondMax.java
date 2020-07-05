//int[] number = {10,33,56,43,99,21}
//Find second max number.
//int[] number = {10,33,56,43,99,21}
//output : 56

package aditiGJUN20;

import java.util.Arrays;

public class FindSecondMax {
	 
	 int findSecondMaxNumber(int inputArray[]) {
		 	if (inputArray.length<2) {
		 		System.out.print(" \nInvalid Input/Array should have atleast 2 elements to find second Max. ");
		 		return 0;
		 	}
			
		 int FirstMax = inputArray[0];
			int secondMax = inputArray[0];
			
			for (int index = 0; index < inputArray.length; index++) {
	 
				if (inputArray[index] > FirstMax) {
					secondMax = FirstMax;
					FirstMax = inputArray[index];
	 
				} else if (inputArray[index] > secondMax) {
					secondMax = inputArray[index];
	 
				}
			}
			System.out.println("\nSecond max number is: "+secondMax);
			return secondMax;
	 }
	 

	public static void main(String[] args) {
		FindSecondMax findSecondMax = new FindSecondMax();
		int[] number = { 10, 33, 56, 43, 99, 21 };
		//int[] number1={ 10, 33, 56, 43, 99, 21, 79 };
		//int[] number2={10};
		System.out.println("Input Array1 -> " + Arrays.toString(number));
		findSecondMax.findSecondMaxNumber(number);
	}
}
