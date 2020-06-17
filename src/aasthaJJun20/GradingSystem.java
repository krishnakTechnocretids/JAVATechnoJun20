package aasthaJJun20;

/*Assignment 9 : 17th Jun 2020

Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
            d) Class should not have any instance variable.  */
			
class GradingSystem{
	
	double sum(double subject1,double subject2,double subject3){
		return subject1 + subject2 + subject3;
	}
	
	double average(double subject1, double subject2, double subject3){
		return (sum(subject1, subject2, subject1)/3);
	}
	
	static boolean isAnswerAboveExpecation(double answer){
		if (answer > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double answer){
		if(answer > 50 || answer%2 == 0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double answer){
		if (answer > 80 )
			return "Grade A";
		else
			return "Grade B";
	}
	
	public static void main(String[] args){
		GradingSystem gradingSystem = new GradingSystem();
		double answer = gradingSystem.average(90.50,80.50,80.50); 
		
		if (isAnswerAboveExpecation(answer) == true)
			System.out.println("Your Performance is above expectation");
		else
			System.out.println("Please work hard, your Performance is below expectation");
		
		if(isEligible(answer) == true)
			System.out.println("You are eligible for the addmission");
		else
			System.out.println("You are not eligible for the addmission");
		
		System.out.println("You have secured : " + getYourGrade(answer));
	}
}
