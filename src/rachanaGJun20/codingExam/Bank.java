//Coding Exam 7 display number of users and operation performed by users
package rachanaGJun20.codingExam;

import java.util.ArrayList;

public class Bank {
	int debitCount;
	int creditCount;
	static int totalDebitCount;
	static int totalCreditCount;
	String name;

	Bank(String name) {

		this.name = name;
	}

	void debit() {
		debitCount++;
		totalDebitCount++;
	}

	void credit() {
		creditCount++;
		totalCreditCount++;
	}

	void display() {
		System.out.println("Debit count by " + name + "  " + debitCount);
		System.out.println("Credit count by " + name + " " + creditCount);
	}

	static void displayAllInfo() {
		System.out.println("Total Debit operations performed: " + totalDebitCount);
		System.out.println("Total Credit operations performed: " + totalCreditCount);
	}
	
	public static void main(String[] args) {
		ArrayList<Bank> bankUsers = new ArrayList<Bank>();
		bankUsers.add(new Bank("bankUser1"));
		bankUsers.add(new Bank("bankUser2"));
		bankUsers.add(new Bank("BankUser3"));
		System.out.println("Number of users :" + bankUsers.size());
		for (int index = 0; index < bankUsers.size(); index++) {
			bankUsers.get(index).debit();
			bankUsers.get(index).credit();
			bankUsers.get(index).display();
		}
		displayAllInfo();
	}
}
