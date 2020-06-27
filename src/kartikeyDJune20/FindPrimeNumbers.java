package kartikeyDJune20;

public class FindPrimeNumbers {
	boolean checkPrime(int start) {
		boolean flag = true;
		for (int index = 2; index <= start / 2; index++) {
			if (start % index == 0) {
				flag = false;
			}

		}

		if (flag == true) {
			// System.out.println(start+" is a prime");
			return true;

		} else {
			// System.out.println(start+" is not a prime");
			return false;
		}
	}

	void findPrimeNo(int start, int end) {
		int cnt = 0;
		for (int index = start; index <= end; index++) {

			if (checkPrime(index) == true)
				cnt++;
		}
		System.out.println(" Total Prime no. between the given range are" + cnt);
	}

	void sumAverageOfPrime(int start, int end) {

		int sum = 0;
		int cnt = 0;

		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int indexChk = 2; indexChk <= index / 2; indexChk++) {

				if (index % indexChk == 0)
					flag = false;
			}
			if (flag == true) {

				sum += index;
				cnt++;
			}
		}

		System.out.println("Sum of all prime no. between " + start + " and " + end + " is " + sum);
		System.out.println("Average of all prime no. between " + start + " and " + end + " is " + (sum / cnt));

	}

	public static void main(String[] args) {
		FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();
		findPrimeNumbers.findPrimeNo(2, 100);
		findPrimeNumbers.sumAverageOfPrime(2, 100);
		findPrimeNumbers.checkPrime(121);

	}

}
