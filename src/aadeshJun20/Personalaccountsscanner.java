package aadeshJun20;

import java.util.Scanner;

public class Personalaccountsscanner {
	static int totalccreditcount,totaldebitcount;
	static int icicidebitcnt,icicicreditcnt,hdfcdebitcnt,hdfccreditcnt,bobdebitcnt,bobcreditcnt,sbidebitcnt,sbicreditcnt;
	static double  balanceICICI,balanceHDFC,balanceBOB,balanceSBI;

	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
		case "ICICI" :
		switch(operation) {
		case "Debit":
			if(balanceICICI>=amount){
				balanceICICI -=amount;
				icicidebitcnt++;
				totaldebitcount++;
			}else {
				System.out.println("Insufficient Balence ");
		    }
		break;
		case "Credit":
			balanceICICI +=amount;
			icicicreditcnt++;
			totalccreditcount++;
		break;
		}
	  break;

		case "HDFC" :
			switch(operation) {
			case "Debit":
				if(balanceHDFC>=amount){
					balanceHDFC -=amount;
					hdfcdebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Insufficient Balence ");
			    }
			break;
			case "Credit":
				balanceHDFC +=amount;
				hdfccreditcnt++;
				totalccreditcount++;
			break;
			}
		break;

		case "BOB" :
			switch(operation) {
			case "Debit":
				if(balanceBOB>=amount){
					balanceBOB -=amount;
					bobdebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Insufficient Balence ");
			    }
			break;
			case "Credit":
				balanceBOB +=amount;
				bobcreditcnt++;
				totalccreditcount++;
			break;
			}
		break;
		case "SBI" :
			switch(operation) {
			case "Debit":
				if(balanceSBI>=amount){
					balanceSBI -=amount;
					sbidebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Insufficient Balence ");
			    }
			break;
			case "Credit":
				balanceSBI +=amount;
				sbicreditcnt++;
				totalccreditcount++;
			break;
			}
		break;
	}
  }
	double totalbalance()
	{    double totalbalanceaccounts=balanceICICI+balanceHDFC+balanceBOB+balanceSBI;
		return totalbalanceaccounts;
	}
	void individualbankcredit() {
		System.out.println("ICICI bank Credit Operation :" +icicicreditcnt +"\nHDFC bank Credit Operation : "+hdfccreditcnt +"\nSBI bank Credit Operation :"+sbicreditcnt+ "\nBOB bank Credit Operation :"+bobcreditcnt);
	}
    void individualbankdebit() {
    	System.out.println("\nICICI bank debit Operation :" +icicidebitcnt +"\nHDFC bank debit Operation : "+hdfcdebitcnt +"\nSBI bank debit Operation :"+sbidebitcnt+ "\nBOB bank debit Operation :"+bobdebitcnt);
	}

    void showtotalcreditdebit() {
    	System.out.println("\nTotal credit operation : "+ totalccreditcount+ " times ");
    	System.out.println("Total debit operation : "+ totaldebitcount+ " times ");

    }
   static boolean returnStringMethod() 
    {        if(totalccreditcount>totaldebitcount) {
    	return true;
    	}else {
    		return false; }
    	}
	public static void main(String[] args) {
		Personalaccountsscanner personaalaccounts= new Personalaccountsscanner();
		Scanner scanner =new Scanner(System.in);
		String status="";
		do {
			System.out.println("Which bank account you want to proceed ICICI/HDFC/SBI/BOB :- ");
			String bankname=scanner.next();
			System.out.println("Which Operation you want to Credit/Debit : ");
			String operationName=scanner.next();
			System.out.println(" Please Enter the Amount : ");
		    double enteredAmount=scanner.nextDouble();
		    personaalaccounts.bankOperation(bankname,enteredAmount,operationName);
			System.out.println("You want to continue the Procedure Yes/No : ");
			status=scanner.next();
		}while(status.equals("Yes"));
		personaalaccounts.individualbankcredit();
		personaalaccounts.individualbankdebit();
	    personaalaccounts.showtotalcreditdebit();
		System.out.println("\nTotal balance of all accounts is " + personaalaccounts.totalbalance());
        if(returnStringMethod()){
        	System.out.println("\nI Appreciate your Money Management Skills ");
        }else {
        	System.out.println("\nPlease spend money Wisely ");
        }
		System.out.println("\nTransaction Finished ");
        scanner.close();
	}
}

