package barkhaPJun20;

public class PairInArrayHavingDesireSum {
	
	void toFindPairInArray(int[] num, int sum) {
		for (int outerIndex=0; outerIndex<num.length; outerIndex++ ) {
			for (int innerIndex=0; innerIndex<num.length; innerIndex++) {
				if ((num[outerIndex]+num[innerIndex])==sum) {
					System.out.println("Pair of numbers in array whose addition is "+sum+" are: "+num[outerIndex] +" and " +num[innerIndex]);
				}
			}
		}
	}	
	public static void main(String[] args) {
		PairInArrayHavingDesireSum pairInArray=new PairInArrayHavingDesireSum();
		int[] numArray= {2,4,3,5,7,8,9,-1};
		int sum=7;
		pairInArray.toFindPairInArray(numArray, sum);
	}
}