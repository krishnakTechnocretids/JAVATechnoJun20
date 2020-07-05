package barkhaPJun20;

public class FindSecondMaxNum {
	
	void secondMaxNum(int[] number) {
		int max=0;
		int secondMax=number[0];
		for (int i=0; i<number.length; i++) {
			if (number[i]>max) {
				secondMax=max;
				max=number[i];
			}
			else if (number[i]>secondMax)
				secondMax=number[i];
		}
		System.out.println("Second Highest Number in given Array is: "+secondMax);
		
	}			
	public static void main(String[] args) {
		FindSecondMaxNum findSecondMaxNum=new FindSecondMaxNum();
		int [] num= {10,33,56,43,99,21};
		findSecondMaxNum.secondMaxNum(num);
	}

}	
