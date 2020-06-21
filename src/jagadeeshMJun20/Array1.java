package jagadeeshMJun20;
import java.util.Scanner;
class Array1 {
//Method to get Largest number from array
	int maxNumber(int[] num) {
	int max=num[0];
	
	for (int index=0; index<num.length; index++) {
			if( num[index] > max ) 
				max = num[index];
	}
	return max;
	}
//Method to get Smallest number from array	
	int minNumber(int[] num) {
	int min=num[0];
	for (int index=0; index<num.length; index++) {
			if( num[index] < min ) 
				min = num[index];	
	}
	return min;
	}
	public static void main (String [] args) {
		Array1 array1 = new Array1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter arry size:");
		int size =scan.nextInt();
		int[] num1 = new int[size];
		int count=0;
		while (count < size)
		{
		System.out.println("Enter the number for  index: " + (count+1));
		num1[count] = scan.nextInt();
		count++;
		}
		scan.close();
		
		System.out.println("Largest number of All is :"+array1.maxNumber(num1));
		System.out.println("Smallest number of All is :"+array1.minNumber(num1));
	}
}