package deavinaSJun20;

public class UserClass {
	static int user;
	static int totalCredit;
	static int totalDebit;
	int userId = 0, userDebit = 0, userCredit = 0;

	UserClass() {
		user++;
		userId = user;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserClass user1 = new UserClass();
		user1.credit();
		user1.credit();
		user1.debit();
		user1.displayUserInfo();
		UserClass user2 = new UserClass();
		user2.debit();
		user2.credit();
		user2.displayUserInfo();
		UserClass user3 = new UserClass();
		user3.debit();
		user3.debit();
		user3.credit();
		user3.displayUserInfo();
		UserClass.displayInfo();

		//System.out.println("total users are " + user);

	}

	void credit() {
		userCredit++;
		totalCredit++;
	}

	void debit() {
		userDebit++;
		totalDebit++;
	}

	// Method to display User Transaction details
	void displayUserInfo() {
		System.out.println("\nUser " + userId + " Transaction details are: ");
		System.out.println("Total debit transaction by user " + userId + ": " + userDebit);
		System.out.println("Total credit transaction by user " + userId + ": " + userCredit);
	}

	// Method to display Bank Transaction details
	static void displayInfo() {
		System.out.println("\nBank Transaction Info is as below");
		System.out.println("Total debit transaction in Bank by all user: " + totalDebit);
		System.out.println("Total credit transaction in Bank by all user: " + totalCredit);
		System.out.println("Number of Users created are: " + user);
	}

}
