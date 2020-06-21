package technoCredits.arrayExample;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 1;
		int[] number = new int[3];
		int index = 0;
		
		while(count<=3) {
			System.out.println("Please enter number : ");
			int num = scanner.nextInt();
			if(num>0) {
				number[index] = num;
				index++;
				count++;
			}else {
				System.out.println("-Ve numbers not allowed");
			}
		}
		
		
//		for(;count<=3;) {
//			System.out.println("Please enter number : ");
//			int num = scanner.nextInt();
//			if(num>0) {
//				number[index] = num;
//				index++;
//				count++;
//			}else {
//				System.out.println("-Ve numbers not allowed");
//			}
//		}
		
		
		
		
		for(int i=0;i<number.length;i++) {
			sum += number[i];
		}
		System.out.println("Sum is " + sum);
		
	}
}
