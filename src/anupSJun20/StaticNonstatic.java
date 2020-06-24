package anupSJun20;
/*Design to test static, non static, return type concept.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
            d) Class should not have any instance variable. */

public class StaticNonstatic {
	double sum(double subject1,double subject2, double subject3) {
		return (subject1+subject2+subject3);
	}
	double average(double subject1,double subject2, double subject3) {
		return sum(subject1,subject2, subject3)/3;
	}
	static boolean isAnswerAboveExpecation(double result) {
		if(result>50)
			return true;
		else
			return false;
	}
	static boolean isEligible(double result) {
		if(result > 50 ||  result%2 ==0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double result) {
		if(result > 80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args) {
		StaticNonstatic staticnonstatic = new StaticNonstatic();
		double averageResult = staticnonstatic.average(50, 55,80);
		if (isAnswerAboveExpecation(averageResult) == true) {
			System.out.println("Answer is above expectation");
		}
		else {
			System.out.println("Answer is below expectation");
		}
		if (isEligible(averageResult) == true){
			System.out.println("Student is eligible");
		}
		else {
			System.out.println("Student is not eligible");
		}	
		System.out.println("The Grade of the student is : "+ getYourGrade(averageResult));	
	}

}

