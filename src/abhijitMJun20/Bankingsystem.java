package abhijitMJun20;

public class Bankingsystem {
	int accountbalance=1000;
	static int credittransactionsummary=0,debittransactionsummary=0,printbalancesummary=0;
	int creditcount=0,debitcount=0,printBalancecount=0;
	
	void debitAmount(int debitamount) { 
		accountbalance=accountbalance-debitamount;
		debitcount++;
		debittransactionsummary++;
		}
	
	void creditAmount( int creditamount ) {
		accountbalance=accountbalance+creditamount;
		creditcount++;
		credittransactionsummary++;
		}
	
	void printBalance() { 
		//System.out.println("Current balcance of user1 " + accountbalance);
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
		b1.debitAmount(500);
		b1.debitAmount(50);
		b1.creditAmount(700);
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
