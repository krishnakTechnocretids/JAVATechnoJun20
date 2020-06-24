package apurvaJun20;

import java.util.Scanner;

public class BankingScanner {
	
	String custName;
	static int countAllDebit,countAllCredit;
	int countIciciDebit,countIciciCredit,countHdfcDebit,countHdfcCredit,countBobDebit,countBobCredit,countSbiDebit,countSbiCredit;
    double iciciBalance,hdfcBalance,bobBalance,sbiBalance;
    
    
	void bankOpertion(String bankName,double amount,String operation)
    {
    	      switch(bankName) {
    	      case"ICICI":
    	      switch (operation) {
    	      case"Debit":
    	if (iciciBalance<amount) {
    		  countIciciDebit++;
    		  countAllDebit++;
    	}else {
    		System.out.println("\nInsufficient Balance,You cannot withdraw from ICICI");
    	}
		    break;
		    case "Credit":
			iciciBalance +=amount;
			countIciciCredit++;
			countAllCredit++;
		    break;
		}
    	    break;
      	    case "HDFC":
      		switch (operation) {
 	        case"Debit":
 	if (hdfcBalance<amount) {
 		countHdfcDebit++;
 		countAllDebit++;
 	}else {
 		    System.out.println("\nInsufficient Balance,You cannot withdraw from HDFC");
 	}
		   break;
		   case "Credit":
		   hdfcBalance +=amount;
		   countHdfcCredit++;
		   countAllCredit++;
		   break;
    }	   
	   	    break;
     	    case "BOB":
     		switch (operation) {
	        case"Debit":
	if (bobBalance<amount) {
		countBobDebit++;
		countAllDebit++;
	}else {
		    System.out.println("\nInsufficient Balance,You cannot withdraw from B0B");
	}
		   break;
		   case "Credit":
		   bobBalance +=amount;
		   countBobCredit++;
		   countAllCredit++;
		   break;
    }	
	   	    break;
     	    case "SBI":
     		switch (operation) {
	        case"Debit":
	if (sbiBalance<amount) {
		countSbiDebit++;
		countAllDebit++;
	}else {
		    System.out.println("\nInsufficient Balance,You cannot withdraw from SBI");
	}
		   break;
		   case "Credit":
		   sbiBalance +=amount;
		   countSbiCredit++;
		   countAllCredit++;
		   break;
    }
   break; 
     	   default :
				System.out.println("You cannot credit/debit. You don't have account in "+bankName+" bank");
    }
    }
    double totalbalance()
	{    double totalbalanceaccounts=iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		return totalbalanceaccounts;
	}
	void individualbankcredit() {
		System.out.println("ICICI bank Credit Operation :" +countIciciCredit +"\nHDFC bank Credit Operation : "+countHdfcCredit +"\nSBI bank Credit Operation :"+countBobCredit+ "\nBOB bank Credit Operation :"+countSbiDebit);
	}
    void individualbankdebit() {
    	System.out.println("\nICICI bank debit Operation :" +countIciciDebit +"\nHDFC bank debit Operation : "+countHdfcDebit +"\nSBI bank debit Operation :"+countBobDebit+ "\nBOB bank debit Operation :"+countSbiCredit);
	}

    void showtotalcreditdebit() {
    	System.out.println("\nTotal credit operation : "+ countAllDebit+ " times");
    	System.out.println("Total debit operation : "+ countAllCredit+ " times");

    }
   static boolean returnStringMethod() 
    {        if(countAllCredit>countAllDebit) {
    	return true;
    	}else {
    		return false; }
    	}
	public static void main(String[] args) {
	
		BankingScanner bankingScanner= new BankingScanner();
		Scanner scanner =new Scanner(System.in);
		String status="";
		do {
			System.out.println("Which bank account you want to proceed ICICI/HDFC/SBI/BOB :");
			scanner.next();
			System.out.println("Which Operation you want to Credit/Debit :");
			scanner.next();
			System.out.println("Enter the amount :");
		    double amount=scanner.nextDouble();
		    bankingScanner.bankOpertion("bankName",amount,"operation");
		   
		    System.out.println("You want to continue the procedure Yes/No :");
			status=scanner.next();
		}while(status.equals("Yes"));
		bankingScanner.individualbankcredit();
		bankingScanner.individualbankdebit();
		bankingScanner.showtotalcreditdebit();
		System.out.println("\nTotal balance of all accounts is " +bankingScanner.totalbalance());
        if(returnStringMethod()){
        	System.out.println("\nI appreciate your money management skill");
        }else {
        	System.out.println("\nPlease spend money wisely");
        }
		System.out.println("\nEnd of procedure");
        scanner.close();
	}
}
    	      
    	      
     		
    	
