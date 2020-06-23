package aadeshJun20;

import java.util.Scanner;

public class MaxLengthArray {

	void displayMaxlengthArray(String[] strArray) {
		String max = strArray[0];
		for(int index=1;index<strArray.length;index++) {
			if(strArray[index].length() > max.length())
				max=strArray[index];

	}
		System.out.println("\nThe longest String enetred: "+max+"\nLength: "+max.length());

}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	MaxLengthArray maxLengthArray = new MaxLengthArray();

	System.out.println("How many Strings you want to enter in the array? : ");

	int arrayLength = scanner.nextInt();

	String[] strArray = new String[arrayLength];
	for(int index=0; index < arrayLength; index++) {
		System.out.println("Please enter "+arrayLength+" integers:-");
		strArray[index] = scanner.next();
	}
	scanner.close();



	maxLengthArray.displayMaxlengthArray(strArray);


}
}
