/*Exam-7:
Q1) class User{
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

Total --> total debit & total credit
*/
package palakSJun20;

public class User {
	static int objectCount;
	int userCreditCount, userDebitCount;
	static int totalCreditCount, totalDebitCount;
	String type;
	public User(String type) {
		objectCount++;
		this.type = type;
	}
	
	public String toString() {
		return this.type;		
	}
	
	void debit() {
		userDebitCount++;
		totalDebitCount++;
	}
	
	void credit() {
		userCreditCount++;
		totalCreditCount++;
	}
	
	void displayInfo() {
		System.out.println(toString() + " --> Debit count is " + userDebitCount);
		System.out.println(toString() + " --> Credit count is " + userCreditCount);
		//System.out.println(getClass().getName());
	}
	
	void displayAllInfo() {
		System.out.println("Total users --> " + objectCount);
		System.out.println("Total Credit Count : " + totalCreditCount);
		System.out.println("Total Debit Count : " + totalDebitCount);
		
	}
	public static void main(String[] args) {
		User user1 = new User("User1");
		user1.debit();
		user1.credit();
		user1.displayInfo();
		System.out.println();
		
		User user2 = new User("User2");
		user2.debit();
		user2.credit();
		user2.displayInfo();
		
		System.out.println();
		User user3 = new User("User3");
		user3.debit();
		user3.credit();
		user3.displayInfo();
		System.out.println();
		
		user3.displayAllInfo();
	}

}
