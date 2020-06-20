package meghaJJune20;

import java.util.Scanner;

public class AccountBank {
	
	String bankname;
	static double amount;
	static int credit;
	static int debit;
	int debitcount;
	int creditcount;
	
	void totalbalance(){
		if (amount>0)
			System.out.println("Balance available in all four Banks : "+amount );
		else
			System.out.println("Less money available");	 	
	}
	void overalloperations(String bname, int amt, String operation){
		
		bankname=bname;
		switch (bname) {
			case "SBI":
			switch (operation)	{
				case "Credit":
				amount=amount+amt;
				credit++;
				creditcount++;
				break;
				case "Debit":
				amount=amount-amt;
				debit++;
				debitcount++;
				break;
			}
			break;

			case "ICICI":
			switch (operation)	{
				case "Credit":
				amount=amount+amt;
				credit++;
				creditcount++;
				break;
				case "Debit":
				amount=amount-amt;
				debit++;
				debitcount++;
				break;
			}
			break;

			case "HDFC":
			switch (operation)	{
			case "Credit":
			amount=amount+amt;
			credit++;
			creditcount++;
			break;
			case "Debit":
			amount=amount-amt;
			debit++;
			debitcount++;
			break;
		}
		break;

			case "BOB":
			switch (operation)	{
			case "Credit":
			amount=amount+amt;
			credit++;
			creditcount++;
			break;
			case "Debit":
			amount=amount-amt;
			debit++;
			debitcount++;
			break;
		}
		break;
		}
		
	}
	void individualBankoperations() {
		System.out.println ("Credit Operation performed " +bankname+" are " +creditcount);
		System.out.println ("Debit Operation performed " +bankname+" are " +debitcount);
		System.out.println();
		
	}
	void totalOperations() {
		System.out.println();
		System.out.println ("Total operations of Credit " +credit);
		System.out.println ("Total operations of Debit " +debit);
		
	}
	void messageDisplay() {
		System.out.println();
		if (credit>debit)
			System.out.println("I appreciate your money management skills");
		else
			System.out.println("Please spend money wisely");	
	}
	public static void main(String[] args)
	{
		AccountBank accountbank = new AccountBank();
		Scanner scanner =new Scanner(System.in);
		String status="";
		do {
			System.out.println("Which operation do you want to perform? (Debit/Credit)");
			String operation=scanner.next();
			
			System.out.println("Which Bank do you want? (ICICI/SBI,BOB/HDFC)");
			String operationbank=scanner.next();
			
			System.out.println("Please enter the amount : ");
			int amount = scanner.nextInt();
			accountbank.overalloperations(operation, amount, operationbank);
			
			System.out.println("Do you want to continue : (Yes/NO)");
			status=scanner.next();
		    }while(status.equals("Yes"));
			{
				System.out.println("Program End");
			}
	}

	}
