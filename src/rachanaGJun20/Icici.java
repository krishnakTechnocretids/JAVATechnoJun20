package rachanaGJun20;

public class Icici {

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
			System.out.println("ICICI;Your Account is debited by amount: " + dbtAmount + " RemainingBalance is: " + balance);
		} else {
			System.out.println("ICICI;Insufficient Balance!");
		}

	}

	void creditOperation(double crdtAmount) {
		creditCount++;
		individualCrediCount++;
		balance = BankOperation.creditOperation(balance, crdtAmount);
		System.out.println("ICICI;Your Account is credited by amount: " + crdtAmount + " RemainingBalance is: " + balance);
	}

	double getBalance() {
		return balance;
	}

	String getBankMessage() {
		if(individualCrediCount > individualDebitCount ) { 
			return "ICICI: I appreciate your money management skill."; 
			
		} else {
			return "ICICI: Please spend money wisely";
		}
	}

	
	
}
