package aavrutiDJun20;

public class BankingSystem {

	int user2printBalCount = 0;
	int currentBalance = 0;
	int debitCount = 0;
	int creditCount = 0;
	int printBalanceCount = 0;
	static int allUsersDebitCnt;
	static int allUsersCreditCnt;
	static int allUsersPrintBalance;
	
	int amountCreditedByUser(int userCreditAmount) {
		if(userCreditAmount>=0) {
			currentBalance = currentBalance + userCreditAmount;
			System.out.println("Credit Amount : " + userCreditAmount );
			allUsersCreditCnt++;
			return ++creditCount;
		}
		else {
			System.out.println("Please enter credit amount more than 0");
			return creditCount;
		}
	}
	
	int amountDebitedByUser(int userDebitAmount) {
		if(userDebitAmount>=0 && userDebitAmount<=currentBalance) {
			allUsersDebitCnt++;
			System.out.println("Debit Amount  : " + userDebitAmount );
			currentBalance = currentBalance - userDebitAmount;
			return ++debitCount;
		}
		else {
			System.out.println("Please enter valid debit amount it should not excess current balance.");
			return debitCount;
		}
	}
	
	int printBalance(String userName) {
		allUsersPrintBalance++;
		System.out.println("\nCurrent Balance of " + userName + " is: " + currentBalance);
		return ++printBalanceCount;
	}
	
	void individualTransactionSummary(String userName,int userCreditCount,int userDebitCount,int userprintBalCount) {
		System.out.println("\n" + userName +"'s Transaction Summary: Credit - " + userCreditCount + " times" + "  Debit - " + userDebitCount + " times " + "  Print Balance - " + userprintBalCount + " time \n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	void allTransactionSummary() {
		System.out.println("All Transaction Summary  : Credit - " + allUsersCreditCnt + " times" + "  Debit - " + allUsersDebitCnt + " times " + "  Print Balance - " + allUsersPrintBalance + " time ");		
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		
		System.out.println("Aayushi's Banking transactions are as below: \n");
		//User1 banking transactions
		int userCreditCount = bankingSystem1.amountCreditedByUser(100000);
		int userDebitCount = bankingSystem1.amountDebitedByUser(5000);
		userCreditCount = bankingSystem1.amountCreditedByUser(1000);
		int userPrintBalCount = bankingSystem1.printBalance("Aayushi");	
		
		
		//print User1 Details
		bankingSystem1.individualTransactionSummary("Aayushi",userCreditCount,userDebitCount,userPrintBalCount);
		
		System.out.println("Shivam's Banking transactions are as below: \n");
		userCreditCount = bankingSystem2.amountCreditedByUser(10000);
		userDebitCount = bankingSystem2.amountDebitedByUser(5000);
		userCreditCount = bankingSystem2.amountCreditedByUser(9000);
		userDebitCount = bankingSystem2.amountDebitedByUser(5000);
		userCreditCount = bankingSystem2.amountCreditedByUser(9000);
		userCreditCount = bankingSystem2.amountCreditedByUser(200);
		userCreditCount = bankingSystem2.amountCreditedByUser(500);
		
		//Print User2 Details
		bankingSystem2.individualTransactionSummary("Shivam",userCreditCount,userDebitCount,bankingSystem2.user2printBalCount);
		
		//Print all users Transaction Summary
		bankingSystem2.allTransactionSummary();
		
	}	
}