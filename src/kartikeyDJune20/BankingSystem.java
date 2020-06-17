package kartikeyDJune20;

public class BankingSystem {
	int totalBalance = 9000;
	int amtDebit;
	int amtCredit;
	int printBalance;
	static int allCredit, allDebit, allPrintBalance;

	void amountCredit(int credit) {
		totalBalance += credit;
		amtCredit++;
		allCredit++;
	}

	void amountDebit(int debit) {
		totalBalance -= debit;
		amtDebit++;
		allDebit++;
	}

	void printBalance() {
		printBalance++;
		allPrintBalance++;
	}

	void userTransactionSummary() {

		System.out.println("\n" + "\n" + "User transaction Summary as follows :" + "\n"
				+ "No. of times accounts is credited:" + amtCredit + "\n" + "No. of times accounts debited:" + amtDebit
				+ "\n" + "No. of times Balance in the Account is printed:" + printBalance + "\n"
				+ "Total balance in the acount:" + totalBalance);
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.amountCredit(300);
		bankingSystem1.amountCredit(200);
		bankingSystem1.amountDebit(600);
		bankingSystem1.printBalance();
		bankingSystem1.userTransactionSummary();
		bankingSystem2.amountCredit(400);
		bankingSystem2.amountCredit(900);
		bankingSystem2.amountDebit(1600);
		bankingSystem2.printBalance();
		bankingSystem2.userTransactionSummary();
		System.out.println("\n" + "\n" + "Bank transaction Summary as follows :" + "\n"
				+ "No. of times accounts are credited:" + allCredit + "\n" + "No. of times accounts are debited:"
				+ allDebit + "\n" + "No. of times Balance in the Accounts is printed:" + allPrintBalance);

	}

}
