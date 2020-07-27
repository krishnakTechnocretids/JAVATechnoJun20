/*
 Exam-7:
Q1) class User{

	void debit(){
	}

	void credit(){
	}
}		 

output : Users -> 3
User1 -> total debit
User1 -> total credit

Total --> total debit & total credit
*/
 
package ajitSJune20;
import java.util.ArrayList;

public class BankingSystemOps {
	int debitCount,creditCount;
	static int totalDebitCount, totalCreditCount;
	String name;

	BankingSystemOps(String name) {
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
		System.out.println("Debit  count of " + name + " : " + debitCount);
		System.out.println("Credit count of " + name + " : " + creditCount);
	}

	static void displayAllInfo() {
		System.out.println("====================================");
		System.out.println("Total Debit  operations performed: " + totalDebitCount);
		System.out.println("Total Credit operations performed: " + totalCreditCount);
	}

	public static void main(String[] args) {
		ArrayList<BankingSystemOps> bankUsers = new ArrayList<BankingSystemOps>();
		bankUsers.add(new BankingSystemOps("User1"));
		bankUsers.add(new BankingSystemOps("User2"));
		bankUsers.add(new BankingSystemOps("User3"));
		System.out.println("Total Users : " + bankUsers.size() + "\n==========================");
		for (int index = 0; index < bankUsers.size(); index++) {
			bankUsers.get(index).debit();
			bankUsers.get(index).credit();
			bankUsers.get(index).display();
		}
		displayAllInfo();
	}
}