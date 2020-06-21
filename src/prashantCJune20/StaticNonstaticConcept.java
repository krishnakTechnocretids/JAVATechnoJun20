package prashantCJune20;

public class StaticNonstaticConcept {
	
	double sum(double num1, double num2,double num3){
		
		return(num1+num2+num3);
	}
	double avarage(double num1,double num2, double num3){
		 double avg = sum(num1,num2,num3)/3;
		 return avg;		
	}
	static  boolean isAnswerAboveExpecation(double avg){
		if(avg>50)
			return true;
		else
			return false;		
	}
	static boolean isEligible(double avg){
		if(avg>50 || avg%2==0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double avg){
		 if(avg > 80)
			 return "You are in Grade A";
		 else 
			 return"You are in Grade B";
	}
	public static void main (String[] args)
	{
		StaticNonstaticConcept concept = new StaticNonstaticConcept();
		 
		 double avarage = concept.avarage(90, 90, 90);
		
		System.out.println("Your percetages are "+avarage);
		
		StaticNonstaticConcept.isAnswerAboveExpecation(avarage);
		
		if(StaticNonstaticConcept.isEligible(avarage)==true)
		System.out.println("Eligible ");
		 else
		System.out.println("Not Eligible");
		
		if(StaticNonstaticConcept.getYourGrade(avarage)=="You are in Grade A")			 
		System.out.println("You are in  Grade A");
		else
		System.out.println("You are in Grade B");		
	}
	
	
}
