package technoCredits.scannerDemo;

import java.util.Scanner;

// next() nextLine()
public class Example8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rno :");
		int rollNo = scanner.nextInt();
		System.out.println("Full name");
		String x = scanner.nextLine(); // Next line will be considered blank line.
		System.out.println(x + ":" + rollNo);
	}
}
