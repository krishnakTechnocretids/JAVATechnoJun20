package apurvaJun20;

public class Bank {
	String custName;
	int debitIndividualCount,creditIndividualCount,balanceIndividualCount,balAmount;
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
		debitIndividualCount++;
		totalDebitCount++;
		     }
		
	}
	void credit(int creditAmt) 
	{
		
	balAmount-=creditAmt;
	creditIndividualCount++;
	totalCreditCount++;
	
	}
	
    void balance()
    {
    	System.out.println("Current Balance available for "+custName+" is :"+balAmount);
    	balanceIndividualCount++;
    	totalBalanceCount++;
     }
    
    void individualTransactionsSummary()
    {
    	System.out.println("\nTransaction Summary :"+"custName"+"\nDebit"+debitIndividualCount+"\nCredit"+creditIndividualCount+"\nBalance"+balanceIndividualCount);
    	
    }
    
    void allTransacationSummary()
    {
    	System.out.println("\nAll Transcation Summary :"+"\nTotal Debit "+totalDebitCount+"\n Total Credit "+totalCreditCount+"\n Total Balance "+totalBalanceCount);
    }
    
   public static void main(String[] args)
   {
	   Bank bank1 = new Bank();
	   bank1.custName ="Shiro";
	   
	   Bank bank2 = new Bank();
	   bank2.custName="Bony";
	   
	    bank1.setInitialBalance(10000);
		bank1.debit(1000); 
		bank1.credit(5000);
		bank1.credit(6000);
		bank1.balance();
		bank1.individualTransactionsSummary();

	    bank2.setInitialBalance(30000);
		bank2.debit(2000); 
		bank2.debit(1000);
		bank2.credit(1000);
		bank2.credit(3000);
		bank2.credit(1500);
		bank2.credit(1000);
		bank2.credit(700);
		bank2.individualTransactionsSummary();
	   
	  
   
	   
   }
    
    

}
