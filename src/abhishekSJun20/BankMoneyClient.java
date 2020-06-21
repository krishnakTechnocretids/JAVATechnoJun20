package abhishekSJun20;

public class BankMoneyClient {
	
		public static void main(String[] args){
			BankMoney bankMoney = new BankMoney();
			bankMoney.custName = "RAdhe";

			bankMoney.bankingOp("ICICI", "Credit", 3500.00);
			bankMoney.bankingOp("ICICI", "Credit", 2500.00);
			bankMoney.bankingOp("HDFC", "Credit", 2500.00);
			bankMoney.bankingOp("HDFC", "Credit", 4000.00);
			bankMoney.bankingOp("BOB", "Credit", 2500.00);
			bankMoney.bankingOp("BOB", "Credit", 9000.00);
			bankMoney.bankingOp("BOB", "Credit", 2500.00);
			bankMoney.bankingOp("SBI", "Credit", 2500.00);

			bankMoney.bankingOp("ICICI", "Debit", 2500.00);
			bankMoney.bankingOp("ICICI", "Debit", 1500.00);
			bankMoney.bankingOp("HDFC", "Debit", 500.00);
			bankMoney.bankingOp("BOB", "Debit", 500.00);
			bankMoney.bankingOp("SBI", "Debit", 2500.00);

			bankMoney.calculateTotalBalance();

			bankMoney.displayTotalBankingOps();

			bankMoney.displayBankWiseCreditOps();

			bankMoney.displayBankWiseDebitOps();
	}
	}