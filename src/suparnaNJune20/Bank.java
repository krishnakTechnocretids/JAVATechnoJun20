package suparnaNJune20;

public class Bank {

	static double atmBal=100000;
	static int debitCnt, creditCnt, printBillCnt;
	int debit,credit, printBill;
	
	void debitTransaction(int amt, String name) {
		if (amt>atmBal)	{
			System.out.println("No Sufficient BAl ");
			return;
		}
		else {
			atmBal-=amt;
			debit++;
			debitCnt++;
			System.out.println(amt+ " Rs debited sucesfully by " + name);
		}
	}
		void  creditTransaction (int amt, String name) {
			 atmBal+=amt;
				System.out.println(amt+ " Rs credited sucesfully by"+ name);
				credit++;
				creditCnt++;
	}		
		void  printBillTransaction() {
			System.out.println(" Current Balance in Atm :"+atmBal);
			printBill++;
			printBillCnt++;
		}
	
	void individualTransactionSumary(String custName) {
		System.out.println("\n\n Total No of  trnasaction done by  "+custName +" are "+ (debit+credit+ printBill));
		System.out.println("Total No of Credit transaction " + credit);
		System.out.println("Total No of Debit transaction " + debit);
		System.out.println("Total No of PrintBill transaction "+ printBill);
    }
	

	void allTransactionSumary() {
		System.out.println("\n\nTotal No of  trnasaction done by all custome are  "+ (debitCnt+creditCnt+ printBillCnt));
		System.out.println("Total No of Credit transaction " + creditCnt);
		System.out.println("Total No of Debit transaction " + debitCnt);
		System.out.println("Total No of PrintBill transaction "+ printBillCnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank customer1 = new Bank();
		Bank customer2 = new Bank();
		System.out.println("Current ATM bal : "+customer1.atmBal );
		for (int i = 40; i<45; i++)
		{		if(i%3 == 1){
					customer1.debitTransaction(3498*1+34,"Deepika");
					customer2.printBillTransaction();
				}
				else  if (i%3 == 2)	{
					customer1.creditTransaction(456/1+5-1, "Deepika");
					customer2.debitTransaction(345656*2+698, "Ranveer");
				}
				else  if (i%3 == 0){
					customer1.printBillTransaction();
					customer2.creditTransaction(453423*9+5-1,"Ranveer");
				}
		}
		customer1.individualTransactionSumary("Cutomer1");
		customer2.individualTransactionSumary("Cutomer2");	
		customer1.allTransactionSumary();
		
	}

}
