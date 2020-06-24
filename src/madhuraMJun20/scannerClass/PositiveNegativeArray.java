package madhuraMJun20.scannerClass;

import java.util.Scanner;

public class PositiveNegativeArray {
	int sumPositive;
	int sumNegative;
		
	void findPositiveNegativeNum(int[] num) {
		int positiveCnt=0;
		int negativeCnt=0;
		
		for(int index=0;index<num.length;index++) {
			if(num[index]>=0) {
				positiveCnt++;
				sumPositive += num[index];
				
			}
			else {
				negativeCnt++;
				sumNegative += num[index];
				
			}
		}
		System.out.println(positiveCnt+ " Positive Numbers and "+negativeCnt+ " Negative Numbers");
				
	}
	int difference() {
		
		return (sumPositive+sumNegative);
	}
	public static void main(String[] args) {
		PositiveNegativeArray positiveNegativeArray = new PositiveNegativeArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int size = scanner.nextInt();
		int[]num = new int[size];
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Enter number "+(i+1)+ " : " );
			num[i]=scanner.nextInt();
		}
		positiveNegativeArray.findPositiveNegativeNum(num);
		System.out.println("Difference of positive number sum and negative number sum : ");
		System.out.println(positiveNegativeArray.difference());
		scanner.close();
	}
}
