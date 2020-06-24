package abhijitMJun20;

public class Bankingsystem {
	int accountbalance;
	static int credittransactionsummary,debittransactionsummary,printbalancesummary;
	int creditcount,debitcount,printBalancecount;
	
	void debitAmount(int debitamount) { 
		accountbalance=accountbalance-debitamount;
		if(accountbalance != 0){
		debitcount++;
		debittransactionsummary++;
		}
		}
	
	void creditAmount( int creditamount ) {
		accountbalance=accountbalance+creditamount;
		creditcount++;
		credittransactionsummary++;
		}
	
	void printBalance() { 
		
		printBalancecount++;
		printbalancesummary++;
	}
	
  void 	individualTransactionSummary(){
	  System.out.println("transaction summary : Credit " + creditcount + " times,Debit " +debitcount+ " times,print balance " +printBalancecount+ " times" );
  }
  
  void alltransactionsummary() {
	  System.out.println("\nAll transaction summary : Credit " + credittransactionsummary + " times,Debit " +debittransactionsummary+ " times,print balance " +printbalancesummary+ " times" );
  }
  
	public static void main(String[] args) {
		Bankingsystem b1= new Bankingsystem();
		b1.creditAmount(700);
		b1.debitAmount(500);
		b1.debitAmount(50);
		b1.creditAmount(200);
		b1.printBalance();
		System.out.println("user1");
		b1.individualTransactionSummary();
		Bankingsystem b2= new Bankingsystem();
		b2.debitAmount(200);
		b2.debitAmount(100);
		b2.creditAmount(1000);
		b2.printBalance();
		System.out.println("user2");
		b2.individualTransactionSummary();
		b2.alltransactionsummary();
	}
}
