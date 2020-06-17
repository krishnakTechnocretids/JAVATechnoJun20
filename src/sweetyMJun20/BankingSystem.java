package sweetyMJun20;

public class BankingSystem {
        int creditcnt;
		int debitcnt;
		int printcnt;
		int balance=5000;
		static int usercreditcnt;
		static int userdebitcnt;
		static int userprintcnt;
			
		void debitAcc(int debtamt){
			if (debtamt<=balance){
				balance = balance-debtamt;
				System.out.println("Amount in your account: " +balance);
			}
			else 
				System.out.println("Insufficient balance in your account:" +balance);
			debitcnt++;
			userdebitcnt++;
		}
		void creditAcc(int creditamt){ 
		  	balance = balance+creditamt;
		    System.out.println("Sufficient amount in your account: " +balance);
			creditcnt++;
			usercreditcnt++;
			}
		void printBalance(){
		    System.out.println("Customer current balance is: " + balance);
			printcnt++;
			userprintcnt++;
		}
		void transactionSummary(String name){
			System.out.println(name + " transaction Summary: Debit - " + debitcnt + " times, Credit - " + creditcnt + " times, PrintBalance " + printcnt + " times");
		}
	    void allTransactionSummary(){
			System.out.println("All transaction summary: Debit - " + userdebitcnt + " times, Credit - " + usercreditcnt + " times, PrintBalance " + userprintcnt + " times");
		}
		
		public static void main(String[] args)
		{
			BankingSystem bankingsystem=new BankingSystem();
			bankingsystem.creditAcc(2000);
			bankingsystem.creditAcc(500);
			bankingsystem.debitAcc(100);
			bankingsystem.printBalance();
			bankingsystem.transactionSummary("user1");
			
			BankingSystem bankingsystem1=new BankingSystem();
			bankingsystem1.debitAcc(500);
			bankingsystem1.debitAcc(200);
			bankingsystem1.creditAcc(500);
			bankingsystem1.creditAcc(500);
			bankingsystem1.creditAcc(500);
			bankingsystem1.creditAcc(500);
			bankingsystem1.creditAcc(200);
			bankingsystem1.transactionSummary("user2");
			bankingsystem.allTransactionSummary();
			
		}
	}
