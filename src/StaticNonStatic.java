
public class StaticNonStatic {
	
	double sum(double m1, double m2, double m3) {
		double totalMarks = m1 + m2 + m3;
		return totalMarks;
	}
	
	double average(double m1, double m2, double m3) {
		double totalMarks = sum(m1,m2,m3);
		double marksAverage = totalMarks/3;
		System.out.println("");
		System.out.println(" Average of Marks is: " + marksAverage);
		System.out.println("");
		return marksAverage;
	}
	
	static boolean isAnswerAboveExpecation(double marksAverage) {
		if(marksAverage > 50) 
			return true;
			else
				return false;	
	}
	
	static boolean isEligible(double marksAverage) {
		if (marksAverage>50 || marksAverage%2==0)
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
		System.out.println(" Students Report is: ");
		double totalAverageMarks = st.average(100, 80, 90);
		
		if(isAnswerAboveExpecation(totalAverageMarks) == true)
			System.out.println(" Answer is above expectation: Yes");
		else
			System.out.println(" Answer is above expectation: No");
		System.out.println("");
		
		if(isEligible(totalAverageMarks) == true)
			System.out.println(" Is Eligible: Yes");
		else
			System.out.println(" Is Eligible: No");
		System.out.println("");

		System.out.println("");
		System.out.println(" Grade is: " + getYourGrade(totalAverageMarks));
	}
	}
	
	


