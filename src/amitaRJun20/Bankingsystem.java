package amitaRJun20;

public class Bankingsystem {
	
	static int bankCreditCount,bankDebitCount,bankPrintBalance;
	int creditCount,debitCount,printBalance;
	String customerName;
	double customerCurrentBalance;
	
	//method to show customer name and currentBalance
	void setCustomerDetails(String name,double balance) {
		customerName=name;
		customerCurrentBalance=balance;
		System.out.println("Customer name: "+customerName+",  current balance ="+customerCurrentBalance);
	}

	//Method to credit amount
	void creditAmount(double amount) {
		if(amount<=0) {
			System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
		}
		else {
			customerCurrentBalance=customerCurrentBalance+amount;
			System.out.println("Credited "+amount+" ,Remaining balance "+customerCurrentBalance);			
			creditCount++;
			bankCreditCount++;		
		}			
	}
	
	//method to debit amount
	void debitAmout(double amount) {
		if(amount>customerCurrentBalance) {
			System.out.println("Insufficient balance");
		}
		else {
			customerCurrentBalance=customerCurrentBalance-amount;
			System.out.println("Debited amount "+amount+" ,Remaining balance "+customerCurrentBalance);
			debitCount++;
			bankDebitCount++;		
		}			
	}
	
	//Method to printBalance [it will print current balance]
	void printBalance() {
		System.out.println("Now clear balance is credit "+customerCurrentBalance);
		bankPrintBalance++;
		printBalance++;		
	}
	
	//method should show how many times individually debit, credit & printBalance method called .
	void individualTransactionSummary() {
		System.out.println(customerName+"  transaction summary:- ");
		System.out.println(customerName+" has done"+" Credit "+creditCount+" times, Debit "+debitCount+" times , print "+printBalance+" times");
	}
	
	//method should show by both users total how many times debit, credit & printBalance method get called.
	void allTransactionSummary() {
		System.out.println("All transaction summary:-  credit "+bankCreditCount+" times,  debit "+bankDebitCount+" times ,printBalance "+bankPrintBalance+" times");		
	}
	
	//Main method calling
	public static void main(String[] args) {
		Bankingsystem bank1=new Bankingsystem();
		bank1.setCustomerDetails("AMITA",20000.00);
		bank1.creditAmount(2000.00);
		bank1.creditAmount(4000.00);
		bank1.debitAmout(500.00);
		bank1.printBalance();
		bank1.individualTransactionSummary();
		System.out.println("**************************************************************************************");
		
		Bankingsystem bank2=new Bankingsystem();
		bank2.setCustomerDetails("ANUP",50000.00);
		bank2.creditAmount(4000.00);
		bank2.creditAmount(5000.00);
		bank2.creditAmount(5000.00);
		bank2.debitAmout(2000.00);
		bank2.creditAmount(5000.00);
		bank2.debitAmout(2000.00);
		bank2.creditAmount(4000.00);
		bank2.individualTransactionSummary();
		System.out.println("*****************************************************************************************");
		
		bank1.allTransactionSummary();
	}
}
