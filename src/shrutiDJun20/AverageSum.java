/*
1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received 
from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from
 average method) return true if value is more then 50 or divisible by 2. 
 Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average
 method) return "A Grade" if average is more then 80 else "B grade", main 
 method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will
 call sum() method.
  Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should
	     be static method and called from main method.
        d) Class should not have any instance variable.  
 */
package shrutiDJun20;

public class AverageSum {
	
	 double summation(double x,double y,double z ){
		double sum = x+y+z;
		System.out.println("Sum is "+ sum);
		return sum;
	}
	 
	 double avg(double x,double y,double z){
		 AverageSum sumobject = new AverageSum();
		 double avg=  (sumobject.summation(x, y, z)/3);
		 System.out.println("Avg is "+ avg);
		 return avg;
	 }
	 
		 static  boolean isAnswerAboveExpecation(double avg){
		 if(avg>50){
			 System.out.println("above expectation");
			 return true;
		 }
		 else{
			 System.out.println("below expectatiom");
			 return false;
		 }
		 }
		
	   static boolean isEligible(double avg){
			if(avg>50 || avg%2==0){
			System.out.println("is eligible");
			return true;
			}
			else{
				System.out.println("is not eligible");
				return false;
			}
		
		}
		
		static String getYourGrade(double avg){
			if(avg>80){
				return "Grade A";
			}
			else
				return "Grade B";
						
		}
		
		public static void main(String[] args) {
			AverageSum averageSum = new AverageSum();
			double average= averageSum.avg(5, 5, 5);
			isAnswerAboveExpecation(average);
			isEligible(average);
			//getYourGrade(average);
			System.out.println(getYourGrade(average));
			
			//AverageSum.isAnswerAboveExpecation(averageSum.avg(5, 5, 5));
			//AverageSum.isEligible(averageSum.avg(5, 5, 5));
		}
		
		
}
