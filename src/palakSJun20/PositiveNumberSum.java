package palakSJun20;

import java.util.Scanner;

public class PositiveNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int count=0;
		do {
			System.out.println("Enter the Number for sum ");
			int number = sc.nextInt();
			if(number > 0) {
				count++;
				sum = sum + number;
					if(count == 3)
						break;
			}
			else 
				System.out.println("Invalid Number");
	    }
		while(count<3);
			System.out.println("Sum is " +sum);
			sc.close();
	}

}
