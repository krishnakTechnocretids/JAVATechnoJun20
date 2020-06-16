/*Create a Banking System which has following functionality.

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
package palakSJun20;

public class BankingSystem {
	String customerName;
	int customerBalance;
	int customerCreditCount , customerDebitCount , customerPrintBalanceCount;
	static int creditCount, debitCount, printBalanceCount;
	
	void setCustomerData(String customerName , int customerBalance){
		this.customerName = customerName;
		this.customerBalance = customerBalance;
	}
	
	void debitTransaction(int debitAmount){
		if(customerBalance < debitAmount )
			System.out.println("You have insufficient balance to withdraw the amount ");
		else {
			customerDebitCount++;
			debitCount++;
			this.customerBalance = customerBalance - debitAmount;
		}
	}
	void creditTransaction(int creditAmount){
		if(creditAmount <= 0)
			System.out.println("Amount should be more than 0");
		else {
			customerCreditCount++;
			creditCount++;
			this.customerBalance = customerBalance + creditAmount;
		}
	}
	void printBalance(){
		customerPrintBalanceCount++;
		printBalanceCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println("\nTransaction Summary of Customer " + customerName);
		System.out.println("Credit : " +customerCreditCount +" Times\n"+
		"Debit : " + customerDebitCount + " Times\n" +
		"Print Balance : "+ customerPrintBalanceCount +" Times\n"+
		"Customer current Balance is : " + customerBalance);
	}
	void allTransactionSummary(){
		System.out.println("\nAll Transactions Summary");
		System.out.println("Credit : " +creditCount +" Times");
		System.out.println("Debit : " + debitCount + " Times");
		System.out.println("Print Balance : "+ printBalanceCount +" Times");
		
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem(); // Customer 1
		bankingSystem1.setCustomerData("Palak",1000);
		bankingSystem1.creditTransaction(500);
		bankingSystem1.printBalance();
		bankingSystem1.debitTransaction(500);
		bankingSystem1.creditTransaction(1000);
		bankingSystem1.individualTransactionSummary();
		
		
		BankingSystem bankingSystem2 = new BankingSystem(); // Customer 2
		bankingSystem2.creditTransaction(1000);
		bankingSystem2.setCustomerData("Palash",2000);
		bankingSystem2.debitTransaction(500);
		bankingSystem2.creditTransaction(500);
		bankingSystem2.creditTransaction(800);
		bankingSystem2.creditTransaction(200);
		bankingSystem2.debitTransaction(1000);
		bankingSystem2.creditTransaction(900);
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();
		
		

	}

}
