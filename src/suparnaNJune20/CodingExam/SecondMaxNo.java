package suparnaNJune20.CodingExam;
public class SecondMaxNo {

	void fndSecondMaxNo(int number[]) {
		int max1No = number[0], max2No = number[0];
		for (int outerIndex = 0; outerIndex < number.length; outerIndex++) {
			if (number[outerIndex] > max1No && number[outerIndex] > max2No) {
				max2No = max1No;
				max1No = number[outerIndex];
			} else if (number[outerIndex] > max2No && number[outerIndex] < max1No) {
				max2No = number[outerIndex];
			}
		}
		System.out.println("Second Max no is  =" + max2No);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 10, 33, 56, 43, 99, 21, 56 };
		new SecondMaxNo().fndSecondMaxNo(number);
	}
}
