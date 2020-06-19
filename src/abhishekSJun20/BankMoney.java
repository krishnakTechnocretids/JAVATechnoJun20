package abhishekSJun20;

public class BankMoney {
	String custName;
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditOpsCnt, hdfcCreditOpsCnt, bobCreditOpsCnt, sbiCreditOpsCnt, iciciDebitOpsCnt, hdfcDebitOpsCnt,
			bobDebitOpsCnt, sbiDebitOpsCnt, totalCreditOpsCnt, totalDebitOpsCnt;

	void bankingOp(String bank, String op, double amount) {
		switch (bank) {
		case "ICICI": {
			switch (op) {
			case "Credit":
				if (amount > 0) {
					iciciBalance += amount;
					iciciCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("Invalid Amount Entered!");
				}
				break;

			case "Debit":
				if (amount <= iciciBalance && amount > 0) {
					iciciBalance -= amount;
					iciciDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("Invalid Operation!");
			}
		}
			break;

		case "HDFC": {
			switch (op) {
			case "Credit":
				if (amount > 0) {
					hdfcBalance += amount;
					hdfcCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("Invalid Amount Entered!");
				}
				break;

			case "Debit":
				if (amount <= hdfcBalance && amount > 0) {
					hdfcBalance -= amount;
					hdfcDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("Invalid Operation!");
			}
		}
			break;

		case "BOB": {
			switch (op) {
			case "Credit":
				if (amount > 0) {
					bobBalance += amount;
					bobCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("Invalid Amount Entered!");
				}
				break;

			case "Debit":
				if (amount <= bobBalance && amount > 0) {
					bobBalance -= amount;
					bobDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("Invalid Operation!");
			}
		}
			break;
			
		case "SBI": {
			switch (op) {
			case "Credit":
				if (amount > 0) {
					sbiBalance += amount;
					sbiCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("Invalid Amount Entered!");
				}
				break;

			case "Debit":
				if (amount <= sbiBalance && amount > 0) {
					sbiBalance -= amount;
					sbiDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("Invalid Operation!");
			}
		}
			break;
		default:
			System.out.println("Invalid Bank Name Entered!");
		}
	}

	void calculateTotalBalance() {
		System.out.println("\nHello " + custName + "! Your Combined Bank Balance (across ICICI, HDFC, BOB and SBI): "
				+ (iciciBalance + hdfcBalance + bobBalance + sbiBalance));
	}

	void displayTotalBankingOps() {
		System.out.println(
				"\nTotal No. of Banking Operations Performed (across ICICI, HDFC, BOB and SBI):- \nTotal Credit Operations: "
						+ totalCreditOpsCnt + "\nTotal Debit Operations: " + totalDebitOpsCnt);
	}

	void displayBankWiseCreditOps() {
		System.out.println("\nBank-wise Credit Operations Performed:-\nICICI Bank : " + iciciCreditOpsCnt
				+ "\nHDFC Bank : " + hdfcCreditOpsCnt + "\nBank of Baroda : " + bobCreditOpsCnt
				+ "\nState Bank of India : " + sbiCreditOpsCnt);
	}

	void displayBankWiseDebitOps() {
		System.out.println("\nBank-wise Debit Operations Performed:-\nICICI Bank : " + iciciDebitOpsCnt
				+ "\nHDFC Bank : " + hdfcDebitOpsCnt + "\nBank of Baroda : " + bobDebitOpsCnt
				+ "\nState Bank of India : " + sbiDebitOpsCnt);
	}

	String calulateFinancialHealth() {
		if (totalCreditOpsCnt > totalDebitOpsCnt) {
			return "*We Appreciate Your Money Management Skills!*";
		} else {
			return "*Please Spend Money Wisely.*";
		}
	}
}
