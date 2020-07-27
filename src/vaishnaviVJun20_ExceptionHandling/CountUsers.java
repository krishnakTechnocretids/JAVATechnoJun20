package vaishnaviVJun20_ExceptionHandling;

/* Exam-7:
Q1) class User{
	
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

Total --> total debit & total credit */

public class CountUsers {

	int debitCount, creditCount;
	static int dCount, cCount;
	static int userCount;

	CountUsers() {
		userCount++;
	}

	void debit() {
		debitCount++;
		dCount++;
	}

	void credit() {
		creditCount++;
		cCount++;
	}

	void displayInfo() {
		System.out.println("Total numbers of times debit is: " + debitCount);
		System.out.println("Total numbers of times Credit is: " + creditCount);
	}

	void displayAllInfo() {
		System.out.println("Total numbers of times debit was called is: " + dCount);
		System.out.println("Total numbers of times debit was called is: " + cCount);
		System.out.println("Total number of Users Created is: " + userCount);
	}

	public static void main(String[] args) {
		CountUsers countUsers = new CountUsers();
		countUsers.credit();
		countUsers.debit();
		countUsers.credit();
		System.out.println("Info for User1");
		countUsers.displayInfo();
		CountUsers countUsers1 = new CountUsers();
		countUsers1.credit();
		countUsers1.debit();
		countUsers1.credit();
		countUsers1.credit();
		System.out.println("Info for User2");
		countUsers1.displayInfo();
		System.out.println("Displaying final Information");
		countUsers1.displayAllInfo();
	}

}
