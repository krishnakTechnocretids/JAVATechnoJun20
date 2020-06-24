package ajitSJune20;

public class BankingSystem {

	int debitCount, creditCount, printBalanceCount, currentBalance;
	static int totalDebitCount, totalCreditCount, TotalPrintBalanceCount;

	int creditAmount(int creditAmt) {
		currentBalance = currentBalance + creditAmt;
		System.out.println("Credit Amount : " + creditAmt);
		totalCreditCount++;
		return creditCount++;

	}

	int debitAmount(int debitAmt) {
		if (debitAmt > 0 && debitAmt < currentBalance) {
			System.out.println("Debit Amount  : " + debitAmt);
			currentBalance = currentBalance - debitAmt;
			totalDebitCount++;
			return debitCount++;
		} else {
			System.out.println("Either Debit amount is Invalid or Debit amount Exceeded current Balance");
			return debitCount;
		}
	}

	int printBalanceSummary(String userName) {
		System.out.println(userName + " 's Current Balance : " + currentBalance);
		TotalPrintBalanceCount++;
		return printBalanceCount++;

	}

	void individualTransactionSummary() {
		System.out.println("\nTransaction Summary:\n--------------------\n" + "Credit : " + creditCount + " times, "
				+ "Debit : " + debitCount + " times, " + "PrintBalance : " + printBalanceCount + " times\n");

	}

	void allTransactionSummary() {
		System.out
				.println("\nOverAll Transaction Summary:\n==========================================================\n"
						+ "Credit : " + totalCreditCount + " times, " + "Debit  : " + totalDebitCount + " times, "
						+ "PrintBalance : " + TotalPrintBalanceCount + " times\n");

	}

	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.creditAmount(12000);
		bankingSystem.creditAmount(2000);
		bankingSystem.debitAmount(6000);
		bankingSystem.printBalanceSummary("Ajit");
		bankingSystem.individualTransactionSummary();

		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.creditAmount(4000);
		bankingSystem1.debitAmount(200);
		bankingSystem1.printBalanceSummary("Ajju");
		bankingSystem1.individualTransactionSummary();
		bankingSystem1.allTransactionSummary();
	}
}
