package technoCredits;

import java.util.Scanner;

public class SwitchBankOps {
	int ihdfc;
	int iicici;
	int ibob;
	int isbi;
	int icicidebitcnt;
	int icicicreditcnt;
	int hdfcdebitcnt;
	int hdfccreditcnt;
	int bobdebitcnt;
	int bobcreditcnt;
	int sbidebitcnt;
	int sbicreditcnt;
	static int totaldebitcnt;
	static int totalcreditcnt;
	

		void getbalance(int icici, int hdfc, int bob, int sbi){
			iicici=icici;
			ihdfc = hdfc;
			ibob=bob;
			isbi=sbi;
			
		}
		void totalBalance(){
			System.out.println("Total Balance is " +(iicici+ihdfc+ibob+isbi));
	
	}

	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
			case "ICICI" :
				
				switch(operation) {
				case "debit":
				case "Debit":
						if(amount>0 && amount<=iicici ){
						System.out.println("Amount debited from ICICI is successful :" + amount);
						iicici-=amount;
						icicidebitcnt++;
						totaldebitcnt++;
						}else
							System.out.println("Insufficient balance in ICICI");
						break;
				case "credit":
				case "Credit":
						System.out.println("Amount credit to ICICI successful:" + amount);
						iicici+=amount;
						icicicreditcnt++;
						totalcreditcnt++;
						break;
			    	}
			       break;
			       
				case "HDFC":
				switch(operation){
				case "debit":
				case "Debit":
					if(amount>0 && amount<=ihdfc ){
					System.out.println("Amount debited from HDFC is successful :" + amount);
					ihdfc-=amount;
					hdfcdebitcnt++;
					totaldebitcnt++;
				}else
					System.out.println("Insufficient balance in HDFC");
					break;
				case "credit":
				case "Credit":
					System.out.println("Amount credited to HDFC is successful :" + amount);
					ihdfc+=amount;
					hdfccreditcnt++;
					totalcreditcnt++;
					break;
		    	}
		       break;
		       
			case "BOB":
				switch(operation){
				case "debit":
				case "Debit":
					if(amount>0 && amount<=ibob ){
					System.out.println("Amount debited from BOB is successful :" + amount);	
					ibob-=amount;
					bobdebitcnt++;
					totaldebitcnt++;
					}else
						System.out.println("Insufficient balance in BOB");
					break;
				case "credit":
				case "Credit":
					System.out.println("Amount credited to BOB is successful :" + amount);
					ibob+=amount;
					bobcreditcnt++;
					totalcreditcnt++;
					break;
		    	}
		      	
		
			case "SBI":
				switch(operation){
				case "debit":
				case "Debit":
					if(amount>0 && amount<=isbi ){
					System.out.println("Amount debited from SBI is successful :" + amount);	
					isbi-=amount;
					sbidebitcnt++;
					totaldebitcnt++;
					}else
					System.out.println("Insufficient balance in SBI");
					break;
				case "credit":
				case "Credit":
					System.out.println("Amount credited to SBI is successful :" + amount);
					isbi+=amount;
					sbicreditcnt++;
					totalcreditcnt++;
					break;
				}
				break;
				
			default:
				System.out.println("Invalid Selection, Please enter correct Bank name");
				break;
				
				}
		
	}
	
	void operationCount(String opname){
		switch(opname){
		case "debit":
		case "Debit":
		System.out.println("debit count of ICICI: " + icicidebitcnt);
		System.out.println("debit count of HDFC: " + hdfcdebitcnt);
		System.out.println("debit count of BOB: " + bobdebitcnt);
		System.out.println("debit count of SBI: " + sbidebitcnt);
		break;
		case "credit":
		case "Credit":
			System.out.println("credit count of ICICI: " + icicicreditcnt);
			System.out.println("credit count of HDFC: " + hdfccreditcnt);
			System.out.println("credit count of BOB: " + bobcreditcnt);
			System.out.println("credit count of SBI: " + sbicreditcnt);
			break;
			default:
				System.out.println("Please enter valid operation name");
				
		}
	}
	
	
	void overallOperationofBank(){
		System.out.println("Total debit count: "+ totaldebitcnt);
		System.out.println("Total Credit count: "+ totalcreditcnt);
	}
	
	String messageForCustomer(){
		if(totalcreditcnt>totaldebitcnt)
			return "**I appreciate your money management skill**";
		else
			return "**Please spend money wisely**";
	}
	
	public static void main(String[] args) {
		SwitchBankOps switchBankOps = new SwitchBankOps();
		Scanner scanner = new Scanner(System.in);
		// to set initial balance
		System.out.println("Thank you for choosing us. Please enter your initial balance");
		System.out.println("Amount to be entered in ICICI bank");
		int icici =  scanner.nextInt();
		System.out.println("Amount to be entered in HDFC bank");
		int hdfc =  scanner.nextInt();
		System.out.println("Amount to be entered in BOB bank");
		int bob =  scanner.nextInt();
		System.out.println("Amount to be entered in SBI bank");
		int sbi =  scanner.nextInt();
		switchBankOps.getbalance(icici, hdfc, bob, sbi);
		
		switchBankOps.totalBalance();
		
		
		String status = "";
		//void bankOperation(String bankName, double amount, String operation){
		do{
			boolean flag = true;
			String bankName = "";
			do {
				System.out.println("From which bank whould you like to transact: ICICI/HDFC/BOB/SBI");				
				bankName  = scanner.next();
				if(bankName.equals("ICICI") || bankName.equals("HDFC"))
					flag = false;
				else
					System.out.println("Please enter valid bank name.");
			}while(flag == true);
			
			//switchBankOps.bankOperation(bankName, amount, operation);
			System.out.println("Which operation  whould you like to perform: Debit/Credit");
			String operation = scanner.next();
			System.out.println("Please enter amount");
			int amount = scanner.nextInt();
			switchBankOps.bankOperation(bankName, amount, operation);
			System.out.println("Would you like to continue: YES/NO");
			status = scanner.next();
		
		}
		while
			(status.equals("YES"));
		
		do{
			System.out.println("Would you like to see the credit/debit operation: YES/No");
			status = scanner.next();
			System.out.println("Please select name of opeation");
			String opname = scanner.next();
			switchBankOps.operationCount(opname);
			
		//	System.out.println("Would you like to continue: YES/NO");
		//	status = scanner.next();
		}
		while
			(status.equals("YES"));
			
		
		System.out.println();
		switchBankOps.overallOperationofBank();
		
		System.out.println(switchBankOps.messageForCustomer());
		scanner.close();
	}
	
}
