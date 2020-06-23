import java.util.Scanner;

public class PositiveNegative {
	int positive;
	int negative;

	void positiveNegativeNum(int[] num) {
		int positiveCnt=0;
		int negativeCnt=0;

		for(int index=0;index<num.length;index++) {
			if(num[index]>=0) {
				positiveCnt++;
				positive += num[index];

			}
			else {
				negativeCnt++;
				negative += num[index];

			}
		}
		System.out.println(positiveCnt+ " Positive Numbers and "+negativeCnt+ " Negative Numbers");
		System.out.println("");

	}
	int difference() {

		return (positive+negative);
	}
	public static void main(String[] args) {
		PositiveNegative positivenegative = new PositiveNegative();
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter size of array : ");
		int size = scanner.nextInt();
		int[]num = new int[size];

		for(int i=0;i<num.length;i++) {
			System.out.println(" Enter number "+(i+1)+ " : " );
			num[i]=scanner.nextInt();
		}
		positivenegative.positiveNegativeNum(num);
		System.out.println("Sum of Difference of Positive and Negative Number is : ");
		System.out.println(positivenegative.difference());
		scanner.close();
	}
}
