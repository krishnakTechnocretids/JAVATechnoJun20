package vaishnaviVJun20;

public class Math {
    double sum(double number1, double number2, double number3) {
    	return number1+number2+number3;
    }
    double average(double number1, double number2, double number3) {
    	double average = sum(number1,number2,number3)/3;
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
