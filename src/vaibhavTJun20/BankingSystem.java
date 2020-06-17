package vaibhavTJun20;

class BankingSystem {
	
	static int totalDebit=0;
	static int totalCredit=0;
	static int totalPrint=0;
	String uName;
	int uCredit, uDebit, uPrint;
			
	void creditAmmout(){
			
	}
			
	void debitAmmout(){
			
	} 
			
	void printBalance(){
			
	}
			
	void individualTransactionSummary(String uName, int uCredit, int uDebit, int uPrint){
				
		totalCredit = totalCredit + uCredit;
		totalDebit = totalDebit + uDebit;
		totalPrint = totalPrint + uPrint;
					
		System.out.println("                                                      ");		
		System.out.println(uName + "'s transection summary details are as below : ");
		System.out.println("Credit action performed        : " + uCredit + " times");
		System.out.println("Debit action performed         : " + uDebit + " times");
		System.out.println("Print Balance action perforned : " + uPrint + " times");
		System.out.println("                                                      ");
	}
		
		
	void allTransactionSummary(int totalCredit, int totalDebit, int totalPrint) {
		System.out.println("                                            ");
		System.out.println("Summary for all transections are as below : ");
			
		System.out.println("Total Credit action performed        : " + totalCredit + " times");
		System.out.println("Total Debit action performed         : " + totalDebit + " times");
		System.out.println("Total Print Balance action perforned : " + totalPrint + " times");
		System.out.println("                                            ");
	}
		
	public static void main (String[] args){
		BankingSystem bankingSystem1= new BankingSystem();
		BankingSystem bankingSystem2= new BankingSystem();
		BankingSystem bankingSystem = new BankingSystem();
			
		bankingSystem1.individualTransactionSummary("User1",2,1,3);
		bankingSystem2.individualTransactionSummary("User2",9,1,3);
			
		bankingSystem.allTransactionSummary(totalCredit, totalDebit, totalPrint);		
		
	}
		

}
	

