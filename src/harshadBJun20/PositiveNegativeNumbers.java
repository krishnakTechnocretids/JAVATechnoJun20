package harshadBJun20;

/*Program 2 : 
Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
Time : 25 mins]*

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

public class PositiveNegativeNumbers{

	void findPositiveNegativeNumbers(int[] num){
		int countOfPositive=0,countOfNegative=0;;
		for(int index=0;index<num.length;index++){
			if(num[index]>=0){
				countOfPositive++;
			}
			else if(num[index]<0){
				countOfNegative++;
			}
		}
		System.out.println();
		System.out.println("The count of Positive numbers is: "+countOfPositive);	
		System.out.println("The count of Negative numbers is: "+countOfNegative);	
		System.out.println();
	}

	int sumOfPositiveAndNegativeNumber(int[] num){
		/*int sumOfPositiveAndNegative=0;
		for(int index=0;index<num.length;index++){
			sumOfPositiveAndNegative+=num[index];
		}
		System.out.println("The difference and sum of Positive & Negative numbers is: "+sumOfPositiveAndNegative);	
		System.out.println();*/

		int sumOfNumber=0;
		for(int index=0;index<num.length;index++){
			if(num[index]>=0)
				sumOfNumber+=num[index];
			else
				sumOfNumber+=num[index];
		}
		return sumOfNumber;
	}

	public static void main(String[] args) {
		PositiveNegativeNumbers positiveNegativeNumbers = new PositiveNegativeNumbers();
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter how many numbers you want to store in array: ");
		size = sc.nextInt();
		int[] numbers = new int[size];

		for(int index=0;index<size;index++){
			System.out.println("Enter number "+(index+1)+ ": ");
			numbers[index]=sc.nextInt();
		}

		positiveNegativeNumbers.findPositiveNegativeNumbers(numbers);
		//positiveNegativeNumbers.sumOfPositiveAndNegativeNumber(numbers);
		System.out.println("Result:"+positiveNegativeNumbers.sumOfPositiveAndNegativeNumber(numbers));
		sc.close();

	}
}
