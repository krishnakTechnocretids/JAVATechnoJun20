package aadeshJun20;

public class GradingSystem {

		double sum(double subject1,double subject2,double subject3){
			return subject1 + subject2 + subject3;
		}

		double average(double subject1, double subject2, double subject3){
			return (sum(subject1, subject2, subject1)/3);
		}

		static boolean isAnswerAboveExpecation(double answer){
			if (answer > 50)
				return true;
			else
				return false;
		}

		static boolean isEligible(double answer){
			if(answer > 50 || answer%2 == 0)
				return true;
			else
				return false;
		}

		static String getYourGrade(double answer){
			if (answer > 80 )
				return "Grade A";
			else
				return "Grade B";
		}

		public static void main(String[] args){
			GradingSystem gradingSystem = new GradingSystem();
			double answer = gradingSystem.average(90.50,80.50,80.50); 

			if (isAnswerAboveExpecation(answer) == true)
				System.out.println("Your Performance is above expectation");
			else
				System.out.println("Please work hard, your Performance is below expectation");

			if(isEligible(answer) == true)
				System.out.println("You are eligible for the addmission");
			else
				System.out.println("You are not eligible for the addmission");

			System.out.println("You have secured : " + getYourGrade(answer));
		}
	}
