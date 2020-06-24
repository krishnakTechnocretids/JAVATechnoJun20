package kartikeyDJune20;

public class BankAccountCreditDebit {
	double totalBalance;
	double totalBalanceInALL;
	static int allCredit, allDebit, iciciCredit, iciciDebit, sbiCredit, sbiDebit, hdfcCredit, hdfcDebit, bobCredit,
			bobDebit;

	void bankingOperations(String bank, double amout, String operation) {

		switch (bank) {

		case "ICICI":
			switch (operation) {

			case "Credit":
				if (amout < 0)
					System.out.println("Credit amount can't be neagtive, Please check and enter again..");
				else {
					totalBalance += amout;
					iciciCredit++;
					allCredit++;
				}
				break;

			case "Debit":
				if (amout > totalBalance)
					System.out.println("Insufficient Funds: Bank:-" + bank);
				else {
					totalBalance -= amout;
					iciciDebit++;
					allDebit++;
				}
				break;

			default:
				System.out.println("Warning please select a valid operation");
			}

			break;

		case "HDFC":

			switch (operation) {

			case "Credit":
				if (amout < 0)
					System.out.println("Credit amount can't be neagtive, Please check and enter again..");
				else {
					totalBalance += amout;
					hdfcCredit++;
					allCredit++;
				}
				break;

			case "Debit":
				if (amout > totalBalance)
					System.out.println("Insufficient Funds: Bank:-" + bank);
				else {
					totalBalance -= amout;
					hdfcDebit++;
					allDebit++;
				}
				break;

			default:
				System.out.println("Warning please select a valid operation");
			}

			break;

		case "SBI":

			switch (operation) {

			case "Credit":
				if (amout < 0)
					System.out.println("Credit amount can't be neagtive, Please check and enter again..");
				else {
					totalBalance += amout;
					sbiCredit++;
					allCredit++;
				}
				break;

			case "Debit":
				if (amout > totalBalance)
					System.out.println("Insufficient Funds: Bank:-" + bank);
				else {
					totalBalance -= amout;
					sbiDebit++;
					allDebit++;
				}
				break;

			default:
				System.out.println("Warning please select a valid operation");
			}

			break;

		case "BOB":
			switch (operation) {

			case "Credit":
				if (amout < 0)
					System.out.println("Credit amount can't be neagtive, Please check and enter again..");
				else {
					totalBalance += amout;
					bobCredit++;
					allCredit++;
				}
				break;

			case "Debit":
				if (amout > totalBalance)
					System.out.println("Insufficient Funds: Bank:-" + bank);
				else {
					totalBalance -= amout;
					bobDebit++;
					allDebit++;
				}
				break;

			default:
				System.out.println("Warning please select a valid operation");
			}

			break;

		default:
			System.out.println("Please Select a Valid Bank to start.. ThankYou");
			break;
		}

	}

	void operationsPerformed() {
		System.out.println("\n\n" + "No of times accounts are credited: " + allCredit);
		System.out.println("No of times accounts are debited: " + allDebit);

	}

	void totalMoneyOwned() {
		totalBalanceInALL += totalBalance;
		System.out.println("\n\n" + "Overall Money owned: " + totalBalanceInALL + "\n");
	}

	void baksCreditOperations() {
		System.out.println("No. of times ICICI bank is credited: " + iciciCredit);
		System.out.println("No. of times ICICI bank is credited: " + iciciDebit);
		System.out.println("No. of times SBI bank is credited: " + sbiCredit);
		System.out.println("No. of times SBI bank is credited: " + sbiDebit);
		System.out.println("No. of times HDFC bank is credited: " + hdfcCredit);
		System.out.println("No. of times HDFC bank is credited: " + hdfcDebit);
		System.out.println("No. of times BOB bank is credited: " + bobCredit);
		System.out.println("No. of times BOB bank is credited: " + bobDebit);
	}

	String myMoneyManagement() {
		if (allCredit > allDebit)
			return "*I appreciate your money management skill*";
		else
			return "*Please spend money wisely*";
	}

	public static void main(String[] args) {
		BankAccountCreditDebit bankAccountCreditDebit = new BankAccountCreditDebit();
		bankAccountCreditDebit.bankingOperations("ICICI", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("ICICI", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("ICICI", 992100, "Debit");
		bankAccountCreditDebit.bankingOperations("ICICI", 10, "Debit");
		bankAccountCreditDebit.bankingOperations("HDFC", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("HDFC", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("HDFC", 10, "Debit");
		bankAccountCreditDebit.bankingOperations("HDFC", 10, "Debit");
		bankAccountCreditDebit.bankingOperations("SBI", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("HDFC", 10, "Debit");
		bankAccountCreditDebit.bankingOperations("BOB", 100, "Credit");
		bankAccountCreditDebit.bankingOperations("BOB", 100, "Credit");
		bankAccountCreditDebit.totalMoneyOwned();
		bankAccountCreditDebit.baksCreditOperations();
		bankAccountCreditDebit.operationsPerformed();
		System.out.println(bankAccountCreditDebit.myMoneyManagement());

	}
}
