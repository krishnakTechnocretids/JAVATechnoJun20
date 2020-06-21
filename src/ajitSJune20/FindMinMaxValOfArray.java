package ajitSJune20;

import java.util.Scanner;

public class FindMinMaxValOfArray {
	
	  // Method for getting the maximum value
	   int getMax(int[] array){ 
	    int maxValue = array[0]; 
	    for(int index=1;index < array.length;index++){ 
	      if(array[index] > maxValue){ 
	         maxValue = array[index]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	   int getMin(int[] array){ 
	   int minValue = array[0]; 
	    for(int index=1;index<array.length;index++){ 
	      if(array[index] < minValue){ 
	        minValue = array[index]; 
	      } 
	    } 
	    return minValue; 
	  } 

	public static void main(String[] args) {
		FindMinMaxValOfArray findMinMaxValOfArray = new FindMinMaxValOfArray();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Elements you want in Array");
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.print("Please enter " + size + " Elements in the Array:\n");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}

		System.out.print("Elements of the array are :");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " , ");
		}
		
		int minValue=findMinMaxValOfArray.getMax(array);
		System.out.println("\n\nMaximun Value of Array is : "+minValue);
		
		int maxValue=findMinMaxValOfArray.getMin(array);
		System.out.println("Minimun Value of Array is : "+maxValue);
		
		scanner.close();
	}
}
