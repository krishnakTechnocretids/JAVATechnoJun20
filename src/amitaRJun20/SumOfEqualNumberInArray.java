package amitaRJun20;

public class SumOfEqualNumberInArray {
	
	void findSumOfequalNumber(int[] array,int num) {
		for(int index=0; index<array.length; index++) {
			for(int j=index+1; j<array.length; j++) {
				if(array[index]+array[j]==num) {
					System.out.println("( "+array[index]+" , "+array[j]+" ) ");
				}
			}
		}
	}

	public static void main(String[] args) {
		SumOfEqualNumberInArray equalnumber=new SumOfEqualNumberInArray();
		int[] array= {2, 4, 3, 5, 7, 8, 9 ,-1};
		int num=7;
		System.out.println("Integer Numbers Whose sum is equal to "+num+" are");
		equalnumber.findSumOfequalNumber(array,num);

	}

}
