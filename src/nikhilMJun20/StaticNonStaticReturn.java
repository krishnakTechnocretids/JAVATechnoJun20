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
            d) Class should not have any instance variable.
*/

package nikhilMJun20;

public class StaticNonStaticReturn {
	double sum(double no1, double no2, double no3) {
		return(no1+no2+no3);
	}
	
	double average(double no1, double no2, double no3) {
		return(sum(no1, no2, no3)/3);
	}
	
	static boolean isAnswerAboveExpecation(double ansFromAverage) {
		if(ansFromAverage > 50)
			return true;
		else
			return false;
	}
	
	static boolean  isEligible(double ansFromAverage) {
		if(ansFromAverage > 50 || ansFromAverage%2 == 0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double ansFromAverage) {
		if(ansFromAverage > 80)
			return "Grade A";
		else
			return "Grade B";
	}
	
	public static void main(String[] args) {
		StaticNonStaticReturn staticNonStaticReturn = new StaticNonStaticReturn();
		
		double average = staticNonStaticReturn.average(100.0, 90.0, 80.0);
		
		//boolean flagExpectation = StaticNonStaticReturn.isAnswerAboveExpecation(average);
		if(StaticNonStaticReturn.isAnswerAboveExpecation(average) == true)
			System.out.println("\nYour Perormance is above Expectation!");
		else
			System.out.println("\nYou need put in more efforts.");
		
		//boolean flagEligibility = StaticNonStaticReturn.isEligible(average);
		if(StaticNonStaticReturn.isEligible(average) == true)
			System.out.println("\nYou are Eligible as per our criteria!");
		else
			System.out.println("\nYou are not Eligible as per our criteria.");
		
		//String grade = getYourGrade(average);
		System.out.println("\nYour Result: "+getYourGrade(average));
	}
}
