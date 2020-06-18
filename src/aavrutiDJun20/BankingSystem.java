package aavrutiDJun20;

public class BankingSystem {

	int user2printBalCount;
	int currentBalance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int allUsersDebitCnt;
	static int allUsersCreditCnt;
	static int allUsersPrintBalance;
	
	//Amount credited to user, adding amount in balance and printing the amount
	void amountCreditedByUser(int userCreditAmount) {
		if(userCreditAmount>0) {
			currentBalance = currentBalance + userCreditAmount;
			System.out.println("Credit Amount : " + userCreditAmount );
			allUsersCreditCnt++;
			creditCount++;
		}
		else {
			System.out.println("Please enter credit amount more than 0");
		}
	}
	
	//amount taken out from the account, debit amount from the balance and printing the amount
	void amountDebitedByUser(int userDebitAmount) {
		if(userDebitAmount>=0 && userDebitAmount<=currentBalance) {
			allUsersDebitCnt++;
			System.out.println("Debit Amount  : " + userDebitAmount );
			currentBalance = currentBalance - userDebitAmount;
			debitCount++;
		}
		else {
			System.out.println("Please enter valid debit amount it should not excess current balance.");
		}
	}
	
	//Print updated bank balance of the user
	void printBalance(String userName) {
		allUsersPrintBalance++;
		System.out.println("\nCurrent Balance of " + userName + " is: " + currentBalance);
		printBalanceCount++;
	}
	
	//Print transaction summary of particular user
	void individualTransactionSummary(String userName) {
		System.out.println("\n" + userName +"'s Transaction Summary: Credit - " + creditCount + " times" + "  Debit - " + debitCount + " times " + "  Print Balance - " + printBalanceCount + " time \n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	//Print transaction Summary of all the users
	void allTransactionSummary() {
		System.out.println("All Transaction Summary  : Credit - " + allUsersCreditCnt + " times" + "  Debit - " + allUsersDebitCnt + " times " + "  Print Balance - " + allUsersPrintBalance + " time ");		
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		
		System.out.println("Aayushi's Banking transactions are as below: \n");
		//User1 banking credit, debit and print bank balance transactions
		bankingSystem1.amountCreditedByUser(100000);
		bankingSystem1.amountDebitedByUser(5000);
		bankingSystem1.amountCreditedByUser(1000);
		bankingSystem1.printBalance("Aayushi");	
		
		
		//print User1 Details of credit, debit and print bank balance transactions
		bankingSystem1.individualTransactionSummary("Aayushi");
		
		System.out.println("Shivam's Banking transactions are as below: \n");
		//User2 banking credit, debit and print bank balance transactions
		bankingSystem2.amountCreditedByUser(10000);
		bankingSystem2.amountDebitedByUser(5000);
		bankingSystem2.amountCreditedByUser(9000);
		bankingSystem2.amountDebitedByUser(5000);
		bankingSystem2.amountCreditedByUser(9000);
		bankingSystem2.amountCreditedByUser(200);
		bankingSystem2.amountCreditedByUser(500);
		
		//Print User2 Details of credit, debit and print bank balance transactions
		bankingSystem2.individualTransactionSummary("Shivam");
		
		//Print all users Transaction Summary of credit, debit and print bank balance transactions
		bankingSystem2.allTransactionSummary();
		
	}	
}