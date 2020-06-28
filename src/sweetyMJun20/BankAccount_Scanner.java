package sweetyMJun20;
import java.util.Scanner;

public class BankAccount_Scanner {
	static int crditCnt;
	static int debitCnt;
	int crCntH,crCntI,crCntS,crCntB;
	int dbCntH,dbCntI,dbCntS,dbCntB;
	double hBal=5000;
	double iBal=5000;
	double sBal=5000;
	double bBal=5000;
	void bankOperation(String bankname, double amount, String operationType){
	switch (bankname){
		case "HDFC":
		  switch(operationType){
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
				   System.out.println(" You choose invalid operationType");
			  }
			  break;
			  
				  
				  
		

		case "ICICI":
			switch(operationType){
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
				System.out.println(" You choose invalid operationType");	  
				}
				break;

		case "BOB":
		  switch(operationType){
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
			   System.out.println(" You choose invalid operationType");	  
			   }
			   break;

			   
		case "SBI":
		  switch(operationType){
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
			   System.out.println(" You choose invalid operationType");	  
			   }	
			   break;
		}	
	}	

	void totalBalance(){
	   System.out.println("Total balance are (HDFC Total Balance + ICICI Total Balance + SBI Total Balance + BOB Total Balance) : " +(hBal+sBal+iBal+bBal));
	}
	
	void totalCount(){
	   System.out.println("Total Credit operationType - " +crditCnt+ " and  Total Debit Operation - " + debitCnt);
	}
   
	void totalDebitOperation(){
		//debitSum=dbCntH+dbCntI+dbCntS+dbCntB;
		System.out.println("HDFC Bank transaction Summary: Debit - " + dbCntH + " times");
		System.out.println("ICICI Bank transaction Summary: Debit - " + dbCntI + " times");
		System.out.println("SBI Bank transaction Summary: Debit - " + dbCntS + " times");
		System.out.println("BOB Bank transaction Summary: Debit - " + dbCntB + " times");
	}

	void totalCreditOperation(){
		//creditSum= crCntH+crCntI+crCntS+crCntB;
		System.out.println("HDFC Bank transaction	 Summary: Credit - " + crCntH + " times");
		System.out.println("ICICI Bank transaction Summary: Credit - " + crCntI + " times");
		System.out.println("SBI Bank transaction Summary: Credit - " + crCntS + " times");
		System.out.println("BOB Bank transaction Summary: Credit - " + crCntB + " times");			
	}

	void managementSkill(){
		if (crditCnt>=debitCnt)
		{
			System.out.println("I appriciate your money management skills");
		}
		else {
			System.out.println("Please Spend money wisely");
		}
	}
	
	public static void main(String[] args)
	{   BankAccount_Scanner bankaccountscanner=new BankAccount_Scanner();
		String status1="Yes";
		
	    do{
			
			Scanner bankName=new Scanner(System.in);
			System.out.println("Which Bank you want to do transaction? HDFC/ICICI/SBI/BOB");
			String bankname=bankName.next();
			Scanner optType=new Scanner(System.in);
			System.out.println("Which operationType you want to do ? Debit/Credit");
			String operatetype=optType.next();
			Scanner transAmount=new Scanner(System.in);
			System.out.println( "Enter amount: ");
			double amount=transAmount.nextDouble();
			bankaccountscanner.bankOperation(bankname, amount, operatetype);
			Scanner status=new Scanner(System.in);
			System.out.println( "Do you want to continue? Yes/No ");
			status1=status.next();
		}
		while(status1.equals("Yes"));
		
		bankaccountscanner.totalBalance();
		bankaccountscanner.totalCount();
		bankaccountscanner.totalDebitOperation();
		bankaccountscanner.totalCreditOperation();
		bankaccountscanner.managementSkill();
}
}

