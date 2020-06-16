/*Assignment 8 : 16th Jun 2020

Create a Banking System which has following functionality.

Create two object to perform below scenario.
1) Method to Debit amount
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


package anshuKJun20;

public class Bank {
	int totalCA;
	int totalDA;
	int currentbalance;
   static int credittimes=0;
   static int debitttimes=0;
   static int printbalnc=0;
   
   //Here debit 1 and 2 means user debited different amount in 2 times.
   void debitAmount(int debit1, int debit2, int debit3,int debit4){
		int debitamount = debit1 +debit2+debit3+debit4;
		totalDA=debitamount;
	}
   //Here debit 1 and 2 means user credited different amount in 5 times.
	void creditAmount(int credit1,int credit2, int credit3, int credit4, int credit5){
		int creditamount = credit1+credit2+credit3+credit4+credit5;
		totalCA=creditamount;
	}
	void printBalance(int balance){
		currentbalance= balance-totalDA+totalCA;
		System.out.println("Current Balnce in User's Account are"+currentbalance);
	}
	void individualTransactionSummary(int credittime,int debittime,int printb) {
		credittimes =credittimes+ credittime;
		debitttimes =debitttimes+ debittime;
		printbalnc = printbalnc+printb;
		System.out.println("User credited "+credittime+" times, Debited "+debittime+"times and Print balnce"+printb);
	}
	
	void allTransactionSummary(){
		System.out.println( "Total credited "+credittimes+" times, Total Debited "+debitttimes+"times and Total Print balnce"+printbalnc+" times.");
	}
	public static void main(String[] args) {
		System.out.println('\n'+"--------User 1 Details--------");
		Bank user1 = new Bank();
		user1.debitAmount(100,0,0,0);
		user1.creditAmount(100,50,0,0,0);
		user1.printBalance(1000);
		user1.individualTransactionSummary(2,1,1);
		
		System.out.println('\n'+"--------User 2 Details--------");
		Bank user2 = new Bank();
		user2.debitAmount(100,200,0,0);
		user2.creditAmount(100,50,1500,400,200);
		user2.printBalance(1500);
		user2.individualTransactionSummary(5,2,0);
		
		user2.allTransactionSummary();
		
		
		
	}
	
	

}
