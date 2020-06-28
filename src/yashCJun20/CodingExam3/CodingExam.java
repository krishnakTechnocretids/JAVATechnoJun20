package yashCJun20.CodingExam3;

public class CodingExam {

	void sum(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == num) {
					System.out.println("(" + array[i] + "," + array[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {

		CodingExam codingExam = new CodingExam();
		int[] array = { 2, 4, 3, 5, 7, 8, 9, -1 };
		codingExam.sum(array, 7);
	}
}
