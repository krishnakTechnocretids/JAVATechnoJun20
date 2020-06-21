package rachanaGJun20.bankingsystem;

public class Bob {

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
			System.out.println("BOB;Your Account is debited by amount: " + dbtAmount + " RemainingBalance is: " + balance);
		} else {
			System.out.println("BOB;Insufficient Balance!");
		}

	}

	void creditOperation(double crdtAmount) {
		creditCount++;
		individualCrediCount++;
		balance = BankOperation.creditOperation(balance, crdtAmount);
		System.out.println("BOB;Your Account is credited by amount: " + crdtAmount + " RemainingBalance is: " + balance);
	}

	double getBalance() {
		return balance;
	}
	String getBankMessage() {
		if (individualCrediCount > individualDebitCount) {
			return "BOB: I appreciate your money management skill.";

		} else {
			return "BOB: Please spend money wisely";
		}
	}
}
