package abhijitMJun20;

public class Staticnonstatic { 
	static double sumofvalues;
	static double average;
	double sum( double parameter1, double parameter2,double parameter3){
		 sumofvalues=parameter1+parameter2+parameter3;
		return sumofvalues;
	}
	double average(double parameter4, double parameter5,double parameter6){  
	       sum(parameter4,parameter5,parameter6);
		   average=sumofvalues/3;
		return average;
	}
	static boolean isAnswerAboveExpecation(double parameter7 ){
	     if(parameter7>50){
		 return true;
		 }
	     else { 
			 return false;
			 }
	}
	static boolean isEligible(double parameter8){
		if( parameter8%2==0 || parameter8>50){
			return true;
		}else{
			return false;
		}		
	}
	static String getYourGrade(double parameter9 ){
	     if(parameter9>80){
		 return "A Grade";
		 }
	 else {
		 return "B Grade";
		 }
	}
	public static void main(String[] args)
	{
		Staticnonstatic staticnonstatic= new Staticnonstatic();
		staticnonstatic.average(10,20,50000);
		if(isAnswerAboveExpecation(average)){
			System.out.println("Value is more then 50: True");
		}
		else{
			System.out.println("Value is more then 50: False");
		}
		if(isEligible(average)){
			System.out.println("Eligibility is true");
		}
		else{
			System.out.println("Eligibility is false");
		}
		System.out.println(getYourGrade(average));
	}
}
