package barkhaPJun20;

public class TreeProgram {
	
	void visibleTrees(int [] arr1) {
		int count=1;
		int tallestTree=arr1[0];
		for (int i=1; i<arr1.length; i++) {
			if (arr1[i]>tallestTree) {
				tallestTree=arr1[i];
				count++;
			}
		}
		System.out.println("Visible Tress are: "+count);
	}
	public static void main(String[] args) {
		TreeProgram treeProgram=new TreeProgram();
		int [] arr1={3,5,5,11,9,10,13};
		treeProgram.visibleTrees(arr1);
		}
}	