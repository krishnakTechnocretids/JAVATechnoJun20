package shrutiDJun20CodeExams;

import java.util.ArrayList;
//import java.util.Arrays;

public class FindPrimeNo {

	void findPrime() {
		ArrayList<Integer> primeNum = new ArrayList<Integer>();

		for (int index = 2; index <= 100; index++) {
			boolean primeFlag = false;
			for (int innerindex = 2; innerindex < index; innerindex++) {
				if (index % innerindex == 0) {
					primeFlag = true;
					break;
				}
			}
			if (primeFlag == false) {
				primeNum.add(index);
			}
		}
		System.out.println("ArrayList of Prime Number between 1 to 100 is below:");
		System.out.println(primeNum);
	}
	public static void main(String[] args) {
		FindPrimeNo findPrimeNo = new FindPrimeNo();
		findPrimeNo.findPrime();
	}

}