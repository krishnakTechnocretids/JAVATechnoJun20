package technoCredits.exceptionExample;

import java.util.Scanner;

public class Example1 {

	void display(int x) {
		int z = 0;
		System.out.println(1);
		System.out.println(2);
		z = 10/x; // Arithmetic
		System.out.println(z);
		
	}
	
	void m1() {
		int[] arr = {10,20,30};
		for(int index=0;index<=3;index++) {
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		//Example1 ex1 = null;
		//ex1.m1();
		
		String msg = "Hi";
		int x = Integer.parseInt(msg);
		System.out.println("end");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	}
}
