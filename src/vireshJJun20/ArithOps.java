package vireshJJun20;

class ArithOps{

	double sum(double a, double b, double c){
		double smAnswer;
		smAnswer= a+b+c;
		System.out.println(" - Sum: " + smAnswer);
		return smAnswer;
	}
	
	double average(double a, double b, double c){
		ArithOps ar= new ArithOps();
		System.out.println("The given 3 numbers are: " + a +", " +b+ ", " +c);
		double avAnswer= (ar.sum(a, b, c))/3;
		if(avAnswer >100) {
			System.out.println("Average of given 3 values exceeds 100%, ie: " +avAnswer+ " please enter new values.");
			return 00.0;
		}
		else {
		System.out.println(" - Average: " +avAnswer);
		return avAnswer;
		}
	}
	
	static boolean isAnswerAboveExpecation(double avAnswer){
		boolean boolExp = false;
			if (avAnswer> 50){
				boolExp= true;
				
			}
			else if (avAnswer<50){
				boolExp= false;
			}
			return boolExp;
	}
	
	static boolean isEligible(double avAnswer){
		if ( avAnswer>50 || avAnswer%2==0) {
			return true;	
		}
		else{
			return false;
		}
	}
	
	static String getYourGrade(double avAnswer){
		String grade;
		if (avAnswer>=80){
			grade= "Grade A";
			}
		else{
			grade= "Grade B";
		}
		return grade;
	}	
	
	public static void main(String[] args){
		ArithOps arithOps= new ArithOps();
		double avg= arithOps.average(99.0,99.0,99.0);
		if (avg!=00.0) {
			if(ArithOps.isEligible(avg)== true) {
				System.out.println("Is Eligible: Yes (Average is more than 50 or divisible by 2)");
			}
			else
				System.out.println("Is Eligible: No (Average is less than or equals 50 or not divisible by 2)");
				//System.out.println("Is Eligible: " + ArithOps.isEligible(avg));
				System.out.println("Grades achieved: " + ArithOps.getYourGrade(avg));
				if(ArithOps.isAnswerAboveExpecation(avg)== true) {
					System.out.println("Is answer above expectation: Yes (Average is greater than 50)");
				}
				else {
					System.out.println("Is answer above expectation: No (Average is less than or equals 50)");
				}
			}
		else {
			System.out.println(" ");
		}
		}
}

