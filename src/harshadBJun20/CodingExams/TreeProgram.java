package harshadBJun20.CodingExams;

/*[3,5,5,11,9,10,13] --> 4*/
public class TreeProgram {
	int max,count;
	void countNumOfTreesVisible(int[] arr) {
		max=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>=max) {
				max = arr[index];
					count++;
			}
		}
		System.out.println(count-1);
	}
	
	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int[] arr = {3,5,5,11,9,10,13};
		treeProgram.countNumOfTreesVisible(arr);
	}
}
