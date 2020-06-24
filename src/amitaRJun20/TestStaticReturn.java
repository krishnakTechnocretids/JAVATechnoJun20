package amitaRJun20;

public class TestStaticReturn {
	
	//method to return sum of marks scored by student 
	double sum(double mark1,double mark2,double mark3){
		double sum=mark1+mark2+mark3;
		return sum ;
	}
	
	//Method to return average of marks
	double average(double mark1,double mark2,double mark3){
		double average=(sum(mark1,mark2,mark3)/3);
		return average;
	}
	
	//method to return if average marks is above Expectation or not
	static boolean isaverageAboveExpecation(double average){
		if(average >50)
		return true;
		else
		return false;
	}
	
	//method to return if the student is eligible or not
	static boolean isEligible(double average){
		if(average >50 || average%2==0)
			return true;
			else
			return false;
	}
	
	//method to return Student's grade
	static String getYourGrade(double average){
		if(average>80)
			return "Grade A";
		else
			return
					"Grade B";		
	}
	
	public static void main(String[] args) {
		TestStaticReturn testreturn=new TestStaticReturn();
		double averageMark=testreturn.average(70,90,90);
		
		if(isaverageAboveExpecation(averageMark)==true)
			System.out.println("Answer is above expectation");
		else
			System.out.println("Answer is not above expectation");
		
		if(isEligible(averageMark)==true)
			System.out.println("Student is elligible");
		else
			System.out.println("Student is not elligible");
		
		System.out.println("Student grade is : "+getYourGrade(averageMark));
		
		
	}

}
