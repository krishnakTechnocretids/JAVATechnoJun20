package archanaNJun20;

public class StaticExample{

	double sum(double no1,double no2,double no3) {
		double sum=no1+no2+no3;
		System.out.println("Sum is : "+sum);
		return sum;
	}
	double average(double no1,double no2,double no3) {

		double average=sum(no1, no2, no3)/3;
		
		System.out.println("Average is : "+average);
		return average;
	}
	static boolean isAnswerAboveExpectation(double avg)
	{
		if(avg>50)
		{
			System.out.println("Yes. Answer is above Expectation");
			return true;
		}
		else {
			System.out.println("NO. Answer is not above Expectation");
			return false;
		}
	}
	static boolean isEligible(double avg)
	{
		if(avg>50 && avg%2==0 )
		{
			System.out.println("Yes.Eligible ");
			return true;
		}
		else {
			System.out.println("NOT Eligible");
			return false;
		}
	}
	static boolean getYourGrade(double avg)
	{
		if(avg>80)
		{
			System.out.println("Grade A");
			return true;
		}
		else {
			System.out.println("Grade B");
			return false;
		}
	}
	public static void main(String[] args) {
		StaticExample staticExample=new StaticExample();
		double avg=staticExample.average(80, 80, 80);
		StaticExample.isAnswerAboveExpectation(avg);
		StaticExample.isEligible(avg);
		StaticExample.getYourGrade(avg);

	}
}
