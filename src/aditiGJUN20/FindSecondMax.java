//int[] number = {10,33,56,43,99,21}
//Find second max number.
//int[] number = {10,33,56,43,99,21}
//output : 56

package aditiGJUN20;

import java.util.Arrays;

public class FindSecondMax {
	 
	 int findSecondMaxNumber(int inputArray[]) {

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
	 
			return secondMax;
	 }
	 

	public static void main(String[] args) {
		FindSecondMax findSecondMax = new FindSecondMax();
		int[] number = { 10, 33, 56, 43, 99, 21 };
		//int[] number1={ 10, 33, 56, 43, 99, 21, 79 };
		//int[] number2={10};
		System.out.println("Input Array1 -> " + Arrays.toString(number));
		if (number.length < 2) 
			System.out.print(" Invalid Input/Array should have atleast 2 elements to find second Max. ");
		else {
			System.out.println("Second max number is: "+findSecondMax.findSecondMaxNumber(number));
		}
	}
}
