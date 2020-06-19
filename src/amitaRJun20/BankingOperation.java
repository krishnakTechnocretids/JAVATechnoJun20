package amitaRJun20;

public class BankingOperation {
	
	String customerName;
	double icicicurrentBalance,hdfccurrentBalance,bobcurrentBalance,sbicurrentBalance,amount;
	int iciciBankDebitCount,hdfcBankDebitCount,bobBankDebitCountt,sbiBankDebitCount;
	int iciciBankCreditCount,hdfcBankCreditCount,bobBankCreditCountt,sbiBankCreditCount;
	static int creditTotalCount,debitTotalCount;
	
	void setCustomerDetails(String name,double iciciBalance,double hdfcBalance,double bobBalance,double sbiBalance) {
		customerName=name;
		icicicurrentBalance=iciciBalance;
		hdfccurrentBalance=hdfcBalance;
		bobcurrentBalance=bobBalance;
		sbicurrentBalance=sbiBalance;
		System.out.println("Customer name: "+customerName+" , Current Account Balance in respective branchs are: "+"\n ICICI Bank: "+icicicurrentBalance+"\n"+" HDFC Bank: "+hdfccurrentBalance+"\n"+" BOB Bank: "+bobcurrentBalance+"\n"+" SBI Bank: "+sbicurrentBalance);                          
	}

			
	void bankOperation(String bankName,String operationName,double amount){
			
		switch (bankName) {
			case "ICICI":
				switch(operationName) {
				case "credit":
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						icicicurrentBalance+=amount;			
						iciciBankCreditCount++;
						creditTotalCount++;	
						break;
				case "debit":
					if(amount>icicicurrentBalance) 
						System.out.println("Insufficient balance");
					else 
						icicicurrentBalance-=amount;			
						iciciBankDebitCount++;
						debitTotalCount++;						
						break;	
				default:
					System.out.println("Invalid Operation");					
				}
				break;
				
			case "HDFC":
				switch(operationName) {
				case "credit":
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						hdfccurrentBalance+=amount;			
						hdfcBankCreditCount++;
						creditTotalCount++;	
						break;
				case "debit":
					if(amount>hdfccurrentBalance) 
						System.out.println("Insufficient balance");
					else 
						hdfccurrentBalance-=amount;			
						hdfcBankDebitCount++;
						debitTotalCount++;						
						break;	
				default:
					System.out.println("Invalid Operation");					
				}
				break;
				
			case "BOB":
				switch(operationName) {
				case "credit":
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						bobcurrentBalance+=amount;			
						bobBankCreditCountt++;
						creditTotalCount++;	
						break;
				case "debit":
					if(amount>bobcurrentBalance) 
						System.out.println("Insufficient balance");
					else 
						bobcurrentBalance-=amount;			
						bobBankDebitCountt++;
						debitTotalCount++;						
						break;	
				default:
					System.out.println("Invalid Operation");					
				}
				break;
				
			case "SBI":
				switch(operationName) {
				case "credit":
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						sbicurrentBalance+=amount;			
						sbiBankCreditCount++;
						creditTotalCount++;	
						break;
				case "debit":
					if(amount>sbicurrentBalance) 
						System.out.println("Insufficient balance");
					else 
						sbicurrentBalance-=amount;			
						sbiBankDebitCount++;
						debitTotalCount++;						
						break;	
				default:
					System.out.println("Invalid Operation");					
				}
				break;
				default:
					System.out.println("Invalid Name....Please try again");
				
			} 
		}
	void totalBankBalance() {
		System.out.println("ICICI remaining balance: "+icicicurrentBalance);
		System.out.println("HDFC remaining balance: "+hdfccurrentBalance);
		System.out.println("BOB remaining balance: "+bobcurrentBalance);
		System.out.println("SBI remaining balance: "+sbicurrentBalance);
	}
	
	void totalCreditAndDebitOperation() {
		System.out.println("Total credit Operation : "+creditTotalCount);
		System.out.println("Total Debit Operation : "+ debitTotalCount);
		
	}
	
	void individualCreditOperation() {
		System.out.println("ICICI Bank total credit count : "+iciciBankCreditCount);
		System.out.println("HDFC Bank total credit count : "+hdfcBankCreditCount);
		System.out.println("BOB Bank total credit count : "+bobBankCreditCountt);
		System.out.println("SBI Bank total credit count : "+sbiBankCreditCount);		
	}
	
	void individualDebitOperation() {
		System.out.println("ICICI Bank total debit count : "+iciciBankDebitCount);
		System.out.println("HDFC Bank total debit count : "+hdfcBankDebitCount);
		System.out.println("BOB Bank total debit count : "+bobBankDebitCountt);
		System.out.println("SBI Bank total debit count : "+sbiBankDebitCount);
	}
	
	public static void main(String[] args) {
		BankingOperation bankingoperation=new BankingOperation();
		bankingoperation.setCustomerDetails("Amita", 50000,45000,75000,90000);
		bankingoperation.bankOperation("ICICI", "debit",9000);
		bankingoperation.bankOperation("ICICI", "credit",200);
		bankingoperation.bankOperation("HDFC", "debit",6000);
		bankingoperation.bankOperation("HDFC", "debit",1000);
		bankingoperation.bankOperation("SBI", "debit",3000);
		bankingoperation.bankOperation("BOB", "credit",500);
		bankingoperation.bankOperation("BOB", "debit",2000);
		bankingoperation.bankOperation("BOB", "debit",4000);		
		bankingoperation.bankOperation("ICICI", "debit",9000);
		bankingoperation.bankOperation("ICICI", "credit",2000);
		bankingoperation.bankOperation("ICICI", "credit",6000);
		bankingoperation.bankOperation("HDFC", "debit",1000);
		bankingoperation.bankOperation("HDFC", "credit",5000);
		bankingoperation.bankOperation("HDFC", "credit",500);
		bankingoperation.bankOperation("BOB", "debit",2000);
		bankingoperation.bankOperation("BOB", "debit",4000);
		bankingoperation.bankOperation("SBI", "credit",8000);
		bankingoperation.bankOperation("SBI", "debit",9000);
		bankingoperation.bankOperation("BOB", "credit",4000);
		
		System.out.println("\nTotal Remaining Balance after Transaction");
		System.out.println("************************************************************************");
		bankingoperation.totalBankBalance();
		System.out.println("\nTotal Credit and Debit Operation in All Bank ");
		System.out.println("************************************************************************");
		bankingoperation.totalCreditAndDebitOperation();
		System.out.println("\nIndividual Credit Operatin: ");
		System.out.println("************************************************************************");
		bankingoperation.individualCreditOperation();
		System.out.println("\nIndividual Debit Operatin: ");
		System.out.println("************************************************************************");
		bankingoperation.individualDebitOperation();
		
		System.out.println("************************************************************************");
		if(creditTotalCount>debitTotalCount)
			System.out.println("*I appreciate your money management skill*");
		else
			System.out.println("*Please spend money wisely*");
	}

}
