package madhuraMJun20;

public class BankingSystem {
	int balance=10000;
	int counterD;
	int counterC;
	int counterP;
	static int countD;
	static int countC;
	static int countP;
	
	void debit(int debitAmt) {
		if(debitAmt>balance) {
			System.out.println("You Have Insufficient Balance");
		}
		else
			balance= balance - debitAmt;
		countD++;
		counterD++;
	}
	
	void credit(int creditAmt) {
		balance = balance + creditAmt; 
		countC++;
		counterC++;
	}
	
	void printBalance() {
		System.out.println("Current balance is : " +balance);
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
		bankingSystem1.credit(2000);
		bankingSystem1.credit(1000);
		bankingSystem1.debit(4000);
		bankingSystem1.printBalance();
		System.out.println("User1 transaction summary :");
		bankingSystem1.individualTrasactionSummary();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.credit(200);
		bankingSystem2.credit(500);
		bankingSystem2.credit(2000);
		bankingSystem2.credit(1000);
		bankingSystem2.credit(300);
		bankingSystem2.debit(3000);
		bankingSystem2.debit(1500);
		
		System.out.println("User2 transaction summary :");
		bankingSystem2.individualTrasactionSummary();
		System.out.println();
		System.out.println("All transaction summary :");
		bankingSystem2.allTransactionSummary();
	}
}
