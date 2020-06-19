package vireshJJun20;

class BankTransactions {

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

	void TotalBalance() {
		totalBal = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println("**Total Balance you hold Rs." + (int) totalBal);
	}

	String displayTotalCreditDebit() {
		System.out.println("**Todays overall transaction History for you**");
		System.out.println(" - Total Credits: " + (int) tCreditCnt);
		System.out.println(" - Total Debits: " + (int) tDebitCnt);
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
		System.out.println("** Here is your individual Credit details**");
		System.out.println(" - ICICI bank: " + (int) iciciCreditCnt);
		System.out.println(" - HDFC bank: " + (int) hdfcCreditCnt);
		System.out.println(" - SBI bank: " + (int) sbiCreditCnt);
		System.out.println(" - BOB bank: " + (int) bobCreditCnt);
		System.out.println("");
	}

	void displayIndBankDebitOperation() {
		System.out.println("** and your individual Debit details**");
		System.out.println(" - ICICI bank: " + (int) iciciDebitCnt);
		System.out.println(" - HDFC bank: " + (int) hdfcDebitCnt);
		System.out.println(" - SBI bank: " + (int) sbiDebitCnt);
		System.out.println(" - BOB bank: " + (int) bobDebitCnt);
		System.out.println("");
	}

	boolean bankOperation(String bankName, double amount, String operation) {
		switch (bankName) {
		case "ICICI":
			switch (operation) {
			case "Debit":
				iciciBal = iciciBal - amount;
				tDebitCnt++;
				iciciDebitCnt++;
				break;
			case "Credit":
				iciciBal = iciciBal + amount;
				tCreditCnt++;
				iciciCreditCnt++;
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "HDFC":
			switch (operation) {
			case "Debit":
				hdfcBal = hdfcBal - amount;
				tDebitCnt++;
				hdfcDebitCnt++;
				break;
			case "Credit":
				hdfcBal = hdfcBal + amount;
				tCreditCnt++;
				hdfcCreditCnt++;
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "SBI":
			switch (operation) {
			case "Debit":
				sbiBal = sbiBal - amount;
				tDebitCnt++;
				sbiDebitCnt++;
				break;
			case "Credit":
				sbiBal = sbiBal + amount;
				tCreditCnt++;
				sbiCreditCnt++;
				break;
			default:
				System.out.println("Invalid transaction Type");
				invalidChoice = true;
			}
			break;
		case "BOB":
			switch (operation) {
			case "Debit":
				bobBal = bobBal - amount;
				tDebitCnt++;
				bobDebitCnt++;
				break;
			case "Credit":
				bobBal = bobBal + amount;
				tCreditCnt++;
				bobCreditCnt++;
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
		BankTransactions bankTransactions = new BankTransactions();
		System.out.println("Hello There, your Personal Money Manager welcomes you!!");
		System.out.println("");
		bankTransactions.bankOperation("BOB", 10000, "Credit");
		bankTransactions.bankOperation("SBI", 10000, "Debit");
		bankTransactions.bankOperation("HDFC", 10000, "Credit");
		bankTransactions.bankOperation("ICICI", 10000, "Debit");
		bankTransactions.bankOperation("ICICI", 5000, "Credit");
		bankTransactions.bankOperation("ICICI", 500, "Debit");
		if (bankTransactions.invalidChoice == false) {
			bankTransactions.TotalBalance();
			System.out.println("");
			bankTransactions.displayIndBankCreditOperation();
			bankTransactions.displayIndBankDebitOperation();
			System.out.print(bankTransactions.displayTotalCreditDebit());
			System.out.println("  Have a wonderful time ahead.");
		}
	}
}
