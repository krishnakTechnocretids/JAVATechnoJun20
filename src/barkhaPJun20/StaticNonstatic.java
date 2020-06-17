package barkhaPJun20;

public class StaticNonstatic {
	 double sum( double x, double y, double z){
		return (x+y+z);
	}	 
	  double average(double x1, double y1,double z1){
		StaticNonstatic s2=new StaticNonstatic();
		double totalAvg= (s2.sum(x1,y1,z1)/3);
		return totalAvg;
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
		 StaticNonstatic s1=new StaticNonstatic();
		 double totalAvg=s1.average(10.59,36.87,500.25);
		 System.out.println("Total Average of provided numbers are :" +s1.average(10.59,36.87,500.25));
		 System.out.println("Answer above Expectation is: " +isAnswerAboveExpectation( totalAvg));
		 System.out.println("Is program is Eligible:" +isEligible(totalAvg));
		 System.out.println("Grade is: "+getYourGrade(totalAvg));
	 }	 
}	 	
	
	 
		
		
	



