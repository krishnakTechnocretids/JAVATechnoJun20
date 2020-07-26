package abhishekSJun20;

public class Coding_exam_07 {
	static int countOfUsers;
	int debitCount, creditCount;
	static int totaldebitCount, totalcreditCount;

	Coding_exam_07() {
		countOfUsers++;
	}

	void debit() {
		debitCount++;
		totaldebitCount++;
	}

	void credit() {
		creditCount++;
		totalcreditCount++;
	}

	void displayInfo() {
		System.out.println("Total numbers of Debit operations are : " + debitCount);
		System.out.println("Total numbers of Credit operations are : " + creditCount);
	}

	void displayAllInfo() {
		System.out.println("Total numbers of times debit method called : " + totaldebitCount);
		System.out.println("Total numbers of times credit method called : " + totalcreditCount);
		System.out.println("Total number of Users : " + countOfUsers);
	}

	public static void main(String[] args) {
		Coding_exam_07 coding_exam_07a = new Coding_exam_07();
		System.out.println("First User -> ");
		coding_exam_07a.credit();
		coding_exam_07a.debit();
		coding_exam_07a.displayInfo();
		Coding_exam_07 coding_exam_07b = new Coding_exam_07();
		System.out.println("Second User ->");
		coding_exam_07b.credit();
		coding_exam_07b.debit();
		coding_exam_07b.displayInfo();
		System.out.println("Operations and Users Total Information : ");
		coding_exam_07b.displayAllInfo();

	}
}

