package yashCJun20;

import java.util.Scanner;

public class BankUsingScannerClassConcept {
	
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
			return "Please spend your money wisely, you spend a lot of money";
		
	}


	public static void main(String[] args) {
		
		String choice;
		
		BankUsingScannerClassConcept bankUsingScannerClassConcept =new BankUsingScannerClassConcept();
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println ("Which Bank do you want to select ?");
		System.out.println ("Enter the Bank name (ICCI/HDFC/SBI/BOB) : ");
		String bankName =scanner.next();
		
		System.out.println ("Which Operation do you want to Perform ? Credit/Debit");
		System.out.println ("Enter the mode of Operation :");
		String operation =scanner.next();
		
		System.out.println ("Enter the Amount :");
		int amount =scanner.nextInt();
		bankUsingScannerClassConcept.bankOperation(bankName,amount,operation);
		
		System.out.println ("Do you want to continue?Yes/No");
		choice=scanner.next();
		}while(choice.equals("Yes"));
		
		bankUsingScannerClassConcept.totalBalance();
		bankUsingScannerClassConcept.totalCrdtDebtOprtn();
		bankUsingScannerClassConcept.indvCreditOprtn();
		bankUsingScannerClassConcept.indvDebitOprtn();
		System.out.println(returnMessage());

	}

}
