package yashCJun20;

public class Bank {
	
	int icciBankBalance;
	int hdfcBankBalance;
	int bobBankBalance;
	int sbiBankBalance;
	int finalBankBalance;
	int indvIcciDebtCnt;
	int indvHdfcDebtCnt;
	int indvBobDebtCnt;
	int indvSbiDebtCnt;
	int indvIcciCrdtCnt;
	int indvHdfcCrdtCnt;
	int indvBobCrdtCnt;
	int indvSbiCrdtCnt;
	static int finalDebtCnt;
	static int finalcrdtCnt;

	
	void bankOperation(String bankName,int amount,String operation) {
		
		switch(bankName) {
		
		case "ICCI":
		switch (operation) {
		case "Debit":
		icciBankBalance=icciBankBalance-amount;
		indvIcciDebtCnt++;
		finalDebtCnt++;
		break;
		case "Credit":
		icciBankBalance=icciBankBalance+amount;
		indvIcciCrdtCnt++;
		finalcrdtCnt++;
		break;
		}
		break;
		
		case "HDFC":
		switch (operation) {
		case "Debit":
		hdfcBankBalance=hdfcBankBalance-amount;
		indvHdfcDebtCnt++;
		finalDebtCnt++;
		break;
		case "Credit":
		hdfcBankBalance=hdfcBankBalance+amount;
		indvHdfcCrdtCnt++;
		finalcrdtCnt++;
		break;
		}
		break;
		
		case "BOB":
		switch (operation) {
		case "Debit":
		bobBankBalance=bobBankBalance-amount;
		indvBobDebtCnt++;
		finalDebtCnt++;
		break;
		case "Credit":
		bobBankBalance=bobBankBalance+amount;
		indvBobCrdtCnt++;
		finalcrdtCnt++;
		break;
		}
		break;
		
		case "SBI":
		switch (operation) {
		case "Debit":
		sbiBankBalance=sbiBankBalance-amount;
		indvSbiDebtCnt++;
		finalDebtCnt++;
		break;
		case "Credit":
		sbiBankBalance=sbiBankBalance+amount;
		indvSbiCrdtCnt++;
		finalcrdtCnt++;
		break;
		}
		break;
		}
		
	}
	
	
	void totalBalance() {
		
		finalBankBalance=icciBankBalance+hdfcBankBalance+bobBankBalance+sbiBankBalance;
		System.out.println("Total Balance is "+ ":" +finalBankBalance);
	}
	
	void totalCrdtDebtOprtn(){
		
		System.out.println("Total credit operation- " + finalcrdtCnt);
		System.out.println("Total debit operation- " + finalDebtCnt);
	}
		
	
	void indvCreditOprtn() {
		
		System.out.println("ICICI bank Credit Operation - " +indvIcciCrdtCnt);
		System.out.println("HDFC bank Credit Operation - " +indvHdfcCrdtCnt);
		System.out.println("SBI bank Credit Operation - " +indvSbiCrdtCnt);
		System.out.println("BOB bank Credit Operation - " +indvBobCrdtCnt);
		
	}
	
	void indvDebitOprtn() {
		
		System.out.println("ICICI bank Debit Operation - " +indvIcciDebtCnt);
		System.out.println("HDFC bank Debit Operation - " +indvHdfcDebtCnt);
		System.out.println("SBI bank Debit Operation - " +indvSbiDebtCnt);
		System.out.println("BOB bank Debit Operation - " +indvBobDebtCnt);
		
	}
	
	static String returnMessage() {
		
		if(finalcrdtCnt>finalDebtCnt)
			return "I appreciate your money management skill";
		else
			return "Please spend money wisely";
		
	}


	public static void main(String[] args) {
		
		Bank bank =new Bank();
		bank.bankOperation ("ICCI",10000,"Credit");
		bank.bankOperation ("ICCI",5000,"Credit");
		bank.bankOperation ("ICCI",5000,"Debit");
		bank.bankOperation ("HDFC",15000,"Credit");
		bank.bankOperation ("HDFC",8000,"Credit");
		bank.bankOperation ("HDFC",3000,"Debit");
		bank.bankOperation ("SBI",12000,"Credit");
		bank.bankOperation ("SBI",8000,"Credit");
		bank.bankOperation ("SBI",5000,"Debit");
		bank.bankOperation ("BOB",8000,"Credit");
		bank.bankOperation ("BOB",3000,"Debit");
		bank.totalBalance();
		bank.totalCrdtDebtOprtn();
		bank.indvCreditOprtn();
		bank.indvDebitOprtn();
		System.out.println(returnMessage());

	}

}
