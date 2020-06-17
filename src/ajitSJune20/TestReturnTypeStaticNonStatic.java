package ajitSJune20;

public class TestReturnTypeStaticNonStatic {

	double sum(double var1, double var2, double var3) {

		System.out.println(
				"Sum of three numbers    (" + var1 + " , " + var2 + " , " + var3 + "): " + (var1 + var2 + var3));
		return (var1 + var2 + var3);
	}

	double average(double var1, double var2, double var3) {

		System.out.println("\nAverage of three numbers(" + var1 + " , " + var2 + " , " + var3 + "): " + (var1 + var2 + var3) / 3);
		return sum(var1, var2, var3) / 3;
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
			return "Grade ";
	}

	public static void main(String[] args) {
		TestReturnTypeStaticNonStatic testReturnTypeStaticNonStatic = new TestReturnTypeStaticNonStatic();
		double average = testReturnTypeStaticNonStatic.average(40.0, 40.0, 40.0);
		System.out.println("Is Student Mark above Expectation? : " + isAnswerAboveExpecation(average));
		System.out.println("Is Student Eligible?               : " + isEligible(average));
		System.out.println("Grade obtained by Student is       : " + getYourGrade(average));

	}

}
