package sweetyMJun20;

public class BankingSystem {
	int creditcnt;
	int debitcnt;
	int printcnt;
	static int usercreditcnt;
	static int userdebitcnt;
	static int userprintcnt;
	
	void debitAcc(int debtamt){
        debitcnt++;
		userdebitcnt++;
	}
	void creditAcc(int creditamt){
		creditcnt++;
		usercreditcnt++;
	}
	void printBalance( int cramt,int debtamt){
	    System.out.println("Customer current balance is: " + ((cramt-debtamt)));
		printcnt++;
		userprintcnt++;
	}
	void transactionSummary(String name){
		System.out.println(name + " transaction Summary: Debit - " + debitcnt + " times, Credit - " + creditcnt + " times, PrintBalance " + printcnt + " times");
	}
    void allTransactionSummary(){
		System.out.println("All transaction summary: Debit - " + userdebitcnt + " times, Credit - " + usercreditcnt + " times, PrintBalance " + userprintcnt + " times");
	}
	
	public static void main(String[] args)
	{
		BankingSystem bankingsystem=new BankingSystem();
		bankingsystem.debitAcc(700);
		bankingsystem.creditAcc(500);
		bankingsystem.creditAcc(500);
		bankingsystem.printBalance(1000,700);
		bankingsystem.transactionSummary("user1");
		BankingSystem bankingsystem1=new BankingSystem();
		bankingsystem1.debitAcc(500);
		bankingsystem1.debitAcc(500);
		bankingsystem1.creditAcc(500);
		bankingsystem1.creditAcc(500);
		bankingsystem1.creditAcc(500);
		bankingsystem1.creditAcc(500);
		bankingsystem1.creditAcc(200);
		bankingsystem1.transactionSummary("user2");
		bankingsystem.allTransactionSummary();
		
	}

}
