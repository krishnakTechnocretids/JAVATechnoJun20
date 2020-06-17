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
	int balance;

	static int totaldebitcounts;
	static int totalcreditcounts;
	static int totalprintbalcounts;
	
	void setBalance(int bal) {
		balance = bal;
		System.out.println("Initial Balance Amount is : "+balance);
	}

	void debitAmount(int dbtamount) {
		System.out.println("User wants to debit: "+dbtamount);
		
		if(balance >=dbtamount) {
			balance=balance -  dbtamount;
			System.out.println("User debited: "+dbtamount);
		}
		else
			System.out.println("Insufficient balance!");
		
		debitcounts++;
		totaldebitcounts++;
	}

	void creditAmount(int crdtamount) {
		balance=balance + crdtamount;
		System.out.println("User credited: "+crdtamount);
		creditcounts++;
		totalcreditcounts++;
	}

	void printBalance() {
		System.out.println("Remining balance: "+balance);
		printbalancecounts++;
		totalprintbalcounts++;
	}

	void individualTransactionSummary() {
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
		System.out.println("Transaction summary for user Amit");
		bankingsystem1.setBalance(1000);
		bankingsystem1.debitAmount(1000);
		bankingsystem1.printBalance();
		bankingsystem1.debitAmount(500);
		bankingsystem1.creditAmount(500);
		bankingsystem1.printBalance();
		bankingsystem1.individualTransactionSummary();

		// Banking for user Sarika
		System.out.println("Transaction summary for user Sarika");
		bankingsystem2.setBalance(2000);
		bankingsystem2.creditAmount(200);
		bankingsystem2.creditAmount(500);
		bankingsystem2.creditAmount(200);
		bankingsystem2.creditAmount(500);
		bankingsystem2.printBalance();
		bankingsystem2.debitAmount(1500);
		bankingsystem2.printBalance();
		bankingsystem2.individualTransactionSummary();

		allTransactionSummary();

	}
}
