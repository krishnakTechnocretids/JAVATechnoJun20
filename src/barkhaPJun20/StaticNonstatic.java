package barkhaPJun20;

public class StaticNonstatic {
	 double sum( double num1, double num2, double num3){
		return (num1+num2+num3);
	}	 
	  double average(double no1, double no2,double no3){
		 return (sum(no1,no2,no3)/3);
	}	
	static boolean isAnswerAboveExpectation(double totalAvg){
		if (totalAvg>50)
			 return true;	
	    else
			return false;
	}	
	static boolean isEligible(double totalAvg){		
		  if (totalAvg>50 || totalAvg%2==0)
			 return true;
		 else
			 return false;
	 }
	 static String getYourGrade(double totalAvg) {
		 if (totalAvg>80)
			 return "A grade";
		 else
			 return "B grade";
	 }
	 public static void main(String[] args) {
		 StaticNonstatic staticNonstatic=new StaticNonstatic();
		 double totalAvg=staticNonstatic.average(10.59,36.87,500.25);
		 System.out.println("Total Average of provided numbers is "+staticNonstatic.average(10.59,36.87,500.25));
		 System.out.println("Answer is above Expectation : " +isAnswerAboveExpectation(totalAvg));
		 System.out.println("Program is Eligible?:" +isEligible(totalAvg));
		 System.out.println("Grade is: "+getYourGrade(totalAvg));
	 }	 
}	 	
		
	
	
		
	 
		
		
	



