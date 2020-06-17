package meghaJJune20;

public class Number {
			
	double sum(double x,double y,double z)
	{
		double totalsum=x+y+z;
		System.out.println("Sum Total is : " +totalsum);
		return totalsum;
		
	}
	double average(double x,double y,double z)
	{
		double avg=(x+y+z)/3;
		System.out.println("Total Average is : " +avg);
		return avg;
	}
	static boolean isAnswerAboveExpecation(double avg)
	{
		System.out.println("Expectation ");
		if(avg > 50)
			return true;
		else
			return false;
			
	}
	static boolean isEligible(double avg)
	{
			System.out.println("Eligible ");
			if(avg>50 || avg%2==0)
				return true;
			else
				return false;
	}
	static String getYourGrade(double avg)
	{
		System.out.println("Student Grade ");
		if (avg >50)
			return "Grade A";
		else
			return "Grade B";
	}
	public static void main(String [] args)
	{
		Number number = new Number();
		double avg=number.average(40,50,50);
		
		System.out.println();
		System.out.println(isAnswerAboveExpecation(avg));
		System.out.println();
		System.out.println(isEligible(avg));
		System.out.println();
		System.out.println(getYourGrade(avg));
		
	}
	
}
