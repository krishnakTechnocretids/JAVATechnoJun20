/*
 *Create a Banking System which has following functionality.

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time 
 */
package shrutiDJun20;

public class Banking {
	int indbalance;
	String name;
	int debitcount;
	int creditcount;
	int statementPrintedcount;
	static int overallDebitcount;
	static int overallcreditcount;
	static int overallStatementPrintedcount;
	
	void setbalance(int initialamountdeposited, String username){
		indbalance=initialamountdeposited;
		name = username;
		System.out.println("Initial amount deposited by "+name+" :" + initialamountdeposited);
	}
	//Method to debit amount
	void amountDebitedByind(int idebit){
		
		if(idebit>0 && idebit<indbalance){
			System.out.println("Amount debit successful for :" + idebit);
		indbalance = indbalance-idebit;
		debitcount++;
		overallDebitcount++;
		}
		else
			System.out.println("Debit Amount entered is less than balance");
		
	}
	//Method to credit amount
	 void amountCreditedByint(int icredit){
		 if(icredit>0){
			 System.out.println("Amount credit successful for :" + icredit);
		 indbalance= indbalance+icredit;
		 overallcreditcount++;
		 creditcount++;}
		 else
			 System.out.println("Amount entered is invalid");
	 }
	//Method to printBalance [it will print current balance]	 
	void printBalance(){
		 System.out.println(name+ "'s current balance :" +indbalance );
		 statementPrintedcount++;
		 overallStatementPrintedcount++;
	}
		
	void transactionbyUser(){
		System.out.print(name+ "'s transaction summary: Credit count: "+ creditcount+", Debit count: "+debitcount+", Printed statement count: "+statementPrintedcount + "\n");
	}
	void overallTransactionofBank(){
		System.out.print("Transaction Summary of the day: No. of times amount credited: "+ overallcreditcount+ ", No. of times amount debited: " + overallDebitcount+ ", No. of time statement printed: "+ overallStatementPrintedcount + "\n");
	}

	
	public static void main(String[] args) {
		Banking banking = new Banking();
		//user 1
		banking.setbalance(50000, "Shruti");
		banking.amountDebitedByind(5000);
		banking.amountCreditedByint(2000);
		banking.amountCreditedByint(3000);
		banking.amountDebitedByind(10000);
		banking.amountDebitedByind(10000);
		banking.printBalance();
		banking.printBalance();
		banking.transactionbyUser();
		System.out.println();
		//user 2
		Banking banking2 = new Banking();
		banking2.setbalance(1000, "Kunal");
		banking2.amountDebitedByind(10500);
		banking2.amountCreditedByint(200);
		banking2.amountCreditedByint(300);
		banking2.printBalance();
		banking2.transactionbyUser();
		System.out.println();
		banking.overallTransactionofBank();	

	}

}
