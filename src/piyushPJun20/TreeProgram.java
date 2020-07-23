package piyushPJun20;
public class TreeProgram {
	
	// removed instance variables.
	void findVisibleTree(int[] arr){
		int max=arr[0], count=1; // updated variable name as max.
		for (int index= 0; index < arr.length; index++) {
			if (arr[index]> max) {
				max = arr[index];
				count++;
			}
		}
			System.out.println(count);
	}
	
	public static void main(String[] args) {

		int[] arr= {10,5,5,11,9,10,13};
		new TreeProgram().findVisibleTree(arr);// removed extra space
	}
}
