package pranitaPJun20;

public class BankingSystem {
	//Instance Variables
	int debitCount=0;
	int creditCount=0;
	int printBalanceCount=0;
	//Static variables
	static int balance=100000;
	static int staticDebitCount=0;
	static int staticCreditCount=0;
	static int staticPrintBalCount=0;
	
		//Method to Debit amount
		void debitAmnt(int amountDebited ){
			debitCount= debitCount+1;
			//debitCount++ ; //we can use this also
			//debitCount+=1 ;//we can use this command also	
			staticDebitCount=staticDebitCount+1;
			balance= balance-amountDebited;
		}
		//Method to credit amount
		void creditAmnt(int amountCredited){
			creditCount= creditCount+1;
			staticCreditCount=staticCreditCount+1;
			balance= balance-amountCredited;		
		}
		//Method to printBalance [it will print current balance]
		void printBalance(){
			printBalanceCount = printBalanceCount+1;	
			staticPrintBalCount=staticPrintBalCount+1;
			System.out.println("The current balance of user after transactions is:"+balance);
		}
		//individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called 
		void individualTransactionSummary(){
			System.out.println("Individual Debit Operation count is :" +creditCount);
			System.out.println("Individual Credit Operation count is :" +debitCount);
			System.out.println("Individual printBanlance Operation count is :" +printBalanceCount);
		}
		//allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
		//All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time 
		void allTransactionSummary(){
			System.out.println("Overall Debit Operations count is :" +staticDebitCount);
			System.out.println("Overall Credit Operations count is :" +staticCreditCount);
			System.out.println("Overall Print Balance Operation count is:" +staticPrintBalCount);
		
		}
		//Main method
		public static void main(String[] args){
		//user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
			BankingSystem bankingSystem1 = new BankingSystem();
			bankingSystem1.debitAmnt(1000);
			bankingSystem1.creditAmnt(2000);
			bankingSystem1.creditAmnt(1000);
			System.out.println("User 1 Transaction Summary:");
			bankingSystem1.individualTransactionSummary();
			bankingSystem1.printBalance();	
			System.out.print("\n");
			//user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time
			BankingSystem bankingSystem2 = new BankingSystem();
			bankingSystem2.creditAmnt(100);
			bankingSystem2.creditAmnt(100);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.creditAmnt(100);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.debitAmnt(5000);
			bankingSystem2.debitAmnt(5000);
			System.out.println("User 2 Transaction Summary:");
			bankingSystem2.individualTransactionSummary();
			//bankingSystem2.printBalance();
			System.out.print("\n");	
			System.out.println("All transaction summary");		
			bankingSystem2.allTransactionSummary();
		}

}
