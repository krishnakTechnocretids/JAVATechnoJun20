/*
 * Assignment 8 : 16th Jun 2020

Create a Banking System which has following functionality.

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time 
*/

package aditiGJUN20;

class BankingSystem {
	
	static int totalDebitCount, totalCreditCount, totalStatementPrintCount;
	int userDebits, userCredits, userStatementPrints, balance;
	 
	String userName;
	
	// Method to set Initial Balance/ Account opening balance..  
	void setInitialBalance(String name, int amount) {
		userName=name;
		balance=amount;
		System.out.println("\nOpening balance of customer "+userName+ " is: "+balance+"Rs");
	}
	
	// Method to Debit amount + Condition check for insufficient balance..
	int debitAmount(int debitAmount){
		if(debitAmount <= balance) {
			balance-=debitAmount;
			userDebits++;
			totalDebitCount++;
		}
		else {
			System.out.println("Insufficient Balance, can not withdraw money");
		}
	
		return balance;
	}
	
	// Method to Credit amount + check for valid input.. 
	int creditAmount(int creditedAmount) {
		if(creditedAmount<=0) {
			System.out.println("Please enter valid amount value.. ");
		}
		else {
		balance+=creditedAmount;
		userCredits++;
		totalCreditCount++;
		}
		return balance;
	}
	
	// Method to Print mini statement..
	void printBalance() {
		System.out.println("\n--- Mini Statement---\nCurrent balance of Customer("+userName+") is: "+balance+"Rs");
		userStatementPrints++;
		totalStatementPrintCount++;
	}
	
	// Method to display individual user's transaction summary.. 
	int userTransactionSummary() {
		System.out.println("\nCustomer Transaction Summary: \n Customer Name: "+userName+"\n Total Credits: "+userCredits+" times\n Total Debits: "+userDebits+ " times\n Printed Mini Statement/s: "+userStatementPrints+" times");
		return balance;
	}
	
	// Method to display all transaction activity count..
	int allTransactionSummary() {
		System.out.println("\nAll Transaction Summary:\n Total Credits: "+totalCreditCount+" times\n Total Debits: "+totalDebitCount+ " times\n Printed Mini Statement/s: "+totalStatementPrintCount+" times");
		return balance;
	}
	
	// Main Method..
	public static void main(String[] args) {
	
		BankingSystem bank1 = new BankingSystem();
		BankingSystem bank2 = new BankingSystem();
		
		// User1 Transaction..
		bank1.setInitialBalance("Aditi",50000);
		bank1.creditAmount(2000);
		bank1.debitAmount(1000);
		bank1.creditAmount(100);
		bank1.printBalance();
		bank1.userTransactionSummary();
		
		// User2 Transaction..
		bank2.setInitialBalance("Nayan",500000);
		bank2.creditAmount(2000);
		bank2.creditAmount(2000);
		bank2.debitAmount(1000);
		bank2.creditAmount(2000);
		bank2.creditAmount(2000);
		bank2.creditAmount(100);
		bank2.debitAmount(50710);
		bank2.userTransactionSummary();
		
		// Total Transactions..
		bank1.allTransactionSummary();
	}

}
