package deavinaSJun20;

public class BankingSystem {
	double balanceIcici;
	double balanceHdfc;
	double balanceBob;
	double balanceSbi;
	int iciciCredit;
	int iciciDebit;
	int hdfcCredit;
	int hdfcDebit;
	int bobCredit;
	int bobDebit;
	int sbiCredit;
	int sbiDebit;
	static int countCredit;
	static int countDebit;

	void bankOperation(String bankName, double amount, String operation) {
		switch (bankName) {
		case "ICICI":
				switch (operation) {
				case "Credit":
					balanceIcici += amount;
					countCredit++;
					iciciCredit++;
					break;
				case "Debit":
					if (balanceIcici >= amount) {
						balanceIcici -= amount;
						countDebit++;
						iciciDebit++;
					} else {
						System.out.println("*You have Insufficient balance in ICICI account*");
					}
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
		case "HDFC":
				switch (operation) {
				case "Credit":
					balanceHdfc += amount;
					countCredit++;
					hdfcCredit++;
					break;
				case "Debit":
					if (balanceHdfc >= amount) {
						balanceHdfc -= amount;
						countDebit++;
						hdfcDebit++;
					} else
						System.out.println("*You have Insufficient balance in HDFC account*");
					break;
	
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
		case "BOB":
				switch (operation) {
				case "Credit":
					balanceBob += amount;
					countCredit++;
					bobCredit++;
					break;
				case "Debit":
					if (balanceBob >= amount) {
						balanceBob -= amount;
						countDebit++;
						bobDebit++;
					} else
						System.out.println("*You have Insufficient balance in BOB account*");
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
		case "SBI":
				switch (operation) {
				case "Credit":
					balanceSbi += amount;
					countCredit++;
					sbiCredit++;
					break;
				case "Debit":
					if (balanceSbi >= amount) {
						balanceSbi -= amount;
						countDebit++;
						sbiDebit++;
					} else
						System.out.println("*You have Insufficient balance in SBI account*");
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
		}
	}

	void totalBalanceOfAllAccount() {
		System.out.println(
				"Total balance of all the bank accounts : " + (balanceIcici + balanceHdfc + balanceBob + balanceSbi));
	}

	void totalCreditDebitOperation() {
		System.out.println("Total Credit operations have been performed " + countCredit + " times");
		System.out.println("Total Debit operations have been performed " + countDebit + " times");
	}

	void individualBkCreditOperation() {
		System.out.println("ICICI Bank Credit operation :- " + iciciCredit);
		System.out.println("HDFC Bank Credit operation :- " + hdfcCredit);
		System.out.println("BOB Bank Credit operation :- " + bobCredit);
		System.out.println("SBI Bank Credit operation :- " + sbiCredit);
	}

	void individualBkDebitOperation() {
		System.out.println("ICICI Bank Debit operation :- " + iciciDebit);
		System.out.println("HDFC Bank Debit operation :- " + hdfcDebit);
		System.out.println("BOB Bank Debit operation :- " + bobDebit);
		System.out.println("SBI Bank Debit operation :- " + sbiDebit);
	}

	String message() {
		if (countCredit >= countDebit)
			return "*You have got really good money management skill*";
		else
			return "*Please spend your money wisely, you spend a lot of money*";
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		// ICICI operations
		bankingSystem.bankOperation("ICICI", 9999, "Credit");
		bankingSystem.bankOperation("ICICI", 813, "Debit");
		bankingSystem.bankOperation("ICICI", 1617, "Credit");
		// HDFC operations
		bankingSystem.bankOperation("HDFC", 5412, "Debit");
		bankingSystem.bankOperation("HDFC", 7125, "Credit");
		// BOB operations
		bankingSystem.bankOperation("BOB", 4321, "Credit");
		bankingSystem.bankOperation("BOB", 1234, "Credit");
		bankingSystem.bankOperation("BOB", 1411, "Debit");
		bankingSystem.bankOperation("BOB", 4555, "Debit");
		// SBI operations
		bankingSystem.bankOperation("SBI", 4245, "Credit");
		bankingSystem.bankOperation("SBI", 8783, "Credit");
		bankingSystem.totalBalanceOfAllAccount();
		bankingSystem.totalCreditDebitOperation();
		bankingSystem.individualBkCreditOperation();
		bankingSystem.individualBkDebitOperation();
		System.out.println(bankingSystem.message());
	}
}
