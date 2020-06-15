package suparnaNJune20;

//11-06 math calculation 
class MathCalculation {
	void evenNo(int start, int end) {

		System.out.println("Even nos between " + start + " to " + end);
		for (; start <= end; start++) {
			if (start % 2 == 0)
				System.out.println(start);
		}
	}

	void divisibleBy5(int start, int end) {

		System.out.println("No Divisible by 5  between " + start + " to " + end);
		for (; start <= end; start++) {
			if (start % 5 == 0)
				System.out.println(start);
		}
	}

	void divisibleBy5And3(int start, int end) {

		System.out.println("No Divisible by 5 and 3  between " + start + " to " + end);
		for (; start <= end; start++) {
			if (start % 5 == 0 && start % 3 == 0)
				System.out.println(start);
		}
	}

	void divisibleBy7And13(int start, int end) {
		System.out.println("No Divisible by 7 and 13  between " + start + " to " + end);
		for (; start <= end; start++) {
			if (start % 7 == 0)
				System.out.println(start + "divisible by 7 ");
			if (start % 13 == 0)
				System.out.println(start + "divisible by 13 ");
		}
	}

	public static void main(String[] args) {
		MathCalculation exp = new MathCalculation();
		exp.evenNo(10, 15);
		exp.divisibleBy5(10, 30);
		exp.divisibleBy5And3(5, 18);
		exp.divisibleBy7And13(5, 40);
	}

}
