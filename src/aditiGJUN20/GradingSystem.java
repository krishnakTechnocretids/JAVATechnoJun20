/*
 Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average 
	method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) 
	return true if value is more then 50 or divisible by 2. 
	Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return 
	"A Grade" if average is more then 80 else "B grade", main method will print grade received from 
	getYourGrade() method.

Rules : 
a) From main method, you will call average() and average() method will call sum() method.
    Main method will not directly call sum method.
b) average() & sum() should be non static method.
c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and called from 
	main method.
d) Class should not have any instance variable.  
 * */


package aditiGJUN20;

public class GradingSystem {
	
	// Method to find sum of marks -- Further it'll be used in Average method.. 
	double sum(double marks1, double marks2, double marks3) {
		if(marks1>0 && marks2>0 && marks3>0) {
			double sum=marks1+marks2+marks3;
			return sum;
		}
		else {
			System.out.println("Enter valid marks");
			return 0;
		}
	}
	
	// Method to find Average of Marks..
	double average(double marks1, double marks2, double marks3) {
		double averageMarks =Math.round(sum(marks1,marks2,marks3)/3); // Calling sum method
		System.out.println("\nMark1: "+marks1+"\nMark2: "+marks2+"\nMark3: "+marks3);
		System.out.println("\nSudent's Average Marks: "+averageMarks);
		return averageMarks;
	}
	
	// Method to check averaged marks are above expectation or not.
	static boolean isAnswerAboveExpecation(double averageMarks) {
		if(averageMarks > 50)
			return true;
		else
			return false;
	}
	
	//  Method to check eligibility based on given criteria..
	static boolean isEligible(double averageMarks) {
		if(averageMarks > 50 || averageMarks%2 == 0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double averageMarks) {
		if (averageMarks>80)
			return "GRADE A";
		else
			return "GRADE B";
	}
	
	
	

	public static void main(String[] args) {
		GradingSystem gradingsystem = new GradingSystem();
		
		System.out.println("--- Student Grades---");
		double averageMarks=gradingsystem.average(85,70,90);// Finding Average
		
		// Answered question above expectation or not..
		if(isAnswerAboveExpecation(averageMarks)==true) {
			System.out.println("Did student answered above Expectation? : YES");
		}
		else
			System.out.println("Did student answered above Expectation? : NO");
		
		// Checking ELigibility Criteria..
		if(isEligible(averageMarks)==true) {
			System.out.println("Is Eligible? : YES");
		}
		else
			System.out.println("Is Eligible? : NO");
		
		// Student Grades..
		System.out.println("Student passed with: "+getYourGrade(averageMarks));
		
	}

}
