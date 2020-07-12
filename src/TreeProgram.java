
public class TreeProgram {
	
	int Max=10, count=1;
	void findVisibleTree(int[] arr){
		int Max=arr[0], count=1;
		for (int index= 0; index < arr.length; index++) {
			if (arr[index]> Max) {
				Max = arr[index];
				count++;
			}
		}
			System.out.println(count);
	}
	
	public static void main(String[] args) {

		int[] arr= {10,5,5,11,9,10,13};
		
		new TreeProgram().findVisibleTree(arr);
	}
	
}
