package yashCJun20;

/*Assignment 8 : 16th Jun 2020

Create a Banking System which has following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variable will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time */

class BankingSystem{
	
	int indvDebit;
	int indvCredit;
	int balance;
	int indvBalance;
	static int debit;
	static int credit;
	static int finalBalance;
	
	
	void debitAmount(int debtAmt){
		
		
		if (debtAmt <=balance) {
			
			balance = balance-debtAmt;
			indvDebit=indvDebit+1;
			debit=debit+1;
			
	}
		
		else
			System.out.println("The requested amount cannot be withdraw due to insufficent balance");
		
			
	}
	
	void creditAmount(int crdtAmt){
		
		balance = balance + crdtAmt;
		indvCredit=indvCredit+1;
		credit=credit+1;
	}
	

	void printBalance(){
		
		System.out.println("Current Balance " +": " +balance);
		indvBalance=indvBalance+1;
		finalBalance=finalBalance+1;
	}
	
	
	void individualTransactionSummary(){
		
		
		System.out.println ("Transaction summary :" + "Credit - "+indvCredit +"times ," +"Debit - "+indvDebit +"times ,"+"Printbalance - "+indvBalance +"times");
		
		
		//System.out.println ("user2 transaction summary :" + "Credit - "+indvCredit +"times ," +"Debit - "+indvDebit +"times ,"+"Printbalance - "+indvBalance +"times");
			
	}
	
	void allTransactionSummary(){
		
		System.out.println ("All transaction summary  :" + "Credit - "+credit +"times ," +"Debit - "+debit +"times ,"+"Printbalance - "+finalBalance +"times");
			
	}
	
	public static void main(String[] args){
		
		
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.creditAmount(1000);
		bankingSystem1.creditAmount(500);
		bankingSystem1.debitAmount(1000);
		bankingSystem1.printBalance();
		System.out.println("Individual Transaction Summary of User1");
		bankingSystem1.individualTransactionSummary();
	
		
		bankingSystem2.creditAmount(200);
		bankingSystem2.creditAmount(300);
		bankingSystem2.creditAmount(100);
		bankingSystem2.creditAmount(150);
		bankingSystem2.creditAmount(100);
		bankingSystem2.debitAmount(300);
		bankingSystem2.debitAmount(300);
		System.out.println("Individual Transaction Summary of User2");
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
		
    	
		
	}		
	
}