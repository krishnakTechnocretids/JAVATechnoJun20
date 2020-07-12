
public class TreeProgram {
	
	int Max=3, count=1;
	void findVisibleTree(int[] arr){
		for (int index= 0; index < arr.length; index++) {
			if (arr[index]> Max) {
				Max = arr[index];
				count++;
			}
				
		}
			System.out.println(count);
	}
	
	
	public static void main(String[] args) {

		int[] arr= {3,5,5,11,9,10,13};
		
		new TreeProgram().findVisibleTree(arr);
	}
	
}
