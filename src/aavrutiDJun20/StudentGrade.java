package aavrutiDJun20;

public class StudentGrade {
	
	//calculate sum of 3 marks and return sum to average method
	double sum(double marks1,double marks2,double marks3) {
		if(marks1>0 && marks2>0 && marks3>0) {
			double sumOfMarks = marks1 + marks2 + marks3;
			return sumOfMarks;
		}
		else {
			System.out.println("Please enter valid marks");
			return 0;
		}
	}

	//calculate average of 3 marks and return average marks
	double average(double marks1,double marks2,double marks3) {
		double sumOfMarks = sum(marks1,marks2,marks3); //Call sum method to take out sum of all 3 marks
		double averageOfMarks = sumOfMarks/3;
		System.out.println("Average mark is: " + averageOfMarks);
		return averageOfMarks;
	}
	
	//Verify whether average marks is above expectations not
	static boolean isAnswerAboveExpectation(double avgOfMarks) {
		if(avgOfMarks>50)
			return true;
		else
			return false;
	}
	
	//Verify whether student is eligible or not
	static boolean isEligible(double avgOfMarks) {
		if(avgOfMarks>50 || avgOfMarks%2 ==0)
			return true;
		else
			return false;
	}
	
	//Return Grade of student
	static String getYourGrade(double avgOfMarks) {
		if(avgOfMarks>80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args) {
		StudentGrade studentGrade = new StudentGrade();
		
		System.out.println("\nDetail's of Shivam are as below:\n");
		double totalAvgMarks = studentGrade.average(50,60,90); //Calculate average Marks of student		
		
		//Print whether answer is as per expectation or not
		if(isAnswerAboveExpectation(totalAvgMarks) == true)
			System.out.println("Answers are above expectation: Yes");
		else
			System.out.println("Answers are above expectation: No");
		
		//print whether student is eligible or not
		if(isEligible(totalAvgMarks) == true)
			System.out.println("Is Eligible: Yes");
		else
			System.out.println("Is Eligible: No");
		
		//Print grade of the student
		System.out.println("Grade is: " + getYourGrade(totalAvgMarks));
	}
}