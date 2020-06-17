package prashantCJune20;
public class Bank {
	
	
	int creditCount = 0;
	int debitCount = 0;
	int printCount = 0;
	int balance;
	String name;
	
	static int debitStatic = 0;
	static int creditstatic = 0;
	static int printstatic = 0;
	
	
	void userDetails (String userName,int userbalance){
		balance = userbalance;
		name = userName;
		
	}
	
	
	void debit(int amount ) {
		if (amount > 0)
		{
			balance = balance + amount;
		debitCount = debitCount +1;
		debitStatic =  debitStatic +1;
		System.out.println("Amount debited in account is  "+amount+ "  and current balance is "+balance);
		}
		else{
		System.out.println("Not provided any amount to credit");	
		}
					
	}
	void credit(int cr){
		
		if(cr <= balance){
			balance = balance-cr;
			creditCount = creditCount +1;
			creditstatic =  creditstatic +1;
			System.out.println("Amount credited from account is  "+cr+"  and current balance is  "+balance);
		}
		else{
			System.out.println("Insufficient balence");
		}		
		
	}
	void printBal(){
		System.out.println("Your curret balance is  "+balance);
		printCount = printCount+1;
		printstatic = printstatic+1;
		
	}
	void individualTS(){
		
		System.out.println(name + " transaction summary : Credit - " + creditCount + " times, Debit - " + creditCount + " times, print count - " + printCount + " time");
		
				
	}
static void allTransactionSummary(){
	
	System.out.println("All transaction summary : Credit - " + creditstatic + " times, Debit - " + debitStatic + " times, printBalance - " + printstatic + " time");

			
	}
	
	
	public static void main(String[] args)
	{
		Bank User1 = new Bank();
		User1.userDetails("Prashant",1000);
		User1.debit(500);
		User1.credit(100);
		User1.printBal();
		User1.individualTS();
			
	System.out.println("--------------------------------------------------------");
	
		Bank User2 = new Bank();
		User2.userDetails("Shraddha",2000);
		User2.debit(800);
		User2.credit(200);
		User2.printBal();
		User2.individualTS();
	System.out.println("--------------------------------------------------------");	
		Bank.allTransactionSummary();
		
	}

}
