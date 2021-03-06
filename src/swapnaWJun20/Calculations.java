package swapnaWJun20;
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

/*@KrishnaKTechnocredits
	KrishnaKTechnocredits 11 hours ago Owner
	Method getYourGrade(),take one parameter (answer which you received from average method)
	return "A Grade" if average is more then 80 else "B grade", main method will
	print grade received from getYourGrade() method.
	It should be if(avg>80) only */

/*Code updated as per Krishna's comment*/

public class Calculations {

	double sumNo(double one, double two, double three){
		return one+two+three ;
	}

	double averageNo(double avg1, double avg2, double avg3){ 
		return (sumNo(avg1,avg2,avg3)/3);
	}

	static boolean isAnswerAboveExpecation(double avgAns){
		if(avgAns>50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double avgAns){
		if(avgAns>50|| avgAns%2==0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double avgAns){
		if (avgAns>80)
			return "A Grade";
		else 
			return "B Grade";
	}

	public static void main(String args[])
	{
		Calculations calculations1 = new Calculations();
		double avgFinal = calculations1.averageNo(90, 80, 70);		

		System.out.println("Summary of Performance");
		System.out.println("--------------------------------------");

		//Printing Expectation criteria
		if(Calculations.isAnswerAboveExpecation(avgFinal) == true)
			System.out.println("Your Performance is above Expectation.");
		else
			System.out.println("You need put in more efforts.");

		//Printing Eligibility
		if(Calculations.isEligible(avgFinal) == true)
			System.out.println("\nYou are Eligible.");
		else
			System.out.println("\nYou are not Eligible.");

		//Printing grades
		System.out.println("\nYour Result: "+getYourGrade(avgFinal));
	}
} 