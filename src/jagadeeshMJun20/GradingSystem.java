package jagadeeshMJun20;
public class GradingSystem {
	double sum(double sub1, double sub2, double sub3){
		 return (sub1+sub2+sub3);
	}
	double avg(double sub1, double sub2, double sub3){
		return (sum(sub1,sub2,sub3)/3);
	}
	static boolean isAnswerAboveExpecation(double avg){
		if( avg > 50)
			return true;
		else return false;
	}
	static boolean isEligible(double avg){
		if (avg >50 || avg%2 ==0)
			return true;
		else return false;
	}
	static String getYourGrade(double avg){
		if(avg > 80)
			return "A Grade";
		else return "B Grade";
	} 
	public static void main(String[] agrs){
		GradingSystem gradingSystem = new GradingSystem();
		double average =  gradingSystem.avg(90,85.5,82.5);
		System.out.println("Average is  :" +average);
			if (isAnswerAboveExpecation(average) == true)
				System.out.println("Candidate is above expections");
			else 
				System.out.println("Candidate is below expections ");
			if ( isEligible(average) == true){
				System.out.println("Candidate is Eligible for grading ");
				System.out.println("Grade is "+getYourGrade(average));
			}
			else
				System.out.println("Candidate is not Eligible for grading ");
	}	

}
