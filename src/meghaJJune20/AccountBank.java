package meghaJJune20;

public class AccountBank
{
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
		accountbank.overalloperations("ICICI", 700, "Credit");
		accountbank.overalloperations("ICICI", 50, "Debit");
		accountbank.individualBankoperations();
		
		AccountBank accountbank1 = new AccountBank();
		accountbank1.overalloperations("SBI", 540, "Credit");
		accountbank1.overalloperations("SBI", 650, "Debit");
		accountbank1.individualBankoperations();
		
		AccountBank accountbank2 = new AccountBank();
		accountbank2.overalloperations("BOB",160, "Credit");
		accountbank2.overalloperations("BOB",104, "Debit");
		accountbank2.individualBankoperations();
		
		AccountBank accountbank3 = new AccountBank();
		accountbank3.overalloperations("HDFC",155, "Credit");
		accountbank3.overalloperations("HDFC",150, "Debit");
		accountbank3.individualBankoperations();
		
		accountbank.totalbalance();
		accountbank.totalOperations();
		accountbank.messageDisplay();
	}
}