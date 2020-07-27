/*output : Users -> 3
User1 -> total debit
User1 -> total credit
Total --> total debit & total credit */ 
package jagadeeshMJun20;

public class User {
	static int debitCountTotal=0,creditCountTotal=0,objectCount=0;
	int debitCount=0,creditCount=0;
	void debit(){
		debitCount++;
		debitCountTotal++;
	}
	void credit(){
		creditCount++;
		creditCountTotal++;
	}
	void displayInfo(String Customer){
		System.out.println("Total debit for "+Customer+" is ->  "+debitCount);
		System.out.println("Total credit for "+Customer+"is ->  "+creditCount);
	}
	
	void displayAllInfo(){
		System.out.println("Total debit transactions for all user is ->  "+debitCountTotal);
		System.out.println("Total credit transactions for all user is ->  "+creditCountTotal);
		System.out.println("Users/No. of object created ->  "+objectCount);
	}
	 User() {
		objectCount++;
	}
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		user1.debit();
		user1.debit();
		user1.credit();
		user2.debit();
		user2.credit();
		user1.displayInfo("User1");
		user2.displayInfo("User2");
		user2.displayAllInfo();
	}

}
