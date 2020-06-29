package aasthaJJun20;

public class NumbersAndArrays {
	//This method is written just to display the array elements in output
	void displayArray(int[] input) {
		System.out.print("Input Array : { ");
		for(int index = 0; index < input.length; index++) {
			System.out.print(input[index]+" ");;
		}
		System.out.println("}");
	}
	
	// Program 1: Find the missing number in integer array of 1 to 10?
	void findMissingNumberFromArray(int[] input) {
		displayArray(input);
		int actualSum = 0, differedSum = 0;
		for (int index = 1; index <= 10; index++) {
			actualSum += index;
		}
		for (int index = 0; index < input.length; index++) {
			differedSum += input[index];
		}
		System.out.println("The missing integer is: " + (actualSum - differedSum));

	}

	// Program 2: Find duplicate number on Integer array in Java? when exactly one number is repeated in the array
	void findDuplicateInArray(int[] input) {
		displayArray(input);
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					System.out.println("Duplicate number is: " + input[index]);
					return;
				}
			}
		}
	}

	// Program 3: WAP to revers number (Consider Input as Integer not as String).
	void displayReverseInteger(int num){
		System.out.print("Reverse of given number "+num+" is: ");
		int reversedNum = 0;
		while(num > 0){
			reversedNum = (reversedNum*10)+(num%10);
			num /= 10;
		}
		System.out.println(reversedNum);
	}
	
	// Program 4: WAP to check if a number is Armstrong or not. Note: It can only handle a 3 digit number
	void isArmstrong(int num) {
		int result = 0;
		int var = num;
		while (var > 0) {
			result += (var % 10) * (var % 10) * (var % 10);
			var /= 10;
		}
		if (num == result)
			System.out.println("Given number " + num + " is an armstrong number");
		else
			System.out.println("Given number " + num + " is not an armstrong number");
	}

	public static void main(String[] args) {
		NumbersAndArrays numbersAndArrays = new NumbersAndArrays();
		int[] arr1 = { 7, 3, 1, 4, 5, 2, 8, 9, 10 };
		int[] arr2 = { 10, 3, 1, 4, 5, 2, 8, 9, 10 };
		System.out.println("\nProgram:1 Output:---------------------------------");
		numbersAndArrays.findMissingNumberFromArray(arr1);
		System.out.println("\nProgram:2 Output:---------------------------------");
		numbersAndArrays.findDuplicateInArray(arr2);
		System.out.println("\nProgram:3 Output:---------------------------------");
		numbersAndArrays.displayReverseInteger(12345);
		System.out.println("\n\nProgram:4 Output:---------------------------------");
		numbersAndArrays.isArmstrong(153);
		numbersAndArrays.isArmstrong(200);
	}
}
