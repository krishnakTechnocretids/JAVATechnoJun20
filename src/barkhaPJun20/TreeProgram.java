package barkhaPJun20;

public class TreeProgram {
	
	void visibleTrees(int [] arr1) {
		int count=0;
		for (int i=0; i<arr1.length-1; i++) {
			if (arr1[i]<arr1[i+1]) {
				count++;
			}
		}System.out.println("Visible Tress are: "+count);
		
	}
	public static void main(String[] args) {
		TreeProgram treeProgram=new TreeProgram();
		int [] arr1={3,5,5,11,9,10,13};
		treeProgram.visibleTrees(arr1);
		
	}
}