package barkhaPJun20;

import java.util.Scanner;

public class MenuDriven {
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
					if (balance>=amount) {
				balance=balance-amount;
				totaldebitcount++;
				debitcount++;
				}
					else
						System.out.println("Insufficient balance");
					
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
					if (balance>=amount) {
				balance=balance-amount;
				totaldebitcount++;
				debitcount++;
				}
					else
						System.out.println("Insufficient balance");
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
				if (balance>=amount) {
			balance=balance-amount;
			totaldebitcount++;
			debitcount++;
				}
				else
					System.out.println("Insufficient balance");
					
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
				if (balance>=amount) {
			balance=balance-amount;
			totaldebitcount++;
			debitcount++;
				}
				else
					System.out.println("Insufficient balance");
					
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
			MenuDriven menudriven=new MenuDriven();
			
			Scanner scanner = new Scanner(System.in);
			String status="";
			do {
				System.out.print("In which bank you want to transact? SBI/ICICI/HDFC/BOB");
				String bankName=scanner.next();
				
				
				if (bankName.equals("SBI")||bankName.equals("ICICI")||bankName.equals("HDFC")||bankName.equals("BOB"))
				{
				System.out.print("Which operation you want to perform? Debit/Credit");
				String operation=scanner.next();
				
				System.out.print("Please enter amount");
				double amount=scanner.nextDouble();
				
				menudriven.bankOperation(bankName, amount, operation);
				
				System.out.print("Do you want to continue? Yes/No");
				status=scanner.next();
				}
				else 
					System.out.println("You are only eligible to transact from SBI/ICICI/HDFC/BOB");
				
			}while (status.equals("Yes"));
			
			menudriven.totalBalance();
			menudriven.totalOps();
			menudriven.individualOps();
			menudriven.statement();
			
			scanner.close();
	}			
}					
				
				
				
				
			
				
			
			
				
			
				
			
					
		
			
			
		
				
		
				
				
		

		
   
   
	
	
		
			
	
	
		
		
		
		

	
	
	
	
	
	
	
	
	



		
	

	
	
	
	
		
	
	


