package aasthaJJun20;

public class UsersOfBank {
	static int countAllDebits, countAllCredits, countUsers;
	int countDebits, countCredits;
	private int balance; //declared private : so that client class cannot directly access the balance and set it to some number

	UsersOfBank(int balance) throws InvalidAmountException {
		if (balance > 0) {
			this.balance = balance;
			countUsers++;
		}
		else {
			throw new InvalidAmountException(balance + " : is an invalid Amount");
		}
	}
	
	void debit(int amount) throws InvalidAmountException {
		if (amount < 0)
			throw new InvalidAmountException(amount + " : is an invalid Amount, You can't debit");
		else if(this.balance < amount)
			throw new InvalidAmountException("Insufficient Balance to debit : " + amount + "Your current balance is : " + this.balance);
		else {
			balance -= amount;
			countDebits++;
			countAllDebits++;
		}
	}

	void credit(int amount) throws InvalidAmountException{
		if (amount < 0)
			throw new InvalidAmountException(amount + " : is an invalid Amount, You can't credit");
		else {
			balance -= amount;
			countCredits++;
			countAllCredits++;
		}
	}

	void displayInfo() {
		System.out.println("Transactions by User" + countUsers);
		System.out.println("Debits : " + countDebits);
		System.out.println("Credits : " + countCredits);
	}
	
	static void displayAllInfo() {
		System.out.println("Total users :" + countUsers);
		System.out.println("Debits : " + countAllDebits);
		System.out.println("Credits : " + countAllCredits);
	}
}
