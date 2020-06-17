package ajitSJune20;

public class TestReturnTypeStaticNonStatic {

	double sum(double var1, double var2, double var3) {
			double sum=var1 + var2 + var3;
		System.out.println("Sum of three numbers    (" + var1 + " , " + var2 + " , " + var3 + "): " + sum);
		return sum;
	}

	double average(double var1, double var2, double var3) {
		double average=sum(var1,var2,var3)/3;
		System.out.println("Average of three numbers(" + var1 + " , " + var2 + " , " + var3 + "): " + average);
		return average;
	}

	static boolean isAnswerAboveExpecation(double average) {
		if (average > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double average) {
		if ((average > 50) || (average % 2 == 0))
			return true;
		else
			return false;

	}

	static String getYourGrade(double average) {
		if (average > 80)
			return "Grade A";
		else
			return "Grade B";
	}

	public static void main(String[] args) {
		TestReturnTypeStaticNonStatic testReturnTypeStaticNonStatic = new TestReturnTypeStaticNonStatic();
		double average = testReturnTypeStaticNonStatic.average(40.0, 40.0, 40.0);
		System.out.println("Is Student Mark above Expectation? : " + isAnswerAboveExpecation(average));
		System.out.println("Is Student Eligible?               : " + isEligible(average));
		System.out.println("Grade obtained by Student is       : " + getYourGrade(average));

	}

}
