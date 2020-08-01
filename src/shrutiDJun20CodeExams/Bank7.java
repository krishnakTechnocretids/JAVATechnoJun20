package shrutiDJun20CodeExams;

public class Bank7 {
	
	 int debitcount, creditcount;
	 static int totaldebitcount, totalcreditcount,  usercount;
	
	Bank7(){
		usercount++;
	}
	

	void debit(){
		debitcount++;
		totaldebitcount++;
		
	}
	
	void credit(){
		creditcount++;
		totalcreditcount++;
	}
	
	void displayInfo(){
		System.out.println("number of debit transaction by user "+ usercount +" is "+debitcount);
		System.out.println("number of credit transaction by user"+ usercount +" is "+creditcount);
	}
	
	
	void displayAllInfo(){
	 System.out.println("Total number of debit transaction:" +totaldebitcount );	
	 System.out.println("Total number of credit transaction:" +totalcreditcount );

	}

	public static void main(String[] args) {
		//user1 Transactions
		Bank7 b1 = new Bank7();
		b1.debit();
		b1.credit();
		b1.credit();
		
		//user2 Transaction
		
		Bank7 b2 = new Bank7();
		b2.credit();
		b2.debit();
		
		
		//user3 Transaction
		Bank7 b3 = new Bank7();
		b3.credit();
		b3.credit();
		b3.debit();
		
		b3.displayAllInfo();
		b3.displayInfo();
		
		
		
	}
}
