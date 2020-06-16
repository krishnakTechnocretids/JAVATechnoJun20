package madhuraMJun20;

public class BankingSystem {
	
	int counterD=0;
	int counterC=0;
	int counterP=0;
	static int countD=0;
	static int countC=0;
	static int countP=0;
	
	void setData(int credit, int debit, int print) {
		
	}
	void debit() {
		countD++;
		counterD++;
	}
	
	void credit() {
		countC++;
		counterC++;
	}
	
	void printBalance() {
		countP++;
		counterP++;
	}
	
	void individualTrasactionSummary() {
		System.out.println("Credit - " +counterC+ " times, Debit - " +counterD+ " times, printBalance - " +counterP+ " time");
	}
	
	void allTransactionSummary() {
		System.out.println("Credit - " +countC+ " times, Debit - " +countD+ " times, printBalance - "+countP+ " time");
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.credit();
		bankingSystem1.credit();
		bankingSystem1.debit();
		bankingSystem1.printBalance();
		System.out.println("User1 transaction summary :");
		bankingSystem1.individualTrasactionSummary();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.debit();
		bankingSystem2.debit();
		bankingSystem2.credit();
		System.out.println("User2 transaction summary :");
		bankingSystem2.individualTrasactionSummary();
		System.out.println("All transaction summary :");
		bankingSystem2.allTransactionSummary();
	}
}
