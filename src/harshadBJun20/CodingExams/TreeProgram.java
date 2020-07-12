package harshadBJun20.CodingExams;

/*[3,5,5,11,9,10,13] --> 4*/
public class TreeProgram {
	int max,count;
	void countNumOfTreesVisible(int[] arr) {
		max=arr[0];
		count=1;
		for(int index=1;index<arr.length;index++) {
			if(arr[index]>max) {
				max = arr[index];
				count++;			
			}
		}
		System.out.println("Count of trees visible is: "+count);
	}
	
	public static void main(String[] args) {
		TreeProgram treeProgram = new TreeProgram();
		int[] arr = {3,5,5,11,9,10,13};
		treeProgram.countNumOfTreesVisible(arr);
	}
}
