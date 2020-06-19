package rachanaGJun20;

public class BankOperation {

	static int totalDebitCount;
	static int totalCreditCount;

	static double debitOperation(double currentbal, double dbtAmount) {
		totalDebitCount++;
		return currentbal - dbtAmount;

	}

	static double creditOperation(double currentbal, double dbtAmount) {
		totalCreditCount++;
		return currentbal + dbtAmount;
	}

}
