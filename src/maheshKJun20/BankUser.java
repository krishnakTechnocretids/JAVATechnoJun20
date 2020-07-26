package maheshKJun20;

public class BankUser {
	static int user = 0, totalDebit =0, totalCredit = 0;
	int userId = 0, userDebit =0, userCredit =0;
	
	// Block can be used for maintaining user count
//	{
//		user++;
//	}
	
	BankUser(){
		user++;
		userId = user;
	}
	
	//Method to count debit transaction for Bank and user
	void debit() {
		userDebit++;
		totalDebit++;
	}
	
	//Method to count credit transaction for Bank and user
	void credit() {
		userCredit++;
		totalCredit++;
	}
	
	//Method to display User Trasaction details
	void displayUserInfo() {
		System.out.println("\nUser "+ userId + " Transaction details are: ");
		System.out.println("Total debit transaction by user " + userId + ": "+ userDebit);
		System.out.println("Total credit transaction by user " + userId + ": "+ userCredit);
	}
	
	//Method to display Nank Transaction details
	static void displayInfo() {
		System.out.println("\nBank Transaction Info is as below");
		System.out.println("Total debit transaction in Bank by all user: " + totalDebit);
		System.out.println("Total credit transaction in Bank by all user: " + totalCredit);
		System.out.println("Number of Users created are: " + user);
	}
	
	public static void main(String[] args) {
		BankUser bankUser1 = new BankUser();
		bankUser1.credit();
		bankUser1.credit();
		bankUser1.debit();
		bankUser1.displayUserInfo();
		BankUser bankUser2 = new BankUser();
		bankUser2.credit();
		bankUser2.debit();
		bankUser2.displayUserInfo();
		BankUser bankUser3 = new BankUser();
		bankUser3.credit();
		bankUser3.debit();
		bankUser3.displayUserInfo();
		BankUser.displayInfo();
		
	}

}
