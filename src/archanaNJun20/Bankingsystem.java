package archanaNJun20;

public class Bankingsystem {

	int balance=1000;
	int debit;
	int credit;
	int pBalance;
	static int sBalance=1000;
	static int sDebit;
	static int sCredit;
	static int sPBalance;
	
	void debitAmount(int pDebit) {
		
		balance=balance-pDebit;
		debit++;
		sDebit++;
	}
	void creditAmount(int pCredit) {
		balance=balance+pCredit;
		credit++;
		sCredit++;
	}
	void printBalance() {
		pBalance++;
		sPBalance++;
	}
	void individualTransactionSummary(String name) {
		System.out.println("***********************************************");
		System.out.println("Individual Transaction Summary for " +name);
		System.out.println("Total Number of debits  "+debit );
		System.out.println("Total Number of credit "+credit);
		System.out.println("Total Number of print balance "+pBalance );
		
	}
	
	void allTransactionSummary() {

		System.out.println("***********************************************");
		System.out.println("All Transaction Summary");
		System.out.println("Total Number of debits  "+sDebit );
		System.out.println("Total Number of credit "+sCredit);
		System.out.println("Total Number of print balance "+sPBalance );
	}
	
	public static void main(String[] args) {
		Bankingsystem bankingsystem = new Bankingsystem();
			bankingsystem.creditAmount(100);
			bankingsystem.creditAmount(100);
			bankingsystem.debitAmount(50);
			bankingsystem.debitAmount(50);
			//bankingsystem.printBalance();
			bankingsystem.individualTransactionSummary("User1");
		Bankingsystem bankingsystem1 = new Bankingsystem();{
			bankingsystem1.creditAmount(100);
			bankingsystem1.creditAmount(100);
			bankingsystem1.debitAmount(50);
			bankingsystem1.debitAmount(50);
			bankingsystem1.debitAmount(50);
			bankingsystem1.printBalance();
			bankingsystem1.individualTransactionSummary("User2");
			bankingsystem.allTransactionSummary();
		}
	}
}
