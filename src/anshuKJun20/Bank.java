/*Assignment 8 : 16th Jun 2020

Create a bank1ing System which has following functionality.

Create two object to perform below scenario.
1) Method to Debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output:
bank1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
bank2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variable will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time */


package anshuKJun20;

public class Bank {
	static int countalldebits,countallcredits,countallprintbalance,countusers;
	int countdebits,countcredits,countprintministatement,balance;
	   
  void initialBAlance(int amount) {
	  countusers++;
	  System.out.println("Intial Balance of user "+countusers+" is "+amount);
	  balance= amount;
	  }
   void debitAmount(int debit){
	    System.out.println("Debited "+debit);
		if(balance<debit){
			System.out.println("Sorry you Don,t have sufficient Balance in your Account.");
		}else {
			balance = balance-debit;
		}
		countdebits++;
		countalldebits++;
	}
   
	void creditAmount(int credit){
		balance = balance+ credit;
		System.out.println("Credited"+credit);
		countcredits++;
		countallcredits++;
		
	}
	void printBalance(){
		System.out.println("Your Balance is "+balance);
		countprintministatement++;
		countallprintbalance++;
	}
	void individualTransactionSummary() {
		System.out.println("user"+countusers+" Transaction Summary is: Credit: "+countcredits+"times, Debit: "+countdebits+" times and he needs PrintBalance "+countprintministatement+"times.");
	}
	
	void allTransactionSummary(){
		System.out.println("All Transaction Summary is: Credit: "+countallcredits+"times, Debit: "+countalldebits+" times and PrintBalance"+countallprintbalance+" times.");
	}
	public static void main(String[] args) {
		System.out.println('\n'+"----Bank 1 Details---");
		Bank bank1 = new Bank();
		bank1.initialBAlance(10000);
		bank1.debitAmount(2000);
		bank1.printBalance();
		bank1.creditAmount(5000);
		bank1.creditAmount(2000);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		
		System.out.println('\n'+"----Bank 2 Details---");
		Bank bank2 = new Bank();
		bank1.initialBAlance(2000);
		bank2.debitAmount(1000);
		bank2.creditAmount(2500);
		bank2.printBalance();
		bank2.debitAmount(1000);
		bank2.printBalance();
		bank2.creditAmount(500);
		bank2.creditAmount(100);
		bank2.creditAmount(5000);
		bank2.creditAmount(1500);
		bank2.printBalance();
		bank2.individualTransactionSummary();
		
		bank1.allTransactionSummary();
		
		
		
	}
	
	

}
