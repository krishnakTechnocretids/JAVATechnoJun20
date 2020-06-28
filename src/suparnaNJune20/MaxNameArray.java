package suparnaNJune20;

import java.util.Scanner;

public class MaxNameArray {

	Scanner scanner = new Scanner(System.in);
	void  setArray(String[] stringArray)
	{
		for (int i=0 ; i< stringArray.length ; i++)
		{
			System.out.println("Enter Name  for   index [ " +(i+1)+" ]");
			stringArray[i]= scanner.next();
		}
	}
	void  getArray(String[] stringArray)
	{
		for (int i=0 ; i< stringArray.length; i++)
		{
			System.out.println("Name store at  index [ " +(i+1)+" ] = " + stringArray[i] );
		}
	}
	void getMaxString (String[] stringArray)
	{
		int maxLen =stringArray[0].length();
		String maxString = stringArray[0];
		for (int i = 1;  i<stringArray.length; i++)
		{
			if(maxLen < stringArray[i].length())
			{
				maxLen = stringArray[i].length();
			maxString = stringArray[i];
		}
		}
		System.out.println("Max length String = " + maxString + " having lenght = "+ maxLen );
	}
	public static void main(String[] agrs) {
		int arraySize =0 ;
		MaxNameArray array = new  MaxNameArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total no of names need to store in array ");
		arraySize= scanner.nextInt();
		if(arraySize < 1)
		{
			System.out.println("Array size should be greater than 1  ");
			return;
		}
		String[] stringArray = new String[arraySize];
		array.setArray(stringArray);
		array.getArray(stringArray);
		array.getMaxString (stringArray);
	}
}
