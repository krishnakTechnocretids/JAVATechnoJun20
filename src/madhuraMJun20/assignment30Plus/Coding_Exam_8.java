package madhuraMJun20.assignment30Plus;
import java.util.ArrayList;

//find prime numbers between 1 -> 100 and return an arraylist.
public class Coding_Exam_8 {
	private boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public ArrayList<Integer> findPrime(int num1, int num2) {
		ArrayList<Integer> primeNum = new ArrayList<Integer>();
		
		for (int index = num1; index <= num2; index++) {
			boolean flag = isPrimeNumber(index);
			if (flag == true) {
				primeNum.add(index);
			}
		}
		return primeNum;
	}

	public static void main(String [] args) {
		Coding_Exam_8 cexam = new Coding_Exam_8();
		System.out.println(cexam.findPrime(2, 100));
	}
}