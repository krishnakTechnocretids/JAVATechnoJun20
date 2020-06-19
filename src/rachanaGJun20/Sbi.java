package rachanaGJun20;

public class Sbi {

	double balance;
	static int debitCount;
	static int creditCount;

	int individualCrediCount;
	int individualDebitCount;

	void debitOperation(double dbtAmount) {

		if (balance >= dbtAmount) {
			debitCount++;
			individualDebitCount++;
			balance = BankOperation.debitOperation(balance, dbtAmount);
			System.out.println(
					"SBI;Your Account is debited by amount: " + dbtAmount + " RemainingBalance is: " + balance);
		} else {
			System.out.println("SBI;Insufficient Balance!");
		}

	}

	void creditOperation(double crdtAmount) {
		creditCount++;
		individualCrediCount++;
		balance = BankOperation.creditOperation(balance, crdtAmount);
		System.out
				.println("SBI;Your Account is credited by amount: " + crdtAmount + " RemainingBalance is: " + balance);
	}

	double getBalance() {
		return balance;
	}

	String getBankMessage() {
		if (individualCrediCount > individualDebitCount) {
			return "SBI: I appreciate your money management skill.";

		} else {
			return "SBI: Please spend money wisely";
		}
	}
}
