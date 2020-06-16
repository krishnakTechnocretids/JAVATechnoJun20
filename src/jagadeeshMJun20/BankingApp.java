package jagadeeshMJun20;

public class BankingApp {
	static int debitcount;
	static int creditcount;
	static int statementcount;
	int indDebCount;
	int indCredCount;
	int indStatementCount;
		
		void  debitAmout(){
		  debitcount++;
		  indDebCount++; 
		}
		void creditAmout(){
		creditcount++;
		indCredCount++;
		}
		void printBalance(){
		statementcount++;
		indStatementCount++;
		}
		void  individualTransactionSummary(String userName){
			System.out.println( userName +" transaction summary : Credit -  " +indCredCount+" times, Debit - "+indDebCount+" times, printBalance - "+indStatementCount+" times");
		}	
		void allTransactionSummary() {
			System.out.println("All transaction summary   : Credit - " +creditcount+" times, Debit - "+debitcount+" times, printBalance - "+statementcount+" times" );
		}
		public static void main(String[] agrs) {
			BankingApp bankingApp1 = new BankingApp();
			BankingApp bankingApp2 = new BankingApp();
			bankingApp1.debitAmout();
			bankingApp1.creditAmout();
			bankingApp1.creditAmout();
			bankingApp1.printBalance();
			bankingApp1.individualTransactionSummary("User1");
			bankingApp2.creditAmout();
			bankingApp2.creditAmout();
			bankingApp2.creditAmout();
			bankingApp2.creditAmout();
			bankingApp2.creditAmout();
			bankingApp2.printBalance();
			bankingApp2.individualTransactionSummary("User2");
			bankingApp1.allTransactionSummary();
		}
}
