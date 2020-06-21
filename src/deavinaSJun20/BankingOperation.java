package deavinaSJun20;

public class BankingOperation {
	int printBalCount;
	int currentBalance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int usersDebitCount;
	static int usersCreditCount;
	static int usersPrintBalance;

	void amountCreditedByUser(int userCreditAmount) {
		if (userCreditAmount > 0) {
			currentBalance = currentBalance + userCreditAmount;
			System.out.println("Credited : " + userCreditAmount);
			usersCreditCount++;
			creditCount++;
		} else {
			System.out.println("You are trying to credit " + userCreditAmount
					+ " which is not more than 0. Please enter correct amount.");
		}
	}

	void amountDebitedByUser(int userDebitAmount) {
		if (userDebitAmount >= 0 && userDebitAmount <= currentBalance) {
			usersDebitCount++;
			System.out.println("Debited  : " + userDebitAmount);
			currentBalance = currentBalance - userDebitAmount;
			debitCount++;
		} else {
			System.out.println(" You are trying to debit " + userDebitAmount
					+ " which is greater than the current balance.Please enter correct amounta");
		}
	}

	void printBalance(String userName) {
		usersPrintBalance++;
		System.out.println("\nCurrent Balance of " + userName + " is: " + currentBalance);
		printBalanceCount++;
	}

	void individualTransactionSummary(String userName) {
		System.out.println("\n" + userName + "'s Transaction Summary: Credited " + creditCount + " times" + "  Debited "
				+ debitCount + " times " + "Balance Printed " + printBalanceCount + " times \n");
		System.out.println("--------------------------------------");
	}

	void allTransactionSummary() {
		System.out.println("All Transaction Summary  : Credited " + usersCreditCount + " times" + "  Debited "
				+ usersDebitCount + " times " + "Balance Printed " + usersPrintBalance + " times ");
	}

	public static void main(String[] args) {
		BankingOperation bankingOperation1 = new BankingOperation();
		BankingOperation bankingOperation2 = new BankingOperation();
		System.out.println("Atul's Banking transactions are as below: \n");
		// User1 banking credit, debit and print bank balance transactions
		bankingOperation1.amountCreditedByUser(99999);
		bankingOperation1.amountDebitedByUser(4312);
		bankingOperation1.amountCreditedByUser(513);
		bankingOperation1.printBalance("Atul");
		// print User1 Details of credit, debit and print bank balance transactions
		bankingOperation1.individualTransactionSummary("Atul");
		System.out.println("Deavina's Banking transactions are as below: \n");
		// User2 banking credit, debit and print bank balance transactions
		bankingOperation2.amountCreditedByUser(1101);
		bankingOperation2.amountDebitedByUser(5000);
		bankingOperation2.amountCreditedByUser(9838);
		bankingOperation2.amountDebitedByUser(1234);
		bankingOperation2.amountCreditedByUser(24234);
		bankingOperation2.amountCreditedByUser(-12);
		bankingOperation2.amountCreditedByUser(13354);
		// Print User2 Details of credit, debit and print bank balance transactions
		bankingOperation2.individualTransactionSummary("Deavina");
		// Print all users Transaction Summary of credit, debit and print bank balance
		bankingOperation2.allTransactionSummary();
	}
}