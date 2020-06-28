package sweetyMJun20;

public class BankAccount {
	static int crditCnt;
	static int debitCnt;
	int crCntH,crCntI,crCntS,crCntB;
	int dbCntH,dbCntI,dbCntS,dbCntB;
	double hBal=5000;
	double iBal=5000;
	double sBal=5000;
	double bBal=5000;
	void bankOperation(String bankname,double amount,String operation){
	switch (bankname){
		case "HDFC":
		  switch(operation){
			case "Credit":
			  { 
				hBal=hBal+amount;
				System.out.println("HDFC balance is: " + hBal);
				crCntH++;
				crditCnt++; 
				break;
			  }
			  case "Debit":
			  {
				   if (amount<=hBal){
					 hBal=hBal-amount;
				  System.out.println("HDFC balance is: " + hBal);
				  }
				  else {
					  System.out.println("Insufficient balance in your account:" +hBal);
				  }
				  dbCntH++;
				  debitCnt++;
				  break;
				  }
			  default:
			   System.out.println(" You choose invalid operation");
			   }
		  break;
		case "ICICI":
			switch(operation){
				case "Credit":
				{ 
				iBal=iBal+amount;
				System.out.println("ICICI balance is: " + iBal);
				crCntI++;
				crditCnt++; 
				break;
				}
				case "Debit":
				{
				  if (amount<=iBal){
					 iBal=iBal-amount;
				  System.out.println("ICICI balance is:" + iBal);
				  }
				  else {
					  System.out.println("Insufficient balance in your account:" +iBal);
				  }
				  dbCntI++;
				  debitCnt++;
				  break;
				}
				default:
				System.out.println(" You choose invalid operation");	  
				}
				break;
        case "BOB":
		  switch(operation){
			case "Credit":
			  { 
				bBal=bBal+amount;
				System.out.println("BOB balance is: " + bBal);
				crCntB++;
				crditCnt++; 
				break;
			  }
			  case "Debit":
			  {
				  if (amount<=bBal){
					 bBal=bBal-amount;
				  System.out.println("BOB balance is: " + bBal);
				  }
				  else {
					  System.out.println("Insufficient balance in your account:" +bBal);
				  }
				  dbCntB++;
				  debitCnt++;
				  break;
			  }
			  default:
			   System.out.println(" You choose invalid operation");	  
			   }
			   break;
         case "SBI":
		  switch(operation){
			case "Credit":
			  { 
				sBal=sBal+amount;
				System.out.println("SBI balance is: " + sBal);
				crCntS++;
				crditCnt++; 
				break;
			  }
			  case "Debit":
			  {
				  if (amount<=sBal){
					 sBal=sBal-amount;
				  System.out.println("SBI balance is:" + sBal);
				  }
				  else {
					  System.out.println("Insufficient balance in your account:" +sBal);
				  }
				  dbCntS++;
				  debitCnt++;
				  break;
			  }
			  default:
			   System.out.println(" You choose invalid operation");	  
			   }	
			   break;
			   }	
	}	
    void totalBalance(){
	   System.out.println("Total balance are (HDFC Total Balance + ICICI Total Balance + SBI Total Balance + BOB Total Balance) : " +(hBal+sBal+iBal+bBal));
	}
	void totalCount(){
	   System.out.println("Total Credit operation - " +crditCnt+ " and  Total Debit Operation - " + debitCnt);
	}
    void totalDebitOperation(){
		System.out.println("HDFC Bank transaction Summary: Debit - " + dbCntH + " times");
		System.out.println("ICICI Bank transaction Summary: Debit - " + dbCntI + " times");
		System.out.println("SBI Bank transaction Summary: Debit - " + dbCntS + " times");
		System.out.println("BOB Bank transaction Summary: Debit - " + dbCntB + " times");
	}
    void totalCreditOperation(){
		System.out.println("HDFC Bank transaction	 Summary: Credit - " + crCntH + " times");
		System.out.println("ICICI Bank transaction Summary: Credit - " + crCntI + " times");
		System.out.println("SBI Bank transaction Summary: Credit - " + crCntS + " times");
		System.out.println("BOB Bank transaction Summary: Credit - " + crCntB + " times");			
	}
    void managementSkill(){
		if (crditCnt>=debitCnt) {
			System.out.println("I appriciate your money management skills");
		}
		else {
			System.out.println("Please Spend money wisely");
		}
	}
	public static void main(String[] args){
		BankAccount bankaccount=new BankAccount();
		bankaccount.bankOperation("ICICI",100,"Debit");
		bankaccount.bankOperation("ICICI",100,"Debit");
		bankaccount.bankOperation("ICICI",1000,"Credit");
		bankaccount.bankOperation("HDFC",100,"Debit");
		bankaccount.bankOperation("HDFC",1000,"Credit");
		bankaccount.bankOperation("HDFC",500,"Debit");
		bankaccount.bankOperation("ICICI",1500,"Credit");
		bankaccount.bankOperation("HDFC",1500,"Credit");
		bankaccount.bankOperation("SBI",200,"Credit");
		bankaccount.bankOperation("SBI",200,"Debit");
		bankaccount.bankOperation("BOB",1000,"Credit");
		bankaccount.bankOperation("BOB",2000,"Credit");
		bankaccount.bankOperation("BOB",2000,"Credit");
		bankaccount.bankOperation("BOB",2000,"Credit");
		bankaccount.bankOperation("BOB",100,"Debit");
		bankaccount.bankOperation("BOB",200,"Debit");
		bankaccount.bankOperation("BOB",200,"Debit");
		bankaccount.bankOperation("BOB",200,"Debit");
		bankaccount.totalBalance();
		bankaccount.totalCount();
		bankaccount.totalDebitOperation();
		bankaccount.totalCreditOperation();
		bankaccount.managementSkill();	
	}
}

