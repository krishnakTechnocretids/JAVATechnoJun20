package abhishekSJun20;
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
	            d) Class should not have any instance variable.8*/
	public class TeststaticNonStatic {
		double sum(double num1, double num2, double num3) {
			return(num1+num2+num3);
		}

		double average(double num1, double num2, double num3) {
			return(sum(num1, num2, num3)/3);
		}
	
	static boolean isAnswerAboveExpectation(double averageAns) {
		System.out.println("Student is Above expectation :");
		if (averageAns > 50) 
			return true;
		else
			return false;
	}

	static boolean isEligible(double averageAns) {
		System.out.println("Student is Eligible for course :");
		if(averageAns>50 || averageAns%2==0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double avgAns) {
		System.out.println("Student passed with : ");
		if (avgAns >=80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {
		TeststaticNonStatic testStaticNonStatic = new TeststaticNonStatic();

		double avgAns=testStaticNonStatic.average(80,90,40);
		System.out.println();
		System.out.println(isAnswerAboveExpectation(avgAns));
		System.out.println();
		System.out.println(isEligible(avgAns));
		System.out.println();
		System.out.println(getYourGrade(avgAns));
	}

}
