package maheshKJun20;

public class AccountManagement {
	
	String customerName;
	double sbiAccountBalance, iciciAccountBalance, hdfcAccountBalance, bobAccountBalance;
	int sbiCredit, iciciCredit, hdfcCredit, bobCredit, sbiDebit, iciciDebit, hdfcDebit, bobDebit;
	
	void setCustomerDetails(String name, double sbiBalance, double iciciBalance,double hdfcBalance,double bobBalance) {
		//Method to set Customer details
		customerName = name;
		sbiAccountBalance = sbiBalance;
		iciciAccountBalance = iciciBalance;
		hdfcAccountBalance = hdfcBalance;
		bobAccountBalance = bobBalance;
	}
	
	void accountTransaction(String bankName, String transactionType,double amount) {
		//Method to Perform Customer Transaction
		switch (bankName) {
			case "sbi":
				switch (transactionType) {
					case "credit":
						if (amount <= 0) {
							System.out.println("Amout to be credit should be greater than Zero. Please enter valid amount");
						}
						else {
							sbiAccountBalance += amount;
							sbiCredit += 1;
						}
						break;
					case "debit":
						if (amount > sbiAccountBalance) {
							System.out.println("Insuffienct balance for this transaction. Please try again");
						}
						else {
							sbiAccountBalance -= amount;
							sbiDebit += 1;
						}
						break;
				}
				break;
			case "icici":
				switch (transactionType) {
					case "credit":
						if (amount <= 0) {
							System.out.println("Amout to be credit should be greater than Zero. Please enter valid amount");
						}
						else {
							iciciAccountBalance += amount;
							iciciCredit += 1;
						}
						break;
					case "debit":
						if (amount > iciciAccountBalance) {
							System.out.println("Insuffienct balance to this transaction. Please try again");
						}
						else {
							iciciAccountBalance -= amount;
							iciciDebit += 1;
						}
						break;
				}
				break;
			case "hdfc":
				switch (transactionType) {
					case "credit":
						if (amount <= 0) {
							System.out.println("Amout to be credit should be greater than Zero. Please enter valid amount");
						}
						else {
							hdfcAccountBalance += amount;
							hdfcCredit += 1;
						}
						break;
					case "debit":
						if (amount > hdfcAccountBalance) {
							System.out.println("Insuffienct balance to this transaction. Please try again");
						}
						else {
							hdfcAccountBalance -= amount;
							hdfcDebit += 1;
						}
						break;
				}
				break;
			case "bob":
				switch (transactionType) {
					case "credit":
						if (amount <= 0) {
							System.out.println("Amout to be credit should be greater than Zero. Please enter valid amount");
						}
						else {
							bobAccountBalance += amount;
							bobCredit += 1;
						}
						break;
					case "debit":
						if (amount > bobAccountBalance) {
							System.out.println("Insuffienct balance to this transaction. Please try again");
						}
						else {
							bobAccountBalance -= amount;
							bobDebit += 1;
						}
						break;
				}
				break;
		}
	}
	
	int getTotalCreditTransation() {
		//Method to get total Credit Transaction by Customer
		return (sbiCredit + iciciCredit + hdfcCredit + bobCredit);
	}
	
	int getTotalDebitTransation() {
		//Method to get total Debit Transaction by Customer
		return (sbiDebit + iciciDebit + hdfcDebit + bobDebit);
	}
	
	void checkCumulativeBalance() {
		//Method to get total Balance in Customer Accounts
		System.out.println("Cumulative Balance in all your account is: " + (sbiAccountBalance + iciciAccountBalance + hdfcAccountBalance + bobAccountBalance) + "\n");
	}
	
	void checkCumulativeTransactionSummary() {
		//Method to check Total Credit and Debit Transaction of customer in all accounts
		System.out.println("Total credit operation: " + getTotalCreditTransation() + "\n" + "Total debit operation: " + getTotalDebitTransation() + "\n");
	}
	
	void checkBankCreditSummary() {
//		Method to check Credit Transaction by Customer in Individual account
		System.out.println("ICICI bank Credit Operation - " + iciciCredit + "\n" + "SBI bank Credit Operation - " + sbiCredit + "\n" + "HDFC bank Credit Operation - " + hdfcCredit + "\n" + "BOB bank Credit Operation - " + bobCredit + "\n");		
	}
	
	void checkBankDebitSummary() {
//		Method to check Debit Transaction by Customer in Individual account
		System.out.println("ICICI bank Debit Operation - " + iciciDebit + "\n" + "SBI bank Debit Operation - " + sbiDebit + "\n" + "HDFC bank Debit Operation - " + hdfcDebit + "\n" + "BOB bank Debit Operation - " + bobDebit + "\n");
	}
	
	void moneyUtilization() {
//		Method to check Money spending habit of Customer
		if (getTotalCreditTransation() > getTotalDebitTransation()) {
			System.out.println("*I appreciate your money management skill*");
		}
		else if (getTotalCreditTransation() < getTotalDebitTransation()) {
			System.out.println("*Please spend money wisely*");
		}
		else {
			System.out.println("Trasaction are in balance");
		}
	}
	
	
	public static void main(String[] args) {
		AccountManagement  accountManagement = new AccountManagement();
		accountManagement.setCustomerDetails("Mahesh", 50000, 60000, 70000, 80000);
		accountManagement.accountTransaction("sbi", "credit", 100);
		accountManagement.accountTransaction("icici", "credit", 1);
		accountManagement.accountTransaction("icici", "credit", 1000);
		accountManagement.accountTransaction("hdfc", "credit", 1000);
		accountManagement.accountTransaction("hdfc", "credit", 1000);
		accountManagement.accountTransaction("bob", "credit", 1000);
		accountManagement.accountTransaction("bob", "credit", 1000);
		accountManagement.accountTransaction("sbi", "debit", 1000);
		accountManagement.accountTransaction("icici", "debit", 1000);
		accountManagement.accountTransaction("icici", "debit", 1000);
		accountManagement.accountTransaction("hdfc", "debit", 1000);
		accountManagement.accountTransaction("bob", "debit", 1000);
		
		accountManagement.checkCumulativeBalance();
		accountManagement.checkCumulativeTransactionSummary();
		accountManagement.checkBankCreditSummary();
		accountManagement.checkBankDebitSummary();
		accountManagement.moneyUtilization();
	}
}
