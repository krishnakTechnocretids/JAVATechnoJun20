package deavinaSJun20;

import java.util.Scanner;

public class BankingSystemUsingScanner {
	int debitICICICount, creditICICICount, debitHDFCCount, creditHDFCCount, debitBOBCount, creditBOBCount,
			debitSBICount, creditSBICount;
	double iciciBankBalance, hdfcBankBalance, bobBankBalance, sbiBankBalance;
	static int allBankDebitCount, allBankCreditCount;

	void bankTransactions(String bankName, double amount, String bankOperation) {
		switch (bankName) {
		case "ICICI":
			switch (bankOperation) {
			case "Credit":
			case "credit":
				iciciBankBalance += amount;
				creditICICICount++;
				allBankCreditCount++;
				break;
			case "Debit":
			case "debit":
				if (amount <= iciciBankBalance) {
					iciciBankBalance -= amount;
					debitICICICount++;
					allBankDebitCount++;
				} else {
					System.out.println("Insufficient Bank Balance in ICICI. Your Bank Balance is " + iciciBankBalance);
				}
				break;
			default:
				System.out.println("Invalid Bank Operation");
			}
			break;
		// HDFC case starting
		case "HDFC":
			switch (bankOperation) {
			case "Credit":
			case "credit":
				hdfcBankBalance += amount;
				creditHDFCCount++;
				allBankCreditCount++;
				break;
			case "Debit":
			case "debit":
				if (amount <= hdfcBankBalance) {
					hdfcBankBalance -= amount;
					debitHDFCCount++;
					allBankDebitCount++;
				} else {
					System.out.println("Insufficient Bank Balance in HDFC. Your Bank Balance is " + hdfcBankBalance);
				}
				break;
			default:
				System.out.println("Invalid Bank Operation");
			}
			break;
		// BOB case starting
		case "BOB":
			switch (bankOperation) {
			case "Credit":
			case "credit":
				bobBankBalance += amount;
				creditBOBCount++;
				allBankCreditCount++;
				break;
			case "Debit":
			case "debit":
				if (amount <= bobBankBalance) {
					bobBankBalance -= amount;
					debitBOBCount++;
					allBankDebitCount++;
				} else {
					System.out.println("Insufficient Bank Balance in BOB. Your Bank Balance is " + bobBankBalance);
				}
				break;
			default:
				System.out.println("Invalid Bank Operation");
			}
			break;
		// SBI case starting
		case "SBI":
			switch (bankOperation) {
			case "Credit":
			case "credit":
				sbiBankBalance += amount;
				creditSBICount++;
				allBankCreditCount++;
				break;
			case "Debit":
			case "debit":
				if (amount <= sbiBankBalance) {
					sbiBankBalance -= amount;
					debitSBICount++;
					allBankDebitCount++;
				} else {
					System.out.println("Insufficient Bank Balance in SBI. Your Bank Balance is " + sbiBankBalance);
				}
				break;
			default:
				System.out.println("Invalid Bank Operation");
			}
			break;

		default:
			System.out.println("Invalid Bank Name");

		}
	}

	void printBankBalance() {
		System.out.println("\nBank Balance of ICICI : " + iciciBankBalance);
		System.out.println("Bank Balance of HDFC : " + hdfcBankBalance);
		System.out.println("Bank Balance of BOB : " + bobBankBalance);
		System.out.println("Bank Balance of SBI : " + sbiBankBalance);
		System.out.println("Total Bank Balance : "
				+ (iciciBankBalance + hdfcBankBalance + bobBankBalance + sbiBankBalance) + "\n");
	}

	void printAllBankOperation() {
		System.out.println("\nTotal Credit Operations performed  : " + allBankCreditCount);
		System.out.println("Total Debit Operation performed : " + allBankDebitCount);
	}

	void bankCreditOperations() {
		System.out.println("\nICICI Bank Credit Operations performed: " + creditICICICount);
		System.out.println("HDFC Bank Credit Operations performed : " + creditHDFCCount);
		System.out.println("BOB Bank Credit Operations performed : " + creditBOBCount);
		System.out.println("SBI Bank Credit Operations performed : " + creditSBICount);
	}

	void bankDebitOperations() {
		System.out.println("\nICICI Bank Debit Operations performed : " + debitICICICount);
		System.out.println("HDFC Bank Debit Operations performed : " + debitHDFCCount);
		System.out.println("BOB Bank Debit Operations performed : " + debitBOBCount);
		System.out.println("SBI Bank Debit Operations performed : " + debitSBICount);
	}

	String printMessage() {
		if (allBankCreditCount > allBankDebitCount) {
			return "*You have got really good money management skill*";
		} else {
			return "*Please spend your money wisely, you spend a lot of money*";
		}
	}

	public static void main(String[] args) {
		BankingSystemUsingScanner bankOperationUsingScanner = new BankingSystemUsingScanner();
		Scanner scanner = new Scanner(System.in);

		String bankName, bankOp, status, bankBal, bankDebitOp, bankCreditOp, bankDebitCreditOp;
		double bankAmt;
		do {
			System.out.println("Please select the Bank to perform the operation from ICICI/HDFC/SBI/BOB: ");
			bankName = scanner.next();
			if (!bankName.equalsIgnoreCase("ICICI") && !bankName.equalsIgnoreCase("HDFC")
					&& !bankName.equalsIgnoreCase("SBI") && !bankName.equalsIgnoreCase("BOB")) {
				System.out.println("Please enter valid Bank Name again from ICICI/HDFC/SBI/BOB");
				bankName = scanner.next();
			}
			bankName = bankName.toUpperCase();
			//select operation to perform
			System.out.println("Which operation would you like to perform on " + bankName + " Bank: Debit/Credit");
			bankOp = scanner.next();
			if (!bankOp.equalsIgnoreCase("Debit") && !bankOp.equalsIgnoreCase("Credit")) {
				System.out.println("Please enter valid Bank Operation from Debit/Credit");
				bankOp = scanner.next();
			}
			//select amount to credit/debit.
			System.out.println("How much amount would you like to " + bankOp + " from/in your " + bankName + " Bank?");
			bankAmt = scanner.nextDouble();
			bankOperationUsingScanner.bankTransactions(bankName, bankAmt, bankOp);
			//see the bank balance
			System.out.println("Would you like to see your bank balance of all the Banks: Yes/No");
			bankBal = scanner.next();
			if (bankBal.equalsIgnoreCase("Yes"))
				bankOperationUsingScanner.printBankBalance();
			// see the debit operations
			System.out.println("Would you like to see number of Debit Operations you have performed: Yes/No");
			bankDebitOp = scanner.next();
			if (bankDebitOp.equalsIgnoreCase("Yes"))
				bankOperationUsingScanner.bankDebitOperations();
			//see the credit operations
			System.out.println("Would you like to see number of Credit Operations you have performed: Yes/No");
			bankCreditOp = scanner.next();
			if (bankCreditOp.equalsIgnoreCase("Yes"))
				bankOperationUsingScanner.bankCreditOperations();
			// see the total debit and credit operations
			System.out.println(
					"Would you like to see total number of Debit & Credit Operations you have performed: Yes/No");
			bankDebitCreditOp = scanner.next();
			if (bankDebitCreditOp.equalsIgnoreCase("Yes"))
				bankOperationUsingScanner.printAllBankOperation();
			// message to print continue
			System.out.println("Would you like to continue with your Bank Transactions: Yes/No");
			status = scanner.next();
		} while (status.equalsIgnoreCase("Yes"));

		scanner.close();
	}

}
