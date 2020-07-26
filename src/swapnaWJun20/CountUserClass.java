/*Q1) class User{
	
	void debit(){	
	}
	void credit(){
	}
	void displayInfo(){
		debit
		credit
	}
	void displayAllInfo(){
		totaldebit
		totalCredit
		totalUsers
	}
}		 

output : Users -> 3
User1 -> total debit
User1 -> total credit

Total --> total debit & total credit*/
package swapnaWJun20;

public class CountUserClass {

	int debitCount, creditCount; // Its should initiate on every object creation
	static int totalDebitCount, totalCreditCount, userCount; // Value should change on every use of variale

	// constructor to get the count of object (users) creation
	public CountUserClass() {
		userCount++;
	}

	void debit() {
		debitCount++;
		totalDebitCount++;
	}

	void credit() {
		creditCount++;
		totalCreditCount++;
	}

	void displayInfo() {
		System.out.println("Debit for user " + userCount + " : " + debitCount);
		System.out.println("Credit for user " + userCount + " : " + creditCount);
	}

	void displayAllInfo() {
		System.out.println("\n---Detailed Information--");
		System.out.println("Total Debit for all users : " + totalDebitCount);
		System.out.println("Total Credit for all users : " + totalCreditCount);
		System.out.println("Total Users : " + userCount);
	}

	public static void main(String[] args) {
		CountUserClass countUserClass = new CountUserClass();
		countUserClass.debit();
		countUserClass.debit();
		countUserClass.credit();
		countUserClass.debit();
		countUserClass.credit();
		System.out.println();
		countUserClass.displayInfo();
		// countUserClass.displayAllInfo();

		CountUserClass countUserClass1 = new CountUserClass();
		countUserClass1.debit();
		countUserClass1.debit();
		countUserClass1.debit();
		countUserClass1.debit();
		countUserClass1.credit();
		countUserClass1.credit();
		System.out.println();
		countUserClass1.displayInfo();
		countUserClass1.displayAllInfo();

	}
}
