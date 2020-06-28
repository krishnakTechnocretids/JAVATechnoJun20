package suparnaNJune20;

public class SwitchOp {
	static double SBIBal, HDFCBal,BOBBal,ICICBal; 
	static int  SBICreditCnt,HDFCCreditCnt,BOBCreditCnt,ICICICreditCnt,SBIDebitCnt,HDFCDebitCnt,BOBDebitCnt,ICICIDebitCnt ;
	void setBal(double SBIAmt, double HDFCAmt, double BOBAmt, double ICICIAmt ) {

		if (SBIAmt <0 )
			System.out.println(" Balance should be greater than  1 Rs in SBI ");
		else SBIBal = SBIBal  +SBIAmt;
		if (HDFCAmt <0 )
			System.out.println(" Balance should be greater than  1 Rs in HDFC");
		else HDFCBal = HDFCBal +HDFCAmt;
		if (BOBAmt <0 )
			System.out.println(" Balance should be greater than  1 Rs BOB");
		else BOBBal =BOBBal+ BOBAmt;
		if (ICICIAmt <0 )
			System.out.println(" Balance should be greater than  1 Rs ICICI");
		else ICICBal =ICICBal+ ICICIAmt;
	}
	double totalBal() {
		return SBIBal+ HDFCBal+BOBBal+ICICBal;
	}
	static void totalCreditDebitOp() {
		System.out.println(" Total Credit Operation :" + (SBICreditCnt+HDFCCreditCnt+BOBCreditCnt+ICICICreditCnt) );
		System.out.println(" Total Debit Operation :" + (SBIDebitCnt+HDFCDebitCnt+BOBDebitCnt+ICICIDebitCnt) );
	}

	static void individualCreditOP(String bankName) {
		switch(bankName) {
		case "SBI": 
			System.out.println("Total SBI Credit Operation :" + SBICreditCnt);
			break;
		case "HDFC":
			System.out.println(" Total HDFC Credit Operation :" + HDFCCreditCnt);
			break;
		case "BOB":
			System.out.println(" Total BOB Credit Operation :" + BOBCreditCnt);
			break;
		case "ICICI":
			System.out.println(" Total ICICI Credit Operation :" + ICICICreditCnt);
			break;
		default :
			System.out.println(bankName +" Invalid bank name :");
		}
	}

	static void individualDebitOP(String bankName) {
		switch(bankName) {
		case "SBI": 
			System.out.println(" Total SBI Debit Operation :" + SBIDebitCnt);
			break;
		case "HDFC":
			System.out.println(" Total HDFCDebit Debit Operation :" + HDFCDebitCnt);
			break;
		case "BOB":
			System.out.println(" Total BOB Debit Operation :" + BOBDebitCnt);
			break;
		case "ICICI":
			System.out.println(" Total ICICI Debit Operation :" + ICICIDebitCnt);
			break;
		default :
			System.out.println(bankName +" Invalid bank name :");
		}
	}
	String appreciation() {
		if ((SBICreditCnt+HDFCCreditCnt+BOBCreditCnt+ICICICreditCnt) > (SBIDebitCnt+HDFCDebitCnt+BOBDebitCnt+ICICIDebitCnt))
			return " I appreciate your money managment skill";
		else return " Please spend money wisely";
	}

	void bankOP(String bankName, String operation, double amt)
	{
		switch(bankName)
		{
		case "SBI":
			switch(operation)
			{
			case "Credit":
				SBIBal += amt;
				SBICreditCnt ++;
				System.out.println(amt +" Rs Credited in SBI Account");
				break;
			case "Debit":
				if(amt >SBIBal ) {
					System.out.println(" In sufficent balance in SBI account, not able tp debit Rs" + amt);
					return;
				}
				else {
					SBIBal -= amt;
					SBIDebitCnt ++;
					System.out.println(amt +" Rs Debited from  SBI Account");
				}
				break;
			default : System.out.println(operation +" In valida operation");
			}
			break;
		case "HDFC":
			switch(operation){
			case "Credit":
				HDFCBal += amt;
				HDFCCreditCnt ++;
				System.out.println(amt +" Rs Credited in HDFC Account");
				break;
			case "Debit":
				if(amt >HDFCBal ){
					System.out.println(" In sufficent balance in HDFC account to debit Rs"+amt);
					return;
				}
				else{
					HDFCBal -= amt;
					HDFCDebitCnt ++;
					System.out.println(amt +" Rs Debited from  HDFC Account");
				}
				break;
			default : System.out.println(operation +" In valida operation");
			}
			break;
		case "BOB":
			switch(operation)	{
			case "Credit":
				BOBBal += amt;
				BOBCreditCnt ++;
				System.out.println(amt +" Rs Credited in BOB Account");
				break;
			case "Debit":
				if(amt >BOBBal ){
					System.out.println(" In sufficent balance in BOB account to debit Rs"+amt);
					return;
				}
				else{
					BOBBal -= amt;
					BOBDebitCnt ++;
					System.out.println(amt +" Rs Debited from  BOB Account");
				}
				break;
			default : System.out.println(operation +" In valida operation");
			}

			break;
		case "ICICI":
			switch(operation)	{
			case "Credit":
				ICICBal += amt;
				ICICICreditCnt ++;
				System.out.println(amt +" Rs Credited in ICICI Account");
				break;
			case "Debit":
				if(amt >ICICBal ){
					System.out.println(" In sufficent balance in ICICI account to debit Rs" +amt);
					return;
				}
				else{
					ICICBal -= amt;
					ICICIDebitCnt ++;
					System.out.println(amt +" Rs Debited from  ICICI Account");
				}
				break;
			default : System.out.println(operation +"Invalida operation");

			}
		default :
			System.out.println(bankName +" Invalid bank name :");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchOp  opeartion1 = new SwitchOp();
		opeartion1.setBal(1000,2000,3000,4000);
		System.out.println("\nBefor Start Bank transaction  Total balance from SBI, ICICI, HDFC and BOB bank account is :  "+opeartion1.totalBal());

		opeartion1.bankOP("SBI","Credit",200);
		opeartion1.bankOP("SBI","Credit",4560);
		opeartion1.bankOP("BOB","Debit",1000);
		opeartion1.bankOP("BOB","Debit",20000);
		opeartion1.bankOP("HDFC","Print",200000);
		opeartion1.bankOP("ICICI","Debit",100);
		opeartion1.bankOP("ICICI","Credit",1000000);
		opeartion1.bankOP("BOB","Credit",10500);
		opeartion1.bankOP("SBI","Credit",4560);
		opeartion1.bankOP("BOB","Debit",0000);
		opeartion1.bankOP("HDFC","Credit",200000);
		opeartion1.bankOP("ICICI","Debit",100000);
		opeartion1.bankOP("BOB","Credit",1000);
		System.out.println("\nAfter All  Bank transactions  Total balance from SBI, ICICI, HDFC and BOB bank account is :  "+opeartion1.totalBal());
		SwitchOp.totalCreditDebitOp();

		System.out.println("\n Individual Bank Credit operations are below \n");
		individualCreditOP("SBI");
		individualCreditOP("ICICI");
		individualCreditOP("BOB");
		individualCreditOP("HDFC");
		System.out.println("\n Individual Bank Debit operations are below \n ");
		individualDebitOP ("SBI");
		individualDebitOP ("ICICI");
		individualDebitOP ("HDFC");
		individualDebitOP ("BOB");
		individualDebitOP ("BOBB");

		opeartion1.appreciation();

	}

}
