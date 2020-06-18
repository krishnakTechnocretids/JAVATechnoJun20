/* Assignment 9 : 17th Jun 2020

Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method.
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
Main method will not directly call sum method.
b) average() & sum() should be non static method.
c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and called from main method.
d) Class should not have any instance variable.
Please read requirement 3-4 times before you start coding. try your best, your PR should merge in first go without any comment. (like)=*/


package anshuKJun20;



public class Test {
	
	double sum (double number1, double number2, double number3) {
		  return(number1+number2+number3);
	}
	 double average(double number1,double number2, double number3) {
		  return  sum(number1,number2,number3)/3;
	}
	static boolean isAnswerAboveExpecation(double answerfromaverage){
		if(answerfromaverage > 50) 
			return true;
		else
			return false;
	}
	 static boolean isEligible(double answerfromaverage){
		if(answerfromaverage>50|| answerfromaverage%2==0) 
		 return true;
		else
			return false;
	}
	 static String getYourGrade(double answerfromaverage) {
		 if(answerfromaverage > 80)
			 return "Grade A";
		 else 
			 return"Grade B";
	 }
	 public static void main(String[]args){
		 Test test = new Test();
		  double average = test.average(80.12,100.00,90.00);
		 System.out.println("Your average is "+average);
		  // print Is Answer Above Expecation 
		   if(Test.isAnswerAboveExpecation(average)==true)
		        System.out.println("You Scored as Our Expectation");
		   else
		    	System.out.println("You Should Work Hard.Your Marks is not so good");
			// Print Is Eligible Method 
		 if(Test.isEligible(average)==true)
			 System.out.println("You are Eligible ");
		 else
			 System.out.println("Sorry You are not Eligible");
		 
		 // Print Get Your Grade Method
		  if(Test.getYourGrade(average)=="Grade A")
			 System.out.println("You Scored Grade A");
		 else
			 System.out.println("You Sored Grade B");
	 }
}

