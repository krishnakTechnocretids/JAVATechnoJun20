package piyushPJun20;

public class BankingSystem {

	int creditCount, debitCount, printCount, balance;
	static int userCrdtCount, userDebtCount, userprintCount, countUser;
	
	void setInitialBalance(int amount){
		countUser++;
		System.out.println("");
		System.out.println(" Initial Balance of User "+countUser+" is: "+amount);
		balance = amount;
	}

	void debitAccount(int debitAmt){
		if(balance < debitAmt)
			System.out.println(" Insufficient Balance ");
		else{
			balance -= debitAmt;
			debitCount++;
			userDebtCount++;
			}
        }
	
	void creditAccount(int creditAmt){
		balance += creditAmt;
		creditCount++;
		userCrdtCount++;
	}
	
	void printBalance(int crAmt,int debtAmt){
	    System.out.println(""); 
	    System.out.println(" Current balance of User "+countUser+" is: "+(balance));
		printCount++;
		userprintCount++;
	}
	void transactionSummary(){
		System.out.println("");
		System.out.println(" User " +countUser+" " + "transaction Summary: Debit - " + debitCount + " times, Credit - " + creditCount + " times, PrintBalance " + printCount + " times");
	}
    void allTransactionSummary(){
    	System.out.println("");
		System.out.println(" All transaction summary: Debit - " + userDebtCount + " times, Credit - " + userCrdtCount + " times, PrintBalance " + userprintCount + " times");
	}

	public static void main(String[] args)
	{
		BankingSystem bankingsystem = new BankingSystem();
		bankingsystem.setInitialBalance(5000);
		bankingsystem.debitAccount(500);
		bankingsystem.creditAccount(100);
		bankingsystem.creditAccount(100);
		bankingsystem.printBalance(600,300);
		bankingsystem.transactionSummary();
		
		
		BankingSystem bankingsystem1 = new BankingSystem();
		bankingsystem1.setInitialBalance(7000);
		bankingsystem1.debitAccount(100);
		bankingsystem1.debitAccount(200);
		bankingsystem1.creditAccount(200);
		bankingsystem1.creditAccount(200);
		bankingsystem1.creditAccount(300);
		bankingsystem1.creditAccount(400);
		bankingsystem1.creditAccount(500);
		bankingsystem1.transactionSummary();
		bankingsystem.allTransactionSummary();

	}	

}
