package harshadBJun20.CodingExams.codingExam7;

public class BankManger extends BankUser{
	/*public BankManger() {
	}*/
	
	// Creating new objects for each user and calling overriden methods
	public static void main(String[] args) {
		System.out.println("-------------User 1 Info---------------");
		BankManger bankManger1 = new BankManger();
		bankManger1.credit();
		bankManger1.credit();
		bankManger1.debit();
		bankManger1.debit();
		bankManger1.displayInfo();
		/*BankUser bankUser1 = new BankUser();
		bankUser1.credit();
		bankUser1.credit();
		bankUser1.debit();
		bankUser1.debit();
		bankUser1.displayInfo();*/
		System.out.println();
		System.out.println("-------------User 2 Info---------------");
		BankManger bankManger2 = new BankManger();
		bankManger2.credit();
		bankManger2.credit();
		bankManger2.debit();
		bankManger2.displayInfo();
		System.out.println();
		
		System.out.println("-------------User 3 Info---------------");
		BankManger bankManger3 = new BankManger();
		bankManger3.credit();
		bankManger3.credit();
		bankManger3.debit();
		bankManger3.displayInfo();
		System.out.println();
		
		System.out.println("-------------Total User Info---------------");
		BankManger.displayAllInfo();	
	}
}