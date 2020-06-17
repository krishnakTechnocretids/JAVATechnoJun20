package vaishnaviVJun20;

public class Bank {   
	int creditCount;
	int debitCount;
	int printBalanceCount;
	static int creditCount1;
	static int debitCount1;
	static int printBalanceCount1;
	int balance;
	
	void debitAmount(int debit) {
		if(balance>= debit) {
	    balance = balance - debit;
	    debitCount++;
	    debitCount1++;
		}
		else 
			System.out.println("Insufficient Balance");
	}	
	void creditAmount(int credit) {
		balance = balance+credit;
		creditCount++;	
		creditCount1++;
	}	
	void getCurrentBalance() {
		System.out.println("Current Balance is:"+balance);
		printBalanceCount++;
		printBalanceCount1++;
	}	
	void individualTransactionSummary(){
		System.out.println("Credit- "+creditCount+" times");
		System.out.println("Debit- "+debitCount+" times");
		System.out.println("PrintBalance- "+printBalanceCount+" times");		
	}	
	void allTransactionSummary() {
		System.out.println("Credit- "+creditCount1+" times");
		System.out.println("Debit- "+debitCount1+" times");
		System.out.println("PrintBalance- "+printBalanceCount1+" times");
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank bank1 = new Bank();		
		bank.creditAmount(20000);
		bank.creditAmount(3000);
		bank.debitAmount(10000);
		bank.getCurrentBalance();
		System.out.print("User 1 transaction summary: ");
		bank.individualTransactionSummary();
		System.out.println("----------------------------------");		
		bank1.creditAmount(20000);
		bank1.creditAmount(3000);
		bank1.creditAmount(2000);
		bank1.creditAmount(200);
		bank1.creditAmount(500);
		bank1.debitAmount(10000);
		bank1.debitAmount(2000);
		System.out.print("User 2 transaction summary: ");
		bank1.individualTransactionSummary();
		System.out.println("----------------------------");
		System.out.println("All Transaction summary: ");
		bank.allTransactionSummary();		
	}
}
