package apurvaJun20;

public class GradingSystem
{

	double sum(double num1,double num2,double num3) {
		return num1+num2+num3;
	}

	double averageSum(double num1,double num2,double num3) {
		return (sum(num1,num2,num3)/3);
	}

	static boolean isAnswerAboveExpecation(double average) {
	if(average>50)
		return true;
     else 
    	 return false;
	}

	static boolean isEligible(double average)
	{
	if(average>50 || average%2==0)
		return true;
	else
		return false;

	}
	static String getYourGrade(double average)
	{
		if (average>80)
			return "Grade A";
		else
			return "Grade B";
	}

	public static void main(String[] args)

	{
		GradingSystem gradingSystem =new GradingSystem();
		double average = gradingSystem.averageSum(80.50,94.50,84.50);

		if(isAnswerAboveExpecation(average)== true)
			System.out.println(" Performance is above expectation");
		else
			System.out.println("Please work hard");

		if(isEligible(average)==true)
			System.out.println("You are Eligible");
		else 
			System.out.println("Please try in next term");

		System.out.println("You have scored "+getYourGrade(average));

	}

}