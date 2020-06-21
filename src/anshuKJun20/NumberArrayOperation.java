package anshuKJun20;

import java.util.Scanner;

public class NumberArrayOperation {
	static Scanner scanner = new Scanner(System.in);
	
public static void main(String[] args){
	
	NumberArrayOperation arrayoperatio = new NumberArrayOperation();
	// Ask for client
	System.out.println("How many elements you want to enter:");
	// Scan Client Output
	int num = scanner.nextInt();
	
	int[] intArray = new int[num];//array length.
	arrayoperatio.insertArrayElement(intArray);
	 int maxnum=arrayoperatio.getMaxNumber(intArray);
   System.out.println("Maximun number is "+maxnum);
}
void insertArrayElement(int[] intArray)
{
	for(int index=0;index<intArray.length;index++) {
		System.out.println("Enter number "+(index+1)+":");
		intArray[index]=scanner.nextInt();
	}
}
int getMaxNumber(int[] intArray) 
{
	int max=intArray[0];
	for(int index=1;index<intArray.length;index++){
		if(max<intArray[index]){
			max=intArray[index];
		}
	}
	 return max;
   }
}
