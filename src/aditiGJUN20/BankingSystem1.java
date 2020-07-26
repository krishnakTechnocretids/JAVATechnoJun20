package aditiGJUN20;

public class BankingSystem1 {

	public BankingSystem1() {
		userCount++;
	}

	static int totalDebitCount, totalCreditCount, userCount;
	int userDebits, userCredits, balance;
	String userName;

	void setInitialBalance(String name, int amount) {
		userName = name;
		balance = amount;
		System.out.println("\nOpening balance is: " + balance + "Rs");
	}

	int debitAmount(int debitAmount) {
		if (debitAmount <= balance) {
			balance -= debitAmount;
			userDebits++;
			totalDebitCount++;
		} else {
			System.out.println("Insufficient Balance, can not withdraw money");
		}

		return balance;
	}

	int creditAmount(int creditedAmount) {
		if (creditedAmount <= 0) {
			System.out.println("Please enter valid amount value.. ");
		} else {
			balance += creditedAmount;
			userCredits++;
			totalCreditCount++;
		}
		return balance;
	}

	void display() {
		System.out.println("\nCustomer Transaction Summary: \n Customer Name: " + userName + "\n Total Credits: "
				+ userCredits + " times\n Total Debits: " + userDebits);
	}

	void displayAll() {
		System.out.println("\nAll Transaction Summary:" + "\nTotal Users till now:" + userCount + "\n Total Credits: "
				+ totalCreditCount + " times\n Total Debits: " + totalDebitCount);
	}

	public static void main(String[] args) {
		BankingSystem1 bank1 = new BankingSystem1();
		BankingSystem1 bank2 = new BankingSystem1();
		BankingSystem1 bank3 = new BankingSystem1();

		// User1 Transaction..
		bank1.setInitialBalance("Ananya", 50000);
		bank1.creditAmount(2000);
		bank1.debitAmount(1000);
		bank1.creditAmount(100);
		bank1.display();
		// User2 Transaction..
		bank2.setInitialBalance("Nimita", 90000);
		bank2.creditAmount(2000);
		bank2.creditAmount(2000);
		bank2.debitAmount(1000);
		bank2.creditAmount(2000);
		bank2.creditAmount(2000);
		bank2.creditAmount(100);
		bank2.debitAmount(50710);
		bank2.display();
		// User3 Transaction..
		bank3.setInitialBalance("Ramya", 500);
		bank3.display();

		bank3.displayAll();
	}
}
