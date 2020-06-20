package abhishekSJun20;

import java.util.Scanner;

public class UserDefineBank {

	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditOpsCnt, hdfcCreditOpsCnt, bobCreditOpsCnt, sbiCreditOpsCnt, iciciDebitOpsCnt, hdfcDebitOpsCnt,
			bobDebitOpsCnt, sbiDebitOpsCnt, totalCreditOpsCnt, totalDebitOpsCnt;

	void bankingOp(int bank, int op, double amount) {
		switch (bank) {
		case 1: {
			switch (op) {
			case 1:
				if (amount > 0) {
					iciciBalance += amount;
					iciciCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("ICICI Bank Alert: Invalid Amount Entered!");
				}
				break;

			case 2:
				if (amount <= iciciBalance && amount > 0) {
					iciciBalance -= amount;
					iciciDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println(
							"ICICI Bank Alert: Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("ICICI Bank Alert: Invalid Operation!");
			}
		}
			break;
		case 2: {
			switch (op) {
			case 1:
				if (amount > 0) {
					hdfcBalance += amount;
					hdfcCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("HDFC Bank Alert: Invalid Amount Entered!");
				}
				break;

			case 2:
				if (amount <= hdfcBalance && amount > 0) {
					hdfcBalance -= amount;
					hdfcDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println(
							"HDFC Bank Alert: Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("HDFC Bank Alert: Invalid Operation!");
			}
		}
			break;
		case 3: {
			switch (op) {
			case 1:
				if (amount > 0) {
					bobBalance += amount;
					bobCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("BOB Alert: Invalid Amount Entered!");
				}
				break;

			case 2:
				if (amount <= bobBalance && amount > 0) {
					bobBalance -= amount;
					bobDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println(
							"BOB Alert: Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("BOB Alert: Invalid Operation!");
			}
		}
			break;
		case 4: {
			switch (op) {
			case 1:
				if (amount > 0) {
					sbiBalance += amount;
					sbiCreditOpsCnt++;
					totalCreditOpsCnt++;
				} else {
					System.out.println("SBI Alert: Invalid Amount Entered!");
				}
				break;

			case 2:
				if (amount <= sbiBalance && amount > 0) {
					sbiBalance -= amount;
					sbiDebitOpsCnt++;
					totalDebitOpsCnt++;
				} else {
					System.out.println(
							"SBI Alert: Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
				}
				break;

			default:
				System.out.println("SBI Alert: Invalid Operation!");
			}
		}
			break;
		default:
			System.out.println("Alert: Invalid Bank Name Entered!");
		}
	}

	double calculateTotalBalance() {
		return (iciciBalance + hdfcBalance + bobBalance + sbiBalance);
	}

	int displayTotalCreditOps() {
		return totalCreditOpsCnt;
	}

	int displayTotalDebitOps() {
		return totalDebitOpsCnt;
	}

	double findBankBalance(int bankChoice) {
		switch (bankChoice) {
		case 1:
			return iciciBalance;

		case 2:
			return hdfcBalance;

		case 3:
			return bobBalance;

		case 4:
			return sbiBalance;

		default:
			return 0.0;
		}
	}

	int findBankWiseCreditOps(int bankChoice) {
		switch (bankChoice) {
		case 1:
			return iciciCreditOpsCnt;

		case 2:
			return hdfcCreditOpsCnt;

		case 3:
			return bobCreditOpsCnt;

		case 4:
			return sbiCreditOpsCnt;

		default:
			return 0;
		}
	}

	int findBankWiseDebitOps(int bankChoice) {
		switch (bankChoice) {
		case 1:
			return iciciDebitOpsCnt;

		case 2:
			return hdfcDebitOpsCnt;

		case 3:
			return bobDebitOpsCnt;

		case 4:
			return sbiDebitOpsCnt;

		default:
			return 06;
		}
	}

	String calulateFinancialHealth() {
		if (totalCreditOpsCnt > totalDebitOpsCnt) {
			return "*We Appreciate Your Money Management Skills!*";
		} else {
			return "*Please Spend Money Wisely.*";
		}
	}

	public static void main(String[] args) {
		UserDefineBank userDefineBank = new UserDefineBank();

		Scanner scanner = new Scanner(System.in);
		String proceed = "";
		double amount = 0.0;

		System.out.println("Welcome to Your Personal Banking System:");

		do {
			System.out.println(
					"\nPlease select an option in below menu:\n1. Access Bank Account\n2. Find Out Total Balance Across All Accounts\n3. View Total No. of Credit Operations Across All Accounts\n4. View Total No. of Debit Operations Across All Accounts\n5. Financial Health Check-Up \n6. Exit\n(Please Enter Your Menu Choice (1 to 6):");
			int menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1: {
				System.out.println(
						"\nWhich Bank Account Would You Like to Access?\n1. ICICI Bank\n2. HDFC Bank\n3. Bank of Baroda\n4. Sate Bank of India\n5. Exit\n(Please Enter Your Bank Choice (1 to 5):");
				int bankChoice = scanner.nextInt();

				System.out.println(
						"\nWhat Would You Like To perform action Today?\n1. Credit\n2. Debit\n3. Find Out Account Balance\n4. No. of Credits \n5. No. of Debits \n6. Exit \n(Please Enter Your Op Choice (1 to 6):");
				int opChoice = scanner.nextInt();

				switch (opChoice) {
				case 1:
					System.out.println("Enter amount to be credited: ");
					amount = scanner.nextDouble();
					userDefineBank.bankingOp(bankChoice, opChoice, amount);
					break;

				case 2:
					System.out.println("Enter amount to be debited: ");
					amount = scanner.nextDouble();
					userDefineBank.bankingOp(bankChoice, opChoice, amount);
					break;

				case 3:
					System.out.println("\nBank Account Balance: " + userDefineBank.findBankBalance(bankChoice));
					break;

				case 4:
					System.out.println("\nNo. of Credit Operations Performed on the Account: "
							+ userDefineBank.findBankWiseCreditOps(bankChoice));
					break;

				case 5:
					System.out.println("\nNo. of Debit Operations Performed on the Account: "
							+ userDefineBank.findBankWiseDebitOps(bankChoice));
					break;

				case 6:
					break;
				}
			}
				break;

			case 2:
				System.out.println("\nYour Combined Bank Balance (across ICICI, HDFC, BOB and SBI): "
						+ userDefineBank.calculateTotalBalance());
				break;

			case 3:
				System.out.println("\nTotal No. of Credit Operations Performed (across ICICI, HDFC, BOB and SBI): "
						+ userDefineBank.displayTotalCreditOps());
				break;

			case 4:
				System.out.println("\nTotal No. of Debit Operations Performed (across ICICI, HDFC, BOB and SBI): "
						+ userDefineBank.displayTotalDebitOps());
				break;

			case 5:
				System.out.println(
						"\nOur Remarks on Your Financial Health:- \n" + userDefineBank.calulateFinancialHealth());
				break;

			case 6:
				break;
			}

			System.out.println("\nWould you like to continue? (Please Enter Your Choice Y or N):");
			proceed = scanner.next();

		} while (proceed.equals("N"));

		scanner.close();
	}

}
