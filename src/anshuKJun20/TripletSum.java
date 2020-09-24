package anshuKJun20;

public class TripletSum {
	
	void findSum(int[] arr) {
		int sum = 0;int  max = 0; int count = 0;
		String temp =" ";
		for(int index= 0;index<arr.length;index++) {
			 sum += arr[index];
				count++;
				if(count == 3) {
					if(max < sum) {
						max = sum;
						temp = arr[index-2]+","+arr[index-1]+","+arr[index];
					}
					sum = 0;
					count = 0;
				}
		}
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		TripletSum findSum = new TripletSum();
		int[] num = {10,20,12,22,15,13,9,17,21};
		
		findSum.findSum(num);
		
		
	}

}
