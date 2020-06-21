package anshuKJun20;

import java.util.Scanner;

public class NumberArrayOperation {
	static Scanner scanner = new Scanner(System.in);
	
public static void main(String[] args){
	
	NumberArrayOperation arrayoperatio = new NumberArrayOperation();
	System.out.println("How many element you want to Enter");
	int num = scanner.nextInt();
	
	int[] intArray = new int[num];//array length.
	arrayoperatio.insertArrayElement(intArray);
	 int maxnum=arrayoperatio.getMaxNumber(intArray);
   System.out.println("Maximun Number is "+maxnum);
}
void insertArrayElement(int[] intArray)
{
	for(int index=0;index<intArray.length;index++) {
		System.out.println("Enter Number "+(index+1));
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
