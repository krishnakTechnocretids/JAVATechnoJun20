package archanaNJun20;

import java.util.Scanner;

public class ScannerExample {
	double iBalance,hBalance,sBalance,bBalance;
	static int debitCnt,creditCnt;

	int iDebitCnt,iCreditCnt,hDebitCnt,hCreditCnt,sDebitCnt,sCreditCnt,bDebitCnt,bCreditCnt;

	void bankOperation(double amount,String bankName,String operation){

		switch(bankName){
		case "ICICI":
			switch(operation){
			case "Debit":
			case "debit":	
				if(iBalance>amount){
					iBalance-=amount;
					iDebitCnt++;
					debitCnt++;
					System.out.println("ICICI balance is "+iBalance);
				}else
					System.out.println("Insuffient Balance in ICICI account**");	
				break;
			case "Credit":
			case "credit":
				iBalance+=amount;
				iCreditCnt++;
				creditCnt++;
				System.out.println("ICICI balance is "+iBalance);
				break;
			default:
				System.out.println("Invalid operation");
			}
			break;

		case "HDFC":
			switch(operation){
			case "Debit":
				if(hBalance>amount){
					hBalance-=amount;
					hDebitCnt++;
					debitCnt++;
					System.out.println("HDFC balance is "+hBalance);
				}else
					System.out.println("Insuffient Balance in HDFC account**");	
				break;
			case "Credit":
				hBalance+=amount;
				hCreditCnt++;
				creditCnt++;
				System.out.println("HDFC balance is "+hBalance);
				break;
			default:
				System.out.println("Invalid operation");
			}
			break;

		case "SBI":
			switch(operation){
			case "Debit":
				if(sBalance>amount){
					sBalance-=amount;
					sDebitCnt++;
					debitCnt++;
					System.out.println("SBI balance is "+sBalance);
				}else
					System.out.println("Insuffient Balance in SBI account**");	
				break;
			case "Credit":
				sBalance-=amount;
				sCreditCnt++;
				creditCnt++;
				System.out.println("SBI balance is "+sBalance);
				break;
			default:
				System.out.println("Invalid operation");
			}
			break;   

		case "BOB":
			switch(operation){
			case "Debit":
				if(bBalance>amount){
					bBalance-=amount;
					bDebitCnt++;
					debitCnt++;
					System.out.println("BOB balance is "+bBalance);
				}else
					System.out.println("Insuffient Balance in BOB account**");	
				break;
			case "Credit":
				bBalance+=amount;
				bCreditCnt++;
				creditCnt++;
				System.out.println("BOB balance is "+bBalance);
				break;
			default:
				System.out.println("Invalid operation");
			}
			break;
		}
	}

	void showTotalOperation(){
		System.out.println("***********************************************");
		System.out.println("Total Debit operation- "+debitCnt+" Times");
		System.out.println("Total Credit operation- "+creditCnt+" Times");
	}
	void individualDebitOperation(){
		System.out.println("***********************************************");
		System.out.println("ICICI bank debit operation -" + iDebitCnt+" Times");
		System.out.println("HDFC bank debit operation -" + hDebitCnt+" Times");
		System.out.println("SBI bank debit operation -" + sDebitCnt+" Times");
		System.out.println("BOB bank debit operation -" + bDebitCnt+" Times");
	}

	void individualCreditOperation(){
		System.out.println("***********************************************");
		System.out.println("ICICI bank credit operation -" + iCreditCnt+" Times");
		System.out.println("HDFC bank credit operation -" + hCreditCnt+" Times");
		System.out.println("SBI bank credit operation -" + sCreditCnt+ " Times");
		System.out.println("BOB bank credit operation -" + bCreditCnt+" Times");
	}

	String printMeassage(){
		if(debitCnt<=creditCnt){
			return "--**I appreciate your money management skill**--";
		}
		return "pleae spend money wisely";
	}

	public static void main(String[] args){
		ScannerExample scanner =new ScannerExample();

		Scanner scan=new Scanner(System.in) ;

		String status="YES";
		while(status.equalsIgnoreCase("YES")){
			System.out.println("Enter Bank Opeartion");
			String operation =scan.next();
			System.out.println("Enter Bank NAME");
			String name =scan.next();
			System.out.println("Enter Bank Amount");
			int amount=scan.nextInt();
			scanner.bankOperation(amount,name,operation);
			
			System.out.println("Do you want to continue YES/NO ?");
			status =scan.next();
		}
		scanner.individualCreditOperation();
		scanner.individualDebitOperation();
		scanner.showTotalOperation();
		System.out.println(scanner.printMeassage());
		scan.close();
	}

}
