/*
Exam-7:
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

Total --> total debit & total credit
*/

package nikhilMJun20;

import java.util.ArrayList;

public class BankUser {
	static int totalCreditOps;
	static int totalDebitOps;
	
	int userId;
	String name;
	int creditOpsCount;
	int debitOpsCount;
	
	public BankUser(int userId, String name, int creditOpsCount, int debitOpsCount) {
		this.userId = userId;
		this.name = name;
		this.creditOpsCount = creditOpsCount;
		this.debitOpsCount = debitOpsCount;		
	}
	
	void credit() {
		System.out.println(this.name+" : Credit op performed");
		this.creditOpsCount++;
		totalCreditOps++;
	}
	
	void debit() {
		System.out.println(this.name+" : Credit op performed");
		this.debitOpsCount++;
		totalDebitOps++;
	}
	
	void displayInfo() {
		System.out.println("\nOps info for "+this.name+"--> Credits: "+this.creditOpsCount+" Credits: "+this.debitOpsCount);
	}
	
	static void displayAllInfo(ArrayList bankUsers) {
		System.out.println("\nInfo of the bank:-\nTotal Users : "+bankUsers.size()+"\nTotal Credits : "+totalCreditOps+"\nTotal Debits : "+totalDebitOps);
	}
	
	public static void main(String[] args) {
		BankUser bankUser1 = new BankUser(1001, "Hulk", 0, 0);
		BankUser bankUser2 = new BankUser(1002, "IronMan", 0, 0);
		BankUser bankUser3 = new BankUser(1003, "Thor", 0, 0);
		
		ArrayList<BankUser> bankUsers = new ArrayList<BankUser>();
		
		bankUsers.add(bankUser1);
		bankUsers.add(bankUser2);
		bankUsers.add(bankUser3);
		
		bankUser1.credit();
		bankUser1.credit();
		bankUser1.debit();
		
		bankUser2.credit();
		bankUser2.credit();
		bankUser2.debit();
		
		bankUser3.credit();
		bankUser3.credit();
		bankUser3.debit();
		
		bankUser1.displayInfo();
		bankUser2.displayInfo();
		bankUser3.displayInfo();
		
		displayAllInfo(bankUsers);
	}
}
