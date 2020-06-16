/*
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

package nikhilMJun20;

public class BankingSystem {
	String custName;
	int creditCalled, debitCalled, balancePrintCalled;
	static int totalCreditCalled, totalDebitCalled, totalBalancePrintCalled;
	
	void credit() {
		creditCalled++;
		totalCreditCalled++;
	}
	
	void debit() {
		debitCalled++;
		totalDebitCalled++;
	}
	
	void balancePrint() {
		balancePrintCalled++;
		totalBalancePrintCalled++;
	}
	
	void individualTransactionsSummary() {
		System.out.println("\nTransaction Summary for "+custName+":-\nCredits: "+creditCalled+"\nDebits: "+debitCalled+"\nBalance Printed: "+balancePrintCalled);
	}
	
	void allTransactionSummary() {
		System.out.println("\nComplete Transaction Summary for the Banking System:-"+"\nTotal Credits: "+totalCreditCalled+"\nTotal Debits: "+totalDebitCalled+"\nTotal Balance Printed: "+totalBalancePrintCalled);
	}
	
	static void allTransactionStats() {
		System.out.println("\nComplete Transaction Summary for the Banking System (Using static method):-"+"\nTotal Credits: "+totalCreditCalled+"\nTotal Debits: "+totalDebitCalled+"\nTotal Balance Printed: "+totalBalancePrintCalled);
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.custName="Dr. Bruce Banner";
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.custName="Tony Stark";
		
		//bankingSystem1 transactions
		bankingSystem1.credit();
		bankingSystem1.credit();
		bankingSystem1.debit();
		bankingSystem1.balancePrint();
		
		bankingSystem1.individualTransactionsSummary();
		
		//bankingSystem2 transactions
		bankingSystem2.credit();
		bankingSystem2.debit();
		bankingSystem2.balancePrint();
		bankingSystem2.debit();
		bankingSystem2.balancePrint();
		
		bankingSystem2.individualTransactionsSummary();
		
		//Calling allTransactionSummary method with object reference
		bankingSystem1.allTransactionSummary();
		
		//Calling allTransactionStats static method without any reference object
		allTransactionStats();
	}
}
