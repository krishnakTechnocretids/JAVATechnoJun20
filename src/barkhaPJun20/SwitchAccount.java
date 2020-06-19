package barkhaPJun20;
public class SwitchAccount {
	static double balance;
	static int totalcreditcount;
	static int totaldebitcount;
	int creditcount, debitcount;
	String bank;
	void bankOperation(String bankName, double amount, String operation) {
		bank=bankName;
		switch (bankName) {
			case "SBI":
			switch (operation)	{
				case "Credit":
				balance=balance+amount;
				totalcreditcount++;
				creditcount++;
				break;
				case "Debit":
				balance=balance-amount;
				totaldebitcount++;
				debitcount++;
				break;
			}
			break;
			
			case "ICICI":
			switch (operation)	{
				case "Credit":
				balance=balance+amount;
				totalcreditcount++;
				creditcount++;
				break;
				case "Debit":
				balance=balance-amount;
				totaldebitcount++;
				debitcount++;
				break;
			}
			break;
			
			case "HDFC":
			switch (operation)	{
			case "Credit":
			balance=balance+amount;
			totalcreditcount++;
			creditcount++;
			break;
			case "Debit":
			balance=balance-amount;
			totaldebitcount++;
			debitcount++;
			break;
		}
		break;
	
			case "BOB":
			switch (operation)	{
			case "Credit":
			balance=balance+amount;
			totalcreditcount++;
			creditcount++;
			break;
			case "Debit":
			balance=balance-amount;
			totaldebitcount++;
			debitcount++;
			break;
		}
		break;
		}
	 }
	void totalBalance(){
		System.out.println();
		if (balance>0)
			System.out.println("Final Amount in all 4 banks is (in rs.): "+balance );
		else
			System.out.println("Oops! you are running out of money");
	}	
	void totalOps() {
		System.out.println();
		System.out.println ("Overall Credit operations are " +totalcreditcount);
		System.out.println ("Overall Debit operations are " +totaldebitcount);
    }	
	void individualOps() {
		System.out.println ("In bank " +bank+" total Credit operations are " +creditcount);
		System.out.println ("In bank " +bank +" total Debit operations are " +debitcount);
	}	
	void statement() {
		System.out.println();
		if (totalcreditcount>totaldebitcount)
			System.out.println("***Wow,I appreciate your money management skills***");
		else
			System.out.println("***Warning:Please spend money wisely***");
	}	
		public static void main(String[] args) {
		SwitchAccount switchaccount=new SwitchAccount();
		switchaccount.bankOperation("SBI", 5000, "Credit");
		switchaccount.bankOperation("SBI", 50.35, "Debit");
		switchaccount.individualOps();
		SwitchAccount switchaccount1=new SwitchAccount();
		switchaccount1.bankOperation("BOB", 1000, "Credit");
		switchaccount1.bankOperation("BOB", 9000, "Credit");
		switchaccount1.bankOperation("BOB", 50.50, "Credit");
		switchaccount1.bankOperation("BOB", 100, "Credit");
		switchaccount1.bankOperation("BOB", 100, "Debit");
		switchaccount1.bankOperation("BOB", 100, "Debit");
		switchaccount1.bankOperation("BOB", 100, "Debit");
		switchaccount1.bankOperation("BOB", 100, "Debit");
		switchaccount1.individualOps();
		SwitchAccount switchaccount2=new SwitchAccount();
		switchaccount2.bankOperation("ICICI",100.30, "Credit");
		switchaccount2.bankOperation("ICICI",15.89, "Credit");
		switchaccount2.bankOperation("ICICI",1000, "Debit");
		switchaccount2.bankOperation("ICICI",1000, "Debit");
		switchaccount2.individualOps();
		SwitchAccount switchaccount3=new SwitchAccount();
		switchaccount3.bankOperation("HDFC",1500.36, "Credit");
		switchaccount3.bankOperation("HDFC", 50.80, "Credit");
		switchaccount3.bankOperation("HDFC",150.36, "Debit");
		switchaccount3.bankOperation("HDFC",1560.36, "Debit");
		switchaccount3.individualOps();
		
		switchaccount3.totalBalance();
		switchaccount3.totalOps();
		switchaccount3.statement();
	}		
}		
	   
   
	
	
		
			
	
	
		
		
		
		

	
	
	
	
	
	
	
	
	



		
	

	
	
	
	
		
	
	


