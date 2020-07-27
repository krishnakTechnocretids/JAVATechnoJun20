package pranitaPJun20;

import java.util.ArrayList;

public class Coding_Exam_8 {
	void findPrimeNum(int startNum, int endNum) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		boolean flag = true;
		for (int num = startNum; num <= endNum; num++) {
			for (int index = 2; index <= num / 2; index++) {
				 flag = true;
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				array.add(num);
			}
		}
		System.out.println("\nAll Prime Numbers are:"+array);
	}

	public static void main(String[] args) {

		new Coding_Exam_8().findPrimeNum(2, 100);
	}
}
