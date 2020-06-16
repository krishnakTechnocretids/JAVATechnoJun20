package rachanaGJun20;

/*Create a Banking System which has following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variable will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time */

public class BankingSystem {

	int debitcounts;
	int creditcounts;
	int printbalancecounts;

	static int totaldebitcounts = 0;
	static int totalcreditcounts = 0;
	static int totalprintbalcounts = 0;

	void debitAmount() {
		debitcounts++;
		totaldebitcounts++;
	}

	void creditAmount() {
		creditcounts++;
		totalcreditcounts++;
	}

	void printBalance() {
		printbalancecounts++;
		totalprintbalcounts++;
	}

	void individualTransactionSummary(String username) {
		System.out.println("Transaction Summary for user : " + username);
		System.out.println("Debit: " + debitcounts + "\n" + "Credit: " + creditcounts + "\n" + "print Balance: "
				+ printbalancecounts);
	}

	static void allTransactionSummary() {
		System.out.println("Summary for all transactions:");
		System.out.println("Total Debits: " + totaldebitcounts + "\n" + "Total credits: " + totalcreditcounts + "\n"
				+ "Total print balance: " + totalprintbalcounts);
	}

	public static void main(String[] args) {

		BankingSystem bankingsystem1 = new BankingSystem();
		BankingSystem bankingsystem2 = new BankingSystem();

		// Banking for user Amit
		bankingsystem1.debitAmount();
		bankingsystem1.debitAmount();
		for (int j = 0; j <= 3; j++) {
			bankingsystem1.creditAmount();
		}
		bankingsystem1.printBalance();
		bankingsystem1.individualTransactionSummary("Amit");

		// Banking for user Sarika
		for (int i = 1; i <= 5; i++) {
			bankingsystem2.creditAmount();
		}
		bankingsystem2.debitAmount();
		bankingsystem2.individualTransactionSummary("Sarika");

		allTransactionSummary();

	}
}
