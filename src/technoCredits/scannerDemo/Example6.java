package technoCredits.scannerDemo;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name : ");
		String fullName = scanner.nextLine();
		System.out.println("Enter roll number : ");
		int rno = scanner.nextInt();
		System.out.println(fullName);
	}
}
