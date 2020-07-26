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
package amitaRJun20;

public class Exam7UserBankOperation {
	
	static int userNumber,userCount,totalCredit,totalDebit;
	int credit,debit;
	{
		userCount++;
	}
	 void credit() {
		credit++;
		totalCredit++;
	}
	 void debit() {
		debit++;
		totalDebit++;
	}
	void display() {
		System.out.println("Total numbers of credits for user : "+userCount+" -->   "+credit);
		System.out.println("Total numbers of debits for user : "+userCount+" -->   "+debit);
	}
	static void dispalyTotal() {
		System.out.println("Total numbers of users : "+userCount);
		System.out.println("Total numbers of Credits today "+totalCredit);
		System.out.println("Total numbers of Debits today "+totalDebit);
	}
	public static void main(String[] args) {
		Exam7UserBankOperation user = new Exam7UserBankOperation();
		user.credit();
		user.debit();
		user.credit();
		user.credit();
		user.display();
		Exam7UserBankOperation user1 = new Exam7UserBankOperation();
		user1.debit();
		user1.debit();
		user1.credit();
		user1.debit();
		user1.display();
		Exam7UserBankOperation user2 = new Exam7UserBankOperation();
		user2.credit();
		user2.debit();
		user2.debit();
		user2.credit();
		user2.debit();
		user2.display();
		dispalyTotal();
	}
}
