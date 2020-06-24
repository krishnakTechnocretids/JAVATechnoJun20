package vireshJJun20.ScannerDemo1;

import java.util.Scanner;

public class ScannerDemo {

	double iciciBal;
	double hdfcBal;
	double bobBal;
	double sbiBal;
	double totalBal;
	double tCreditCnt;
	double iciciCreditCnt;
	double hdfcCreditCnt;
	double bobCreditCnt;
	double sbiCreditCnt;
	double tDebitCnt;
	double iciciDebitCnt;
	double hdfcDebitCnt;
	double bobDebitCnt;
	double sbiDebitCnt;
	boolean invalidChoice;
	boolean bdecision;

	void TotalBalance() {
		totalBal = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println("**Total Balance you hold Rs." + (int) totalBal);
	}

	String displayTotalCreditDebit() {
		System.out.println(" Your overall banking transactions History");
		System.out.println("    Total Credits: " + (int) tCreditCnt);
		System.out.println("    Total Debits: " + (int) tDebitCnt);
		System.out.println("");
		System.out.println("**Advise for today** (based on your total inward vs outward transactions)");
		if (tCreditCnt > tDebitCnt)
			return "  Ahaa! I appreciate your money management skill";
		else if (tCreditCnt == tDebitCnt)
			return "  Make a choice! to either earn more or spend less!!";
		else
			return "  You need to spend your money wisely!!";
	}

	void displayIndBankCreditOperation() {
		System.out.println(" Below is your bank-wise Credit details");
		System.out.println("    ICICI bank: " + (int) iciciCreditCnt);
		System.out.println("    HDFC bank: " + (int) hdfcCreditCnt);
		System.out.println("    SBI bank: " + (int) sbiCreditCnt);
		System.out.println("    BOB bank: " + (int) bobCreditCnt);
		System.out.println("");
	}

	void displayIndBankDebitOperation() {
		System.out.println(" Below is your bank-wise Debit details");
		System.out.println("    ICICI bank: " + (int) iciciDebitCnt);
		System.out.println("    HDFC bank: " + (int) hdfcDebitCnt);
		System.out.println("    SBI bank: " + (int) sbiDebitCnt);
		System.out.println("    BOB bank: " + (int) bobDebitCnt);
		System.out.println("");
	}

	boolean bankOperation(String bankName, double amount, String operation) {
		switch (bankName) {
		case "ICICI":
		case "icici":
			switch (operation) {
			case "Debit":
			case "debit":
				if (iciciBal >= amount) {
					iciciBal = iciciBal - amount;
					tDebitCnt++;
					iciciDebitCnt++;
				} else {
					System.out.println("Insufficient balance." + iciciBal);
				}
				System.out.println("ICICI balance: " + iciciBal);
				break;
			case "Credit":
			case "credit":
				iciciBal = iciciBal + amount;
				tCreditCnt++;
				iciciCreditCnt++;
				System.out.println("ICICI balance: " + iciciBal);
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "HDFC":
		case "hdfc":
			switch (operation) {
			case "Debit":
			case "debit":
				if (hdfcBal >= amount) {
					hdfcBal = hdfcBal - amount;
					tDebitCnt++;
					hdfcDebitCnt++;
				} else {
					System.out.println("Insufficient balance." + hdfcBal);
				}
				System.out.println("HDFC balance: " + iciciBal);
				break;
			case "Credit":
			case "credit":
				hdfcBal = hdfcBal + amount;
				tCreditCnt++;
				hdfcCreditCnt++;
				System.out.println("HDFC balance: " + iciciBal);
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "SBI":
		case "sbi":
			switch (operation) {
			case "Debit":
			case "debit":
				if (sbiBal >= amount) {
					sbiBal = sbiBal - amount;
					tDebitCnt++;
					sbiDebitCnt++;
				} else {
					System.out.println("Insufficient balance." + sbiBal);
				}
				System.out.println("SBI balance: " + sbiBal);
				break;
			case "Credit":
			case "credit":
				sbiBal = sbiBal + amount;
				tCreditCnt++;
				sbiCreditCnt++;
				System.out.println("SBI balance: " + sbiBal);
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "BOB":
		case "bob":
			switch (operation) {
			case "Debit":
			case "debit":
				if (bobBal >= amount) {
					bobBal = bobBal - amount;
					tDebitCnt++;
					bobDebitCnt++;
				} else {
					System.out.println("Insufficient balance." + bobBal);
				}
				System.out.println("BOB balance: " + bobBal);
				break;
			case "Credit":
			case "credit":
				bobBal = bobBal + amount;
				tCreditCnt++;
				bobCreditCnt++;
				System.out.println("BOB balance: " + bobBal);
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		default:
			System.out.println("Invalid bank");
			invalidChoice = true;
		}
		return invalidChoice;
	}

	public static void main(String[] args) {
		ScannerDemo scannerDemo = new ScannerDemo();
		String newLine = System.getProperty("line.separator");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello There, your Personal Money Manager welcomes you!!");
		System.out.println(" You hold bank accounts in below banks:");
		System.out.println(" - ICICI" + newLine + " - HDFC" + newLine + " - SBI" + newLine + " - BOB");
		String deci;
		do {
			System.out.print(" Please select your Bank: ");
			String bName = scanner.next();
			System.out.print("   Please enter transaction type:(Debit/Credit): ");
			String tName = scanner.next();
			System.out.print("   Please enter ammount: ");
			double amt = scanner.nextDouble();

			scannerDemo.bankOperation(bName, amt, tName);
			System.out.println("**Your transaction is completed successfully**" + newLine);

			System.out.print(" Do you want to continue with another transaction:(Yes/No) ");
			deci = scanner.next();
		} while (deci.equals("Yes"));

		if (scannerDemo.invalidChoice == false) {
			scannerDemo.TotalBalance();
			System.out.println("");
			System.out.print(" Do you want to check your bank-wise credit details:(Yes/No) ");
			String indCreditOperation = scanner.next();
			if (indCreditOperation.equals("Yes"))
				scannerDemo.displayIndBankCreditOperation();
			System.out.print(" Do you want to check your bank-wise debit details:(Yes/No)");
			String indDebitOperation = scanner.next();
			if (indDebitOperation.equals("Yes"))
				scannerDemo.displayIndBankDebitOperation();
			System.out.print(" Do you want to check over all credit-debit details:(Yes/No)");
			String TotalCreditDebitOperation = scanner.next();
			if (TotalCreditDebitOperation.equals("Yes"))
				System.out.print(scannerDemo.displayTotalCreditDebit());

		}
		System.out.println(" Have a wonderful time ahead.");
	}
}
