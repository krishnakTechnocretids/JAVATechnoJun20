package kartikeyDJune20;

public class AverageSumGrade {
	double sum(double frst, double second, double thrd) {
		double sum = frst + second + thrd;
		return sum;
	}

	double average(double first, double scnd, double thrd) {
		double avg = 0;
		if ((first > 100 || first < 0) || (scnd > 100 || scnd < 0) || (thrd > 100 || thrd < 0)) {
			return avg;
		} else {
			sum(first, scnd, thrd);
			avg = (first + scnd + thrd) / 3;
			return avg;
		}
	}

	static boolean isAnswerABoveExpectation(double avg) {
		if (avg > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double avg) {
		if (avg < 80)
			return "B Garde";
		else
			return "A Garde";
	}

	public static void main(String[] args) {
		AverageSumGrade averageSumGarde = new AverageSumGrade();
		double avg = averageSumGarde.average(99, 0.20, 30);
		
		if (avg != 0) {
			isAnswerABoveExpectation(avg);
			if (isEligible(avg) == true)
				System.out.println("Student is Eligible for next standard");
			else
				System.out.println("Student is not eligible for next standard");

			System.out.println("Student grade is " + getYourGrade(avg));
		} else
			System.out.println("Marks entered are invalid: Please correct");
	}

}
