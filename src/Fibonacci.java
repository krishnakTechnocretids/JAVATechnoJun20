import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n, first = 1, next = 1;
		System.out.println(" Enter the value of n : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.print(" Fibonacci Series is : ");
		System.out.print(first + " " + next);
		for (int i = 1; i <= n - 2; i++) {
			int sum = first + next;
			first = next;
			next = sum;
			System.out.print(" " + sum);
		}
		scanner.close();
	}

}