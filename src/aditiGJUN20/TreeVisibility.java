package aditiGJUN20;

public class TreeVisibility {
	
	void displayTree(int[] tree) {
		int count=0;
		for (int i = 0; i < tree.length-1; i++) {
			if(tree[i]<tree[i+1]) {
				count++;		
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
	TreeVisibility treeVisibility = new TreeVisibility();
	int[] tree= {3,5,5,11,9,10,13};
	treeVisibility.displayTree(tree);
	}
}
