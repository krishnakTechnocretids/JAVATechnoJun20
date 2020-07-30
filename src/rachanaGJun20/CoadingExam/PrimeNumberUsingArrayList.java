package rachanaGJun20.CoadingExam;

import java.util.ArrayList;

public class PrimeNumberUsingArrayList {

	ArrayList<Integer> getPrimeNumber() {
		ArrayList<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
		boolean flag = true;
		for (int number = 2; number <= 100; number++) {
			for (int innerindex = 2; innerindex <= number / 2; innerindex++) {
				flag = true;
				if (number % innerindex == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				listOfPrimeNumbers.add(number);
			}
		}
		return listOfPrimeNumbers;
	}

	public static void main(String[] args) {
		System.out.println(new PrimeNumberUsingArrayList().getPrimeNumber());
	}
}
