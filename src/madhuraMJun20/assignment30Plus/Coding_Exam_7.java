package madhuraMJun20.assignment30Plus;
/*Exam-7:
Q1) class User{
output : Users -> 3
User1 -> total debit
User1 -> total credit

Total --> total debit & total credit*/
public class Coding_Exam_7 {
	static int count;
	Coding_Exam_7(){
		count++;
	}
	int debitCnt,creditCnt,balance;
	static int debitCount, creditCount;
	void debit(int debitAmt) {
		if(debitAmt>balance) {
			System.out.println("You Have Insufficient Balance");
		}
		else
			balance= balance - debitAmt;
		debitCnt++;
		debitCount++;
	}
	
	void credit(int creditAmt) {
		balance = balance + creditAmt; 
		creditCnt++;
		creditCount++;
	}
	//Individual credit,debit count
	void displayInfo() {
		System.out.println("Debit - " +debitCnt);
		System.out.println("Credit - " +creditCnt);
	}
	//Total credit debit and user count
	public static void displayInfoAll() {
		System.out.println("==================================");
		System.out.println("Total Users : "+count);
		System.out.println("Total Debit : "+debitCount);
		System.out.println("Total Credit : "+creditCount);
	}
	public static void main(String [] args) {
		System.out.println("User 1 ->");
		Coding_Exam_7 user1 = new Coding_Exam_7();
		user1.credit(2000);
		user1.credit(1000);
		user1.displayInfo();
		System.out.println();
		
		System.out.println("User 2 ->");
		Coding_Exam_7 user2 = new Coding_Exam_7();
		user2.credit(1000);
		user2.credit(300);
		user2.debit(3000);
		user2.displayInfo();
		System.out.println();
		
		System.out.println("User 3 ->");
		Coding_Exam_7 user3 = new Coding_Exam_7();
		user3.credit(10000);
		user3.debit(3000);
		user3.debit(3000);
		user3.displayInfo();
		System.out.println();
		
		System.out.println("User 4 ->");
		Coding_Exam_7 user4 = new Coding_Exam_7();
		user4.credit(300);
		user4.debit(3000);
		user4.displayInfo();
		
		Coding_Exam_7.displayInfoAll();
	}
}