package amitaRJun20;

import java.util.Scanner;

public class BankTransactionScannerClass {
	String customerName;
	double icicicurrentBalance,hdfccurrentBalance,bobcurrentBalance,sbicurrentBalance,amount;
	int iciciBankDebitCount,hdfcBankDebitCount,bobBankDebitCountt,sbiBankDebitCount;
	int iciciBankCreditCount,hdfcBankCreditCount,bobBankCreditCountt,sbiBankCreditCount;
	static int creditTotalCount,debitTotalCount;
	
	void setBalance(double iciciBalance,double hdfcBalance,double bobBalance,double sbiBalance) {
		icicicurrentBalance=iciciBalance;
		hdfccurrentBalance=hdfcBalance;
		bobcurrentBalance=bobBalance;
		sbicurrentBalance=sbiBalance;
		System.out.println("Current Account Balance in respective branchs are: "+"\n ICICI Bank: "+icicicurrentBalance+"\n"+" HDFC Bank: "+hdfccurrentBalance+"\n"+" BOB Bank: "+bobcurrentBalance+"\n"+" SBI Bank: "+sbicurrentBalance);                          
	}
	void bankOperation(int bankName,int operationName,double amount){
		
		switch (bankName) {
			case 1:
				switch(operationName) {
				case 1:
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						icicicurrentBalance+=amount;			
						iciciBankCreditCount++;
						creditTotalCount++;	
						break;
				case 2:
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
				
			case 2:
				switch(operationName) {
				case 1:
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						hdfccurrentBalance+=amount;			
						hdfcBankCreditCount++;
						creditTotalCount++;	
						break;
				case 2:
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
				
			case 3:
				switch(operationName) {
				case 1:
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						bobcurrentBalance+=amount;			
						bobBankCreditCountt++;
						creditTotalCount++;	
						break;
				case 2:
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
				
			case 4:
				switch(operationName) {
				case 1:
					if(amount<=0) 
						System.out.println("Amount can not be less than zero"+"\n"+"please enter a valid amount");
					else 
						sbicurrentBalance+=amount;			
						sbiBankCreditCount++;
						creditTotalCount++;	
						break;
				case 2:
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
			case 5:
				System.out.println("Have a Good day");
				break;
			default:
				System.out.println("Invalid Name....Please try again");
				
			} 
		}
	double printBalance(int bankName) {
		switch(bankName) {
		case 1:
			return icicicurrentBalance;
		case 2:
			return hdfccurrentBalance;
		case 3:
			return bobcurrentBalance;
		case 4:
			return sbicurrentBalance;
		default :
			return 0;
		}
	}
	int individualCreditOperation(int choice) {
		switch(choice) {
		case 1:
			return iciciBankCreditCount;
		case 2:
			return hdfcBankCreditCount;
		case 3:
			return bobBankCreditCountt;
		case 4:
			return sbiBankCreditCount;
		default:
			return 0;
		}
	}
	int individualDebitOperation(int choice) {
		switch(choice) {
		case 1:
			return iciciBankDebitCount;
		case 2:
			return hdfcBankDebitCount;
		case 3:
			return bobBankDebitCountt;
		case 4:
			return sbiBankDebitCount;
		default:
			return 0;
		}
	}
	int totalCreditOperation(int choice) {
		return creditTotalCount;
	}
	int totalDebitOperation(int choice) {
		return creditTotalCount;
	}
	void financeManagement(int choice) {
		if(creditTotalCount>debitTotalCount)
			System.out.println("*I appreciate your money management skill*");
		else
			System.out.println("*Please spend money wisely*");
	}
	public static void main(String[] args) {
		BankTransactionScannerClass banktransaction=new BankTransactionScannerClass();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome customer...Please Enter your Name... ");
		String name=scanner.next();
		banktransaction.setBalance(80000, 75000, 90000, 85000);
		String status="";
		do{
			System.out.println("In Which Bank you want to perform:\n1.ICICI\n2.HDFC\n3.BOB\n4.SBI\n5.Exit");
			int bankName= scanner.nextInt();
			
			System.out.println("What operation you want to perform: ");
			System.out.println("\n 1.Credit"+"\n 2.Debit"+"\n 3.Current balance"+"\n 4.No of credits in this bank"+"\n5.No of debits in this bank "+"\n6.Total No of credits"+"\n7.Total No of debits"+"\n8. Your status on finance management");
			int operationChoice=scanner.nextInt();
			double amount=0;
			switch(operationChoice){
			case 1:
				System.out.println("Please enter the amount to credit :");
				amount=scanner.nextDouble();
				banktransaction.bankOperation(bankName,operationChoice,amount);
				break;
			case 2:
				System.out.println("Please enter the amount to debit :");
				amount=scanner.nextDouble();
				banktransaction.bankOperation(bankName,operationChoice,amount);
				break;	
			case 3:
				System.out.println("Your current balance is "+banktransaction.printBalance(bankName));
				break;
			case 4:
				System.out.println("Total no of credits are"+banktransaction.individualCreditOperation(operationChoice));
				break;
			case 5:
				System.out.println("Total no of debits are"+banktransaction.individualDebitOperation(operationChoice));
				break;
			case 6:
				System.out.println("Overal Credit operation performed " +banktransaction.totalCreditOperation(operationChoice));
				break;
			case 7:
				System.out.println("Overal debits operation performed " +banktransaction.totalDebitOperation(operationChoice));
				break;
			case 8:
				banktransaction.financeManagement(operationChoice);
				break;			        
			default:
				System.out.println("Thank you....Have a nice day...");
			}
			System.out.println("Do you want to continue: Y/N");
			status = scanner.next();
			
		}while(status.equals("Y"));
	}
}
