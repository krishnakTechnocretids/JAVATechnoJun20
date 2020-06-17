package rajAJun20;

public class StaticNonStatic {
			double sum(double var1, double var2, double var3) {
	    	double sum = var1 + var2 + var3;
	    	System.out.println("Sum of three variable is: " + sum);
	    	return sum;
	    }
	    double average(double var1, double var2, double var3) {
	    	double average = (var1 + var2 + var3)/3;
	    	sum(var1, var2, var3);
	    	return average;
	    }
	    static boolean isAnswerAboveExpectation(double average) {
	    	if(average > 50)
	    		return true;
	    	else
	    		return false;
	    }
	    static boolean isEligible(double average) {
	    	if(average > 50 || average % 2 == 0)
	    		return true;
	    	else
	    		return false;
	    }
	    static String getYourGrade(double average) {
	    	if(average > 80)
	    		return "Grade A";
	    	else
	    		return "Grade B";
	    }
		public static void main(String[] args) {
		   StaticNonStatic staticnonstatic = new StaticNonStatic();
		   double result = staticnonstatic.average(65,78.64,80.7);
		   System.out.println("Average of numbers is: " + result);
		   System.out.println("Is average above expectation: " +isAnswerAboveExpectation(result));
		   System.out.println("Is student eligible: " +isEligible(result));
		   System.out.println("Grade: " +getYourGrade(result));
		}

	}
