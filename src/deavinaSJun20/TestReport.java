package deavinaSJun20;

public class TestReport {

	double sum(double x, double y, double z) {
		return (x + y + z);
	}

	double average(double x, double y, double z) {
		double sum = sum(x, y, z);
		double average = sum / 3;
		return average;
	}

	static boolean isAnswerAboveExpecation(double average) {
		if (average >= 50) {
			System.out.println("Student average is above expectation");
			return true;
		} else {
			System.out.println("Student average is below expectation");
			return false;
		}
	}

	static boolean isEligible(double average) {
		if (average >= 50 || average % 2 == 0) {
			System.out.println("Student is eligible for scholarship");
			return true;
		} else {
			System.out.println("Student is not eligible for scholarship");
			return false;
		}
	}

	static String getYourGrade(double average) {
		if (average >= 80) {
			return "A";
		} else
			return "B";
	}

	public static void main(String[] args) {
		TestReport tr = new TestReport();
		double average = tr.average(100, 150, 130);
		System.out.println("Result " + isAnswerAboveExpecation(average));
		System.out.println("Eligiblity is : " + isEligible(average));
		System.out.println("Student Grade is " + getYourGrade(average));
	}
}