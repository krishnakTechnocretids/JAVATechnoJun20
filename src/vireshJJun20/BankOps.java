package vireshJJun20;

public class BankOps {
	static int availableBal=10000;
	static int allCredit=0;
	static int allDebit=0;
	static int allPrintBal=0;
	
	int creditCnt=0;
	int	debitCnt= 0;
	int printCnt=0;
	
	int creditTr(int cr) {
		System.out.println(" - User willing to credit amount of " + cr);
		if(availableBal+cr<10000) {
			availableBal= availableBal+cr;
			System.out.println("Available balance: " + availableBal);
			allCredit++;
			creditCnt++;
		}
		else {
			System.out.println(" - User tried to exceed credit limit of 10000");
		}
		return creditCnt;
	}
	
	int debitTr(int db) {
		System.out.println(" - User willing to debit amount of " + db);
		if(db-availableBal<=0) {
			availableBal= db-availableBal;
			System.out.println("Available balance: " + availableBal);
			allDebit++;
			debitCnt++;
		}
		else {
			System.out.println(" - User can not debit the amount due to insufficient balance");
		}
		
		return debitCnt;
	}
	
	int printTr() {
		allPrintBal++;
		printCnt++;
		return printCnt;
	}
	
	void individualTransactionSummary() {
		System.out.println("Individual Transaction Summary: ");
		System.out.println(" - Credit: " + creditCnt + " times.");
		System.out.println(" - Debit: " + debitCnt + " times.");
		System.out.println(" - Count of Printed Statement Requests: " + printCnt + " times.");
	}
	
	static void allTransactionSummary() {
		System.out.println("Total Transaction Summary: ");
		System.out.println(" - Closing balance:" + availableBal);
		System.out.println(" - Total Credit transactions: " + allCredit);
		System.out.println(" - Total Debit transactions: " + allDebit);
		System.out.println(" - Total number of printed statements: " + allPrintBal);
	}
	public static void main(String[] args) {
		System.out.println(" - Opening balance: " + availableBal);
		BankOps bankOps1= new BankOps();
		System.out.println("First User info: ");
		bankOps1.debitTr(10000);
		bankOps1.creditTr(100);
		bankOps1.printTr();
		bankOps1.debitTr(10000);
		bankOps1.individualTransactionSummary();
		//allTransactionSummary();
		
		BankOps bankOps2= new BankOps();
		System.out.println("Second User info: ");
		bankOps2.creditTr(1000);
		bankOps2.individualTransactionSummary();
		allTransactionSummary();
		
	}

}
