/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times

         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                              HDFC bank Credit Operation - 2
		              SBI bank Credit Operation - 1
                              BOB bank Credit Operation - 4

         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                             HDFC bank Debit Operation - 2
		             SBI bank Debit Operation - 1
                             BOB bank Debit Operation - 4

         f) A Method which should return "*I appreciate your money management skill*" message if credit operation count is more than debit operation count else return "*Please spend money wisely*" and print this message in main method.*/

package rachanaGJun20;

public class Person {

	Icici icici = new Icici();
	Sbi sbi = new Sbi();
	Bob bob = new Bob();
	Hdfc hdfc = new Hdfc();

	static void displayIndividualBankDebitTransaction() {
		System.out.println("\nTotal Individual bank Debit Transactions count:");
		System.out.println("ICICI: Debit Count: " + Icici.debitCount);
		System.out.println("SBI: Debit Count: " + Sbi.debitCount);
		System.out.println("BOB: Debit Count: " + Bob.debitCount);
		System.out.println("HDFC: Debit Count: " + Hdfc.debitCount);
	}
	static void displayIndividualBankCreditTransaction() {
		System.out.println("\nTotal Individual bank Credit Transactions count:");
		System.out.println("ICICI: Credit Count: " + Icici.creditCount);
		System.out.println("SBI: Credit Count: " + Sbi.creditCount);
		System.out.println("BOB: Credit Count: " + Bob.creditCount);
		System.out.println("HDFC: Credit Count: " + Hdfc.creditCount);
	}

	static void displayAllBankTransactions() {
		System.out.println("\nTotal All banks Transactions count\nDebit Count: " + BankOperation.totalDebitCount
				+ "\nCredit Count: " + BankOperation.totalCreditCount);
	}

	
	void bankingOperations(String bankName, double amount, String operation) {

		switch (bankName) {

		case "ICICI": {

			switch (operation) {
			case "Debit": {
				icici.debitOperation(amount);
				break;
			}
			case "Credit": {
				icici.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}
		case "SBI": {
			switch (operation) {
			case "Debit": {
				sbi.debitOperation(amount);
				break;
			}
			case "Credit": {
				sbi.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");

			}
			break;
		}
		case "BOB": {
			switch (operation) {
			case "Debit": {
				bob.debitOperation(amount);
				break;
			}
			case "Credit": {
				bob.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}
		case "HDFC": {
			switch (operation) {
			case "Debit": {
				hdfc.debitOperation(amount);
				break;
			}
			case "Credit": {
				hdfc.creditOperation(amount);
				break;
			}
			default:
				System.out.println("Please perform correct operation");
			}
			break;
		}

		default:
			System.out.println("Invalid Bank Name!");
		}
	}

	void displayTotalBankBalance() {

		System.out.println("\nTotal Bank balance of a person:" + (icici.getBalance() + sbi.getBalance() + hdfc.getBalance()
				+ bob.getBalance())+"\n");

	}

	public static void main(String[] args) {

		Person person1 = new Person();
		// Person person2 = new Person();
		person1.bankingOperations("ICICI", 1200, "Credit");
		person1.bankingOperations("ICICI", 200, "Debit");
		person1.bankingOperations("ICICI", 1200, "Credit");
		person1.bankingOperations("SBI", 1000, "Credit");
		person1.bankingOperations("SBI", 500, "Credit");
		person1.bankingOperations("SBI", 1000, "Debit");
		person1.bankingOperations("SBI", 100, "Debit");
		person1.bankingOperations("HDFC", 1500, "Debit");
		person1.bankingOperations("HDFC", 1500, "Credit");
		person1.bankingOperations("HDFC", 100, "Debit");
		person1.bankingOperations("BOB", 1000, "Credit");
		person1.bankingOperations("BOB", 1000, "Credit");
		person1.bankingOperations("BOB", 1000, "Credit");
		person1.bankingOperations("BOB", 1000, "Debit");
		person1.displayTotalBankBalance();
		System.out.println(person1.icici.getBankMessage());
		System.out.println(person1.sbi.getBankMessage());
		System.out.println(person1.hdfc.getBankMessage());
		System.out.println(person1.bob.getBankMessage());
		displayIndividualBankDebitTransaction();
		displayIndividualBankCreditTransaction();
		displayAllBankTransactions();

	}

}
