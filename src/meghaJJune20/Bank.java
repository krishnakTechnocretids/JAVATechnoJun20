package meghaJJune20;

public class Bank {
	
	int countdebit;
	int countcredit;
	int countbalance;
	int userid;
	
	static int debittotal=0;
	static int credittotal=0;
	static int baltotal=0;
		
	void setData( int userid1,int balance)
	{
		userid=userid1;
		countbalance=balance;
	}
	void debitamount(int debit1)
	{
		countbalance=countbalance-debit1;
		countdebit++;
		debittotal++;
	}
	void creditamount(int credit1)
	{
		countbalance=countbalance+credit1;
		countcredit++;
		credittotal++;	
	}
	void printbalance()
	{
		System.out.println();
		System.out.println("Balance of User " +userid+" is "+countbalance);
		countbalance++;
		baltotal++;
	}
	void individualTransactionSummary()
	{
		System.out.println();
		if(userid==1)
			System.out.println("User1 Transaction Summary : Debit "+countdebit +" time, Credit " +countcredit +" times, Print Balance "+baltotal);
		
		if(userid==2)
			System.out.println("User2 Transaction Summary : Debit " +countdebit +" times, Credit " +countcredit +" times, Print Balance "+baltotal);
		
	}
	void allTransactionSummary()
	{
		System.out.println();
		System.out.println("All Transaction Summary: " +"Credit: "+credittotal+" times " +"Debit: " +debittotal+" times" +" Print Balance: "+baltotal+" times");
	}
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		bank.setData(1,1000);
		bank.debitamount(55);
		bank.creditamount(800);
		bank.creditamount(380);
		bank.printbalance();
		bank.individualTransactionSummary();
		
		Bank bank1 = new Bank();
		bank1.setData(2,2000);
		bank1.debitamount(180);
		bank1.debitamount(520);
		bank1.creditamount(100);
		bank1.creditamount(200);
		bank1.printbalance();
		bank1.individualTransactionSummary();
		
		bank1.allTransactionSummary();
	}
	
	

}
