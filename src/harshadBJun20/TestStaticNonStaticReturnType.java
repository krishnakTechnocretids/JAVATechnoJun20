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

package harshadBJun20;

public class TestStaticNonStaticReturnType{
	
	double sum(double number1, double number2, double number3){
		return (number1+number2+number3);
	}
	
	double average(double number1, double number2, double number3){
		
		return ((sum(number1,number2,number3))/3);
	}
	
	static boolean isAnswerAboveExpecation(double avgAnswer){
		if(avgAnswer>50)
			return true;
		else
			return false;
	}
	
	//In the below method isAnswerAboveExpecation(avgAnswer) is called in if condition to check avgAnswer>50.
	static boolean isEligible(double avgAnswer){
		if(isAnswerAboveExpecation(avgAnswer) || (avgAnswer%2==0))
			return true;
		else
			return false;
		
	}	
	
	static String getYourGrade(double avgAnswer){
		if(avgAnswer>80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String args[]){
		
		TestStaticNonStaticReturnType test = new TestStaticNonStaticReturnType();
		double avgAnswer = test.average(100,80,50);
		
		System.out.println("Value of isAnswerAboveExpecation: "+isAnswerAboveExpecation(avgAnswer));
		
		if(isEligible(avgAnswer)== true)
			System.out.println("Student with "+avgAnswer+" average is Eligibe");
		else
			System.out.println("Student with "+avgAnswer+" average is not Eligibe");
		
		System.out.println("Grade received: "+getYourGrade(avgAnswer));	
	}
}