package vireshJJun20;

public class AtmOps {

	static int allCredit=0;
	static int allDebit=0;
	static int allPrintBal=0;
	
	int creditCnt=0;
	int	debitCnt= 0;
	int printCnt=0;
	
	int creditTr() {
		allCredit++;
		creditCnt++;
		return creditCnt;
	}
	
	int debitTr() {
		allDebit++;
		debitCnt++;
		return debitCnt;
	}
	
	int printTr() {
		allPrintBal++;
		printCnt++;
		return printCnt;
	}
	
	void individualTransactionSummary() {
		System.out.println("Credit: " + creditCnt + " times.");
		System.out.println("Debit: " + debitCnt + " times.");
		System.out.println("PrintBalance: " + printCnt + " times.");
	}
	
	static void allTransactionSummary() {
		System.out.println("Total Credit: " + allCredit + " times.");
		System.out.println("Total Debit: " + allDebit + " times.");
		System.out.println("Total PrintBalance: " + allPrintBal + " times.");
	}
	public static void main(String[] args) {
		AtmOps atmOps1= new AtmOps();
		System.out.println("First User info: ");
		atmOps1.creditTr();
		atmOps1.debitTr();
		atmOps1.printTr();
		atmOps1.debitTr();
		atmOps1.individualTransactionSummary();
		AtmOps atmOps2= new AtmOps();
		System.out.println("Second User info: ");
		atmOps2.creditTr();
		atmOps2.debitTr();
		atmOps2.printTr();
		atmOps2.creditTr();
		atmOps2.individualTransactionSummary();
		allTransactionSummary();
		
	}

}
