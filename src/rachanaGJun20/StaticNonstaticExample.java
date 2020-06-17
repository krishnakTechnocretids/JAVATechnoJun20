/*Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
           Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
        d) Class should not have any instance variable.  */

package rachanaGJun20;

public class StaticNonstaticExample {

	double sum(double num1, double num2, double num3) {

		return (num1 + num2 + num3);
	}

	double average(double x, double y, double z) {

		double calculatedsum = sum(x, y, z);
		double calculatedaverage = calculatedsum / 3;
		return calculatedaverage;
	}

	static boolean isAnswerAboveExpectation(double answer) {
		
		if (answer > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double answer) {
		
		if(answer > 50 || (answer % 2) == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double answer) {
		
		if(answer > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {

		StaticNonstaticExample staticnonstaticexample1 = new StaticNonstaticExample();
		StaticNonstaticExample staticnonstaticexample2 = new StaticNonstaticExample();
		//Result for student 2
		System.out.println("Display result for student 1");
		double calculatedaverage1 = staticnonstaticexample1.average(100, 200, 300);
		System.out.print("Is answer above expectations ? : ");
		if (isAnswerAboveExpectation(calculatedaverage1)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.print("Is Eligible ? : ");
		if(isEligible(calculatedaverage1)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println("Grade of the Student: "+getYourGrade(calculatedaverage1));
		
		//Result for student 2
		System.out.println("\nDisplay result for student 2");
		double calculatedaverage2 = staticnonstaticexample2.average(50, 30, 50);
		System.out.print("Is answer above expectations ? : ");
		if (isAnswerAboveExpectation(calculatedaverage2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.print("Is Eligible ? : ");
		if(isEligible(calculatedaverage2)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println("Grade of the Student: "+getYourGrade(calculatedaverage2));
		
		
	}
}
