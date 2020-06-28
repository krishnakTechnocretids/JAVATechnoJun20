/*Program 1 :
A) Find maximum number from user given array [use scanner class to take numbers and size of an array]
B) Find minimum number from user given array [use scanner class to take numbers and size of an array] */

package amitaRJun20;

import java.util.Scanner;

public class FindMaxMinNumberInArray {
	
	void maximumNumber(int[] array) {
		int max=array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]>max)
				max=array[index];
		}
			System.out.println("the maximum number in the array is :"+max);
		}
	void minimumNumber(int[] array) {
		int min=array[0];
		for(int index=0;index<array.length;index++) {
			if(array[index]<min)
				min=array[index];
		}
			System.out.println("the minimum number in the array is :"+min);
		}

	public static void main(String[] args) {
		FindMaxMinNumberInArray findmaxminnumber=new FindMaxMinNumberInArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many elements you want in the array");
		int input=scanner.nextInt();
		int[] array = new int[input];
			
		for(int index=0;index<array.length;index++) {
			System.out.println("Please enter number "+(index+1));
			array[index]=scanner.nextInt();
		}
			findmaxminnumber.maximumNumber(array);
			findmaxminnumber.minimumNumber(array);
	}

}
