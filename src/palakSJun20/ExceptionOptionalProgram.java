package palakSJun20;

public class ExceptionOptionalProgram {
	
	void findSumOfNumberFromString(String input) {
		double sum = 0;
		String[] array = input.split(" ");
		for (int index = 0; index < array.length; index++) {
			try {
				sum += Double.parseDouble((array[index]));
				
			} catch (NumberFormatException nfe) {
				
			}
		}
		System.out.println("Output "+sum);
	}

	public static void main(String[] args) {
		ExceptionOptionalProgram exceptionOptionalProgram = new ExceptionOptionalProgram();
		String input1 = "I have 2.3 years experience in manual & 1.2 years in automation";
		exceptionOptionalProgram.findSumOfNumberFromString(input1);
	}

}
