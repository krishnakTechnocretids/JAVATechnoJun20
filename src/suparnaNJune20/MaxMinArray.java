package suparnaNJune20;
import java.util.Scanner;
public class MaxMinArray {
	Scanner scanner = new Scanner(System.in);
	void  setArray(int[] intArray, int arraySize)
	{
		for (int i=0 ; i< arraySize; i++)
		{
			System.out.println("Enter value of  index [ " +(i+1)+" ]");
			intArray[i]= scanner.nextInt();
		}
	}
	void  getArray(int[] intArray, int arraySize)
	{
		for (int i=0 ; i< arraySize; i++)
		{
			System.out.println("Value of  index [ " +(i+1)+" ] = " + intArray[i] );
		}
	}
	void getMaxMinNo (int[] intArray)
	{
		int max = intArray[0], min = intArray[0];;
		for (int i = 1;  i< intArray.length; i++)
		{
			if(max < intArray[i])
				max = intArray[i];
		}
		for (int i = 1;  i< intArray.length; i++)
		{
			if(min > intArray[i])
				min = intArray[i];
		}
		System.out.println("Maximum  no = :"+ max);
		System.out.println("Minimun no = :"+ min);
	}
	public static void main(String[] agrs) {
		int arraySize =0 ;
		MaxMinArray array = new MaxMinArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array size ");
		arraySize= scanner.nextInt();
		if(arraySize < 1)
		{
			System.out.println("Array size should be greater than 1  ");
			return;
		}
		int[] intArray = new int[arraySize];
		array.setArray(intArray,arraySize);
		array.getArray(intArray,arraySize);
		array.getMaxMinNo(intArray);
	}
}
