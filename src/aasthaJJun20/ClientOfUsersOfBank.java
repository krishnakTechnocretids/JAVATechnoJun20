package aasthaJJun20;

public class ClientOfUsersOfBank {
	public static void main(String[] args) throws InvalidAmountException {
		UsersOfBank usersOfBank1 = new UsersOfBank(10000);
		usersOfBank1.credit(1000);
		usersOfBank1.debit(1000);
		usersOfBank1.credit(2000);
		usersOfBank1.debit(2000);
		usersOfBank1.debit(100);
		usersOfBank1.displayInfo();
		System.out.println();
		UsersOfBank usersOfBank2 = new UsersOfBank(10000);
		usersOfBank2.credit(1000);
		usersOfBank2.debit(1000);
		usersOfBank2.credit(2000);
		usersOfBank2.debit(2000);
		usersOfBank2.debit(200);
		usersOfBank2.displayInfo();
		System.out.println();
		try {
			UsersOfBank usersOfBankInvalid = new UsersOfBank(-10000);
			usersOfBankInvalid.debit(100);
		}catch(InvalidAmountException invalidAmountException) {
			System.out.println(invalidAmountException.getMessage());
		}
		try {
			UsersOfBank usersOfBankInvalid = new UsersOfBank(10000);
			usersOfBankInvalid.credit(-2000);
		}catch(InvalidAmountException invalidAmountException) {
			System.out.println(invalidAmountException.getMessage());
		}
		try {
			UsersOfBank usersOfBankInvalid = new UsersOfBank(10000);
			usersOfBankInvalid.debit(-3000);
		}catch(InvalidAmountException invalidAmountException) {
			System.out.println(invalidAmountException.getMessage());
		}
		UsersOfBank.displayAllInfo();
	}
}
