package technoCredits.scannerDemo;

import java.util.Scanner;

import suparnaNJune20.Emp;

public class Example4 {
	int balance = 10000;
	
	void debit(int amount) {
		if(balance>=amount) {
			balance -= amount;
			System.out.println("Now remaining balance is " + balance);
		}else {
			System.out.println("Insufficient balance,you asked for " + amount + " but your balance is " + balance);
		}
	}
	
	public static void main(String[] args) {
		Example4 example3 = new Example4();
		Scanner scanner = new Scanner(System.in);
		String status = "Yes";
		while(status.equals("Yes")){
			System.out.println("Enter amount to be debited : ");
			int amount = scanner.nextInt();
			example3.debit(amount);
			System.out.println("Do you want to continue ? Yes/No");
			status = scanner.next();
		}
		System.out.println("Program end");
	}
}
