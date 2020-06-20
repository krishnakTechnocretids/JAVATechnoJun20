package apurvaJun20;

public class Banking {
	
	String custName;
	static int countAllDebit,countAllCredit;
	int countIciciDebit,countIciciCredit,countHdfcDebit,countHdfcCredit,countBobDebit,countBobCredit,countSbiDebit,countSbiCredit;
    double iciciBalance,hdfcBalance,bobBalance,sbiBalance;
	private Object Else;
    
    void bankOpertion(String bankName,double amount,String operation)
    {
    	switch(bankName) {
    	  case"ICICI":
    	    switch (operation) {
    	       case"Debit":
    	if (iciciBalance<amount)
    		System.out.println("\nInsufficient Balance,You cannot withdraw from ICICI");
    	else {
    		iciciBalance-=amount;
    		   countIciciDebit++;
    			   countAllDebit++;
    	}
    	break;
    	case "Credit":
    		if(amount <= iciciBalance && amount > 0)
    			System.out.println("\n Invalid Operation or Insufficient Balance");
    		else {
    			iciciBalance+=amount;
    		      countIciciCredit++;
    		         countAllCredit++;
    	}
    		break;
    	default:
    		System.out.println("\n Invalid Input"); 		
    	}
   
    	break;
    case"HDFC":
    	switch (operation) {
    	    case"Debit":
    	         if (hdfcBalance<amount)
        System.out.println("\nInsufficient Balance,You cannot withdraw from HDFC");
    	      else {
    		       hdfcBalance-=amount;
    		            countHdfcDebit++;
    			           countAllDebit++;
    	}
    	break;
    	case "Credit":
    		if(amount <= hdfcBalance && amount > 0)
    			System.out.println("\n Invalid Operation or Insufficient Balance");
    		else {
    		      hdfcBalance+=amount;
    		         countHdfcCredit++;
    		             countAllCredit++;
    	}
    		break;
    	default:
    		System.out.println("\n Invalid Input"); 		
    	}
    	break;
    case"BOB":
    	switch (operation) {
    	    case"Debit":
    	         if (bobBalance<amount)
        System.out.println("\nInsufficient Balance,You cannot withdraw from BOB");
    	      else {
    		       bobBalance-=amount;
    		            countBobDebit++;
    			           countAllDebit++;
    	}
    	break;
    	case "Credit":
    		if(amount <= bobBalance && amount > 0)
    			System.out.println("\n Invalid Operation or Insufficient Balance");
    		else {
    		      bobBalance+=amount;
    		         countBobCredit++;
    		             countAllCredit++;
    	}
    		break;
    	default:
    		System.out.println("\n Invalid Input"); 		
    	}
    	break;
    case"SBI":
    	switch (operation) {
    	    case"Debit":
    	         if (sbiBalance<amount)
        System.out.println("\nInsufficient Balance,You cannot withdraw from SBI");
    	      else {
    		       sbiBalance-=amount;
    		            countSbiDebit++;
    			           countAllDebit++;
    	}
    	break;
    	case "Credit":
    		if(amount <= sbiBalance && amount > 0)
    			System.out.println("\n Invalid Operation or Insufficient Balance");
    		else {
    		      sbiBalance+=amount;
    		         countSbiCredit++;
    		             countAllCredit++;
    	}
    		break;
    	default:
    		System.out.println("\n Invalid Input"); 		
    	}
    	break;
          default:
        	  System.out.println("\nAccount Detail Invalid");
        }
    }	
    void calculateTotalBalance() {
		System.out.println("\nHello "+custName+"! Your  Total Balance is: "+(iciciBalance + hdfcBalance + bobBalance + sbiBalance));
	}
    void displayTotaloperations() {
    	System.out.println("\nTotal No. of Operations Performed:- \n No.of  Credit Operations: "+countAllCredit+"\nNo.of Debit Operations: "+countAllDebit);
    	}

    	void displayIndivisduaLBankOps() {
    		System.out.println("\nIndividual Credit Operations:-\nICICI Bank : "+countIciciCredit+"\nHDFC Bank : "+countHdfcCredit+"\nBOB : "+countBobCredit+"\nSBI : "+countSbiCredit);
    	}

    	void displayBankWiseDebitOps() {
    		System.out.println("\nBank-wise Debit Operations:-\nICICI Bank : "+countIciciDebit+"\nHDFC Bank : "+countHdfcDebit+"\nBob : "+countBobDebit+"\nSBI : "+countSbiDebit);
    	}
    	
    	String ExpenseResult() {
    		if(countAllCredit>countAllDebit){
    		return("\nWe Appreciate Your Money Management Skills!");
    		}
    		else{
    			return("\nPlease Spend Your Money Wisely");
      	}
    }
    	public static void main(String[] args) {
    		Banking banking = new Banking();
    		banking.custName = "Shiro Gupta";
    		
    		banking.bankOpertion("ICICI",2000,"Credit");
    		banking.bankOpertion("HDFC",1000,"Credit");
    		banking.bankOpertion("ICICI",2800,"Credit");
    		banking.bankOpertion("SBI",4000,"Credit");
    		banking.bankOpertion("SBI",3000,"Credit");
    		banking.bankOpertion("BOB",1000,"Credit");
    		banking.bankOpertion("BOB",2000,"Credit");
    		banking.bankOpertion("ICICI",500,"Debit");
    		banking.bankOpertion("BOB",1500,"Debit");
    		banking.bankOpertion("HDFC",700,"Debit");
    		banking.bankOpertion("SBI",2000,"Debit");
    		banking.bankOpertion("ICICI",880,"Debit");
    		
    		banking.calculateTotalBalance();
    		banking.displayTotaloperations();
    		banking.displayBankWiseDebitOps() ;
    		banking.displayBankWiseDebitOps();
    		
    		System.out.println("\n"+banking.custName+" Result :"+banking.ExpenseResult());
     	}    
 }

