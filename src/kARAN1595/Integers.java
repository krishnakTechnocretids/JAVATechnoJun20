package kARAN1595;
/*
Program 2 : 
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
     Output -> 16
 */
import java.util.Scanner;

public class Integers {

	void findPositiveNegativeNos(int[] input) {
		int countPostiveInteger = 0;
		int countNegativeInteger = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0)
				countNegativeInteger++;
			else
				countPostiveInteger++;
		}
		System.out.println("Total  postive: " + countPostiveInteger + " and Negative numbers: " + countNegativeInteger);
	}

	int getDifference(int[] input) {
		int difference = 0;
		for (int index = 0; index < input.length; index++) {
			difference += input[index];
		}
		return difference;
	}

	public static void main(String[] args) {
		Integers Integers = new Integers();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		do {
			System.out.print("How many elements you need in an array enter? : ");
			int size = scanner.nextInt();
			int[] input = new int[size];
			for (int index = 0; index < input.length; index++) {
				System.out.print("Enter integer " + (index + 1) + " : ");
				input[index] = scanner.nextInt();
			}
			Integers.findPositiveNegativeNos(input);
			System.out.println("Diference of positive & negative number sum = " + Integers.getDifference(input));
			System.out.println("\nPress yes if you want to continue:");
			status = scanner.next();
		} while (status.equalsIgnoreCase("yes"));
		scanner.close();
	}
}