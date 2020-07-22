/* WAP to do sum of numbers in given statement.
 *  (Use split method and Exception handling concept. Do not use character class methods and ascii concept.)*/

package swapnaWJun20;

public class SumSplit {

	int sum = 0;

	void sumWithException(String arrayInp) {
		String[] arrInp = arrayInp.split(" ");
		for (int index = 0; index < arrInp.length; index++) {
			try {
				//adding numbers only to the variable sum
				sum += Integer.parseInt(arrInp[index]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Output : " + sum);
	}

	public static void main(String args[]) {
		SumSplit sumSplit = new SumSplit();
		String arrayInp = "I have 5 Years 6 month of experience.";
		System.out.println("Input : " + arrayInp);
		sumSplit.sumWithException(arrayInp);
	}
}
