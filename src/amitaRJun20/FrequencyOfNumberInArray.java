package amitaRJun20;

import java.util.Scanner;

public class FrequencyOfNumberInArray {
	
	void frequencyOfNumber(int[] array,int number) {
		int count=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]==number)
				count++;
		}
		if(count!=0)
			System.out.println("The given number "+number+ " is present in array with frequency "+count+" times");		
		else
			System.out.println("The given number "+number+ " is not present in array");	
	}

	public static void main(String[] args) {
		FrequencyOfNumberInArray numberFrequency=new FrequencyOfNumberInArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraySize=sc.nextInt();
		
		int[] array=new int[arraySize];
		for(int index=0;index<array.length;index++) {
			System.out.println("Enter number "+(index+1)+":-->");
			array[index]=sc.nextInt();
		}
		
		String next="";
		do {
		System.out.println("Enter which number frequency you want to see ");
		int number=sc.nextInt();
		numberFrequency.frequencyOfNumber(array, number);
		System.out.println("Do you want to continue ? (y/n))");
		next=sc.next();	
		} 
		while(next.equals("y"));
		sc.close();
	}
}