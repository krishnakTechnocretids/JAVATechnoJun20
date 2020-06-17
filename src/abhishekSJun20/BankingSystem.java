package abhishekSJun20;
/*Assignment 8 : 16th Jun 2020
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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/
public class BankingSystem {
	String customerName;
	double accBalance;
	int creditCount, debitCount, balancePrintCount;
	static int totalCreditCount, totalDebitCount, totalBalancePrintCount;

		void debitAmount(double subBal) {
		if(subBal <= accBalance) {
			accBalance -= subBal;
			debitCount++;
			totalDebitCount++;
		}else {
			System.out.println("\n"+customerName+"! Insufficient Balance in your account!*");
		}
	}

	void creditAmount(double addBal) {
		creditCount++;
		accBalance += addBal;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Account Balance for "+customerName+": "+accBalance);
		balancePrintCount++;
		totalBalancePrintCount++;
	}

	void individualTransactionSummary() {
		System.out.println("Transaction Summary for "+customerName+":-");
		System.out.println("Credits: "+creditCount);
		System.out.println("Debits: "+debitCount);
		System.out.println("Balance Printed: "+balancePrintCount);
		System.out.println();
	}

	static void allTransactionSummary() {
		System.out.println("Complete Transaction Summary for the Banking System:-");
		System.out.println("Total Credits: "+totalCreditCount);
		System.out.println("Total Debits: "+totalBalancePrintCount);
		System.out.println("Total Balance Printed: "+totalBalancePrintCount);
		System.out.println();
	}

	public static void main(String []args) {
		BankingSystem bankingSystem1=new BankingSystem();
		bankingSystem1.customerName="Radhe";
		//bankingSystem1 transactions
		bankingSystem1.creditAmount(5000.25);
		bankingSystem1.creditAmount(250.50);
		bankingSystem1.debitAmount(1200.50);
		bankingSystem1.printBalance();
        bankingSystem1.individualTransactionSummary();  

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.customerName="Krishna";
		//bankingSystem2 transactions
		bankingSystem2.creditAmount(1100.25);
		bankingSystem2.debitAmount(1350.00);
		bankingSystem2.printBalance();
		bankingSystem2.debitAmount(250.25);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();

		
		BankingSystem.allTransactionSummary();

	}
}