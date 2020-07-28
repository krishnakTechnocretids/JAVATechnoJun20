package rajAJun20;

public class Exam7 {
	static int countOfUsers;
	int debitCount, creditCount;
	static int dCount, cCount;

	Exam7() {
		countOfUsers++;
	}

	void debit() {
		debitCount++;
		dCount++;
	}

	void credit() {
		creditCount++;
		cCount++;
	}

	void displayInfo() {
		System.out.println("Total numbers of Debit operations are : " + debitCount);
		System.out.println("Total numbers of Credit operations are : " + creditCount);
	}

	void displayAllInfo() {
		System.out.println("Total numbers of times debit method called : " + dCount);
		System.out.println("Total numbers of times credit method called : " + cCount);
		System.out.println("Total number of Users : " + countOfUsers);
	}

	public static void main(String[] args) {
		Exam7 exam = new Exam7();
		System.out.println("First User : ");
		exam.credit();
		exam.debit();
		exam.displayInfo();
		Exam7 exam1 = new Exam7();
		System.out.println("Second User : ");
		exam1.credit();
		exam1.debit();
		exam1.displayInfo();
		System.out.println("Operations and Users Total Information : ");
		exam1.displayAllInfo();

	}
}
