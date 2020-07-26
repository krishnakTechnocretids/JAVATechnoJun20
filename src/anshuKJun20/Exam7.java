package anshuKJun20;

public class Exam7 {
	  int  debitCount, creditCount, user = 0;
	  static int totalCount ,userCount, totalDebit, totalCredit =0;
	Exam7(){
		userCount++;
		user++;
	}
	void debit(){
		debitCount++;
		totalCount++;
		totalDebit++;
	}
	void credit() {
		creditCount++;
		totalCount++;
		totalCredit++;
	}
	void individualDisplayInfo() {
		System.out.println("  debit by user " +userCount+"-----> "  + debitCount );
		System.out.println("  credit  by user " +userCount+"----> " + creditCount );
	}
	void displayInfo() {
		System.out.println("Total  debit = "+ totalDebit);
		System.out.println(" Total credit = "+ totalCredit);
		System.out.println(" Over all bank transaction = "+ totalCount);
	}
	public static void main(String[] args) {
		Exam7 user1 = new Exam7();
		user1.debit();
		user1.debit();
		user1.credit();
		user1.individualDisplayInfo();
	    System.out.println();
		
		Exam7 user2 = new Exam7();
		user2.credit();
		user2.debit();
		user2.credit();
		user2.debit();
		user2.individualDisplayInfo();
	     System.out.println();
		
		Exam7 user3 = new Exam7();
			user3.credit();
			user3.credit();
			user3.credit();
		    user3.debit();
		    user3.individualDisplayInfo();
		    System.out.println();
		    
			user3.displayInfo();
			System.out.println();
			System.out.println(" total user = "+ userCount);
		    
	}
}
