package rachanaGJun20;

public class Hdfc {

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
			System.out.println("HDFC;Your Account is debited by amount: " + dbtAmount + " RemainingBalance is: " + balance);
		} else {
			System.out.println("HDFC;Insufficient Balance!");
		}

	}

	void creditOperation(double crdtAmount) {
		creditCount++;
		individualCrediCount++;
		balance = BankOperation.creditOperation(balance, crdtAmount);
		System.out.println("HDFC;Your Account is credited by amount: " + crdtAmount + " RemainingBalance is: " + balance);
	}

	double getBalance() {
		return balance;
	}
	String getBankMessage() {
		if (individualCrediCount > individualDebitCount) {
			return "HDFC: I appreciate your money management skill.";

		} else {
			return "HDFC: Please spend money wisely";
		}
	}
}
