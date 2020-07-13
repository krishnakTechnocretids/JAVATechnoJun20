package pranitaPJun20;

public class TreeProgram {
	void findNumberOfVisibleTrees(int[] arr) {
		int max = arr[0], count =1;
		for(int index=1; index<arr.length; index++) {
			if(max<arr[index]) {
				count++;
				max = arr[index];
			}
		}
		System.out.println("Total visible tree: "+count);
	}
	
	/*void findNumberOfVisibleTrees(int[] array) {
		int temp=0;
		int count=1;
		for(int index=0;index<array.length-1;index++) {
			if((array[index+1]>array[index])&& array[index+1]>temp) {
				temp=array[index+1];
				count++;
			}
		}
		System.out.println("Total number of visible trees are:"+count);
	}*/
	
	public static void main(String[] args) {
		int[] array = {3,5,5,11,9,10,13};
		TreeProgram treeProgram = new TreeProgram();
		treeProgram.findNumberOfVisibleTrees(array);
	}

}
