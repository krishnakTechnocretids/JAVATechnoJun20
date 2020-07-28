package kARAN1595;

/* Assignment 9 : 17th Jun 2020

Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
           Main method will not directly call sum method. 
 b) average() & sum() should be non static method.
 c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and scalled from main method.
        d) Class should not have any instance variable.
        
*/

public class StaticNonStatic {

	double sum(double m1, double m2, double m3) {
		double totalMarks = m1 + m2 + m3;
		return totalMarks;
	}

	double average(double m1, double m2, double m3) {
		double totalMarks = sum(m1, m2, m3);
		double marksAverage = totalMarks / 3;
		System.out.println(" Average of Marks: " + marksAverage);
		return marksAverage;
	}

	static boolean isAnswerAboveExpecation(double marksAverage) {
		if (marksAverage > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double marksAverage) {
		if (marksAverage > 50 || marksAverage % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double marksAverage) {
		if (marksAverage > 50)
			return "A Grade";
		else
			return "B Grade";

	}
	public static void main(String[] args) {
		StaticNonStatic st = new StaticNonStatic();
		double totalAverageMarks = st.average(100, 80, 90);

		if (isAnswerAboveExpecation(totalAverageMarks) == true)
			System.out.println(" Answer is Yes");
		else
			System.out.println(" Answer is : No");

		if (isEligible(totalAverageMarks) == true)
			System.out.println(" Is Eligible: Yes");
		else
			System.out.println(" Is Eligible: No");

		System.out.println(" Grade is: " + getYourGrade(totalAverageMarks));
	}

}
