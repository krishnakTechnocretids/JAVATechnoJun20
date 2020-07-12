package madhuraMJun20;
//[3,5,5,11,9,10,13]
public class TreeProgram {
	void findNumOfTrees(int [] arr) {
		int max = 0;
		int cnt=1;
		for(int index = 1; index < arr.length-1; index++) {
			//num = arr[index]; 
			if(arr[index] > arr[index-1]) {
				cnt++;
				max = arr[index]; //5
			}
			else if (arr[index]< arr[index-1] && arr[index]>max) {
				max = arr[index];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int []arr = {3,5,5,11,9,10,13};
		treeProgram.findNumOfTrees(arr);
	}
}
