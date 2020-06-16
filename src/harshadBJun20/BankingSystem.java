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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

package harshadBJun20;

class BankingSystem{
	
	int debitIndividualCount,creditIndividualCount,balanceIndividualCount, balanceAmt;
	static int debitTotalCount=0, creditTotalCount=0, balanceTotalCount=0;
	int userId;

	//Method to set UserId and balanceAmount.
	void setData(int uId, int balance){
		userId = uId;
		balanceAmt = balance;
	}
	
	//Method to Debit the Amount from Balance
	void debitAmount(int debitAmt){
		this.balanceAmt= this.balanceAmt - debitAmt;
		debitIndividualCount++;
		debitTotalCount++;
	}
	
	//Method to Credit the Amount to Balance
	void creditAmount(int creditAmt){
		this.balanceAmt= this.balanceAmt + creditAmt;
		creditIndividualCount++;
		creditTotalCount++;
	}
	
	//Method to Print balance Amount w.r.to user
	void printBalance(){
		System.out.println();
		System.out.println("Current Balance of user "+userId+" is: "+balanceAmt);
		System.out.println();
		balanceIndividualCount++;
		balanceTotalCount++;
	}
	
	//Method to Print individual transaction summary
	void individualTransactionSummary(){
		
		if(userId == 1){
			System.out.println("User1 transaction summary : " +"Credit: " +creditIndividualCount+" times, " +"Debit: " + debitIndividualCount+" times," +" Print Balance: "+balanceIndividualCount+" times");
		}
		if(userId == 2){
			System.out.println("User2 transaction summary : " +"Credit: " +creditIndividualCount+" times, " +"Debit: " + debitIndividualCount+" times," +" Print Balance: "+balanceIndividualCount+" times");
		}
				
		System.out.println();
	}
	
	//Method to Print overall transaction summary
	void allTransactionSummary(){
		System.out.println("Overall Transaction Summary: ");
		System.out.println("------------------------------------");
		System.out.println("All transaction summary : " +"Credit: " +creditTotalCount+" times " +"Debit: " + debitTotalCount+" times" +"Print Balance: "+balanceTotalCount+" times");
	}
	
	//Main method
	public static void main(String args[]){
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setData(1,10000);
		bankingSystem1.creditAmount(500);
		bankingSystem1.creditAmount(200);
		bankingSystem1.debitAmount(5000);
		bankingSystem1.printBalance();
		
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setData(2,15000);
		bankingSystem2.creditAmount(2500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(2500);
		bankingSystem2.creditAmount(500);
		bankingSystem2.creditAmount(2500);
		bankingSystem2.debitAmount(500);
		bankingSystem2.debitAmount(1500);
		bankingSystem2.printBalance();
		
		System.out.println("Individual Transaction Summary: ");
		System.out.println("------------------------------------");
		bankingSystem1.individualTransactionSummary();
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
		
	}
}