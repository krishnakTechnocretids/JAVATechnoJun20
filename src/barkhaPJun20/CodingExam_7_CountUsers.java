/*class User{
	
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

package barkhaPJun20;

public class CodingExam_7_CountUsers {
	int debitCount, creditCount;
	static int overallDebitCount, overallCreditCount,users;
	
	void debitCount() {
		debitCount++;
		overallDebitCount++;
		
	}
	void creditCount() {
		creditCount++;
		overallCreditCount++;
	}
	CodingExam_7_CountUsers() {             //here we use constructor(explicitly) so when object creates users++.
		users++;
		
	}
	void displayInfo() {
		System.out.println("Total Debit per user is: " +debitCount);
		System.out.println("Total credit per user is: " +creditCount);
	}
	void displayAllInfo() {
		System.out.println("Total number of users: "+users);
		System.out.println("Total Debit count of All users are: " +overallDebitCount);
		System.out.println("Total Credit count of All users are: " +overallCreditCount);
		
	}
	public static void main(String[] args) {
		CodingExam_7_CountUsers countUsers=new CodingExam_7_CountUsers();
		countUsers.creditCount();
		countUsers.debitCount();
		System.out.println("Info of 1 user:");
		countUsers.displayInfo();
		System.out.println("===========================================================");
		CodingExam_7_CountUsers countUsers1=new CodingExam_7_CountUsers();
		countUsers1.creditCount();
		countUsers1.creditCount();
		System.out.println("Info of 2 user:");
		countUsers1.displayInfo();
		System.out.println("===========================================================");
		System.out.println("OverallInfo of Transaction is: ");
		countUsers1.displayAllInfo();
		}

}	