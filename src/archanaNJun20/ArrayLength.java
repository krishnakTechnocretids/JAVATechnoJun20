package archanaNJun20;

import java.util.Scanner;

public class ArrayLength {
	void printMaximumlength(String[] array){
		int index=0;
		int maxLength=array[0].length();
		String longString=array[0];
		for( index=0;index<array.length;index++){
			if(array[index].length()>maxLength) {
				maxLength=array[index].length();
				longString=array[index];
			}

		}
		System.out.println("Maximum string "+longString +"length is"+maxLength);
	}

	public static void main(String[] args) {
		ArrayLength arraylength=new ArrayLength();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=scanner.nextInt();

		String[] array=new String[size];
		for(int index=0;index<size;index++){
			System.out.println("Enter NAME "+ (index+1) + ":");
			array[index]=scanner.next();
		}
		arraylength.printMaximumlength(array);
		scanner.close();
	}
}
