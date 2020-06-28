package abhishekSJun20;
/*
 A) User can provide any positive and negative number
 B) You need to find out how many positive and negative numbers are there in array 
    (Hint : here you need two variable which maintains count of positive and negative 
    number)
    Example : input -> 10,-2,-3,4,7
    Output -> 3 positive & 2 negative numbers
  C) Create a method which return difference of positive number sum and negative number 
     sum.
     Example : input -> 10,-2,-3,4,7
     Output -> 16*/
import java.util.Scanner;

public class PostiveAndNegativeNumberInArrays {
	int positiveNumberCount = 0;
	int negativeNumberCount = 0;

	// method to find count of positive numbers and negative numbers in the array
	void findPositiveandNegative(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (array[index]>0) {
				positiveNumberCount++;
			} else
				negativeNumberCount++;
		}
		 System.out.println("Positive number count :" + positiveNumberCount);
		 System.out.println("Negative number count :" + negativeNumberCount);
	}
	//method to find difference between positive numbers and negative numbers
	int difference0fPostiveAndNegativenuber(int[]array) {
		int positiveSum=0;
		int negativeSum=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]>0) {
				 positiveSum =array[index]+positiveSum;
				 positiveSum=array[index]+negativeSum;
			}
		}
		return positiveSum+positiveSum;
	}


public static void main(String[] args) {
	PostiveAndNegativeNumberInArrays postiveAndNegativeNumberInArrays = new PostiveAndNegativeNumberInArrays();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter how many numbers you want in the array");
	int input = scanner.nextInt();
	int[] array = new int[input];

	for (int index = 0; index < array.length; index++) {
		System.out.println("Please enter number " + (index + 1));
		array[index] = scanner.nextInt();
	}
	postiveAndNegativeNumberInArrays.findPositiveandNegative(array);
	System.out.println("Difference between positve number and negative number :"+postiveAndNegativeNumberInArrays.difference0fPostiveAndNegativenuber(array));
	scanner.close();
}
}