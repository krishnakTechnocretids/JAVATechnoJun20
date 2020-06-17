package aadeshJun20;

public class BankingSystem {
	String custName;
	int debitCount,creditCount,balanceCount,balAmount;
	static int totalDebitCount,totalCreditCount,totalBalanceCount;

	void setInitialBalance(int amount){
		totalBalanceCount++;
		System.out.println("\n\nInitial Balance of Customer "+custName+" is: "+amount);
		balAmount = amount;
	}


	void debit(int debitAmt)
   {
		if(balAmount<debitAmt)
			System.out.println("Insufficient Balance");
		else {
	    balAmount-=debitAmt;
		debitCount++;
		totalDebitCount++;
		     }

	}
	void credit(int creditAmt) 
	{

	balAmount-=creditAmt;
	creditCount++;
	totalCreditCount++;

	}

    void balance()
    {
    	System.out.println("Current Balance available for "+custName+" is :"+balAmount);
    	balanceCount++;
    	totalBalanceCount++;
     }

    void individualTransactionsSummary()
    {
    	System.out.println("\nTransaction Summary :"+"custName"+"\nDebit"+debitCount+"\nCredit"+creditCount+"\nBalance"+balanceCount);

    }

    void allTransacationSummary()
    {
    	System.out.println("\nAll Transcation Summary :"+"\nTotal Debit "+totalDebitCount+"\n Total Credit "+totalCreditCount+"\n Total Balance "+totalBalanceCount);
    }

   public static void main(String[] args)
   {
	   BankingSystem bank1 = new BankingSystem();
	   bank1.custName ="Appu";

	   BankingSystem bank2 = new BankingSystem();
	   bank2.custName="Shanky";

	    bank1.setInitialBalance(15200);
		bank1.debit(256); 
		bank1.credit(348);
		bank1.credit(678);
		bank1.balance();
		bank1.individualTransactionsSummary();

	    bank2.setInitialBalance(30000);
		bank2.debit(800); 
		bank2.debit(100);
		bank2.credit(750);
		bank2.credit(300);
		bank2.credit(88);
		bank2.credit(1000);
		bank2.credit(650);
		bank2.individualTransactionsSummary();

   }
}