package rajAJun20;

public class BankSystem {

	int balance = 50000;
	int creditCount = 0;
	int debitCount = 0;
	int printBalanceCount = 0;
	static int creditCount1 = 0;
	static int debitCount1 = 0;
	static int printBalanceCount1 = 0;

	void debitAmount(int debit) {
		if(balance >= debit) {
	    balance = balance - debit;
	    debitCount++;
	    debitCount1++;
		}
		else 
			System.out.println("Amount entered is not availaible.Insufficient Balance!!");
	}	
	void creditAmount(int credit) {
		balance = balance + credit;
		creditCount++;	
		creditCount1++;
	}	
	void getCurrentBalance() {
		System.out.println("Current Balance is:"+balance);
		printBalanceCount++;
		printBalanceCount1++;
	}	
	void individualTransactionSummary(){
		System.out.println("Credit - " +creditCount+ " times");
		System.out.println("Debit - " +debitCount+ " times");
		System.out.println("PrintBalance - " +printBalanceCount+ " times");		
	}	
	void allTransactionSummary() {
		System.out.println("Credit - " +creditCount1+ " times");
		System.out.println("Debit - " +debitCount1+ " times");
		System.out.println("PrintBalance - " +printBalanceCount1+ " times");
	}
	public static void main(String[] args) {
		BankSystem banksystem = new BankSystem();
		BankSystem banksystem1 = new BankSystem();
		banksystem.debitAmount(10000);
		banksystem.creditAmount(30000);
		banksystem.creditAmount(5000);		
		banksystem.getCurrentBalance();
		System.out.print("Transaction Summary for User 1 is : ");
		banksystem.individualTransactionSummary();
		System.out.println("                                           ");
		banksystem1.debitAmount(5000);
		banksystem1.debitAmount(3000);
		banksystem1.creditAmount(10000);
		banksystem1.creditAmount(2000);
		banksystem1.creditAmount(4000);
		banksystem1.creditAmount(100);
		banksystem1.creditAmount(600);
		System.out.print("Transaction Summary for User 2 is : ");
		banksystem1.individualTransactionSummary();
		System.out.println("----------------------------");
		System.out.println("All Transaction summary: ");
		banksystem.allTransactionSummary();		
	}

}
