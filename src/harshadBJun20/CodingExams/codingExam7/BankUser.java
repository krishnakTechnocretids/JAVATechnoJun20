package harshadBJun20.CodingExams.codingExam7;

/*Exam-7:
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

Total --> total debit & total credit*/

public class BankUser {
	int individualDebitCount=0,individualCreditCount=0;
	static int totalDebitCount,totalCreditCount;
	static int userCount;
	
	/*public BankUser(int userID) {
		userCount = userID;
	}*/
	
	//this constructor will count the number of User in Bank
	public BankUser() {
		++userCount;
	}
	
	//this method will count individual and total debit count
	void debit() {
		individualDebitCount++;
		totalDebitCount++;
	}
	
	//this method will count individual and total credit count
	void credit() {
		individualCreditCount++;
		totalCreditCount++;
	}
	
	//this method will display the individual debit and credit count of individual users
	void displayInfo() {
		System.out.println("Individual Debit Count of User "+userCount+" is "+individualDebitCount);
		System.out.println("Individual Credit Count of User "+userCount+" is "+individualCreditCount);
	}
	
	//this method will display the total users, debit and credit count of all users associated to Bank
	static void displayAllInfo() {
		System.out.println("Total users of Bank: "+userCount);
		System.out.println("Total Debit Count of all users: "+totalDebitCount);
		System.out.println("Total Credit Count of all users: "+totalCreditCount);
	}
}
