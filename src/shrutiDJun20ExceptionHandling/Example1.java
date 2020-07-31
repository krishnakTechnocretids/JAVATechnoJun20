package shrutiDJun20ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
//Note : User may enter wrong inputs, make sure program should not break.
public class Example1 {

	void display(int x) {

		int z = 0;
		System.out.println(1);
		;
		System.out.println(2);
		;
		z = 10 / x; // when x = 0, arithmetic exception;
		System.out.println(z);
	}

	void m1() {
		int[] arr = { 10, 20, 30 };
		for (int i = 0; i <= 3; i++) {
			System.out.println(arr[i]);// indexoutofbound
		}

		String msg = "hi";
		int c = Integer.parseInt(msg);
		System.out.println(c); // number format exception
	}

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int count = 1;
	int sum = 0;
	while(count<=3)
		
try{
	System.out.println("Enter Input:"+count);
	int num = scanner.nextInt();
	if(num>=0 || num<0){
	count++;
	sum += num;
	}
}
catch(InputMismatchException ae){
	
	System.out.println("Invalid Input. Please Enter Valid Input(input should be a number):");
	scanner.next();
	
}
	System.out.println(sum);
	scanner.close();
	}
	
	
	
		
}

