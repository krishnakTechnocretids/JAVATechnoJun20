/** Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100
 */
package suparnaNJune20.Assignment19;

public class PrimeNoOperation {
	static int cnt, sum;
	static boolean flag = true;

	void checkPrimeNo(int num) {
		for (int index = 2; index < (num / 2 + 1); index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(num + " : is Prime No ");
		else
			System.out.println(num + " : is not Prime No ");
	}
	void TotalPrimeCnt() {
		for (int outerIndex = 2; outerIndex <= 100; outerIndex++) {
			flag = true;
			for (int innerIndex = 2; innerIndex <= (outerIndex / 2 + 1); innerIndex++) {
				if (outerIndex % innerIndex == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				cnt++;
		}
		System.out.println("Total count of Prime no between 2 to 100 is : " + cnt);
	}

	void TotalPrimeSum() {
		for (int outerIndex = 2; outerIndex <= 100; outerIndex++) {
			flag = true;
			for (int innerIndex = 2; innerIndex <= (outerIndex / 2 + 1); innerIndex++) {
				if (outerIndex % innerIndex == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				sum += outerIndex;
		}
		System.out.println("Total sum  of Prime no between 2 to 100 is : " + sum);
	}
	void TotalPrimeAvg() {
		System.out.println("Total Avg  of Prime no between 2 to 100 is : " + sum / cnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimeNoOperation().checkPrimeNo(13);
		new PrimeNoOperation().checkPrimeNo(12);
		new PrimeNoOperation().TotalPrimeCnt();
		new PrimeNoOperation().TotalPrimeSum();
		new PrimeNoOperation().TotalPrimeAvg();
	}
}
