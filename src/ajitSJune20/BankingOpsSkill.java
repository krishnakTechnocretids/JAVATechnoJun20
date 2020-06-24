package ajitSJune20;

public class BankingOpsSkill {

	double iciciBalance, sbiBalance, bobBalance, hdfcBalance;
	int iciciCreditCount, sbiCreditCount, bobCreditCount, hdfcCreditCount;
	int iciciDebitCount, sbiDebitCount, bobDebitCount, hdfcDebitCount;
	static int totalDebitCount, totalCreditCount;

	void bankOperation(String bankName, double amount, String operation) {
		switch (bankName) {
		case "ICICI":
			switch (operation) {
			case "Debit":
				if (iciciBalance >= amount) {
					iciciBalance -= amount;
					iciciDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("Insufficient Balance for Withdrawl in ICICI Bank");
				}
				break;
			case "Credit":
				iciciBalance += amount;
				iciciCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in ICICI Bank!");
			}
			break;

		case "HDFC":
			switch (operation) {
			case "Debit":
				if (hdfcBalance >= amount) {
					hdfcBalance -= amount;
					hdfcDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("Insufficient Balance for Withdrawl in HDFC Bank");
				}
				break;
			case "Credit":
				hdfcBalance += amount;
				hdfcCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in HDFC Bank !");
			}
			break;

		case "BOB":
			switch (operation) {
			case "Debit":
				if (bobBalance >= amount) {
					bobBalance -= amount;
					bobDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("Insufficient Balance for Withdrawl in BOB Bank");
				}
				break;
			case "Credit":
				bobBalance += amount;
				bobCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in BOB Bank!");
			}
			break;
		case "SBI":
			switch (operation) {
			case "Debit":
				if (sbiBalance >= amount) {
					sbiBalance -= amount;
					sbiDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("Insufficient Balance for Withdrawl in SBI Bank");
				}
				break;
			case "Credit":
				sbiBalance += amount;
				sbiCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in SBI Bank!");
			}
			break;
		}
	}

	void displayTotalBalance() {
		System.out.println("\nTotal Account Balance of all four Account: Rs. "
				+ (iciciBalance + bobBalance + hdfcBalance + sbiBalance));
	}

	void displaytotalDebitCreditOpsCount() {
		System.out.println("\nTotal Credit Operations count of all four banks : " + totalCreditCount + " times"
				+ "\nTotal  Debit Operations count of all four banks : " + totalDebitCount + " times");
	}

	void displayIndividualBanksCreditOpsCount() {
		System.out.println("\nICICI Credit operations Count : " + iciciCreditCount + " times"
				+ "\nHDFC  Credit operations Count : " + hdfcCreditCount + " times"
				+ "\nBOB   Credit operations Count : " + bobCreditCount + " times"
				+ "\nSBI   Credit operations Count : " + sbiCreditCount + " times");
	}

	void displayIndividualBanksDebitOpsCount() {
		System.out.println("\nICICI Dedit operations Count : " + iciciDebitCount + " times"
				+ "\nHDFC  Dedit operations Count : " + hdfcDebitCount + " times" + "\nBOB   Dedit operations Count : "
				+ bobDebitCount + " times" + "\nSBI   Dedit operations Count : " + sbiDebitCount + " times");
	}

	void bankMsgUponOpsSkill() {
		if (totalCreditCount >= totalDebitCount)
			System.out.println("\nAppreciation : *I appreciate your money management skill*");
		else
			System.out.println("\nSuggestions : *Please spend money wisely*");
	}

	public static void main(String[] args) {
		BankingOpsSkill bankingOpsSkill = new BankingOpsSkill();
		
		bankingOpsSkill.bankOperation("ICICI", 2000, "Credit");
		bankingOpsSkill.bankOperation("ICICI", 2000, "Credit");
		bankingOpsSkill.bankOperation("HDFC", 2000, "Credit");
		bankingOpsSkill.bankOperation("HDFC", 2000, "Credit");
		bankingOpsSkill.bankOperation("SBI", 2000, "Credit");
		bankingOpsSkill.bankOperation("BOB", 2000, "Credit");
		bankingOpsSkill.bankOperation("BOB", 2000, "Credit");
		bankingOpsSkill.bankOperation("BOB", 2000, "Credit");
		bankingOpsSkill.bankOperation("BOB", 2000, "Credit");
		bankingOpsSkill.bankOperation("ICICI", 500, "Debit");
		bankingOpsSkill.bankOperation("ICICI", 500, "Debit");
		bankingOpsSkill.bankOperation("HDFC", 500, "Debit");
		bankingOpsSkill.bankOperation("HDFC", 500, "Debit");
		bankingOpsSkill.bankOperation("BOB", 500, "Debit");
		bankingOpsSkill.bankOperation("BOB", 500, "Debit");
		bankingOpsSkill.bankOperation("BOB", 500, "Debit");
		bankingOpsSkill.bankOperation("SBI", 500, "Debit");

		bankingOpsSkill.displayTotalBalance();
		bankingOpsSkill.displaytotalDebitCreditOpsCount();
		bankingOpsSkill.displayIndividualBanksCreditOpsCount();
		bankingOpsSkill.displayIndividualBanksDebitOpsCount();
		bankingOpsSkill.bankMsgUponOpsSkill();

	}

}
