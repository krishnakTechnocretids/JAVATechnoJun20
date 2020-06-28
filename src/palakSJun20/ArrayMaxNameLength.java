package palakSJun20;

import java.util.Scanner;

public class ArrayMaxNameLength {
	
	void FindNameLength(String[] array){
		int maxLength = 0;
		String name = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i].length() > maxLength)
				maxLength = array[i].length();
				name = array[i];
		}
		System.out.println(" Name is "+ name + " and Maximum Length is " +maxLength);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayMaxNameLength maxNameLength = new ArrayMaxNameLength();
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		String[] array = new String[size];
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter the Name");
			array[index] = sc.next();
		}
		maxNameLength.FindNameLength(array);
		
		
		sc.close();

	}

}
