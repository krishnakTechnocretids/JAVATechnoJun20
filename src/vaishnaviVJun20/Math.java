package vaishnaviVJun20;

public class Math {
    double sum(double variable1, double variable2, double variable3) {
    	double sum = variable1+variable2+variable3;
    	return sum;
    }
    double average(double variable1, double variable2, double variable3) {
    	System.out.println("Sum of three variable is: " +sum(variable1,variable2,variable3));
    	double average = (variable1+variable2+variable3)/3;
    	return average;
    }
    static boolean isAnswerAboveExpectation(double average) {
    	if(average>50)
    		return true;
    	else
    		return false;
    }
    static boolean isEligible(double average) {
    	if(average>50 || average%2==0)
    		return true;
    	else
    		return false;
    }
    static String getYourGrade(double average) {
    	if(average>80)
    		return "Grade A";
    	else
    		return "Grade B";
    }
	public static void main(String[] args) {
	   Math math = new Math();
	   double result = math.average(80.5,90.5,70.5);
	   System.out.println("Average of given three numbers is: " +result);
	   System.out.println("Is average above expectation: " +isAnswerAboveExpectation(result));
	   System.out.println("Is student eligible: " +isEligible(result));
	   System.out.println("Grade: " +getYourGrade(result));
	}

}
