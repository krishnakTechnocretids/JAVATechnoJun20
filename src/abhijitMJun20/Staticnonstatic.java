package abhijitMJun20;

public class Staticnonstatic{ 
	double sum( double parameter1, double parameter2,double parameter3){
		double sumofvalues=parameter1+parameter2+parameter3;
		return sumofvalues;
	}
	double average(double parameter4, double parameter5,double parameter6){  
		 double averageofsum=sum(parameter4,parameter5,parameter6)/3;
		return averageofsum;
	}
	static boolean isAnswerAboveExpecation(double averageofsum ){
	     if(averageofsum>50)
		 {
		 return true;}
	 else { return false;}
	}
	static boolean isEligible(double averageofsum){
		if( averageofsum%2==0 || averageofsum>50){
			return true;
		}else{
			return false;
			}		
	}
	static String getYourGrade(double averageofsum ){
	     if(averageofsum>80)
		 {
		 return "A Grade";}
	 else { return "B Grade";}
	}
	public static void main(String[] args){
		Staticnonstatic staticnonstatic= new Staticnonstatic();
		double averageofsum=staticnonstatic.average(10,20,50000);
		if(isAnswerAboveExpecation(averageofsum))
		{
			System.out.println("Value is more then 50: True");
		}
		else{
			System.out.println("Value is more then 50: False");
		}
		if(isEligible(averageofsum))
		
			{
			System.out.println("Eligibility is true");
		}
		else{
			System.out.println("Eligibility is false");
		}
		
		System.out.println(getYourGrade(averageofsum));
	}
}