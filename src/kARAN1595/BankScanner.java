/*Assignment 12 : 20th Jun 2020

Write an Assignment 11 program using Scanner class (Menu driven).

Note : Please don't update same class, create new one.*/

package kARAN1595;

import java.util.Scanner;

public class BankScanner {
	
	

	int iciciCreditCount,iciciDebitCount;
	int hdfcCreditCount,hdfcDebitCount;
	int sbiCreditCount,sbiDebitCount;
	int bobCreditCount,bobDebitCount;
	int totalCreditCount,totalDebitCount;
	int iciciAccountBalance,hdfcAccountBalance;
	int sbiAccountBalance,bobAccountBalance;
	int totalAccountBalance;
	
	void banking(String bankName,String operation,int amount )
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
			void displaytotalBalanceOfAllAccount() 
			{
				totalAccountBalance=iciciAccountBalance+hdfcAccountBalance+sbiAccountBalance+bobAccountBalance;
				System.out.println("Total Amount of all the banks: "+totalAccountBalance);
			}
			
			void displaybankingOperationsPerformed()
			{
				System.out.println("Total Count of Debit and Credit operations" +(totalCreditCount+totalDebitCount));
			}
			
			void displayindividualBankAccountCreditCount()
			{
				System.out.println("ICICI Credit Count:"+iciciCreditCount);
				System.out.println("HDFC Credit Count:"+hdfcCreditCount);
				System.out.println("SBI Credit Count:"+sbiCreditCount);
				System.out.println("BOB Credit Count:"+bobCreditCount);
			}
			
			void displayindividualBankAccountDebitCount()
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
		
		BankScanner bankscan = new BankScanner();
		Scanner scanner = new Scanner(System.in);
		String status ="";
		
		do{
			System.out.println("Enter Operation whic you want to perform Credit/Debit? \n ");
			String operation = scanner.next();
			
			System.out.println("Enter the bank name ICICI/HDFC/SBI/BOB: \n");
			String bankName = scanner.next();
			
			System.out.println("Please enter the amouunt : \n");
			int amount = scanner.nextInt();
			
			switch (operation)
			{
			case "Credit":
				bankscan.banking(bankName,"Credit",amount);
				break;
			case "Debit":
				bankscan.banking(bankName,"Debit",amount);
				break;
			default:
				System.out.println("Invalid data/Please try again with vaild input \n");
			}
				System.out.println("\n Do you want to continue??Yes/No \n" );
				status=scanner.next();
		}while(status.equals("Yes"));
		System.out.println("Program ended");
		scanner.close();
	
		bankscan.displaytotalBalanceOfAllAccount();
		bankscan.displayindividualBankAccountCreditCount();
		bankscan.displayindividualBankAccountDebitCount();
		bankscan.displaybankingOperationsPerformed();
		bankscan.displayBank();
		
	}

	

}
