package aasthaJJun20;

public class BankingSystem{
	
	static int countAllDebits, countAllCredits,countAllPrintMiniStatements, countUser;
	int countDebits, countCredits, countPrintMiniStatements, balance;
	
	void setInitialBalance(int amount){
		countUser++;
		System.out.println("\n\nInitial Balance of Customer "+countUser+" is: "+amount);
		balance = amount;
	}
	
	void debitAmount(int debit){
		if(balance < debit)
			System.out.println("Insufficient Balance, you cannot withdraw");
		else{
			balance -= debit;
			countDebits++;
			countAllDebits++;
		}
	}
	
	void creditAmount(int credit){
		balance += credit;
		countCredits++;
		countAllCredits++;
	}
	
	void printBalance(){
		System.out.println("After credits/debits - Current balance of Customer "+countUser+" is: "+(balance));
		countPrintMiniStatements++;
		countAllPrintMiniStatements++;
	}
	
	void individualTransactionSummary(){
		System.out.print("Customer "+countUser+"'s Transaction summary: Credit - "+countCredits+" times, Debit - "+countDebits+" times, print balance - "+countPrintMiniStatements+" times");
	}
	
	void allTransactionSummary(){
		System.out.println("\n\nAll Transaction summary: Credit - "+countAllCredits+" times, Debit - "+countAllDebits+" times, print balance - "+countAllPrintMiniStatements+" times");
	}
	
	public static void main(String[] args){
		BankingSystem bankingSystem1 = new BankingSystem();
		
		bankingSystem1.setInitialBalance(10000);
		bankingSystem1.debitAmount(1000); 
		bankingSystem1.creditAmount(5000);
		bankingSystem1.creditAmount(6000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setInitialBalance(20000);
		bankingSystem2.debitAmount(1000); 
		bankingSystem2.creditAmount(2000);
		bankingSystem2.debitAmount(1000); 
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(1500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(10);
		bankingSystem2.individualTransactionSummary();
		
		bankingSystem1.allTransactionSummary();
				
	}
}
