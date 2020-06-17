package anupSJun20;
/* Create a Banking System which has following functionality.

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

public class BankTransactions {
	
	static int totalcredit = 0;
	static int totaldebit = 0;
	static int totalprintBalance = 0;
	
	int custCredit = 0;
	int custDebit = 0;
	int custPrintBalance = 0;
	String custname;
	int availableBalance;
	
	void setCustomerData(String name, int balance){
		custname = name;
		availableBalance = balance;
		System.out.println("Customer name : " + name + " , " + "Available balance : " + availableBalance );
	}
	
	int debit(int amount) {
		if(amount > availableBalance) {
			System.out.println("Debit transaction Insufficient fund");
		    return availableBalance;
		}
		else if (amount <= 0){
			System.out.println("Debit transaction Invalid number");
			return availableBalance;
		}
		else {
			availableBalance = availableBalance - amount;
			custDebit++;
			totaldebit++;
			System.out.println("Debit Amount: "+amount);
			return availableBalance;
		}
		
	}
	int credit(int amount) {
		if(amount>0) {
		availableBalance = availableBalance + amount;
		custCredit++;
		totalcredit++;
		System.out.println("Credit Amount: "+amount);
		return availableBalance;
		}
		else {
			System.out.println("Credit Transaction : Credit Amount not accepted");
			return availableBalance;
		}
		
	}
	
	int printBalance() {
		totalprintBalance++;
		custPrintBalance++;
		
		return availableBalance;
	}
	
	void individualTransactionSummary() {
		System.out.println("Customer Name : " + custname +" "+ "transaction summary :" + " Credit :" +  custCredit + " times " + " Debit : " + custDebit + " times " +  " printBalance :" + custPrintBalance + " times ");
		System.out.println("EOD balance: "+availableBalance);
	}
	void allTransactionSummary() {
		System.out.println("All transaction summary :" + " Credit :" +  totalcredit + " times " + " Debit : " + totaldebit + " times " +  " printBalance :" + totalprintBalance + " times ");
		
	}
	
	public static void main(String[] args) {
		BankTransactions banktransaction = new BankTransactions();
		banktransaction.setCustomerData("Anup", 50000);
		banktransaction.debit(30000);
		banktransaction.credit(2000);
		banktransaction.credit(4500);
		banktransaction.printBalance();
		banktransaction.printBalance();
		banktransaction.individualTransactionSummary();
		//System.out.println("Customer Name : " + banktransaction.custname + " EOD Bal " + banktransaction.printBalance()) ; 	
		
		BankTransactions banktransaction1 = new BankTransactions();
		banktransaction1.setCustomerData("Amita", 75000);
		banktransaction1.debit(20000);
		banktransaction1.credit(1000);
		banktransaction1.credit(8500);
		banktransaction1.printBalance();
		banktransaction1.printBalance();
		banktransaction1.individualTransactionSummary();
		//System.out.println("Customer Name : " + banktransaction1.custname + " EOD Bal " + banktransaction1.printBalance()) ; 	
		banktransaction.allTransactionSummary();
	
	}
	
}
