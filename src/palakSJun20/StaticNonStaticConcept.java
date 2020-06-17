package palakSJun20;

public class StaticNonStaticConcept {
	
	double sum(double number1, double number2, double number3){
		return number1 + number2 + number3;
	}
	
	double average(double number1, double number2, double number3){
		double averageResult=(number1 + number2 + number3) / 3;
		sum(10.0, 10.5, 10.5);
		return averageResult;
	}
	
	static boolean isAnswerAboveExpecation(double averageResult){
		if(averageResult > 50 )
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double averageResult){
		if(averageResult > 50 || averageResult %2 == 0)
			return true;
		return false;
	}
	
	static String getYourGrade(double averageResult){
		if(averageResult > 80)
			return "A Grade";
		else 
			return "B Grade";
	}
	
	public static void main(String[] args) {
		StaticNonStaticConcept staticConcept = new StaticNonStaticConcept();
		double averageResult = staticConcept.average(10, 50, 20);
		 
		if(isAnswerAboveExpecation(averageResult))
			System.out.println("Average Answer " + averageResult+ " is above Expectation ");
		else
			System.out.println("Average Answer "+ averageResult +" is below Expectation");
		
		if(StaticNonStaticConcept.isEligible(averageResult))
			System.out.println("It is eligible as per Average");
		else 
			System.out.println("It is Not eligible as per Average");
		
		System.out.println("Grade Result Based on Average : "+ StaticNonStaticConcept.getYourGrade(averageResult));

	}

}
