package pranitaPJun20;

public class BankingSystem {
//Instance Variables
	int debitCount;
	int creditCount;
	int printBalanceCount;
	int balance;
//Static variables
	static int staticDebitCount;
	static int staticCreditCount;
	static int staticPrintBalCount;
	
//Method to Debit amount
		void debitAmnt(int amountDebited ){
			debitCount= debitCount+1;
			//debitCount++ ; //we can use this also
			//debitCount+=1 ;//we can use this command also	
			staticDebitCount=staticDebitCount+1;
			balance= balance-amountDebited;
				if(balance<=100) {
					System.out.println("Account has insufficient balance");			
				}
			}
		
//Method to credit amount
		void creditAmnt(int amountCredited){
			creditCount= creditCount+1;
			staticCreditCount=staticCreditCount+1;
			balance= balance+amountCredited;		
		}
		
//Method to printBalance [it will print current balance]
		void printBalance(){
			printBalanceCount = printBalanceCount+1;	
			staticPrintBalCount=staticPrintBalCount+1;	
			System.out.println("The current balance of user is:"+balance);
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
			System.out.println("User 1 Transaction Summary:");
			bankingSystem1.creditAmnt(2000);
			System.out.println("The initial balance of user1 is:"+bankingSystem1.balance);
			bankingSystem1.debitAmnt(1000);
			bankingSystem1.creditAmnt(2000);
			bankingSystem1.individualTransactionSummary();
			bankingSystem1.printBalance();
			System.out.print("\n");
			
//user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time
			BankingSystem bankingSystem2 = new BankingSystem();
			System.out.println("User 2 Transaction Summary:");
			bankingSystem2.creditAmnt(5000);
			System.out.println("The initial balance of user2 is:"+bankingSystem2.balance);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.creditAmnt(1000);
			bankingSystem2.debitAmnt(500);
			bankingSystem2.debitAmnt(500);
			bankingSystem2.individualTransactionSummary();
			System.out.println("The Current balance of user2 is:"+bankingSystem2.balance);
			System.out.print("\n");	
			
//All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time 
			System.out.println("All transaction summary");		
			bankingSystem2.allTransactionSummary();
		}

}
