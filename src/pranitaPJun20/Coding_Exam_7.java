/*
 * Q1) class User{
		
		void debit(){
			
		}
		void credit(){
		}
		
		void displayInfo(){
			debit
			credit
		}
		
		void displayAllInfo(){
			totaldebit
			totalCredit
			totalUsers
		}
	}		 
	output : Users -> 3
	User1 -> total debit
	User1 -> total credit
	Total --> total debit & total credit */

package pranitaPJun20;

public class Coding_Exam_7 {
		int debitCount, creditCount;
		static int dCount, cCount;
		static int userCount;

		Coding_Exam_7() {
			userCount++;
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
			System.out.println("Total debit operations are: " + debitCount);
			System.out.println("Total credit operations are: " + creditCount);
		}

		void displayAllInfo() {
			System.out.println("Total number of times debit operation done: " + dCount);
			System.out.println("Total numbers of times creditoperation done: " + cCount);
			System.out.println("Total number of Users Created : " + userCount);
		}

		public static void main(String[] args) {
			Coding_Exam_7 Coding_Exam_7 = new Coding_Exam_7();
			Coding_Exam_7.credit();
			Coding_Exam_7.debit();
			Coding_Exam_7.credit();
			System.out.println("User1 Information");
			Coding_Exam_7.displayInfo();
			
			Coding_Exam_7 Coding_Exam_7_1 = new Coding_Exam_7();
			Coding_Exam_7_1.credit();
			Coding_Exam_7_1.debit();
			Coding_Exam_7_1.credit();
			Coding_Exam_7_1.credit();
			System.out.println("\nUser2 Information");
			Coding_Exam_7_1.displayInfo();
			System.out.println("\nDisplaying final Information");
			Coding_Exam_7_1.displayAllInfo();
		}
	}

