package swapnaWJun20;

public class BankingSystem {

	int debit, credit, balance,statement;
	static int allDebit, allCredit, allBalance, allStatement, accHolder;

	void setAmount(int amount){
		accHolder++;
		System.out.println(" Balance of Customer is: "+amount);
		balance = amount;
	}

	void debitAmt(int debitAmt){
		if(balance<=0) {
			System.out.println("\n Insufficient funds in account. Withdrawal is not possible"); 
		}
		balance -= debitAmt;
		debit++;
		allDebit++;
	}

	void creditAmt(int creditAmt) {
		balance += creditAmt;
		credit++;
		allCredit++;
	}

	void printBalance() {
		System.out.println("\n Balance after transactions "+accHolder+" is: "+balance);
		statement++;
		allStatement++;
	}

	void individualTransactionSummary() {
		System.out.print("\n ----- Customer "+accHolder+"'s Transaction summary------ "
				+ "\n Credit - "+credit+" times, \n Debit - "+debit+" times"
				+ "\n print balance - "+statement+" times");
	}

	void allTransactionSummary() {
		System.out.println("------ All Transactions------"
				+ "\n Credit - "+allCredit+" times,"
				+ "\n Debit - "+allDebit+" times,"
				+ "\n print balance - "+allStatement+" times");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();

		bankingSystem1.setAmount(40);
		bankingSystem1.debitAmt(2); 
		bankingSystem1.creditAmt(3);
		bankingSystem1.creditAmt(2);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();

		System.out.println("\n \n **********************************************");
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setAmount(20);
		bankingSystem2.debitAmt(10); 
		bankingSystem2.creditAmt(2);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
	
		System.out.println("\n **********************************************");

		bankingSystem1.allTransactionSummary();
	}
}