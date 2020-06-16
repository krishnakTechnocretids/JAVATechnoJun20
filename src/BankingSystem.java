
public class BankingSystem {

	int creditCount, debitCount, printCount;
	static int userCrdtCount;
	static int userDebtCount;
	static int userprintCount;

	void debitAccount(int debitAmt){
        debitCount++;
		userDebtCount++;
	}
	void creditAccount(int creditAmt){
		creditCount++;
		userCrdtCount++;
	}
	void printBalance(int crAmt,int debtAmt){
	    System.out.println(""); 
	    System.out.println(" Current Balance is : " + ((crAmt-debtAmt)));
		printCount++;
		userprintCount++;
	}
	void transactionSummary(String name){
		System.out.println("");
		System.out.println( name + "transaction Summary: Debit - " + debitCount + " times, Credit - " + creditCount + " times, PrintBalance " + printCount + " times");
	}
    void allTransactionSummary(){
    	System.out.println("");
		System.out.println(" All transaction summary: Debit - " + userDebtCount + " times, Credit - " + userCrdtCount + " times, PrintBalance " + userprintCount + " times");
	}

	public static void main(String[] args)
	{
		BankingSystem bankingsystem = new BankingSystem();
		bankingsystem.debitAccount(500);
		bankingsystem.creditAccount(100);
		bankingsystem.creditAccount(100);
		bankingsystem.printBalance(600,300);
		bankingsystem.transactionSummary(" User1 ");
		
		
		BankingSystem bankingsystem1 = new BankingSystem();
		bankingsystem1.debitAccount(100);
		bankingsystem1.debitAccount(200);
		bankingsystem1.creditAccount(200);
		bankingsystem1.creditAccount(200);
		bankingsystem1.creditAccount(300);
		bankingsystem1.creditAccount(400);
		bankingsystem1.creditAccount(500);
		bankingsystem1.transactionSummary(" User2 ");
		bankingsystem.allTransactionSummary();

	}	

}
