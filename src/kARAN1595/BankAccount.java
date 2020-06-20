/*Assignment 11 :  19th Jun 2020

	A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
	          a) Person can debit or credit amount from respective bank.
	              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

	          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

	          c) A Method to show total credit, debit operations 
	                 output : Total credit operation - 7 times
	                              Total debit operation - 5 times

	         d) A Method to show individual bank credit operations.
	                output : ICICI bank Credit Operation - 2
	                              HDFC bank Credit Operation - 2
			              SBI bank Credit Operation - 1
	                              BOB bank Credit Operation - 4

	         e) A Method to show individual bank debit operations.
	                output : ICICI bank Debit Operation - 2
	                             HDFC bank Debit Operation - 2
			             SBI bank Debit Operation - 1
	                             BOB bank Debit Operation - 4

	         f) A Method which should return "*I appreciate your money management skill*" message if credit operation count is more than debit operation count else return "*Please spend money wisely*" and print this message in main method.*/



package kARAN1595;

public class BankAccount {

	
	
	int iciciCreditCount,iciciDebitCount;
	int hdfcCreditCount,hdfcDebitCount;
	int sbiCreditCount,sbiDebitCount;
	int bobCreditCount,bobDebitCount;
	int totalCreditCount,totalDebitCount;
	double iciciAccountBalance,hdfcAccountBalance;
	double sbiAccountBalance,bobAccountBalance;
	double totalAccountBalance;
	
	void banking(String bankName,String operation,double amount )
	{
		switch(bankName)
		{
		// ICICI Bank
			case "ICICI" :
			{
				switch(operation)
				{
				     case "Credit":
				    	 if(amount>0)
				    	 {
				    		 iciciAccountBalance += amount;
				    		 iciciCreditCount++;
				    		 totalCreditCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount can't be Credited to this account.");
				    	 }
				    	 break;
				    	 
				     case "Debit":
				    	 if(iciciAccountBalance>=amount && amount>0)
				    	 {
				    		 iciciAccountBalance -=amount;
				    		 iciciDebitCount++;
				    		 totalDebitCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount is not available int this account.");
				    	 }
				    	 break;
				    	 
				   default:
					   System.out.println("Invalid amount is Credited or Debited");
				}
			}
			break;
			
			
//HDFC Bank 
			case "HDFC" :
			{
				switch(operation)
				{
				     case "Credit":
				    	 if(amount>0)
				    	 {
				    		 hdfcAccountBalance += amount;
				    		 hdfcCreditCount++;
				    		 totalCreditCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount can't be Credited to this account.");
				    	 }
				    	 break;
				    	 
				     case "Debit":
				    	 if(hdfcAccountBalance>=amount&& amount>0)
				    	 {
				    		 hdfcAccountBalance -=amount;
				    		 hdfcDebitCount++;
				    		 totalDebitCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount is not available int this account.");
				    	 }
				    	 break;
				    	 
				   default:
					   System.out.println("Invalid amount is Credited or Debited");
				}
			}
			break;
			
		//SBI Bank
			case "SBI" :
			{
				switch(operation)
				{
				     case "Credit":
				    	 if(amount>0)
				    	 {
				    		 sbiAccountBalance += amount;
				    		 sbiCreditCount++;
				    		 totalCreditCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount can't be Credited to this account.");
				    	 }
				    	 break;
				    	 
				     case "Debit":
				    	 if(sbiAccountBalance>=amount && amount>0)
				    	 {
				    		 sbiAccountBalance -=amount;
				    		 sbiDebitCount++;
				    		 totalDebitCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount is not available int this account.");
				    	 }
				    	 break;
				    	 
				   default:
					   System.out.println("Invalid amount is Credited or Debited");
				}
			}
			break;
		
			//BOB Bank		
			case "BOB" :
			{
				switch(operation)
				{
				     case "Credit":
				    	 if(amount>0)
				    	 {
				    		 bobAccountBalance += amount;
				    		 bobCreditCount++;
				    		 totalCreditCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount can't be Credited to this account.");
				    	 }
				    	 break;
				    	 
				     case "Debit":
				    	 if(bobAccountBalance>=amount && amount>0)
				    	 {
				    		 bobAccountBalance -=amount;
				    		 bobDebitCount++;
				    		 totalDebitCount++;
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Amount is not available int this account.");
				    	 }
				    	 break;
				    	 
				   default:
					   System.out.println("Invalid amount is Credited or Debited");
				}
			}
			break;	
		}
	}
		
			//This method shows the Total Amount of balance in each and every account
			void totalBalanceOfAllAccount() 
			{
				totalAccountBalance=iciciAccountBalance+hdfcAccountBalance+sbiAccountBalance+bobAccountBalance;
				System.out.println("Total Amount of all the banks: "+totalAccountBalance);
			}
			
			void bankingOperationsPerformed()
			{
				System.out.println("Total Count of Debit and Credit operations" +(totalCreditCount+totalDebitCount));
			}
			
			void individualBankAccountCreditCount()
			{
				System.out.println("ICICI Credit Count:"+iciciCreditCount);
				System.out.println("HDFC Credit Count:"+hdfcCreditCount);
				System.out.println("SBI Credit Count:"+sbiCreditCount);
				System.out.println("BOB Credit Count:"+bobCreditCount);
			}
			
			void individualBankAccountDebitCount()
			{
				System.out.println("ICICI Debit Count:"+iciciDebitCount);
				System.out.println("HDFC Debit Count:"+hdfcDebitCount);
				System.out.println("SBI Debit Count:"+sbiDebitCount);
				System.out.println("BOB Debit Count:"+bobDebitCount);
			}
			//Message Display
			String displayBank()
		      {
		    	  if(totalCreditCount >totalDebitCount)
		    		  return "*We Appreciate Your Money Management Skills!*";
		    	  else
		    		  return "*Please Spend Money Wisely.*";
		      }
			
	
	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount();
	//Credit Operation
		bank.banking("ICICI","Credit",3500.00);
		bank.banking("ICICI","Credit",4000.00);
		bank.banking("HDFC","Credit",3500.00);
		bank.banking("HDFC","Credit",3500.00);
		bank.banking("SBI","Credit",4000.00);
		bank.banking("SBI","Credit",3500.00);
		bank.banking("BOB","Credit",3500.00);
		bank.banking("BOB","Credit",3500.00);
		

    //Debit Operation
		bank.banking("ICICI","Debit",2000.0);
		bank.banking("HDFC","Debit",2000.0);
		bank.banking("SBI","Debit",2000.0);
		bank.banking("BOB","Debit",2000.0);
		
		bank.totalBalanceOfAllAccount();
		bank.bankingOperationsPerformed();
		bank.individualBankAccountCreditCount();
		bank.individualBankAccountDebitCount();
		System.out.println("Karan:"+bank.displayBank());

	}

}
