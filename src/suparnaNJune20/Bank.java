package suparnaNJune20;

public class Bank {

	static double atmBal;
	static int debitCnt, creditCnt, printBillCnt;
	String custName;
	static void setAtmData(double cnt) {
		atmBal += cnt;
	}

	void  setName(String name) {
		custName = name;
	}

	int debit,credit, printBill;

	void debitTransaction(int amt) {
		if (amt>atmBal)	{
			System.out.println("No Sufficient BAl in ATM  " );
			return;
		}
		else {
			atmBal-=amt;
			debit++;
			debitCnt++;
			System.out.println(amt+ " Rs debited sucesfully  ");
		}
	}
	void  creditTransaction (int amt) {
		atmBal+=amt;
		System.out.println(amt+ " Rs credited sucesfully by");
		credit++;
		creditCnt++;
	}		
	void  printBillTransaction() {

		System.out.println(" Current Balance in Atm :"+ atmBal );
		printBill++;
		printBillCnt++;
	}

	void individualTransactionSumary() {
		System.out.println("\n\n Total No of  transaction  done by  " + custName +" are "+ (debit+credit+ printBill));
		System.out.println("Total No of Credit transaction " + credit);
		System.out.println("Total No of Debit transaction " + debit);
		System.out.println("Total No of PrintBill transaction "+ printBill);
	}


	static void allTransactionSumary() {
		System.out.println("\n\nTotal No of  trnasaction done by all custome are  "+ (debitCnt+creditCnt+ printBillCnt));
		System.out.println("Total No of Credit transaction " + creditCnt);
		System.out.println("Total No of Debit transaction " + debitCnt);
		System.out.println("Total No of PrintBill transaction "+ printBillCnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank customer1 = new Bank();
		Bank customer2 = new Bank();
		setAtmData(100000);
		customer1.setName("Deepika");
		customer2.setName("Priyanka");
		allTransactionSumary();
		System.out.println("\n");
		System.out.println("\n Current ATM bal : "+atmBal );
		System.out.println("\n Transaction by " + customer1.custName);
		customer1.debitTransaction(45634);
		customer1.printBillTransaction();
		customer1.creditTransaction(12345 );
		System.out.println("\nTransaction by " + customer2.custName);	
		customer2.debitTransaction(67890 );
		customer2.printBillTransaction();
		customer2.creditTransaction(1253123);
		System.out.println("\nTransaction by " + customer1.custName);
		customer1.printBillTransaction();
		customer1.debitTransaction(45334);
		System.out.println("\nTransaction by " + customer2.custName);	
		customer2.printBillTransaction(); 
		customer2.debitTransaction(4563445);
		customer1.individualTransactionSumary();
		customer2.individualTransactionSumary();

		allTransactionSumary();

	}

}
