package rajAJun20;

public class Banking {
		String custName;
		double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
		int iciciCreditCnt, hdfcCreditCnt, bobCreditCnt, sbiCreditCnt, iciciDebitCnt, hdfcDebitCnt, bobDebitCnt, sbiDebitCnt, totalCreditCnt, totalDebitCnt;

		void bankingOperation(String bank, String operation, double amount) {
			switch(bank) {
					case "ICICI" :{
						switch(operation) {
							case "Credit" :
								if(amount > 0) {
									iciciBalance += amount;
									iciciCreditCnt++;
									totalCreditCnt++;
								}
								else {
										System.out.println("Invalid Amount");
									}
									break;

							case "Debit" :
								if(amount <= iciciBalance && amount > 0) {
									iciciBalance -= amount;
									iciciDebitCnt++;
									totalDebitCnt++;
									}
								else {
										System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
									}
									break;

							default :
								System.out.println("Invalid Operation");
							}
						}
						break;

						//Outer Case # 2
						case "HDFC" :{
							switch(operation) {
								case "Credit" :
									if(amount > 0) {
										hdfcBalance += amount;
										hdfcCreditCnt++;
										totalCreditCnt++;
									}else {
										System.out.println("Invalid Amount");
									}
									break;

								case "Debit" :
									if(amount <= hdfcBalance && amount > 0) {
										hdfcBalance -= amount;
										hdfcDebitCnt++;
										totalDebitCnt++;
									}else {
										System.out.println("Please enter valid amount");
									}
									break;

								default :
									System.out.println("Invalid Operation");
							}
						} 
						break;

						//Outer Case # 3
						case "BOB" :{
							switch(operation) {
								case "Credit" :
									if(amount > 0) {
										bobBalance += amount;
										bobCreditCnt++;
										totalCreditCnt++;
									}else {
										System.out.println("Invalid Amount");
									}
									break;

								case "Debit" :
									if(amount <= bobBalance && amount > 0) {
										bobBalance -= amount;
										bobDebitCnt++;
										totalDebitCnt++;
									}else {
										System.out.println("Please enter valid amount");
									}
									break;

								default :
									System.out.println("Invalid Operation");
							}
						} 
						break;

						//Outer Case # 4
						case "SBI" :{
							switch(operation) {
								case "Credit" :
									if(amount > 0) {
										sbiBalance += amount;
										sbiCreditCnt++;
										totalCreditCnt++;
									}else {
										System.out.println("Invalid Amount");
									}
									break;

								case "Debit" :
									if(amount <= sbiBalance && amount > 0) {
										sbiBalance -= amount;
										sbiDebitCnt++;
										totalDebitCnt++;
									}else {
										System.out.println("Please enter valid amount");
									}
									break;

								default :
									System.out.println("Invalid Operation");
							}
						}
						break;

						default :
							System.out.println("Bank name is invalid");
					}
				}

				void calculateTotalBalance() {
					System.out.println(" Your total bank balance of BOB, SBI, ICICI and HDFC banks is : " +(iciciBalance + hdfcBalance + bobBalance + sbiBalance));
				}

				void displayTotalOperations() {
					System.out.println(" Total Credit Operations are : " +totalCreditCnt+ " Total Debit Operations are : " +totalDebitCnt);
				}

				void showBankCreditOperations() {
					System.out.println(" ICICI Bank : " +iciciCreditCnt+ " HDFC Bank : " +hdfcCreditCnt+ " Bank of Baroda : " +bobCreditCnt+ " State Bank of India : " +sbiCreditCnt);
				}

				void showBankDebitOperations() {
					System.out.println(" ICICI Bank : " +iciciDebitCnt+ " HDFC Bank : " +hdfcDebitCnt+ " Bank of Baroda : " +bobDebitCnt+ " State Bank of India : " +sbiDebitCnt);
				}

				String calulateFinancialHealth() {
					if(totalCreditCnt > totalDebitCnt) {
						return " Credit score is more than debit score";
					}else {
						return "Over Debit transactions";
					}
				}

				public static void main(String[] args) {
					Banking banking = new Banking();
					banking.custName = "Raj";

					banking.bankingOperation("ICICI", "Credit", 1000.00);
					banking.bankingOperation("ICICI", "Credit", 2000.00);
					banking.bankingOperation("HDFC", "Credit", 1000.00);
					banking.bankingOperation("HDFC", "Credit", 1000.00);
					banking.bankingOperation("BOB", "Credit", 1000.00);
					banking.bankingOperation("BOB", "Credit", 1000.00);
					banking.bankingOperation("BOB", "Credit", 1000.00);
					banking.bankingOperation("SBI", "Credit", 1000.00);
					banking.bankingOperation("SBI", "Credit", 1000.00);

					banking.bankingOperation("ICICI", "Debit", 1000.00);
					banking.bankingOperation("ICICI", "Debit", 1000.00);
					banking.bankingOperation("HDFC", "Debit", 1000.00);
					banking.bankingOperation("BOB", "Debit", 1000.00);
					banking.bankingOperation("SBI", "Debit", 1000.00);

					banking.calculateTotalBalance();
					banking.displayTotalOperations();
					banking.showBankCreditOperations();
					banking.showBankDebitOperations();

					System.out.println(banking.calulateFinancialHealth());		
				}
			}

