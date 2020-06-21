package maheshKJun20;

import java.util.Scanner;

public class AccountManagementUsingScanner {
	
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
					default:
						System.out.println("Please Select correct Transaction Type: credit/debit");
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
					default:
						System.out.println("Please Select correct Transaction Type: credit/debit");
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
					default:
						System.out.println("Please Select correct Transaction Type: credit/debit");
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
					default:
						System.out.println("Please Select correct Transaction Type: credit/debit");
				}
				break;
			default:
				System.out.println("Please select correct Bank for transaction");
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
		AccountManagementUsingScanner  accountManagement = new AccountManagementUsingScanner();
		accountManagement.setCustomerDetails("Mahesh", 50000, 60000, 70000, 80000);
		Scanner scanner = new Scanner(System.in);
		String status = "Yes";
		while (status.equalsIgnoreCase("Yes")) {
			System.out.println("Please select Action to perform (Enter 1/2/3/4): \n 1. Credit/Debit \n 2. Check Balance \n 3. Check Transaction Summary \n 4. Money utilization feeback");
			int customerAction = scanner.nextInt();
			if (customerAction == 1) {
				System.out.println("Please enter Bank name for transaction: \n 1. sbi \n 2. icici \n 3. hdfc \n 4. bob");
				String bankName = scanner.next();
				if (bankName.equals("sbi") || bankName.equals("icici") || bankName.equals("hdfc") || bankName.equals("bob")) {
					System.out.println("Please enter Transaction Type: \n 1. credit \n 2. debit");
					String transactionType = scanner.next();
					if (transactionType.equals("credit") || transactionType.equals("debit")) {
						System.out.println("Please amount Transaction amout");
						double amount = scanner.nextInt();
						accountManagement.accountTransaction(bankName, transactionType, amount);
					}else {
						System.out.println("Please select correct transaction Type");
					}
				}else {
					System.out.println("Please select Correct Bank Name for transaction");
				}
				
			}else if(customerAction == 2) {
				accountManagement.checkCumulativeBalance();
			}else if(customerAction == 3) {
				System.out.println("Please select Transaction Summary type (Enter 1/2/3): \n 1. Total Summary of all banks. \n 2. Individual Bank Debit Summary \n 3. Individual Bank Credit Summary");
				int summaryType = scanner.nextInt();
				if (summaryType == 1) {
					accountManagement.checkCumulativeTransactionSummary();
				}else if(summaryType == 2) {
					accountManagement.checkBankDebitSummary();
				}else if(summaryType == 3) {
					accountManagement.checkBankCreditSummary();
				}else {
					System.out.println("Invalid option selected. Please try again");
				}
			}else if(customerAction == 4) { 
				accountManagement.moneyUtilization();
			}else {
				System.out.println("Invalid option selected. Please try again");
			}
			System.out.println("Do you want to continue? (Yes/No)");
			status = scanner.next();
		}
		System.out.println("Good bye. Have a nice day :-)");
	}

}
