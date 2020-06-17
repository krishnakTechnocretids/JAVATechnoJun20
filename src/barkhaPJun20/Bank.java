package barkhaPJun20;

public class Bank {
	int debitCount;
	int creditCount;
	int balanceCount;
	static int overallDebitCount;
	static int overallCreditCount;
	static int overallBalanceCount;
	int currentBalance;
	int user;
	void setInitialAmnt(int uID,int Amnt){
		user=uID;
		currentBalance=Amnt;
	}
	void debitAmount( int dAmnt){
		currentBalance=currentBalance-dAmnt;
		debitCount++;
		overallDebitCount++;
	}	
	void creditAmount( int cAmnt){
		currentBalance=currentBalance+cAmnt;
		creditCount++;
		overallCreditCount++;
	}		
	void printBalance(){
		System.out.println();
		System.out.println("Final Amount is: "+currentBalance +" for customer "  +user);
		balanceCount++;
		overallBalanceCount++; 
	}
	void individualTransactionSummary(){
		System.out.println();
		System.out.println("Customer" +user +" Transaction Summary: Debit "  +debitCount +" times, Credit " +creditCount +" times, Print balance "+balanceCount);
	}	
	void allTransactionSummary(){
		System.out.println();
		System.out.println("Overall Transaction by both users");
		System.out.println ("Overall Credit done " +overallCreditCount);
		System.out.println ("Overall Debit done" +overallDebitCount);
		System.out.println ("Overall Print Balance done " +overallBalanceCount);
	}
	public static void main(String[] args){
		Bank bank1=new Bank();
		bank1.setInitialAmnt(1,1000);
		bank1.debitAmount(50);
		bank1.creditAmount(500);
		bank1.creditAmount(300);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		Bank bank2=new Bank();
		bank2.setInitialAmnt(2,2000);
		bank2.debitAmount(190);
		bank2.debitAmount(75);
		bank2.creditAmount(700);
		bank2.creditAmount(70);
		bank2.creditAmount(200);
		bank2.creditAmount(100);
		bank2.creditAmount(90);
		bank2.printBalance();
		bank2.individualTransactionSummary();
		bank2.allTransactionSummary();
	}
}				
	
	
	
	
	
	
	
		
		
		
	


	
	
	
	

		
	
	
	
	
	