package anupSJun20;
/*Q1) class User{

	void debit(){
	}

	void credit(){
	}
}		 

output : Users -> 3
User1 -> total debit
User1 -> total credit

Total --> total debit & total credit*/

public class UserAndMethoddisplay {
	static int totalUser = 0;
	static int totalDebit = 0;
	static int totalCredit = 0;
	int debit = 0;
	int credit = 0;
	
	UserAndMethoddisplay(){
		totalUser++;
	}
	void debit() {
		debit++;
		totalDebit++;
	}
	void credit() {
		credit++;
		totalCredit++;
	}
	void display() {
		System.out.println("The number of Debits by user " + " : " + totalUser + " : " + debit);
		System.out.println("The number of Credits by user " + ":" + totalUser + " : " + credit);	
	}
	
	static void displayuserinfo() {
		System.out.println("The number of users " + totalUser);
		System.out.println("The total number of Debit methods " + totalDebit);
		System.out.println("The total number of Credit methods " + totalCredit);
	}
	
	public static void main(String[] args) {
		UserAndMethoddisplay userAndMethoddisplay1 = new UserAndMethoddisplay();
		userAndMethoddisplay1.debit();
		userAndMethoddisplay1.credit();
		userAndMethoddisplay1.credit();
		userAndMethoddisplay1.display();
		UserAndMethoddisplay userAndMethoddisplay2 = new UserAndMethoddisplay();
		userAndMethoddisplay2.debit();
		userAndMethoddisplay2.credit();
		userAndMethoddisplay2.credit();
		userAndMethoddisplay2.display();
		UserAndMethoddisplay userAndMethoddisplay3 = new UserAndMethoddisplay();
		userAndMethoddisplay3.debit();
		userAndMethoddisplay3.credit();
		userAndMethoddisplay3.credit();
		userAndMethoddisplay3.display();
		displayuserinfo();
	}

}
