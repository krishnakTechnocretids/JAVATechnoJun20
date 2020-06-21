package meghaJJune20;

public class Number {
			
	double sum(double x,double y,double z)
	{
		double totalsum=x+y+z;
		return totalsum;
		
	}
	double average(double x,double y,double z)
	{
		double avg= sum(x,y,z)/3;
		return avg;
	}
	static boolean isAnswerAboveExpecation(double avg)
	{
		if(avg > 50)
			return true;
		else
			return false;
			
	}
	static boolean isEligible(double avg)
	{
			if(avg>50 || avg%2==0)
				return true;
			else
				return false;
	}
	static String getYourGrade(double avg)
	{
		if (avg >80)
			return "Grade A";
		else
			return "Grade B";
	}
	public static void main(String [] args)
	{
		Number number = new Number();
		double avg=number.average(10,20,30);
		
		System.out.println();
		if(Number.isAnswerAboveExpecation(avg) == true)
			System.out.println("Your Performance is above Expectation.");
		else
			System.out.println("You need to put more efforts.");
		
		if(Number.isEligible(avg) == true)
			System.out.println("You are Eligible.");
		else
			System.out.println("You are not Eligible.");
		
		System.out.println("Your Result is : "+getYourGrade(avg));
		
	}
	
}
