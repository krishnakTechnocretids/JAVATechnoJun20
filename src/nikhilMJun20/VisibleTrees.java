package nikhilMJun20;

public class VisibleTrees {
	void printVisibleTrees(int[] intArr) {
		int visibles = 1, maxTall = intArr[0];
		for(int index=1; index<intArr.length; index++) {
			if(intArr[index]>maxTall) {
				maxTall = intArr[index];
				visibles++;
			}
		}
		System.out.println("Visible trees are : "+visibles);
	}
	
	public static void main(String[] args) {
		int[] treeArray = {3,5,5,11,9,10,13};
		new VisibleTrees().printVisibleTrees(treeArray);
	}
}
