package suparnaNJune20.Assignment16;

import java.util.Scanner;

public class CharOperationOnArray {
	void oneCharFreq(String Name, String chr) {
		int cnt = 0;
		for (int i = 0; i < Name.length(); i++) {
			String temp = String.valueOf(Name.charAt(i));
			if (temp.equals(chr)) {
				cnt++;
			}
		}
		if (cnt != 0)
			System.out.println(" - Given Character " + chr + " is present " + cnt + " times in a given name: " + Name);
		else
			System.out.println(" - Given Character " + chr + " is not present in a given name: " + Name);
	}

	void AllCharFreq(String Name) { // aabc

		for (int i = 0; i < Name.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < Name.length(); j++) {
				if (Name.charAt(i) == Name.charAt(j)) {
					cnt++;
				}
			}
			System.out.println(" - " + Name.charAt(i) + " > " + cnt);
		}
	}

	void AllCharFreqArray(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			AllCharFreq(arr[i]);
			System.out.println("=======================");
		}
	}

	public static void main(String[] args) {
		int usechoice =0;
		CharOperationOnArray charactercounting = new CharOperationOnArray();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		do {
		System.out.println("MainMenu\n 1. Find one character frequency from given name\n 2. Find all character frequency from given name\n 3.Find all character frequency from each name given in String array\n 0.Exit");
		System.out.println("Please enter your choice");
		usechoice = scanner.nextInt();
		
		switch(usechoice) {
			case 1:{
				System.out.println("Please enter a String");
				String stringname= scanner.next();
				System.out.println("Enter charater");
				String ch = scanner.next();
				charactercounting.oneCharFreq(stringname,ch);
				break;
			}
			case 2:{
				System.out.println("Please enter a String");
				String stringname= scanner.next();
				charactercounting.AllCharFreq(stringname);
				break;
			}
			case 3:{
				System.out.println("Enter how many Strings you want");
				int size=scanner.nextInt();
				System.out.println("Enter strings");
				String[] stringArray = new String[size];
				for(int i=0;i<size;i++) {
					stringArray[i]=scanner.next();
				}
				charactercounting.AllCharFreqArray(stringArray);
				break;
			}
			case 0: break;
			
			default:
				System.out.println("invalid output!");
	}
		}while(usechoice != 0);
}
	}