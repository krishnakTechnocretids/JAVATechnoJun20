/*Assignment 9 : 17th Jun 2020
 * #PR140

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
            d) Class should not have any instance variable.  
			
*/
package pranitaPJun20;

public class MethodCalling {
//Method sum(), accept 3 parameters of type double & return answer
	double sum(double num1,double num2,double num3){
		return num1+num2+num3;	
	}
//Method average(), accept 3 parameters of type double & return answer
	double average(double num1,double num2,double num3){
		double avgAns=sum(num1,num2,num3)/3;
		return avgAns;
	}
//Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method)
// and return true if value is more then 50 else false.
	static boolean isAnswerAboveExpectation(double avg){
			if(avg>50)
				return true;
			else
				return false;	
		}
//Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2.  
	static boolean isEligible(double avg){
			if (avg>50 || avg%2==0)
				return true;
			else
				return false;		
		}
//Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", 
	static String getYourGrade(double avg){
			if(avg>80)
				return"A Grade";
			else
				return "B Grade";			
		}
//main method
	public static void main(String[] args){
		MethodCalling methodCalling = new MethodCalling();
		double avg= methodCalling.average(100,90.99,78.89);
//Access static menthos.Best practice to write method_name with class_name
		MethodCalling.isAnswerAboveExpectation(avg);
//Eligibility will be printed in main method.
		MethodCalling.isEligible(avg);
		boolean checkValue= MethodCalling.isEligible(avg); 
			if(checkValue==true)
				System.out.println("Eligibility check value is:-Is elligible");
			else
				System.out.println("Eligibility check value is:-Not elligible");
//main method will print grade received from getYourGrade() method.
		String grade = MethodCalling.getYourGrade(avg);
		System.out.println("The value of garde is:- "+grade);
	}
		
}
