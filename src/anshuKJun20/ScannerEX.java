package anshuKJun20;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ScannerEX {
	 static int countICICIcredit,countICICIdebit,counthdfccredit,counthdfcdebit,countsbicredit,countsbidebit,countbobcredit,countbobdebit ,totalcreditoperation,totaldebitoperation;
	  static int hdfcbankbalance = 30000,icicibankbalance=4000,sbibankbalance=10000,bobbankbalance=5000;
	 
	
	  
	
	static void bankOperation(int bankname, int amount, String Operation) {
		switch(bankname){
			case 1: // HDFC:
				switch(Operation) {
				case "credit":
					hdfcbankbalance += amount;
					counthdfccredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(hdfcbankbalance>amount) {
						hdfcbankbalance -= amount;
						counthdfcdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your HDFC account");
						}break;
					}break;
					
			case 2: //ICICI:
				switch(Operation) {
				case "credit":
					icicibankbalance += amount;
					countICICIcredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(icicibankbalance>amount) {
						icicibankbalance-=amount;
						countICICIdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your ICICI account");
						}break;
					}break;
			case 3: // ICICI:
				switch(Operation) {
				case "credit":
					sbibankbalance += amount;
					countsbicredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(sbibankbalance>amount) {
						sbibankbalance-=amount;
						countsbidebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your SBI Account");
						}break;
					}break;
			case 4:// BOB:
				switch(Operation) {
				case "credit":
					bobbankbalance += amount;
					countbobcredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(bobbankbalance>amount) {
						bobbankbalance-=amount;
						countbobdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in Your BOB account");
						}break;
					}
				default:
					break;
				}//switch bracket
			}//bankOperation
	 static void totalBankBalance() {
		int totalBalane =  hdfcbankbalance+icicibankbalance+sbibankbalance+bobbankbalance;
		System.out.println("Total Balance "+totalBalane);
	}
	static void totalCreditDebitOperation() {
		 System.out.println("Total Credit Operation "+totalcreditoperation+ " and Total Debit Operation "+totaldebitoperation);
	 }
	 static void idividualCreditOperation() {
		 System.out.println("HDFC Credit"+counthdfccredit);
		 System.out.println("ICICI Credit"+countICICIcredit);
		 System.out.println("SBI Credit"+countsbicredit);
		 System.out.println("BOB Credit"+countbobcredit);
	 }
	static void idividualDebitOperation() {
		 System.out.println(" HDFC Debit "+counthdfcdebit);
		 System.out.println("ICICI Debit "+countICICIdebit);
		 System.out.println("SBI Debit "+counthdfcdebit);
		 System.out.println("BOB Debit "+counthdfcdebit);
	 }
	static boolean returnMethod() {
		 if(totalcreditoperation > totaldebitoperation) {
			 return true;
		 }else 
	     return false;
		}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String proceed="";
		do {
		System.out.println("Hi Welcome To this ATM");
		System.out.println("Which Operation would you want to perform");
		System.out.println("press 1 for Access Bank Name to check balance \n press 2 for Check Balance On your account \n Press 3 for Check Credit Operation \n Press 4 For Debit Opertaion \n and press 5 to know your Money stability.");
			int operationchoice = sc.nextInt();
			switch (operationchoice) {
			      case 1:
			    	  System.out.println(" Press 1: HDFC Bank \n Press 2:ICICI Bank \n Press 3: SBI  Bank \n Press 4 : BOB Bank");
			    	    int bankchoice = sc.nextInt();
			    	      switch(bankchoice) {
			    	            case 1:int hdfc = ScannerEX.hdfcbankbalance;
			    	              System.out.println("Would you Like to Credit Or Debit \n press credit for Credit Operation \n Press Debit For Debit Operation ");
			    	                 String Op = sc.next();
			    	                      switch(Op) {
			    	                        case "credit":
			    	                        	System.out.println("How much Amount you want to credit");
			    	                        	   int camount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, camount, Op);
			    	                        	   hdfc += camount;
			    	                        	   System.out.println("You credited" +camount+" in your HDFC ammount");
			    	                        	   System.out.println(" Now Your Balance is "+hdfcbankbalance);
			    	                        	     
			    	                        	   break;
			    	                        case "Debit":
			    	                        	 System.out.println("How much Amount you want to credit");
			    	                        	   int damount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, damount, Op);
			    	                        	   hdfc -= damount;
			    	                        	   System.out.println("You Debited" + damount+" in your HDFC ammount");
			    	                        	   System.out.println(" Now Your Balance is "+hdfcbankbalance);
			    	                        	    
			    	                        	   break;
			    	                        default:
			    	                        	    	break;
			    	                      } break;
			    	                     
			    	                      
			    	            case 2:int icici = ScannerEX.icicibankbalance;
			    	              System.out.println("Would you Like to Credit Or Debit \n press credit for Credit Operation \n Press Debit For Debit Operation ");
			    	                 String Op1 = sc.next();
			    	                      switch(Op1) {
			    	                        case "credit":
			    	                        	System.out.println("How much Amount you want to credit");
			    	                        	   int camount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, camount, Op1);
			    	                        	   icici += camount;
			    	                        	   System.out.println("You credited" +camount+" in your ICICI ammount");
			    	                        	   System.out.println(" Now Your Balance is "+icicibankbalance);
			    	                        	     
			    	                        	   break;
			    	                        case "Debit":
			    	                        	 System.out.println("How much Amount you want to credit");
			    	                        	   int damount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, damount, Op1);
			    	                        	   icici -= damount;
			    	                        	   System.out.println("You Debited" + damount+" in your ICICI ammount");
			    	                        	   System.out.println(" Now Your Balance is "+icicibankbalance);
			    	                        	    
			    	                        	   break;
			    	                        default:
			    	                        	    	break;
			    	                        	   }break;
			    	            case 3:
			    	                     int sbi = ScannerEX.sbibankbalance;
			    	                     System.out.println("Would you Like to Credit Or Debit \n press credit for Credit Operation \n Press Debit For Debit Operation ");
			    	                      String Op2 = sc.next();
			    	                      switch(Op2) {
			    	                        case "credit":
			    	                        	System.out.println("How much Amount you want to credit");
			    	                        	   int camount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, camount, Op2);
			    	                        	   sbi += camount;
			    	                        	   System.out.println("You credited" +camount+" in your SBI account");
			    	                        	   System.out.println(" Now Your Balance is "+sbibankbalance);
			    	                        	     
			    	                        	   break;
			    	                        case "Debit":
			    	                        	 System.out.println("How much Amount you want to credit");
			    	                        	   int damount = sc.nextInt();
			    	                        	   ScannerEX.bankOperation(bankchoice, damount, Op2);
			    	                        	   sbi -= damount;
			    	                        	   System.out.println("You Debited" + damount+" in your SBI accountt");
			    	                        	   System.out.println(" Now Your Balance is "+sbibankbalance);
			    	                        	    
			    	                        	   break;
			    	                        default:
			    	                        	    	break;
			    	                        	   }break;
			    	            case 4: int bob = ScannerEX.bobbankbalance;
				    	                     System.out.println("Would you Like to Credit Or Debit \n press credit for Credit Operation \n Press Debit For Debit Operation ");
				    	                      String Op3 = sc.next();
				    	                      switch(Op3) {
				    	                        case "credit":
				    	                        	System.out.println("How much Amount you want to credit");
				    	                        	   int camount = sc.nextInt();
				    	                        	   ScannerEX.bankOperation(bankchoice, camount, Op3);
				    	                        	   bob += camount;
				    	                        	   System.out.println("You credited" +camount+" in your BOB account");
				    	                        	   System.out.println(" Now Your Balance is "+bobbankbalance);
				    	                        	     
				    	                        	   break;
				    	                        case "Debit":
				    	                        	 System.out.println("How much Amount you want to credit");
				    	                        	   int damount = sc.nextInt();
				    	                        	   ScannerEX.bankOperation(bankchoice, damount, Op3);
				    	                        	   bob -= damount;
				    	                        	   System.out.println("You Debited" + damount+" in your BOB accountt");
				    	                        	   System.out.println(" Now Your Balance is "+bobbankbalance);
				    	                        	    
				    	                        	   break;
				    	                        default:
				    	                        	    	break;
				    	                        	   }
				    	                      default:
				    	                    	  break;
			    	                      }break;// operation choice
			      case 2:
			    	   ScannerEX.totalBankBalance();
			    	  break;
			    	  
			      case 3:
			    	  ScannerEX.idividualCreditOperation();
			    	  break;
			      case 4:
			    	  ScannerEX.idividualDebitOperation();
			     case 5:
			    	 ScannerEX.returnMethod();
			    	 break;
			     case 7: 
			    	 ScannerEX.totalCreditDebitOperation();
			    	 break;
			   default:
				   break;
			}
		      System.out.println("Would you like to perform action again Press Y to Repeat again or N to Exit");
		      proceed = sc.next();
		      
		
		}while(proceed.equals("Y")); 
	 		sc.close();
	}
}

