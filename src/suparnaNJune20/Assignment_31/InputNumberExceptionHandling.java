package suparnaNJune20.Assignment_31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberExceptionHandling {
	int sum = 0, cnt = 0, inputNo = 0;;

	public void sumOfNumber(int inputCnt) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer inputStr = new StringBuffer("");
		for (cnt = 1; cnt <= inputCnt; cnt++) {

			try {
				System.out.println("Enter " + cnt + " input Number ");
				inputNo = scanner.nextInt();
				sum += inputNo;
				inputStr = inputStr.append(inputNo);
				inputStr = inputStr.append(" , ");

			} catch (InputMismatchException inputMismatchException) {
				System.out.println("Enter Number input not a string  ");
				cnt--;
				inputStr = inputStr.append(scanner.next());
				inputStr = inputStr.append(" , ");
			}
		}
		inputStr = inputStr.deleteCharAt(inputStr.lastIndexOf(","));
		System.out.println("Input = " + inputStr);
		System.out.println("Sum = " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of count of number  to find sum");
		new InputNumberExceptionHandling().sumOfNumber(scanner.nextInt());
	}
}
