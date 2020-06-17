package maheshKJun20;

public class Calculation {
	
	static boolean isAnswerAboveExpectation(double average){
		//Method to check Average is above 50
		if (average > 50){
			return true;
		}
		else{
			return false;
		}
	}
	
	static boolean isEligible(double average){
		//Method to check Average is greater than 50 and is divisible by 2
		if (average > 50 || 50%2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	static String getyourGrade(double average){
		//Method to return grade based on average of numbers
		if (average >80){
			return "A Grade";
		}
		else{
			return "B Grade";
		}
	}
	
	double sumOfNumber(double num1, double num2, double num3){
		//Method to calculate and return sum of numbers
		return (num1 + num2 + num3);
	}
	
	double averageOfNumber(double num1, double num2, double num3){
		//Method to calculate and return average of numbers
		return (sumOfNumber(num1, num2, num3)/3);
	}
	
	public static void main(String[] args){
		Calculation calculation = new Calculation();						//Create instance of class Calculation
		double average = calculation.averageOfNumber(50, 30, 80.50);		
		System.out.println("Eligible as per average: " + Calculation.isEligible(average));
		System.out.println("Is Average of number above expectation: " + Calculation.isAnswerAboveExpectation(average));
		System.out.println("Grade based on average of number is: " + Calculation.getyourGrade(average)); 
	}
}
