package rachanaGJun20.bankingsystem;

import java.util.Scanner;

public class Banking {

	Icici icici = new Icici();
	Sbi sbi = new Sbi();
	Bob bob = new Bob();
	Hdfc hdfc = new Hdfc();

	static void displayIndividualBankDebitTransaction() {
		System.out.println("\nTotal Individual bank Debit Transactions count:");
		System.out.println("ICICI: Debit Count: " + Icici.debitCount);
		System.out.println("SBI: Debit Count: " + Sbi.debitCount);
		System.out.println("BOB: Debit Count: " + Bob.debitCount);
		System.out.println("HDFC: Debit Count: " + Hdfc.debitCount);
	}

	static void displayIndividualBankCreditTransaction() {
		System.out.println("\nTotal Individual bank Credit Transactions count:");
		System.out.println("ICICI: Credit Count: " + Icici.creditCount);
		System.out.println("SBI: Credit Count: " + Sbi.creditCount);
		System.out.println("BOB: Credit Count: " + Bob.creditCount);
		System.out.println("HDFC: Credit Count: " + Hdfc.creditCount);
	}

	static void displayAllBankTransactions() {
		System.out.println("\nTotal All banks Transactions count\nDebit Count: " + BankOperation.totalDebitCount
				+ "\nCredit Count: " + BankOperation.totalCreditCount);
	}

	void bankingOperations(String bankName, double amount, String operation) {

		switch (bankName) {

		case "ICICI": {

			switch (operation) {
			case "Debit": {
				icici.debitOperation(amount);
				break;
			}
			case "Credit": {
				icici.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}
		case "SBI": {
			switch (operation) {
			case "Debit": {
				sbi.debitOperation(amount);
				break;
			}
			case "Credit": {
				sbi.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");

			}
			break;
		}
		case "BOB": {
			switch (operation) {
			case "Debit": {
				bob.debitOperation(amount);
				break;
			}
			case "Credit": {
				bob.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}
		case "HDFC": {
			switch (operation) {
			case "Debit": {
				hdfc.debitOperation(amount);
				break;
			}
			case "Credit": {
				hdfc.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}

		default:
			System.out.println("Invalid Bank Name!");
		}
	}

	void displayTotalBankBalance() {

		System.out.println("\nTotal Bank balance of a person:"
				+ (icici.getBalance() + sbi.getBalance() + hdfc.getBalance() + bob.getBalance()) + "\n");

	}


	}
