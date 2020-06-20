package technoCredits.scannerDemo;

import java.util.Scanner;

import suparnaNJune20.Emp;

public class Example3 {
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
		Example3 example3 = new Example3();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter amount to be debited : ");
			int amount = scanner.nextInt();
			example3.debit(amount);
		}
		scanner.close();
	}
}
