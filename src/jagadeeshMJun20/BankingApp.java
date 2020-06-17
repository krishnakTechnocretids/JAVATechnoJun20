package jagadeeshMJun20;
class BankingApp{
static int debitcount;
static int creditcount;
static int statementcount;
int indDebCount;
int indCredCount;
int indStatementCount;
double bal;

	String  debitAmout(double withdraw){
	  debitcount++;
	  indDebCount++;
		if (bal > withdraw){
			bal = bal - withdraw;
			return "Transaction is successful";
		}
		else return ("Insufficient funds. Balance available is: " +bal);
	}
	
	void creditAmout(double credAmt){
	creditcount++;
	indCredCount++;
	bal = bal+credAmt;
	}
	String printBalance(){
	statementcount++;
	indStatementCount++;
	return("Balance is : "+bal);
	}
	void  individualTransactionSummary(String userName){
		
		System.out.println( userName +" transaction summary : Credit -  " +indCredCount+" times, Debit - "+indDebCount+" times, printBalance - "+indStatementCount+" times");
	}
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " +creditcount+" times, Debit - "+debitcount+" times, printBalance - "+statementcount+" times" );
	}
	public static void main(String[] agrs) {
		BankingApp bankingApp1 = new BankingApp();
		BankingApp bankingApp2 = new BankingApp();
		bankingApp1.creditAmout(6000);
		System.out.println(bankingApp1.debitAmout(1000));
		bankingApp1.creditAmout(50);
		System.out.println(bankingApp1.printBalance());
		bankingApp1.printBalance();
		bankingApp1.individualTransactionSummary("User1");
		System.out.println();
		bankingApp2.creditAmout(1000);
		bankingApp2.creditAmout(1000);
		bankingApp2.creditAmout(1000);
		System.out.println(bankingApp2.debitAmout(1000));
		bankingApp2.debitAmout(500);
		bankingApp2.creditAmout(1000);
		bankingApp2.creditAmout(1000);
		System.out.println(bankingApp2.printBalance());
		bankingApp2.individualTransactionSummary("User2");
		System.out.println();
		bankingApp1.allTransactionSummary();
	}	
}