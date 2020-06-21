package suparnaNJune20;

public class BankMenuTransaction {
	static void totalCreditDebitOp() {
		System.out.println(" Total Credit Operation :" + (BankMenu.SBICreditCnt+BankMenu.HDFCCreditCnt+BankMenu.BOBCreditCnt+BankMenu.ICICICreditCnt) );
		System.out.println(" Total Debit Operation :" + (BankMenu.SBIDebitCnt+BankMenu.HDFCDebitCnt+BankMenu.BOBDebitCnt+BankMenu.ICICIDebitCnt) );
	}

	static void individualCreditOP(String bankName) {
		switch(bankName) {
		case "SBI": 
			System.out.println("Total SBI Credit Operation :" + BankMenu.SBICreditCnt);
			break;
		case "HDFC":
			System.out.println(" Total HDFC Credit Operation :" + BankMenu.HDFCCreditCnt);
			break;
		case "BOB":
			System.out.println(" Total BOB Credit Operation :" + BankMenu.BOBCreditCnt);
			break;
		case "ICICI":
			System.out.println(" Total ICICI Credit Operation :" + BankMenu.ICICICreditCnt);
			break;
		default :
			System.out.println(bankName +" Invalid bank name :");
		}
	}

	static void individualDebitOP(String bankName) {
		switch(bankName) {
		case "SBI": 
			System.out.println(" Total SBI Debit Operation :" + BankMenu.SBIDebitCnt);
			break;
		case "HDFC":
			System.out.println(" Total HDFCDebit Debit Operation :" + BankMenu.HDFCDebitCnt);
			break;
		case "BOB":
			System.out.println(" Total BOB Debit Operation :" + BankMenu.BOBDebitCnt);
			break;
		case "ICICI":
			System.out.println(" Total ICICI Debit Operation :" + BankMenu.ICICIDebitCnt);
			break;
		default :
			System.out.println(bankName +" Invalid bank name :");
		}
	}

}
