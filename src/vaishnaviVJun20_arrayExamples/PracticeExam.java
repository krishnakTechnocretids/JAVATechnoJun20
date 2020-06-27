package vaishnaviVJun20_arrayExamples;

public class PracticeExam {
	
	void getAdditionOfAllDigits(String s) {
		int addition=0;
		for(int index=0;index<s.length();index++) {
			if(Character.isDigit(s.charAt(index))) {
				char ch = s.charAt(index);
				String num= String.valueOf(ch);
				int num1= Integer.parseInt(num);
				addition= addition+num1;
			}				
		}
		System.out.println("Addition of digits is: "+addition);
	}

	public static void main(String[] args) {
		PracticeExam practiceExam = new PracticeExam();
        String input = "1Hh9PR34QP";
        practiceExam.getAdditionOfAllDigits(input);
	}

}

