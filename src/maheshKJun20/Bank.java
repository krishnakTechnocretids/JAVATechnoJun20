package maheshKJun20;

public class Bank{
	
	static int bankCredit, bankDebit, bankPrintBalance;
	int userCredit, userDebit, userPrintBalance;
	double userBalance = 0;
	String userName;
	
	void setUserDetails(String name, double balance) {
		userBalance = balance;
		userName = name;
	}
	
	void debitAccount(double amount){
		if(amount > userBalance) {
			System.out.println("Insufficient Balance for this transaction");
		}else {
			System.out.println(userName + "Account debited with amount: " + amount);
			userBalance -= amount;
			userDebit ++;
			bankDebit ++;
		}
	}
	
	void creditAccount(double amount) {
		if(amount <= 0) {
			System.out.println("Amount should be greater than Zero. Please enter valid amount to credit");
		}else {
			System.out.println(userName + "Account Credit with amount: " + amount);
			userBalance += amount;
			userCredit ++;
			bankCredit ++;
		}
	}
	
	void printBalance() {
		System.out.println(userName + " Account Balance is: " + userBalance);
		userPrintBalance++;
		bankPrintBalance++;
	}
	
	static void allTransactionSummary() {
		
		System.out.println("All transaction summary : Credit - " + bankCredit + " times, Debit - " + bankDebit + " times, printBalance - " + bankPrintBalance + " time");
	}
	
	void individualTransactionSummary() {
		System.out.println(userName + " transaction summary : Credit - " + userCredit + " times, Debit - " + userDebit + " times, printBalance - " + userPrintBalance + " time");		
	}
	
	
	public static void main(String[] args) {
		Bank bankUser1 = new Bank();
		bankUser1.setUserDetails("Mahesh", 100000);
		bankUser1.debitAccount(9000);
		bankUser1.creditAccount(4000);
		bankUser1.creditAccount(1000);
		bankUser1.printBalance();
		System.out.println("========================================================================");
		Bank bankUser2 = new Bank();
		bankUser2.setUserDetails("Mahi", 50000);
		bankUser2.debitAccount(8000);
		bankUser2.creditAccount(4000);
		bankUser2.creditAccount(1000);
		bankUser2.creditAccount(1000);
		bankUser2.creditAccount(1000);
		bankUser2.creditAccount(1000);
		bankUser2.debitAccount(5000);
		System.out.println("========================================================================");
		bankUser1.individualTransactionSummary();
		bankUser2.individualTransactionSummary();
		Bank.allTransactionSummary();
		
	}

}
