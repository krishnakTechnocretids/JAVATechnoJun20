package amitaRJun20;

public class FindMaxSumTripletInArrayExam {
	int sum = 0;
	int maxSum = 0;
	int count = 0;
	String output;
	
	public void findmaxSum(int[] num) {
		for(int i=0;i<num.length;i++) {
			sum += num[i];
			count++;
			if(count%3 ==0) {
				if(sum>maxSum) {
					maxSum = sum;
					sum = 0;
					//System.out.println(maxSum);
					output = num[i-2]+","+num[i-1]+","+num[i];
					count = 0;
				}
			}		
		}
		System.out.println("Max sum triplet is :"+output+"----->"+ maxSum);		
	}
	
	public static void main(String[] args) {
		FindMaxSumTripletInArrayExam maxSumTriplet = new FindMaxSumTripletInArrayExam();
		int[] num = {10,20,12,22,15,13,9,17,21};
		maxSumTriplet.findmaxSum(num);
	}
}
