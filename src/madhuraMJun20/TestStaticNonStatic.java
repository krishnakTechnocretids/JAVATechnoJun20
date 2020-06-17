package madhuraMJun20;

public class TestStaticNonStatic {

	double sum(double a, double b, double c) {
		double sumAns= a+b+c;
		System.out.println("Sum of the marks is : " +sumAns);
		return sumAns;
	}
	double average(double a, double b, double c) {
		double avgAns= (a+b+c)/3;
		System.out.println("Average of the marks is : " +avgAns);		
		sum(a,b,c);
		return avgAns;
	}
	static boolean isAnswerAboveExpectation(double avgAns) {
		System.out.println("Student is Above expectation -- ");
		if (avgAns > 50) 
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double avgAns) {
		System.out.println("Student is Eligible for course -- ");
		if(avgAns>50 || avgAns%2==0)
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
		TestStaticNonStatic testStaticNonStatic = new TestStaticNonStatic();
		
		double avgAns=testStaticNonStatic.average(40,40,40);
		System.out.println();
		System.out.println(isAnswerAboveExpectation(avgAns));
		System.out.println();
		System.out.println(isEligible(avgAns));
		System.out.println();
		System.out.println(getYourGrade(avgAns));
	}
}
