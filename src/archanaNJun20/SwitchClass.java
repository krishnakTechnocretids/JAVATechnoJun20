package archanaNJun20;

public class SwitchClass {
	double iBalance,hBalance,sBalance,bBalance;
	int debitCnt,creditCnt;
	int iDebitCnt,iCreditCnt,hDebitCnt,hCreditCnt,sDebitCnt,sCreditCnt,bDebitCnt,bCreditCnt;

	void bankOperation(double amount,String bankName,String operation){
		switch(bankName){
		case "ICICI":
			switch(operation){
			case "Debit":
				if(iBalance>amount){
					iBalance-=amount;
					iDebitCnt++;
					debitCnt++;
					System.out.println("ICICI balance is "+iBalance);
				}else
					System.out.println("Insuffient Balance in ICICI account**");	
				break;
			case "Credit":
				iBalance+=amount;
				iCreditCnt++;
				creditCnt++;
				System.out.println("ICICI balance is "+iBalance);
				break;
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
		SwitchClass switchclass =new SwitchClass();
		switchclass.bankOperation(1000, "HDFC","Credit");
		switchclass.bankOperation(2000, "ICICI", "Credit");
		switchclass.bankOperation(2000, "BOB", "Credit");
		switchclass.bankOperation(100, "SBI", "Credit");
		switchclass.bankOperation(1000, "SBI", "Debit");
		switchclass.bankOperation(200, "ICICI", "Debit");
		switchclass.bankOperation(200, "BOB", "Debit");
		switchclass.individualCreditOperation();
		switchclass.individualDebitOperation();
		switchclass.showTotalOperation();
		System.out.println(switchclass.printMeassage());


	}

}
